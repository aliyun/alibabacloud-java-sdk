// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllUserGroupRequest extends TeaModel {
    @NameInMap("IsolationId")
    public String isolationId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryFaceAllUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceAllUserGroupRequest self = new QueryFaceAllUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceAllUserGroupRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public QueryFaceAllUserGroupRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public QueryFaceAllUserGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
