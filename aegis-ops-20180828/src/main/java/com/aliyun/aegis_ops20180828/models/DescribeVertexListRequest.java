// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeVertexListRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("IncidentTime")
    public String incidentTime;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("StartType")
    public String startType;

    @NameInMap("Type")
    public String type;

    @NameInMap("UserLevel")
    public String userLevel;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("VertexId")
    public String vertexId;

    public static DescribeVertexListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVertexListRequest self = new DescribeVertexListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVertexListRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeVertexListRequest setIncidentTime(String incidentTime) {
        this.incidentTime = incidentTime;
        return this;
    }
    public String getIncidentTime() {
        return this.incidentTime;
    }

    public DescribeVertexListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVertexListRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public DescribeVertexListRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public DescribeVertexListRequest setStartType(String startType) {
        this.startType = startType;
        return this;
    }
    public String getStartType() {
        return this.startType;
    }

    public DescribeVertexListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeVertexListRequest setUserLevel(String userLevel) {
        this.userLevel = userLevel;
        return this;
    }
    public String getUserLevel() {
        return this.userLevel;
    }

    public DescribeVertexListRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribeVertexListRequest setVertexId(String vertexId) {
        this.vertexId = vertexId;
        return this;
    }
    public String getVertexId() {
        return this.vertexId;
    }

}
