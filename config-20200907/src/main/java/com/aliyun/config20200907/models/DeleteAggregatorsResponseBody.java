// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregatorsResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("OperateAggregatorsResult")
    public DeleteAggregatorsResponseBodyOperateAggregatorsResult operateAggregatorsResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8195B664-9565-4685-89AC-8B5F04B44B92</p>
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
        /**
         * <p>The ID of the account group.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-dacf86d8314e00eb****</p>
         */
        @NameInMap("AggregatorId")
        public String aggregatorId;

        /**
         * <p>The error code returned.</p>
         * <blockquote>
         * <p>No error code is returned for the account group if the account group is deleted.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AccountNotExisted</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The details of the account group.</p>
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
