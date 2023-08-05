// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeVertexDetailRequest extends TeaModel {
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

    public static DescribeVertexDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVertexDetailRequest self = new DescribeVertexDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVertexDetailRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeVertexDetailRequest setIncidentTime(String incidentTime) {
        this.incidentTime = incidentTime;
        return this;
    }
    public String getIncidentTime() {
        return this.incidentTime;
    }

    public DescribeVertexDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVertexDetailRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public DescribeVertexDetailRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public DescribeVertexDetailRequest setStartType(String startType) {
        this.startType = startType;
        return this;
    }
    public String getStartType() {
        return this.startType;
    }

    public DescribeVertexDetailRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeVertexDetailRequest setUserLevel(String userLevel) {
        this.userLevel = userLevel;
        return this;
    }
    public String getUserLevel() {
        return this.userLevel;
    }

    public DescribeVertexDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribeVertexDetailRequest setVertexId(String vertexId) {
        this.vertexId = vertexId;
        return this;
    }
    public String getVertexId() {
        return this.vertexId;
    }

}
