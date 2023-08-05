// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeGraph4IncidentOnlineShrinkRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("AnomalyCount")
    public Integer anomalyCount;

    @NameInMap("AssetName")
    public String assetName;

    @NameInMap("IncidentId")
    public String incidentId;

    @NameInMap("IncidentName")
    public String incidentName;

    @NameInMap("IncidentTime")
    public String incidentTime;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SecurityEventIdList")
    public String securityEventIdListShrink;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("VertexId")
    public String vertexId;

    public static DescribeGraph4IncidentOnlineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGraph4IncidentOnlineShrinkRequest self = new DescribeGraph4IncidentOnlineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGraph4IncidentOnlineShrinkRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeGraph4IncidentOnlineShrinkRequest setAnomalyCount(Integer anomalyCount) {
        this.anomalyCount = anomalyCount;
        return this;
    }
    public Integer getAnomalyCount() {
        return this.anomalyCount;
    }

    public DescribeGraph4IncidentOnlineShrinkRequest setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

    public DescribeGraph4IncidentOnlineShrinkRequest setIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public String getIncidentId() {
        return this.incidentId;
    }

    public DescribeGraph4IncidentOnlineShrinkRequest setIncidentName(String incidentName) {
        this.incidentName = incidentName;
        return this;
    }
    public String getIncidentName() {
        return this.incidentName;
    }

    public DescribeGraph4IncidentOnlineShrinkRequest setIncidentTime(String incidentTime) {
        this.incidentTime = incidentTime;
        return this;
    }
    public String getIncidentTime() {
        return this.incidentTime;
    }

    public DescribeGraph4IncidentOnlineShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGraph4IncidentOnlineShrinkRequest setSecurityEventIdListShrink(String securityEventIdListShrink) {
        this.securityEventIdListShrink = securityEventIdListShrink;
        return this;
    }
    public String getSecurityEventIdListShrink() {
        return this.securityEventIdListShrink;
    }

    public DescribeGraph4IncidentOnlineShrinkRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribeGraph4IncidentOnlineShrinkRequest setVertexId(String vertexId) {
        this.vertexId = vertexId;
        return this;
    }
    public String getVertexId() {
        return this.vertexId;
    }

}
