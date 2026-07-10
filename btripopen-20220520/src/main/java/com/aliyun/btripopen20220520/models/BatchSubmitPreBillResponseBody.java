// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class BatchSubmitPreBillResponseBody extends TeaModel {
    /**
     * <p>The data.</p>
     */
    @NameInMap("module")
    public BatchSubmitPreBillResponseBodyModule module;

    /**
     * <p>The pagination token set by the server. Indicates whether more data exists on the next page during pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("more_page")
    public Boolean morePage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5009956-1077-52FB-B520-EA8C7E91D722</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("result_code")
    public Integer resultCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("result_msg")
    public String resultMsg;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>21041ce********056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static BatchSubmitPreBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSubmitPreBillResponseBody self = new BatchSubmitPreBillResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSubmitPreBillResponseBody setModule(BatchSubmitPreBillResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public BatchSubmitPreBillResponseBodyModule getModule() {
        return this.module;
    }

    public BatchSubmitPreBillResponseBody setMorePage(Boolean morePage) {
        this.morePage = morePage;
        return this;
    }
    public Boolean getMorePage() {
        return this.morePage;
    }

    public BatchSubmitPreBillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchSubmitPreBillResponseBody setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public Integer getResultCode() {
        return this.resultCode;
    }

    public BatchSubmitPreBillResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchSubmitPreBillResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchSubmitPreBillResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class BatchSubmitPreBillResponseBodyModuleForbidUpdateDetail extends TeaModel {
        /**
         * <p>The number of records that cannot be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("can_not_update_count")
        public Integer canNotUpdateCount;

        /**
         * <p>The number of records that can be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("can_update_count")
        public Integer canUpdateCount;

        /**
         * <p>The value.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;9999&quot;</p>
         */
        @NameInMap("value")
        public String value;

        public static BatchSubmitPreBillResponseBodyModuleForbidUpdateDetail build(java.util.Map<String, ?> map) throws Exception {
            BatchSubmitPreBillResponseBodyModuleForbidUpdateDetail self = new BatchSubmitPreBillResponseBodyModuleForbidUpdateDetail();
            return TeaModel.build(map, self);
        }

        public BatchSubmitPreBillResponseBodyModuleForbidUpdateDetail setCanNotUpdateCount(Integer canNotUpdateCount) {
            this.canNotUpdateCount = canNotUpdateCount;
            return this;
        }
        public Integer getCanNotUpdateCount() {
            return this.canNotUpdateCount;
        }

        public BatchSubmitPreBillResponseBodyModuleForbidUpdateDetail setCanUpdateCount(Integer canUpdateCount) {
            this.canUpdateCount = canUpdateCount;
            return this;
        }
        public Integer getCanUpdateCount() {
            return this.canUpdateCount;
        }

        public BatchSubmitPreBillResponseBodyModuleForbidUpdateDetail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class BatchSubmitPreBillResponseBodyModule extends TeaModel {
        /**
         * <p>The batch ID. This value may be null if no actionable bills exist.</p>
         * 
         * <strong>example:</strong>
         * <p>999</p>
         */
        @NameInMap("batch_id")
        public Long batchId;

        /**
         * <p>The number of bills that cannot be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("forbid_update_bill_count")
        public Integer forbidUpdateBillCount;

        /**
         * <p>The details of bills that cannot be updated.</p>
         */
        @NameInMap("forbid_update_detail")
        public java.util.List<BatchSubmitPreBillResponseBodyModuleForbidUpdateDetail> forbidUpdateDetail;

        /**
         * <p>The number of matched records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("match_count")
        public Integer matchCount;

        /**
         * <p>The number of unmatched records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("not_match_count")
        public Integer notMatchCount;

        /**
         * <p>The unmatched details.</p>
         */
        @NameInMap("not_match_detail")
        public java.util.List<String> notMatchDetail;

        public static BatchSubmitPreBillResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            BatchSubmitPreBillResponseBodyModule self = new BatchSubmitPreBillResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public BatchSubmitPreBillResponseBodyModule setBatchId(Long batchId) {
            this.batchId = batchId;
            return this;
        }
        public Long getBatchId() {
            return this.batchId;
        }

        public BatchSubmitPreBillResponseBodyModule setForbidUpdateBillCount(Integer forbidUpdateBillCount) {
            this.forbidUpdateBillCount = forbidUpdateBillCount;
            return this;
        }
        public Integer getForbidUpdateBillCount() {
            return this.forbidUpdateBillCount;
        }

        public BatchSubmitPreBillResponseBodyModule setForbidUpdateDetail(java.util.List<BatchSubmitPreBillResponseBodyModuleForbidUpdateDetail> forbidUpdateDetail) {
            this.forbidUpdateDetail = forbidUpdateDetail;
            return this;
        }
        public java.util.List<BatchSubmitPreBillResponseBodyModuleForbidUpdateDetail> getForbidUpdateDetail() {
            return this.forbidUpdateDetail;
        }

        public BatchSubmitPreBillResponseBodyModule setMatchCount(Integer matchCount) {
            this.matchCount = matchCount;
            return this;
        }
        public Integer getMatchCount() {
            return this.matchCount;
        }

        public BatchSubmitPreBillResponseBodyModule setNotMatchCount(Integer notMatchCount) {
            this.notMatchCount = notMatchCount;
            return this;
        }
        public Integer getNotMatchCount() {
            return this.notMatchCount;
        }

        public BatchSubmitPreBillResponseBodyModule setNotMatchDetail(java.util.List<String> notMatchDetail) {
            this.notMatchDetail = notMatchDetail;
            return this;
        }
        public java.util.List<String> getNotMatchDetail() {
            return this.notMatchDetail;
        }

    }

}
