// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ConfirmPreBillResponseBody extends TeaModel {
    /**
     * <p>The details of the returned result.</p>
     */
    @NameInMap("module")
    public ConfirmPreBillResponseBodyModule module;

    /**
     * <p>The pagination token set by the server. Indicates whether more data is available on the next page during pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("more_page")
    public Boolean morePage;

    /**
     * <p>The unique identifier of the request.</p>
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
     * <p>Indicates whether the API call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static ConfirmPreBillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfirmPreBillResponseBody self = new ConfirmPreBillResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfirmPreBillResponseBody setModule(ConfirmPreBillResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public ConfirmPreBillResponseBodyModule getModule() {
        return this.module;
    }

    public ConfirmPreBillResponseBody setMorePage(Boolean morePage) {
        this.morePage = morePage;
        return this;
    }
    public Boolean getMorePage() {
        return this.morePage;
    }

    public ConfirmPreBillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfirmPreBillResponseBody setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public Integer getResultCode() {
        return this.resultCode;
    }

    public ConfirmPreBillResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ConfirmPreBillResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ConfirmPreBillResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ConfirmPreBillResponseBodyModuleForbidUpdateDetail extends TeaModel {
        /**
         * <p>The number of items that cannot be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("can_not_update_count")
        public Integer canNotUpdateCount;

        /**
         * <p>The number of items that can be updated.</p>
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
         * <p>[]</p>
         */
        @NameInMap("value")
        public String value;

        public static ConfirmPreBillResponseBodyModuleForbidUpdateDetail build(java.util.Map<String, ?> map) throws Exception {
            ConfirmPreBillResponseBodyModuleForbidUpdateDetail self = new ConfirmPreBillResponseBodyModuleForbidUpdateDetail();
            return TeaModel.build(map, self);
        }

        public ConfirmPreBillResponseBodyModuleForbidUpdateDetail setCanNotUpdateCount(Integer canNotUpdateCount) {
            this.canNotUpdateCount = canNotUpdateCount;
            return this;
        }
        public Integer getCanNotUpdateCount() {
            return this.canNotUpdateCount;
        }

        public ConfirmPreBillResponseBodyModuleForbidUpdateDetail setCanUpdateCount(Integer canUpdateCount) {
            this.canUpdateCount = canUpdateCount;
            return this;
        }
        public Integer getCanUpdateCount() {
            return this.canUpdateCount;
        }

        public ConfirmPreBillResponseBodyModuleForbidUpdateDetail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ConfirmPreBillResponseBodyModule extends TeaModel {
        /**
         * <p>The batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9999</p>
         */
        @NameInMap("batch_id")
        public Long batchId;

        /**
         * <p>The number of bills that cannot be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("forbid_update_bill_count")
        public Integer forbidUpdateBillCount;

        /**
         * <p>The details of items that cannot be updated.</p>
         */
        @NameInMap("forbid_update_detail")
        public java.util.List<ConfirmPreBillResponseBodyModuleForbidUpdateDetail> forbidUpdateDetail;

        /**
         * <p>The number of matched items.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("match_count")
        public Integer matchCount;

        /**
         * <p>The number of unmatched items.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("not_match_count")
        public Integer notMatchCount;

        /**
         * <p>The details of unmatched items.</p>
         */
        @NameInMap("not_match_detail")
        public java.util.List<String> notMatchDetail;

        public static ConfirmPreBillResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            ConfirmPreBillResponseBodyModule self = new ConfirmPreBillResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public ConfirmPreBillResponseBodyModule setBatchId(Long batchId) {
            this.batchId = batchId;
            return this;
        }
        public Long getBatchId() {
            return this.batchId;
        }

        public ConfirmPreBillResponseBodyModule setForbidUpdateBillCount(Integer forbidUpdateBillCount) {
            this.forbidUpdateBillCount = forbidUpdateBillCount;
            return this;
        }
        public Integer getForbidUpdateBillCount() {
            return this.forbidUpdateBillCount;
        }

        public ConfirmPreBillResponseBodyModule setForbidUpdateDetail(java.util.List<ConfirmPreBillResponseBodyModuleForbidUpdateDetail> forbidUpdateDetail) {
            this.forbidUpdateDetail = forbidUpdateDetail;
            return this;
        }
        public java.util.List<ConfirmPreBillResponseBodyModuleForbidUpdateDetail> getForbidUpdateDetail() {
            return this.forbidUpdateDetail;
        }

        public ConfirmPreBillResponseBodyModule setMatchCount(Integer matchCount) {
            this.matchCount = matchCount;
            return this;
        }
        public Integer getMatchCount() {
            return this.matchCount;
        }

        public ConfirmPreBillResponseBodyModule setNotMatchCount(Integer notMatchCount) {
            this.notMatchCount = notMatchCount;
            return this;
        }
        public Integer getNotMatchCount() {
            return this.notMatchCount;
        }

        public ConfirmPreBillResponseBodyModule setNotMatchDetail(java.util.List<String> notMatchDetail) {
            this.notMatchDetail = notMatchDetail;
            return this;
        }
        public java.util.List<String> getNotMatchDetail() {
            return this.notMatchDetail;
        }

    }

}
