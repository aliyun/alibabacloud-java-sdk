// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeARMServerInstancesShrinkRequest extends TeaModel {
    /**
     * <p>The list of container specifications.</p>
     */
    @NameInMap("AICSpecs")
    public String AICSpecsShrink;

    /**
     * <p>Specifies whether the query results include container information. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Included.</p>
     * </li>
     * <li><p><strong>false</strong>: Not included.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DescribeAICInstances")
    public Boolean describeAICInstances;

    /**
     * <p>The list of ENS edge zone IDs.</p>
     */
    @NameInMap("EnsRegionIds")
    public String ensRegionIdsShrink;

    /**
     * <p>The end time of the query. Format: &quot;2006-01-02&quot;. By default, no time limit is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>2006-01-03</p>
     */
    @NameInMap("MaxDate")
    public String maxDate;

    /**
     * <p>The start time of the query. Format: &quot;2006-01-02&quot;. By default, no time limit is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>2006-01-02</p>
     */
    @NameInMap("MinDate")
    public String minDate;

    /**
     * <p>The server name.</p>
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
     * <p>The sorting method for query results. You can sort results by one or more of the following fields: ServerIdSort (server ID), ServerNameSort (server name), ExpireTimeSort (expiration time), CreationTimeSort (creation time), and EnsRegionIdSort (edge zone ID).</p>
     * <p>Valid values: asc (ascending order) and desc (descending order).</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ServerIdSort&quot;:&quot;desc&quot;,&quot;ServerNameSort&quot;:&quot;desc&quot;,&quot;ExpireTimeSort&quot;:&quot;asc&quot;}</p>
     */
    @NameInMap("OrderByParams")
    public String orderByParams;

    /**
     * <p>The page number of the query list. Minimum value: <strong>1</strong>.</p>
     * <p>Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paged query. Maximum value: <strong>100</strong>.</p>
     * <p>Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The list of server instance IDs.</p>
     */
    @NameInMap("ServerIds")
    public String serverIdsShrink;

    /**
     * <p>The list of server specifications.</p>
     */
    @NameInMap("ServerSpecs")
    public String serverSpecsShrink;

    /**
     * <p>The list of operation states.</p>
     */
    @NameInMap("States")
    public String statesShrink;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

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

    public DescribeARMServerInstancesShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
