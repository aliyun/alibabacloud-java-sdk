// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateIceProjectResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateIceProjectResponseBodyResult result;

    public static CreateIceProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIceProjectResponseBody self = new CreateIceProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIceProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateIceProjectResponseBody setResult(CreateIceProjectResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateIceProjectResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateIceProjectResponseBodyResult extends TeaModel {
        // 工程ID
        @NameInMap("ProjectId")
        public String projectId;

        public static CreateIceProjectResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateIceProjectResponseBodyResult self = new CreateIceProjectResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateIceProjectResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

}
