// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllUserIdsByGroupIdRequest extends TeaModel {
    @NameInMap("IsolationId")
    @Validation(required = true)
    public String isolationId;

    @NameInMap("UserGroupId")
    @Validation(required = true)
    public String userGroupId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNo")
    @Validation(required = true)
    public Integer pageNo;

    public static QueryFaceAllUserIdsByGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceAllUserIdsByGroupIdRequest self = new QueryFaceAllUserIdsByGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceAllUserIdsByGroupIdRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public QueryFaceAllUserIdsByGroupIdRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public QueryFaceAllUserIdsByGroupIdRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryFaceAllUserIdsByGroupIdRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

}
