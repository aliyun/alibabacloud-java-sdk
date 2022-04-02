// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDAGVersionsRequest extends TeaModel {
    @NameInMap("DagId")
    public Long dagId;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Tid")
    public Long tid;

    public static ListDAGVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDAGVersionsRequest self = new ListDAGVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListDAGVersionsRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public ListDAGVersionsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListDAGVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDAGVersionsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
