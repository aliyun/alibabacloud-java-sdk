// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregateCompliancePacksResponseBody extends TeaModel {
    /**
     * <p>The results of the delete operations.</p>
     */
    @NameInMap("OperateCompliancePacksResult")
    public DeleteAggregateCompliancePacksResponseBodyOperateCompliancePacksResult operateCompliancePacksResult;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The ID of the compliance package.</p>
         */
        @NameInMap("CompliancePackId")
        public String compliancePackId;

        /**
         * <p>The error code returned.</p>
         * <br>
         * <p>*   If the compliance package is deleted, no error code is returned.</p>
         * <p>*   If the compliance package fails to be deleted, an error code is returned. For more information about error codes, see [Error codes](https://error-center.alibabacloud.com/status/product/Config).</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <br>
         * <p>*   true: The request was successful.</p>
         * <p>*   false: The request failed.</p>
         */
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
        /**
         * <p>An array that contains the deleted compliance packages.</p>
         */
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
