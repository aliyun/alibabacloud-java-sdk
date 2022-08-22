// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layoutadmin20220801.models;

import com.aliyun.tea.*;

public class QueryRelationRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RelationId")
    public String relationId;

    @NameInMap("UserId")
    public String userId;

    public static QueryRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRelationRequest self = new QueryRelationRequest();
        return TeaModel.build(map, self);
    }

    public QueryRelationRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public QueryRelationRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryRelationRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRelationRequest setRelationId(String relationId) {
        this.relationId = relationId;
        return this;
    }
    public String getRelationId() {
        return this.relationId;
    }

    public QueryRelationRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
