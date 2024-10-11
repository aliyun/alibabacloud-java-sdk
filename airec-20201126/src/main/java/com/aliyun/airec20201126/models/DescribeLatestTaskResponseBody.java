// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeLatestTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>829F38F6-E2D6-4109-90A6-888160BD16C2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<DescribeLatestTaskResponseBodyResult> result;

    public static DescribeLatestTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLatestTaskResponseBody self = new DescribeLatestTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLatestTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLatestTaskResponseBody setResult(java.util.List<DescribeLatestTaskResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeLatestTaskResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeLatestTaskResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-11-08T02:00:00Z</p>
         */
        @NameInMap("builtTime")
        public String builtTime;

        /**
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("costSeconds")
        public Integer costSeconds;

        /**
         * <strong>example:</strong>
         * <p>Manual</p>
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
         * <p>2938475566</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>pending</p>
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
         * <p>20102010211</p>
         */
        @NameInMap("versionId")
        public String versionId;

        public static DescribeLatestTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeLatestTaskResponseBodyResult self = new DescribeLatestTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeLatestTaskResponseBodyResult setBuiltTime(String builtTime) {
            this.builtTime = builtTime;
            return this;
        }
        public String getBuiltTime() {
            return this.builtTime;
        }

        public DescribeLatestTaskResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeLatestTaskResponseBodyResult setCostSeconds(Integer costSeconds) {
            this.costSeconds = costSeconds;
            return this;
        }
        public Integer getCostSeconds() {
            return this.costSeconds;
        }

        public DescribeLatestTaskResponseBodyResult setFlowType(String flowType) {
            this.flowType = flowType;
            return this;
        }
        public String getFlowType() {
            return this.flowType;
        }

        public DescribeLatestTaskResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeLatestTaskResponseBodyResult setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeLatestTaskResponseBodyResult setRollbackEnabled(Boolean rollbackEnabled) {
            this.rollbackEnabled = rollbackEnabled;
            return this;
        }
        public Boolean getRollbackEnabled() {
            return this.rollbackEnabled;
        }

        public DescribeLatestTaskResponseBodyResult setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeLatestTaskResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeLatestTaskResponseBodyResult setSwitchedTime(String switchedTime) {
            this.switchedTime = switchedTime;
            return this;
        }
        public String getSwitchedTime() {
            return this.switchedTime;
        }

        public DescribeLatestTaskResponseBodyResult setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
