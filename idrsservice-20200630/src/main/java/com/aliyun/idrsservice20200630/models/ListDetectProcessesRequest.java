// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListDetectProcessesRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PublishStatus")
    public Boolean publishStatus;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("SortKey")
    public String sortKey;

    @NameInMap("Type")
    public String type;

    public static ListDetectProcessesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDetectProcessesRequest self = new ListDetectProcessesRequest();
        return TeaModel.build(map, self);
    }

    public ListDetectProcessesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDetectProcessesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListDetectProcessesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDetectProcessesRequest setPublishStatus(Boolean publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }
    public Boolean getPublishStatus() {
        return this.publishStatus;
    }

    public ListDetectProcessesRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public ListDetectProcessesRequest setSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }
    public String getSortKey() {
        return this.sortKey;
    }

    public ListDetectProcessesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
