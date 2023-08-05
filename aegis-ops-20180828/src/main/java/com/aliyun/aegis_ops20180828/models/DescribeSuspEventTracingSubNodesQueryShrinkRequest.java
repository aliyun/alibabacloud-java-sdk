// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeSuspEventTracingSubNodesQueryShrinkRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("EdgeTypeList")
    public String edgeTypeListShrink;

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

    public static DescribeSuspEventTracingSubNodesQueryShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventTracingSubNodesQueryShrinkRequest self = new DescribeSuspEventTracingSubNodesQueryShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventTracingSubNodesQueryShrinkRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeSuspEventTracingSubNodesQueryShrinkRequest setEdgeTypeListShrink(String edgeTypeListShrink) {
        this.edgeTypeListShrink = edgeTypeListShrink;
        return this;
    }
    public String getEdgeTypeListShrink() {
        return this.edgeTypeListShrink;
    }

    public DescribeSuspEventTracingSubNodesQueryShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSuspEventTracingSubNodesQueryShrinkRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public DescribeSuspEventTracingSubNodesQueryShrinkRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public DescribeSuspEventTracingSubNodesQueryShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeSuspEventTracingSubNodesQueryShrinkRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribeSuspEventTracingSubNodesQueryShrinkRequest setVertexId(String vertexId) {
        this.vertexId = vertexId;
        return this;
    }
    public String getVertexId() {
        return this.vertexId;
    }

}
