// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListInstanceRequest extends TeaModel {
    @NameInMap("BindId")
    public String bindId;

    /**
     * <p>The channel type. Valid values:</p>
     * <ul>
     * <li><p><strong>whatsapp</strong></p>
     * </li>
     * <li><p><strong>messenger</strong></p>
     * </li>
     * <li><p><strong>instagram</strong></p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;- <strong>viber</strong></p>
     * 
     * <strong>example:</strong>
     * <p>VIBER</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The filter condition.</p>
     * 
     * <strong>example:</strong>
     * <p>aa</p>
     */
    @NameInMap("FilterStr")
    public String filterStr;

    /**
     * <p>The instance ID. Only non-Alibaba Cloud hosts are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>r-uf6wd7pkyjwxvlxfhk</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>viber_ins</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("IsBind")
    public Boolean isBind;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>92</p>
     */
    @NameInMap("PageIndex")
    public Long pageIndex;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>87</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the enterprise resource group to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The submit time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-12-12 00:00:00</p>
     */
    @NameInMap("SubmitTime")
    public String submitTime;

    public static ListInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRequest self = new ListInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceRequest setBindId(String bindId) {
        this.bindId = bindId;
        return this;
    }
    public String getBindId() {
        return this.bindId;
    }

    public ListInstanceRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public ListInstanceRequest setFilterStr(String filterStr) {
        this.filterStr = filterStr;
        return this;
    }
    public String getFilterStr() {
        return this.filterStr;
    }

    public ListInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListInstanceRequest setIsBind(Boolean isBind) {
        this.isBind = isBind;
        return this;
    }
    public Boolean getIsBind() {
        return this.isBind;
    }

    public ListInstanceRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public ListInstanceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListInstanceRequest setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public String getSubmitTime() {
        return this.submitTime;
    }

}
