// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DeleteDataSetResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public DeleteDataSetResponseBodyResult result;

    public static DeleteDataSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSetResponseBody self = new DeleteDataSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDataSetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteDataSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDataSetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteDataSetResponseBody setResult(DeleteDataSetResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteDataSetResponseBodyResult getResult() {
        return this.result;
    }

    public static class DeleteDataSetResponseBodyResult extends TeaModel {
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

        public static DeleteDataSetResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteDataSetResponseBodyResult self = new DeleteDataSetResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteDataSetResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DeleteDataSetResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DeleteDataSetResponseBodyResult setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public DeleteDataSetResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DeleteDataSetResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

    }

}
