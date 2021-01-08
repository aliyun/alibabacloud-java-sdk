// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class AttachDatasetResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public AttachDatasetResponseBodyResult result;

    public static AttachDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachDatasetResponseBody self = new AttachDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachDatasetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AttachDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachDatasetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AttachDatasetResponseBody setResult(AttachDatasetResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AttachDatasetResponseBodyResult getResult() {
        return this.result;
    }

    public static class AttachDatasetResponseBodyResult extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("VersionId")
        public String versionId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("GmtModified")
        public Long gmtModified;

        public static AttachDatasetResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AttachDatasetResponseBodyResult self = new AttachDatasetResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AttachDatasetResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public AttachDatasetResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public AttachDatasetResponseBodyResult setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public AttachDatasetResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AttachDatasetResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

    }

}
