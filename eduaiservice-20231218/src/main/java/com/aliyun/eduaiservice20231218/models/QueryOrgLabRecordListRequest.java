// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduaiservice20231218.models;

import com.aliyun.tea.*;

public class QueryOrgLabRecordListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AliyunUid")
    public String aliyunUid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LabId")
    public String labId;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("OrderDirection")
    public String orderDirection;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryOrgLabRecordListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOrgLabRecordListRequest self = new QueryOrgLabRecordListRequest();
        return TeaModel.build(map, self);
    }

    public QueryOrgLabRecordListRequest setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    public QueryOrgLabRecordListRequest setLabId(String labId) {
        this.labId = labId;
        return this;
    }
    public String getLabId() {
        return this.labId;
    }

    public QueryOrgLabRecordListRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public QueryOrgLabRecordListRequest setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
        return this;
    }
    public String getOrderDirection() {
        return this.orderDirection;
    }

    public QueryOrgLabRecordListRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public QueryOrgLabRecordListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
