// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliyunid_ag20180912.models;

import com.aliyun.tea.*;

public class PaginateAgRelationsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryCount")
    public Boolean queryCount;

    public static PaginateAgRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        PaginateAgRelationsRequest self = new PaginateAgRelationsRequest();
        return TeaModel.build(map, self);
    }

    public PaginateAgRelationsRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public PaginateAgRelationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PaginateAgRelationsRequest setQueryCount(Boolean queryCount) {
        this.queryCount = queryCount;
        return this;
    }
    public Boolean getQueryCount() {
        return this.queryCount;
    }

}
