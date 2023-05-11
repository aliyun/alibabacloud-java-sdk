// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryProductListRequest extends TeaModel {
    /**
     * <p>The type of the product. Valid values:</p>
     * <br>
     * <p>*   **iothub_senior**: A Thing Specification Language (TSL) model is used for the product.</p>
     * <p>*   **iothub**: No TSL model is used for the product.</p>
     * <br>
     * <p>>  If you do not configure this parameter, all products are returned.</p>
     */
    @NameInMap("AliyunCommodityCode")
    public String aliyunCommodityCode;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the instance. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <br>
     * <p>> *   If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</p>
     * <p>> *   If no **Overview** page or ID is generated for your instance, you do not need to configure this parameter.</p>
     * <br>
     * <p>For more information, see [Overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 200.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group to which the product belongs. You can log on to the [Resource Management](https://resourcemanager.console.aliyun.com/resource-groups) console to view the details of the resource group.</p>
     * <br>
     * <p>> You can specify a value for this parameter only if you have activated Resource Management.</p>
     * <br>
     * <p>If you leave this parameter empty, the information about all products in the current account is queried.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static QueryProductListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProductListRequest self = new QueryProductListRequest();
        return TeaModel.build(map, self);
    }

    public QueryProductListRequest setAliyunCommodityCode(String aliyunCommodityCode) {
        this.aliyunCommodityCode = aliyunCommodityCode;
        return this;
    }
    public String getAliyunCommodityCode() {
        return this.aliyunCommodityCode;
    }

    public QueryProductListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryProductListRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryProductListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryProductListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
