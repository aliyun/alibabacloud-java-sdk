// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ReAddMigrationTaskInPlanResponseBody extends TeaModel {
    @NameInMap("FailModels")
    public FailModels failModels;

    @NameInMap("RequestId")
    public String requestId;

    public static ReAddMigrationTaskInPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReAddMigrationTaskInPlanResponseBody self = new ReAddMigrationTaskInPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public ReAddMigrationTaskInPlanResponseBody setFailModels(FailModels failModels) {
        this.failModels = failModels;
        return this;
    }
    public FailModels getFailModels() {
        return this.failModels;
    }

    public ReAddMigrationTaskInPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class FailModelsFailModels extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static FailModelsFailModels build(java.util.Map<String, ?> map) throws Exception {
            FailModelsFailModels self = new FailModelsFailModels();
            return TeaModel.build(map, self);
        }

        public FailModelsFailModels setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public FailModelsFailModels setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class FailModels extends TeaModel {
        @NameInMap("FailModels")
        public java.util.List<FailModelsFailModels> failModels;

        public static FailModels build(java.util.Map<String, ?> map) throws Exception {
            FailModels self = new FailModels();
            return TeaModel.build(map, self);
        }

        public FailModels setFailModels(java.util.List<FailModelsFailModels> failModels) {
            this.failModels = failModels;
            return this;
        }
        public java.util.List<FailModelsFailModels> getFailModels() {
            return this.failModels;
        }

    }

}
