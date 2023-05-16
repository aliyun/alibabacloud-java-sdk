// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeARMServerInstancesShrinkRequest extends TeaModel {
    @NameInMap("AICSpecs")
    public String AICSpecsShrink;

    @NameInMap("DescribeAICInstances")
    public Boolean describeAICInstances;

    @NameInMap("EnsRegionIds")
    public String ensRegionIdsShrink;

    @NameInMap("LatestAction")
    public String latestAction;

    @NameInMap("MaxDate")
    public String maxDate;

    @NameInMap("MinDate")
    public String minDate;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OrderByParams")
    public String orderByParams;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ServerIds")
    public String serverIdsShrink;

    @NameInMap("ServerSpecs")
    public String serverSpecsShrink;

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

    public DescribeARMServerInstancesShrinkRequest setLatestAction(String latestAction) {
        this.latestAction = latestAction;
        return this;
    }
    public String getLatestAction() {
        return this.latestAction;
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
