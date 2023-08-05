// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeGraph4InvestigationOnlineRequest extends TeaModel {
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
    public java.util.List<String> ruleIdList;

    @NameInMap("StoreType")
    public String storeType;

    @NameInMap("ToTime")
    public Integer toTime;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("VertexId")
    public String vertexId;

    @NameInMap("VertexIdList")
    public java.util.List<String> vertexIdList;

    public static DescribeGraph4InvestigationOnlineRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGraph4InvestigationOnlineRequest self = new DescribeGraph4InvestigationOnlineRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGraph4InvestigationOnlineRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public DescribeGraph4InvestigationOnlineRequest setAnomalyId(String anomalyId) {
        this.anomalyId = anomalyId;
        return this;
    }
    public String getAnomalyId() {
        return this.anomalyId;
    }

    public DescribeGraph4InvestigationOnlineRequest setAnomalyUuid(String anomalyUuid) {
        this.anomalyUuid = anomalyUuid;
        return this;
    }
    public String getAnomalyUuid() {
        return this.anomalyUuid;
    }

    public DescribeGraph4InvestigationOnlineRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeGraph4InvestigationOnlineRequest setFromTime(Integer fromTime) {
        this.fromTime = fromTime;
        return this;
    }
    public Integer getFromTime() {
        return this.fromTime;
    }

    public DescribeGraph4InvestigationOnlineRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGraph4InvestigationOnlineRequest setPathLength(Integer pathLength) {
        this.pathLength = pathLength;
        return this;
    }
    public Integer getPathLength() {
        return this.pathLength;
    }

    public DescribeGraph4InvestigationOnlineRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public DescribeGraph4InvestigationOnlineRequest setRuleIdList(java.util.List<String> ruleIdList) {
        this.ruleIdList = ruleIdList;
        return this;
    }
    public java.util.List<String> getRuleIdList() {
        return this.ruleIdList;
    }

    public DescribeGraph4InvestigationOnlineRequest setStoreType(String storeType) {
        this.storeType = storeType;
        return this;
    }
    public String getStoreType() {
        return this.storeType;
    }

    public DescribeGraph4InvestigationOnlineRequest setToTime(Integer toTime) {
        this.toTime = toTime;
        return this;
    }
    public Integer getToTime() {
        return this.toTime;
    }

    public DescribeGraph4InvestigationOnlineRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribeGraph4InvestigationOnlineRequest setVertexId(String vertexId) {
        this.vertexId = vertexId;
        return this;
    }
    public String getVertexId() {
        return this.vertexId;
    }

    public DescribeGraph4InvestigationOnlineRequest setVertexIdList(java.util.List<String> vertexIdList) {
        this.vertexIdList = vertexIdList;
        return this;
    }
    public java.util.List<String> getVertexIdList() {
        return this.vertexIdList;
    }

}
