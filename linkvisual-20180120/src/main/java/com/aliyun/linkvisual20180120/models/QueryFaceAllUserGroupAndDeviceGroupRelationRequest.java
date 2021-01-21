// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryFaceAllUserGroupAndDeviceGroupRelationRequest extends TeaModel {
    @NameInMap("IsolationId")
    @Validation(required = true)
    public String isolationId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageNo")
    @Validation(required = true)
    public Integer pageNo;

    public static QueryFaceAllUserGroupAndDeviceGroupRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceAllUserGroupAndDeviceGroupRelationRequest self = new QueryFaceAllUserGroupAndDeviceGroupRelationRequest();
        return TeaModel.build(map, self);
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryFaceAllUserGroupAndDeviceGroupRelationRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

}
