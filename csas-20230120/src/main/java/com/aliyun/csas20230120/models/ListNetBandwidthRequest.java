// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListNetBandwidthRequest extends TeaModel {
    /**
     * <p>The current page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of instance IDs.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The network type. If this parameter is left empty, both VPC and Connector instances are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("NetType")
    public String netType;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListNetBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNetBandwidthRequest self = new ListNetBandwidthRequest();
        return TeaModel.build(map, self);
    }

    public ListNetBandwidthRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListNetBandwidthRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ListNetBandwidthRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public ListNetBandwidthRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
