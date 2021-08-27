// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachKeyPairResponseBody extends TeaModel {
    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("FailCount")
    public String failCount;

    @NameInMap("Results")
    public AttachKeyPairResponseBodyResults results;

    public static AttachKeyPairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachKeyPairResponseBody self = new AttachKeyPairResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachKeyPairResponseBody setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public AttachKeyPairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachKeyPairResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public AttachKeyPairResponseBody setFailCount(String failCount) {
        this.failCount = failCount;
        return this;
    }
    public String getFailCount() {
        return this.failCount;
    }

    public AttachKeyPairResponseBody setResults(AttachKeyPairResponseBodyResults results) {
        this.results = results;
        return this;
    }
    public AttachKeyPairResponseBodyResults getResults() {
        return this.results;
    }

    public static class AttachKeyPairResponseBodyResultsResult extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Success")
        public String success;

        public static AttachKeyPairResponseBodyResultsResult build(java.util.Map<String, ?> map) throws Exception {
            AttachKeyPairResponseBodyResultsResult self = new AttachKeyPairResponseBodyResultsResult();
            return TeaModel.build(map, self);
        }

        public AttachKeyPairResponseBodyResultsResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachKeyPairResponseBodyResultsResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachKeyPairResponseBodyResultsResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AttachKeyPairResponseBodyResultsResult setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

    public static class AttachKeyPairResponseBodyResults extends TeaModel {
        @NameInMap("Result")
        public java.util.List<AttachKeyPairResponseBodyResultsResult> result;

        public static AttachKeyPairResponseBodyResults build(java.util.Map<String, ?> map) throws Exception {
            AttachKeyPairResponseBodyResults self = new AttachKeyPairResponseBodyResults();
            return TeaModel.build(map, self);
        }

        public AttachKeyPairResponseBodyResults setResult(java.util.List<AttachKeyPairResponseBodyResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<AttachKeyPairResponseBodyResultsResult> getResult() {
            return this.result;
        }

    }

}
