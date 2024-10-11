// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListIndexVersionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListIndexVersionsResponseBodyResult> result;

    public static ListIndexVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIndexVersionsResponseBody self = new ListIndexVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIndexVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIndexVersionsResponseBody setResult(java.util.List<ListIndexVersionsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListIndexVersionsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListIndexVersionsResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-11-08T02:00:00Z</p>
         */
        @NameInMap("builtTime")
        public String builtTime;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("costSeconds")
        public Integer costSeconds;

        /**
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        @NameInMap("flowType")
        public String flowType;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("progress")
        public Integer progress;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("rollbackEnabled")
        public Boolean rollbackEnabled;

        /**
         * <strong>example:</strong>
         * <p>300922211</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2020-11-08T02:00:00Z</p>
         */
        @NameInMap("switchedTime")
        public String switchedTime;

        /**
         * <strong>example:</strong>
         * <p>2020112301</p>
         */
        @NameInMap("versionId")
        public String versionId;

        public static ListIndexVersionsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListIndexVersionsResponseBodyResult self = new ListIndexVersionsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListIndexVersionsResponseBodyResult setBuiltTime(String builtTime) {
            this.builtTime = builtTime;
            return this;
        }
        public String getBuiltTime() {
            return this.builtTime;
        }

        public ListIndexVersionsResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListIndexVersionsResponseBodyResult setCostSeconds(Integer costSeconds) {
            this.costSeconds = costSeconds;
            return this;
        }
        public Integer getCostSeconds() {
            return this.costSeconds;
        }

        public ListIndexVersionsResponseBodyResult setFlowType(String flowType) {
            this.flowType = flowType;
            return this;
        }
        public String getFlowType() {
            return this.flowType;
        }

        public ListIndexVersionsResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListIndexVersionsResponseBodyResult setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ListIndexVersionsResponseBodyResult setRollbackEnabled(Boolean rollbackEnabled) {
            this.rollbackEnabled = rollbackEnabled;
            return this;
        }
        public Boolean getRollbackEnabled() {
            return this.rollbackEnabled;
        }

        public ListIndexVersionsResponseBodyResult setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListIndexVersionsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListIndexVersionsResponseBodyResult setSwitchedTime(String switchedTime) {
            this.switchedTime = switchedTime;
            return this;
        }
        public String getSwitchedTime() {
            return this.switchedTime;
        }

        public ListIndexVersionsResponseBodyResult setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
