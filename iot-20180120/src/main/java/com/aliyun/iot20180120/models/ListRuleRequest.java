// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListRuleRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Maximum value: 1000. Default value: 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the instance. You can view the ID of the instance on the **Overview** page in the IoT Platform console.****</p>
     * <br>
     * <p>>*   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.****</p>
     * <p>>*   If no **Overview** page or **ID** is generated for your instance, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group to which the rule belongs. You can log on to the [Resource Management](https://resourcemanager.console.aliyun.com/resource-groups) console to view the details of the resource group.</p>
     * <br>
     * <p>>You can configure this parameter only if you have activated Resource Management.</p>
     * <br>
     * <p>If you do not configure this parameter, all rules of the Alibaba Cloud account are queried.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRuleRequest self = new ListRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListRuleRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListRuleRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ListRuleRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
