// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeSuspEventTracingGraphRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("AssetName")
    public String assetName;

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

    @NameInMap("UniqueInfoList")
    public java.util.List<String> uniqueInfoList;

    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("VertexId")
    public String vertexId;

    public static DescribeSuspEventTracingGraphRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventTracingGraphRequest self = new DescribeSuspEventTracingGraphRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventTracingGraphRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeSuspEventTracingGraphRequest setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

    public DescribeSuspEventTracingGraphRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public DescribeSuspEventTracingGraphRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSuspEventTracingGraphRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSuspEventTracingGraphRequest setMaxId(Long maxId) {
        this.maxId = maxId;
        return this;
    }
    public Long getMaxId() {
        return this.maxId;
    }

    public DescribeSuspEventTracingGraphRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSuspEventTracingGraphRequest setUniqueInfoList(java.util.List<String> uniqueInfoList) {
        this.uniqueInfoList = uniqueInfoList;
        return this;
    }
    public java.util.List<String> getUniqueInfoList() {
        return this.uniqueInfoList;
    }

    public DescribeSuspEventTracingGraphRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribeSuspEventTracingGraphRequest setVertexId(String vertexId) {
        this.vertexId = vertexId;
        return this;
    }
    public String getVertexId() {
        return this.vertexId;
    }

}
