// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListDataSetResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public java.util.List<ListDataSetResponseBodyResult> result;

    public static ListDataSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataSetResponseBody self = new ListDataSetResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataSetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDataSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataSetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDataSetResponseBody setResult(java.util.List<ListDataSetResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDataSetResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDataSetResponseBodyResult extends TeaModel {
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

        public static ListDataSetResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataSetResponseBodyResult self = new ListDataSetResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDataSetResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListDataSetResponseBodyResult setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListDataSetResponseBodyResult setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListDataSetResponseBodyResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDataSetResponseBodyResult setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

    }

}
