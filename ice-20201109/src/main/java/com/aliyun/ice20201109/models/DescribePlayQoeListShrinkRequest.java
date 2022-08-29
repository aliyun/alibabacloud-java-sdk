// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayQoeListShrinkRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BeginTs")
    public Long beginTs;

    @NameInMap("Definition")
    public String definition;

    @NameInMap("EndTs")
    public Long endTs;

    @NameInMap("ItemConfigs")
    public String itemConfigs;

    @NameInMap("MetricTypes")
    public String metricTypesShrink;

    @NameInMap("Network")
    public String network;

    @NameInMap("OrderName")
    public String orderName;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("Os")
    public String os;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TerminalType")
    public String terminalType;

    public static DescribePlayQoeListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayQoeListShrinkRequest self = new DescribePlayQoeListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribePlayQoeListShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribePlayQoeListShrinkRequest setBeginTs(Long beginTs) {
        this.beginTs = beginTs;
        return this;
    }
    public Long getBeginTs() {
        return this.beginTs;
    }

    public DescribePlayQoeListShrinkRequest setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public DescribePlayQoeListShrinkRequest setEndTs(Long endTs) {
        this.endTs = endTs;
        return this;
    }
    public Long getEndTs() {
        return this.endTs;
    }

    public DescribePlayQoeListShrinkRequest setItemConfigs(String itemConfigs) {
        this.itemConfigs = itemConfigs;
        return this;
    }
    public String getItemConfigs() {
        return this.itemConfigs;
    }

    public DescribePlayQoeListShrinkRequest setMetricTypesShrink(String metricTypesShrink) {
        this.metricTypesShrink = metricTypesShrink;
        return this;
    }
    public String getMetricTypesShrink() {
        return this.metricTypesShrink;
    }

    public DescribePlayQoeListShrinkRequest setNetwork(String network) {
        this.network = network;
        return this;
    }
    public String getNetwork() {
        return this.network;
    }

    public DescribePlayQoeListShrinkRequest setOrderName(String orderName) {
        this.orderName = orderName;
        return this;
    }
    public String getOrderName() {
        return this.orderName;
    }

    public DescribePlayQoeListShrinkRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribePlayQoeListShrinkRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public DescribePlayQoeListShrinkRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribePlayQoeListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePlayQoeListShrinkRequest setTerminalType(String terminalType) {
        this.terminalType = terminalType;
        return this;
    }
    public String getTerminalType() {
        return this.terminalType;
    }

}
