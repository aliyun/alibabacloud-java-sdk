// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeSceneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeSceneResponseBodyResult result;

    public static DescribeSceneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneResponseBody self = new DescribeSceneResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("Status")
        public String status;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("SceneId")
        public String sceneId;

        @NameInMap("GmtModified")
        public String gmtModified;

        public static DescribeSceneResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeSceneResponseBodyResult self = new DescribeSceneResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeSceneResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSceneResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeSceneResponseBodyResult setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public DescribeSceneResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

    }

}
