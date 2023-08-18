// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class CheckRawPlanJsonResponseBody extends TeaModel {
    @NameInMap("PlanJsonInfo")
    public CheckRawPlanJsonResponseBodyPlanJsonInfo planJsonInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckRawPlanJsonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckRawPlanJsonResponseBody self = new CheckRawPlanJsonResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckRawPlanJsonResponseBody setPlanJsonInfo(CheckRawPlanJsonResponseBodyPlanJsonInfo planJsonInfo) {
        this.planJsonInfo = planJsonInfo;
        return this;
    }
    public CheckRawPlanJsonResponseBodyPlanJsonInfo getPlanJsonInfo() {
        return this.planJsonInfo;
    }

    public CheckRawPlanJsonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckRawPlanJsonResponseBodyPlanJsonInfo extends TeaModel {
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("PlanJson")
        public String planJson;

        @NameInMap("Status")
        public String status;

        public static CheckRawPlanJsonResponseBodyPlanJsonInfo build(java.util.Map<String, ?> map) throws Exception {
            CheckRawPlanJsonResponseBodyPlanJsonInfo self = new CheckRawPlanJsonResponseBodyPlanJsonInfo();
            return TeaModel.build(map, self);
        }

        public CheckRawPlanJsonResponseBodyPlanJsonInfo setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CheckRawPlanJsonResponseBodyPlanJsonInfo setPlanJson(String planJson) {
            this.planJson = planJson;
            return this;
        }
        public String getPlanJson() {
            return this.planJson;
        }

        public CheckRawPlanJsonResponseBodyPlanJsonInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
