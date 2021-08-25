// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregatorsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OperateAggregatorsResult")
    public DeleteAggregatorsResponseBodyOperateAggregatorsResult operateAggregatorsResult;

    public static DeleteAggregatorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregatorsResponseBody self = new DeleteAggregatorsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAggregatorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAggregatorsResponseBody setOperateAggregatorsResult(DeleteAggregatorsResponseBodyOperateAggregatorsResult operateAggregatorsResult) {
        this.operateAggregatorsResult = operateAggregatorsResult;
        return this;
    }
    public DeleteAggregatorsResponseBodyOperateAggregatorsResult getOperateAggregatorsResult() {
        return this.operateAggregatorsResult;
    }

    public static class DeleteAggregatorsResponseBodyOperateAggregatorsResultOperateAggregators extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("AggregatorId")
        public String aggregatorId;

        public static DeleteAggregatorsResponseBodyOperateAggregatorsResultOperateAggregators build(java.util.Map<String, ?> map) throws Exception {
            DeleteAggregatorsResponseBodyOperateAggregatorsResultOperateAggregators self = new DeleteAggregatorsResponseBodyOperateAggregatorsResultOperateAggregators();
            return TeaModel.build(map, self);
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

        public DeleteAggregatorsResponseBodyOperateAggregatorsResultOperateAggregators setAggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }
        public String getAggregatorId() {
            return this.aggregatorId;
        }

    }

    public static class DeleteAggregatorsResponseBodyOperateAggregatorsResult extends TeaModel {
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
