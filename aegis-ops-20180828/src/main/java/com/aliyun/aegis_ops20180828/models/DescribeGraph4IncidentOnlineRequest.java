// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeGraph4IncidentOnlineRequest extends TeaModel {
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
    public java.util.List<DescribeGraph4IncidentOnlineRequestSecurityEventIdList> securityEventIdList;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("VertexId")
    public String vertexId;

    public static DescribeGraph4IncidentOnlineRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGraph4IncidentOnlineRequest self = new DescribeGraph4IncidentOnlineRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGraph4IncidentOnlineRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeGraph4IncidentOnlineRequest setAnomalyCount(Integer anomalyCount) {
        this.anomalyCount = anomalyCount;
        return this;
    }
    public Integer getAnomalyCount() {
        return this.anomalyCount;
    }

    public DescribeGraph4IncidentOnlineRequest setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

    public DescribeGraph4IncidentOnlineRequest setIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public String getIncidentId() {
        return this.incidentId;
    }

    public DescribeGraph4IncidentOnlineRequest setIncidentName(String incidentName) {
        this.incidentName = incidentName;
        return this;
    }
    public String getIncidentName() {
        return this.incidentName;
    }

    public DescribeGraph4IncidentOnlineRequest setIncidentTime(String incidentTime) {
        this.incidentTime = incidentTime;
        return this;
    }
    public String getIncidentTime() {
        return this.incidentTime;
    }

    public DescribeGraph4IncidentOnlineRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGraph4IncidentOnlineRequest setSecurityEventIdList(java.util.List<DescribeGraph4IncidentOnlineRequestSecurityEventIdList> securityEventIdList) {
        this.securityEventIdList = securityEventIdList;
        return this;
    }
    public java.util.List<DescribeGraph4IncidentOnlineRequestSecurityEventIdList> getSecurityEventIdList() {
        return this.securityEventIdList;
    }

    public DescribeGraph4IncidentOnlineRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribeGraph4IncidentOnlineRequest setVertexId(String vertexId) {
        this.vertexId = vertexId;
        return this;
    }
    public String getVertexId() {
        return this.vertexId;
    }

    public static class DescribeGraph4IncidentOnlineRequestSecurityEventIdList extends TeaModel {
        @NameInMap("OccurrenceTime")
        public String occurrenceTime;

        @NameInMap("UniqueInfo")
        public String uniqueInfo;

        public static DescribeGraph4IncidentOnlineRequestSecurityEventIdList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGraph4IncidentOnlineRequestSecurityEventIdList self = new DescribeGraph4IncidentOnlineRequestSecurityEventIdList();
            return TeaModel.build(map, self);
        }

        public DescribeGraph4IncidentOnlineRequestSecurityEventIdList setOccurrenceTime(String occurrenceTime) {
            this.occurrenceTime = occurrenceTime;
            return this;
        }
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        public DescribeGraph4IncidentOnlineRequestSecurityEventIdList setUniqueInfo(String uniqueInfo) {
            this.uniqueInfo = uniqueInfo;
            return this;
        }
        public String getUniqueInfo() {
            return this.uniqueInfo;
        }

    }

}
