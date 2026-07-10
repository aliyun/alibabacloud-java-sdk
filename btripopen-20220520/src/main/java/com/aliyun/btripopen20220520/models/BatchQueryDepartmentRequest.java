// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class BatchQueryDepartmentRequest extends TeaModel {
    @NameInMap("modified_time_greater_or_equal_than")
    public String modifiedTimeGreaterOrEqualThan;

    @NameInMap("out_dept_id")
    public String outDeptId;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("page_token")
    public String pageToken;

    public static BatchQueryDepartmentRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryDepartmentRequest self = new BatchQueryDepartmentRequest();
        return TeaModel.build(map, self);
    }

    public BatchQueryDepartmentRequest setModifiedTimeGreaterOrEqualThan(String modifiedTimeGreaterOrEqualThan) {
        this.modifiedTimeGreaterOrEqualThan = modifiedTimeGreaterOrEqualThan;
        return this;
    }
    public String getModifiedTimeGreaterOrEqualThan() {
        return this.modifiedTimeGreaterOrEqualThan;
    }

    public BatchQueryDepartmentRequest setOutDeptId(String outDeptId) {
        this.outDeptId = outDeptId;
        return this;
    }
    public String getOutDeptId() {
        return this.outDeptId;
    }

    public BatchQueryDepartmentRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public BatchQueryDepartmentRequest setPageToken(String pageToken) {
        this.pageToken = pageToken;
        return this;
    }
    public String getPageToken() {
        return this.pageToken;
    }

}
