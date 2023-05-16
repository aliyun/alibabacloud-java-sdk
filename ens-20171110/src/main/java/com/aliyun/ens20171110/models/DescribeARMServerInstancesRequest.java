// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeARMServerInstancesRequest extends TeaModel {
    @NameInMap("AICSpecs")
    public java.util.List<String> AICSpecs;

    @NameInMap("DescribeAICInstances")
    public Boolean describeAICInstances;

    @NameInMap("EnsRegionIds")
    public java.util.List<String> ensRegionIds;

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
    public java.util.List<String> serverIds;

    @NameInMap("ServerSpecs")
    public java.util.List<String> serverSpecs;

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

    public DescribeARMServerInstancesRequest setLatestAction(String latestAction) {
        this.latestAction = latestAction;
        return this;
    }
    public String getLatestAction() {
        return this.latestAction;
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
