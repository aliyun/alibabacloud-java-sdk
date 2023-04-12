// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteCompliancePacksResponseBody extends TeaModel {
    /**
     * <p>The results of the delete operations.</p>
     */
    @NameInMap("OperateCompliancePacksResult")
    public DeleteCompliancePacksResponseBodyOperateCompliancePacksResult operateCompliancePacksResult;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The ID of the compliance package.</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The error code.</p>
         * <br>
         * <p>*   If the compliance package is deleted, no error code is returned.</p>
         * <p>*   If the compliance package fails to be deleted, an error code is returned. For more information about error codes, visit the [API Error Center](https://error-center.alibabacloud.com/status/product/Config).</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Indicates whether the operation is successful. Valid values:</p>
         * <br>
         * <p>*   true: The operation is successful.</p>
         * <p>*   false: The operation fails.</p>
         */
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
        /**
         * <p>The result of the delete operation.</p>
         */
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
