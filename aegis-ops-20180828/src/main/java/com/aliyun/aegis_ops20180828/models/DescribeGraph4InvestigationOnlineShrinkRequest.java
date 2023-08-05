// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeGraph4InvestigationOnlineShrinkRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("AnomalyId")
    public String anomalyId;

    @NameInMap("AnomalyUuid")
    public String anomalyUuid;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("FromTime")
    public Integer fromTime;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PathLength")
    public Integer pathLength;

    @NameInMap("Query")
    public String query;

    @NameInMap("RuleIdList")
    public String ruleIdListShrink;

    @NameInMap("StoreType")
    public String storeType;

    @NameInMap("ToTime")
    public Integer toTime;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("VertexId")
    public String vertexId;

    @NameInMap("VertexIdList")
    public String vertexIdListShrink;

    public static DescribeGraph4InvestigationOnlineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGraph4InvestigationOnlineShrinkRequest self = new DescribeGraph4InvestigationOnlineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGraph4InvestigationOnlineShrinkRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public DescribeGraph4InvestigationOnlineShrinkRequest setAnomalyId(String anomalyId) {
        this.anomalyId = anomalyId;
        return this;
    }
    public String getAnomalyId() {
        return this.anomalyId;
    }

    public DescribeGraph4InvestigationOnlineShrinkRequest setAnomalyUuid(String anomalyUuid) {
        this.anomalyUuid = anomalyUuid;
        return this;
    }
    public String getAnomalyUuid() {
        return this.anomalyUuid;
    }

    public DescribeGraph4InvestigationOnlineShrinkRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeGraph4InvestigationOnlineShrinkRequest setFromTime(Integer fromTime) {
        this.fromTime = fromTime;
        return this;
    }
    public Integer getFromTime() {
        return this.fromTime;
    }

    public DescribeGraph4InvestigationOnlineShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGraph4InvestigationOnlineShrinkRequest setPathLength(Integer pathLength) {
        this.pathLength = pathLength;
        return this;
    }
    public Integer getPathLength() {
        return this.pathLength;
    }

    public DescribeGraph4InvestigationOnlineShrinkRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public DescribeGraph4InvestigationOnlineShrinkRequest setRuleIdListShrink(String ruleIdListShrink) {
        this.ruleIdListShrink = ruleIdListShrink;
        return this;
    }
    public String getRuleIdListShrink() {
        return this.ruleIdListShrink;
    }

    public DescribeGraph4InvestigationOnlineShrinkRequest setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

    public DescribeGraph4InvestigationOnlineShrinkRequest setToTime(Integer toTime) {
        this.toTime = toTime;
        return this;
    }
    public Integer getToTime() {
        return this.toTime;
    }

    public DescribeGraph4InvestigationOnlineShrinkRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribeGraph4InvestigationOnlineShrinkRequest setVertexId(String vertexId) {
        this.vertexId = vertexId;
        return this;
    }
    public String getVertexId() {
        return this.vertexId;
    }

    public DescribeGraph4InvestigationOnlineShrinkRequest setVertexIdListShrink(String vertexIdListShrink) {
        this.vertexIdListShrink = vertexIdListShrink;
        return this;
    }
    public String getVertexIdListShrink() {
        return this.vertexIdListShrink;
    }

}
