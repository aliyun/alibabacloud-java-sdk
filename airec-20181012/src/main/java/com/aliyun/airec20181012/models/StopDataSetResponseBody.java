// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class StopDataSetResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public StopDataSetResponseBodyResult result;

    public static StopDataSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopDataSetResponseBody self = new StopDataSetResponseBody();
        return TeaModel.build(map, self);
    }

    public StopDataSetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopDataSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopDataSetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopDataSetResponseBody setResult(StopDataSetResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public StopDataSetResponseBodyResult getResult() {
        return this.result;
    }

    public static class StopDataSetResponseBodyResult extends TeaModel {
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

        public static StopDataSetResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            StopDataSetResponseBodyResult self = new StopDataSetResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public StopDataSetResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public StopDataSetResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public StopDataSetResponseBodyResult setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public StopDataSetResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public StopDataSetResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

    }

}
