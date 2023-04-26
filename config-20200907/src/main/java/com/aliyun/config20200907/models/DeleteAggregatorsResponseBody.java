// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregatorsResponseBody extends TeaModel {
    /**
     * <p>The result for the account group.</p>
     */
    @NameInMap("OperateAggregatorsResult")
    public DeleteAggregatorsResponseBodyOperateAggregatorsResult operateAggregatorsResult;

    /**
     * <p>The results of the delete operations.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAggregatorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregatorsResponseBody self = new DeleteAggregatorsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAggregatorsResponseBody setOperateAggregatorsResult(DeleteAggregatorsResponseBodyOperateAggregatorsResult operateAggregatorsResult) {
        this.operateAggregatorsResult = operateAggregatorsResult;
        return this;
    }
    public DeleteAggregatorsResponseBodyOperateAggregatorsResult getOperateAggregatorsResult() {
        return this.operateAggregatorsResult;
    }

    public DeleteAggregatorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteAggregatorsResponseBodyOperateAggregatorsResultOperateAggregators extends TeaModel {
        @NameInMap("AggregatorId")
        public String aggregatorId;

        /**
         * <p>Indicates whether the delete operation is successful. Valid values:</p>
         * <br>
         * <p>*   true: The account group is deleted.</p>
         * <p>*   false: The account group fails to be deleted.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The ID of the account group.</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DeleteAggregatorsResponseBodyOperateAggregatorsResultOperateAggregators build(java.util.Map<String, ?> map) throws Exception {
            DeleteAggregatorsResponseBodyOperateAggregatorsResultOperateAggregators self = new DeleteAggregatorsResponseBodyOperateAggregatorsResultOperateAggregators();
            return TeaModel.build(map, self);
        }

        public DeleteAggregatorsResponseBodyOperateAggregatorsResultOperateAggregators setAggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }
        public String getAggregatorId() {
            return this.aggregatorId;
        }

        public DeleteAggregatorsResponseBodyOperateAggregatorsResultOperateAggregators setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DeleteAggregatorsResponseBodyOperateAggregatorsResultOperateAggregators setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class DeleteAggregatorsResponseBodyOperateAggregatorsResult extends TeaModel {
        /**
         * <p>The error code.</p>
         * <br>
         * <p>>  No error code is returned for the account group if the account group is deleted.</p>
         */
        @NameInMap("OperateAggregators")
        public java.util.List<DeleteAggregatorsResponseBodyOperateAggregatorsResultOperateAggregators> operateAggregators;

        public static DeleteAggregatorsResponseBodyOperateAggregatorsResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteAggregatorsResponseBodyOperateAggregatorsResult self = new DeleteAggregatorsResponseBodyOperateAggregatorsResult();
            return TeaModel.build(map, self);
        }

        public DeleteAggregatorsResponseBodyOperateAggregatorsResult setOperateAggregators(java.util.List<DeleteAggregatorsResponseBodyOperateAggregatorsResultOperateAggregators> operateAggregators) {
            this.operateAggregators = operateAggregators;
            return this;
        }
        public java.util.List<DeleteAggregatorsResponseBodyOperateAggregatorsResultOperateAggregators> getOperateAggregators() {
            return this.operateAggregators;
        }

    }

}
