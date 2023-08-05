// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeSuspEventTracingSubNodesQueryRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("EdgeTypeList")
    public java.util.List<String> edgeTypeList;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Offset")
    public Long offset;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("VertexId")
    public String vertexId;

    public static DescribeSuspEventTracingSubNodesQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventTracingSubNodesQueryRequest self = new DescribeSuspEventTracingSubNodesQueryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventTracingSubNodesQueryRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeSuspEventTracingSubNodesQueryRequest setEdgeTypeList(java.util.List<String> edgeTypeList) {
        this.edgeTypeList = edgeTypeList;
        return this;
    }
    public java.util.List<String> getEdgeTypeList() {
        return this.edgeTypeList;
    }

    public DescribeSuspEventTracingSubNodesQueryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSuspEventTracingSubNodesQueryRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public DescribeSuspEventTracingSubNodesQueryRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public DescribeSuspEventTracingSubNodesQueryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeSuspEventTracingSubNodesQueryRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribeSuspEventTracingSubNodesQueryRequest setVertexId(String vertexId) {
        this.vertexId = vertexId;
        return this;
    }
    public String getVertexId() {
        return this.vertexId;
    }

}
