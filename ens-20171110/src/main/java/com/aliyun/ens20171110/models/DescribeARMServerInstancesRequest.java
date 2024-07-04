// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeARMServerInstancesRequest extends TeaModel {
    /**
     * <p>The container specifications.</p>
     */
    @NameInMap("AICSpecs")
    public java.util.List<String> AICSpecs;

    /**
     * <p>Spcifies whether the result contains the container information. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DescribeAICInstances")
    public Boolean describeAICInstances;

    /**
     * <p>The IDs of the Edge Node Service (ENS) nodes.</p>
     */
    @NameInMap("EnsRegionIds")
    public java.util.List<String> ensRegionIds;

    /**
     * <p>The end of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.</p>
     * 
     * <strong>example:</strong>
     * <p>2006-01-03</p>
     */
    @NameInMap("MaxDate")
    public String maxDate;

    /**
     * <p>The beginning of the time range to query. Specify the time in the 2006-01-02 format. By default, the time range to query is not restricted.</p>
     * 
     * <strong>example:</strong>
     * <p>2006-01-02</p>
     */
    @NameInMap("MinDate")
    public String minDate;

    /**
     * <p>The name of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>Server-Name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The sorting order of the results to return. Valid values: ServerIdSort, ServerNameSort, ExpireTimeSort, CreationTimeSort, and EnsRegionIdSort.</p>
     * <p>asc: ascending order. desc: descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ServerIdSort&quot;:&quot;desc&quot;,&quot;ServerNameSort&quot;:&quot;desc&quot;,&quot;ExpireTimeSort&quot;:&quot;asc&quot;,&quot;CreationTimeSort&quot;:&quot;asc&quot;,&quot;EnsRegionIdSort&quot;:&quot;asc&quot;}</p>
     */
    @NameInMap("OrderByParams")
    public String orderByParams;

    /**
     * <p>The page number. Pages start from page <strong>1</strong>.</p>
     * <p>Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. The maximum value is <strong>100</strong>.</p>
     * <p>Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The IDs of the ARM servers.</p>
     */
    @NameInMap("ServerIds")
    public java.util.List<String> serverIds;

    /**
     * <p>The server specifications.</p>
     */
    @NameInMap("ServerSpecs")
    public java.util.List<String> serverSpecs;

    /**
     * <p>The operation statuses.</p>
     */
    @NameInMap("States")
    public java.util.List<String> states;

    public static DescribeARMServerInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeARMServerInstancesRequest self = new DescribeARMServerInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeARMServerInstancesRequest setAICSpecs(java.util.List<String> AICSpecs) {
        this.AICSpecs = AICSpecs;
        return this;
    }
    public java.util.List<String> getAICSpecs() {
        return this.AICSpecs;
    }

    public DescribeARMServerInstancesRequest setDescribeAICInstances(Boolean describeAICInstances) {
        this.describeAICInstances = describeAICInstances;
        return this;
    }
    public Boolean getDescribeAICInstances() {
        return this.describeAICInstances;
    }

    public DescribeARMServerInstancesRequest setEnsRegionIds(java.util.List<String> ensRegionIds) {
        this.ensRegionIds = ensRegionIds;
        return this;
    }
    public java.util.List<String> getEnsRegionIds() {
        return this.ensRegionIds;
    }

    public DescribeARMServerInstancesRequest setMaxDate(String maxDate) {
        this.maxDate = maxDate;
        return this;
    }
    public String getMaxDate() {
        return this.maxDate;
    }

    public DescribeARMServerInstancesRequest setMinDate(String minDate) {
        this.minDate = minDate;
        return this;
    }
    public String getMinDate() {
        return this.minDate;
    }

    public DescribeARMServerInstancesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeARMServerInstancesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeARMServerInstancesRequest setOrderByParams(String orderByParams) {
        this.orderByParams = orderByParams;
        return this;
    }
    public String getOrderByParams() {
        return this.orderByParams;
    }

    public DescribeARMServerInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeARMServerInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeARMServerInstancesRequest setServerIds(java.util.List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }
    public java.util.List<String> getServerIds() {
        return this.serverIds;
    }

    public DescribeARMServerInstancesRequest setServerSpecs(java.util.List<String> serverSpecs) {
        this.serverSpecs = serverSpecs;
        return this;
    }
    public java.util.List<String> getServerSpecs() {
        return this.serverSpecs;
    }

    public DescribeARMServerInstancesRequest setStates(java.util.List<String> states) {
        this.states = states;
        return this;
    }
    public java.util.List<String> getStates() {
        return this.states;
    }

}
