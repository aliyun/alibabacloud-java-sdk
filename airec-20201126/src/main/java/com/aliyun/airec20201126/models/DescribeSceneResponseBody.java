// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeSceneResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public DescribeSceneResponseBodyResult result;

    public static DescribeSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneResponseBody self = new DescribeSceneResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSceneResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSceneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSceneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSceneResponseBody setResult(DescribeSceneResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeSceneResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeSceneResponseBodyResult extends TeaModel {
        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("sceneId")
        public String sceneId;

        @NameInMap("status")
        public String status;

        public static DescribeSceneResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeSceneResponseBodyResult self = new DescribeSceneResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeSceneResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeSceneResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeSceneResponseBodyResult setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public DescribeSceneResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
