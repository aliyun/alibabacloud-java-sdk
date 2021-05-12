// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetSnapshotInstancesRequest extends TeaModel {
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("sortKey")
    public String sortKey;

    @NameInMap("sortDirect")
    public String sortDirect;

    public static GetSnapshotInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotInstancesRequest self = new GetSnapshotInstancesRequest();
        return TeaModel.build(map, self);
    }

    public GetSnapshotInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetSnapshotInstancesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public GetSnapshotInstancesRequest setSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }
    public String getSortKey() {
        return this.sortKey;
    }

    public GetSnapshotInstancesRequest setSortDirect(String sortDirect) {
        this.sortDirect = sortDirect;
        return this;
    }
    public String getSortDirect() {
        return this.sortDirect;
    }

}
