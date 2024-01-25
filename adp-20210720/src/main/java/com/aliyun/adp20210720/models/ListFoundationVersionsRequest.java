// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListFoundationVersionsRequest extends TeaModel {
    @NameInMap("onlyDefault")
    public Boolean onlyDefault;

    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("sortDirect")
    public String sortDirect;

    @NameInMap("sortKey")
    public String sortKey;

    @NameInMap("type")
    public String type;

    @NameInMap("version")
    public String version;

    public static ListFoundationVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFoundationVersionsRequest self = new ListFoundationVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListFoundationVersionsRequest setOnlyDefault(Boolean onlyDefault) {
        this.onlyDefault = onlyDefault;
        return this;
    }
    public Boolean getOnlyDefault() {
        return this.onlyDefault;
    }

    public ListFoundationVersionsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListFoundationVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFoundationVersionsRequest setSortDirect(String sortDirect) {
        this.sortDirect = sortDirect;
        return this;
    }
    public String getSortDirect() {
        return this.sortDirect;
    }

    public ListFoundationVersionsRequest setSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }
    public String getSortKey() {
        return this.sortKey;
    }

    public ListFoundationVersionsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListFoundationVersionsRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
