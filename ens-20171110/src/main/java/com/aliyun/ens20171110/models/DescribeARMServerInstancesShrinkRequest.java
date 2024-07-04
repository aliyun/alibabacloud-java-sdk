// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeARMServerInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The container specifications.</p>
     */
    @NameInMap("AICSpecs")
    public String AICSpecsShrink;

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
    public String ensRegionIdsShrink;

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
    public String serverIdsShrink;

    /**
     * <p>The server specifications.</p>
     */
    @NameInMap("ServerSpecs")
    public String serverSpecsShrink;

    /**
     * <p>The operation statuses.</p>
     */
    @NameInMap("States")
    public String statesShrink;

    public static DescribeARMServerInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeARMServerInstancesShrinkRequest self = new DescribeARMServerInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeARMServerInstancesShrinkRequest setAICSpecsShrink(String AICSpecsShrink) {
        this.AICSpecsShrink = AICSpecsShrink;
        return this;
    }
    public String getAICSpecsShrink() {
        return this.AICSpecsShrink;
    }

    public DescribeARMServerInstancesShrinkRequest setDescribeAICInstances(Boolean describeAICInstances) {
        this.describeAICInstances = describeAICInstances;
        return this;
    }
    public Boolean getDescribeAICInstances() {
        return this.describeAICInstances;
    }

    public DescribeARMServerInstancesShrinkRequest setEnsRegionIdsShrink(String ensRegionIdsShrink) {
        this.ensRegionIdsShrink = ensRegionIdsShrink;
        return this;
    }
    public String getEnsRegionIdsShrink() {
        return this.ensRegionIdsShrink;
    }

    public DescribeARMServerInstancesShrinkRequest setMaxDate(String maxDate) {
        this.maxDate = maxDate;
        return this;
    }
    public String getMaxDate() {
        return this.maxDate;
    }

    public DescribeARMServerInstancesShrinkRequest setMinDate(String minDate) {
        this.minDate = minDate;
        return this;
    }
    public String getMinDate() {
        return this.minDate;
    }

    public DescribeARMServerInstancesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeARMServerInstancesShrinkRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeARMServerInstancesShrinkRequest setOrderByParams(String orderByParams) {
        this.orderByParams = orderByParams;
        return this;
    }
    public String getOrderByParams() {
        return this.orderByParams;
    }

    public DescribeARMServerInstancesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeARMServerInstancesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeARMServerInstancesShrinkRequest setServerIdsShrink(String serverIdsShrink) {
        this.serverIdsShrink = serverIdsShrink;
        return this;
    }
    public String getServerIdsShrink() {
        return this.serverIdsShrink;
    }

    public DescribeARMServerInstancesShrinkRequest setServerSpecsShrink(String serverSpecsShrink) {
        this.serverSpecsShrink = serverSpecsShrink;
        return this;
    }
    public String getServerSpecsShrink() {
        return this.serverSpecsShrink;
    }

    public DescribeARMServerInstancesShrinkRequest setStatesShrink(String statesShrink) {
        this.statesShrink = statesShrink;
        return this;
    }
    public String getStatesShrink() {
        return this.statesShrink;
    }

}
