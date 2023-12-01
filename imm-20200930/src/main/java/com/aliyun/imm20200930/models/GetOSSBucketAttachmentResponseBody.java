// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetOSSBucketAttachmentResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UpdateTime")
    public String updateTime;

    public static GetOSSBucketAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOSSBucketAttachmentResponseBody self = new GetOSSBucketAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOSSBucketAttachmentResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetOSSBucketAttachmentResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetOSSBucketAttachmentResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetOSSBucketAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOSSBucketAttachmentResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
