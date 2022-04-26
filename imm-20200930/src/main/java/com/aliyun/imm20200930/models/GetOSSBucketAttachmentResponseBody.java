// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetOSSBucketAttachmentResponseBody extends TeaModel {
    @NameInMap("ProjectName")
    public String projectName;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    public static GetOSSBucketAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOSSBucketAttachmentResponseBody self = new GetOSSBucketAttachmentResponseBody();
        return TeaModel.build(map, self);
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

}
