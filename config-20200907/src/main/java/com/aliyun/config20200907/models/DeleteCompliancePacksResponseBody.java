// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteCompliancePacksResponseBody extends TeaModel {
    @NameInMap("OperateCompliancePacksResult")
    public DeleteCompliancePacksResponseBodyOperateCompliancePacksResult operateCompliancePacksResult;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCompliancePacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCompliancePacksResponseBody self = new DeleteCompliancePacksResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCompliancePacksResponseBody setOperateCompliancePacksResult(DeleteCompliancePacksResponseBodyOperateCompliancePacksResult operateCompliancePacksResult) {
        this.operateCompliancePacksResult = operateCompliancePacksResult;
        return this;
    }
    public DeleteCompliancePacksResponseBodyOperateCompliancePacksResult getOperateCompliancePacksResult() {
        return this.operateCompliancePacksResult;
    }

    public DeleteCompliancePacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks extends TeaModel {
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Success")
        public Boolean success;

        public static DeleteCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks build(java.util.Map<String, ?> map) throws Exception {
            DeleteCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks self = new DeleteCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks();
            return TeaModel.build(map, self);
        }

        public DeleteCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks setCompliancePackId(String compliancePackId) {
            this.compliancePackId = compliancePackId;
            return this;
        }
        public String getCompliancePackId() {
            return this.compliancePackId;
        }

        public DeleteCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class DeleteCompliancePacksResponseBodyOperateCompliancePacksResult extends TeaModel {
        @NameInMap("OperateCompliancePacks")
        public java.util.List<DeleteCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks> operateCompliancePacks;

        public static DeleteCompliancePacksResponseBodyOperateCompliancePacksResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteCompliancePacksResponseBodyOperateCompliancePacksResult self = new DeleteCompliancePacksResponseBodyOperateCompliancePacksResult();
            return TeaModel.build(map, self);
        }

        public DeleteCompliancePacksResponseBodyOperateCompliancePacksResult setOperateCompliancePacks(java.util.List<DeleteCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks> operateCompliancePacks) {
            this.operateCompliancePacks = operateCompliancePacks;
            return this;
        }
        public java.util.List<DeleteCompliancePacksResponseBodyOperateCompliancePacksResultOperateCompliancePacks> getOperateCompliancePacks() {
            return this.operateCompliancePacks;
        }

    }

}
