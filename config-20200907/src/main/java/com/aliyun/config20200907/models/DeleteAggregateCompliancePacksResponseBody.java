// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregateCompliancePacksResponseBody extends TeaModel {
    @NameInMap("OperateCompliancePacksResult")
    public DeleteAggregateCompliancePacksResponseBodyOperateCompliancePacksResult operateCompliancePacksResult;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAggregateCompliancePacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregateCompliancePacksResponseBody self = new DeleteAggregateCompliancePacksResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAggregateCompliancePacksResponseBody setOperateCompliancePacksResult(DeleteAggregateCompliancePacksResponseBodyOperateCompliancePacksResult operateCompliancePacksResult) {
        this.operateCompliancePacksResult = operateCompliancePacksResult;
        return this;
    }
    public DeleteAggregateCompliancePacksResponseBodyOperateCompliancePacksResult getOperateCompliancePacksResult() {
        return this.operateCompliancePacksResult;
    }

    public DeleteAggregateCompliancePacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteAggregateCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks extends TeaModel {
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteAggregateCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks build(java.util.Map<String, ?> map) throws Exception {
            DeleteAggregateCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks self = new DeleteAggregateCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks();
            return TeaModel.build(map, self);
        }

        public DeleteAggregateCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public DeleteAggregateCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteAggregateCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class DeleteAggregateCompliancePacksResponseBodyOperateCompliancePacksResult extends TeaModel {
        @NameInMap("OperateCompliancePacks")
        public java.util.List<DeleteAggregateCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks> operateCompliancePacks;

        public static DeleteAggregateCompliancePacksResponseBodyOperateCompliancePacksResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteAggregateCompliancePacksResponseBodyOperateCompliancePacksResult self = new DeleteAggregateCompliancePacksResponseBodyOperateCompliancePacksResult();
            return TeaModel.build(map, self);
        }

        public DeleteAggregateCompliancePacksResponseBodyOperateCompliancePacksResult setOperateCompliancePacks(java.util.List<DeleteAggregateCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks> operateCompliancePacks) {
            this.operateCompliancePacks = operateCompliancePacks;
            return this;
        }
        public java.util.List<DeleteAggregateCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks> getOperateCompliancePacks() {
            return this.operateCompliancePacks;
        }

    }

}
