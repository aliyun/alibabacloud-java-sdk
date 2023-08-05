// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeSuspEventTracingSubNodesCountShrinkRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("Bid")
    public String bid;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MaxId")
    public Long maxId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("VertexList")
    public String vertexListShrink;

    public static DescribeSuspEventTracingSubNodesCountShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventTracingSubNodesCountShrinkRequest self = new DescribeSuspEventTracingSubNodesCountShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventTracingSubNodesCountShrinkRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeSuspEventTracingSubNodesCountShrinkRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public DescribeSuspEventTracingSubNodesCountShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSuspEventTracingSubNodesCountShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSuspEventTracingSubNodesCountShrinkRequest setMaxId(Long maxId) {
        this.maxId = maxId;
        return this;
    }
    public Long getMaxId() {
        return this.maxId;
    }

    public DescribeSuspEventTracingSubNodesCountShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSuspEventTracingSubNodesCountShrinkRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribeSuspEventTracingSubNodesCountShrinkRequest setVertexListShrink(String vertexListShrink) {
        this.vertexListShrink = vertexListShrink;
        return this;
    }
    public String getVertexListShrink() {
        return this.vertexListShrink;
    }

}
