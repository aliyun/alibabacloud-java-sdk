// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeSuspEventTracingVertexExtendInfoRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("Bid")
    public String bid;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EdgeType")
    public String edgeType;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MaxId")
    public Long maxId;

    @NameInMap("Offset")
    public Long offset;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("VertexId")
    public String vertexId;

    public static DescribeSuspEventTracingVertexExtendInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventTracingVertexExtendInfoRequest self = new DescribeSuspEventTracingVertexExtendInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventTracingVertexExtendInfoRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeSuspEventTracingVertexExtendInfoRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public DescribeSuspEventTracingVertexExtendInfoRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSuspEventTracingVertexExtendInfoRequest setEdgeType(String edgeType) {
        this.edgeType = edgeType;
        return this;
    }
    public String getEdgeType() {
        return this.edgeType;
    }

    public DescribeSuspEventTracingVertexExtendInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSuspEventTracingVertexExtendInfoRequest setMaxId(Long maxId) {
        this.maxId = maxId;
        return this;
    }
    public Long getMaxId() {
        return this.maxId;
    }

    public DescribeSuspEventTracingVertexExtendInfoRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public DescribeSuspEventTracingVertexExtendInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSuspEventTracingVertexExtendInfoRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public DescribeSuspEventTracingVertexExtendInfoRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeSuspEventTracingVertexExtendInfoRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribeSuspEventTracingVertexExtendInfoRequest setVertexId(String vertexId) {
        this.vertexId = vertexId;
        return this;
    }
    public String getVertexId() {
        return this.vertexId;
    }

}
