// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskBizDataResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAiOutboundTaskBizDataResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAiOutboundTaskBizDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskBizDataResponseBody self = new GetAiOutboundTaskBizDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskBizDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAiOutboundTaskBizDataResponseBody setData(GetAiOutboundTaskBizDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAiOutboundTaskBizDataResponseBodyData getData() {
        return this.data;
    }

    public GetAiOutboundTaskBizDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAiOutboundTaskBizDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAiOutboundTaskBizDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAiOutboundTaskBizDataResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{&quot;customer&quot;:123}</p>
         */
        @NameInMap("BizData")
        public String bizData;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CaseId")
        public Long caseId;

        /**
         * <strong>example:</strong>
         * <p>158****0000</p>
         */
        @NameInMap("PhoneNum")
        public String phoneNum;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        public static GetAiOutboundTaskBizDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAiOutboundTaskBizDataResponseBodyData self = new GetAiOutboundTaskBizDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAiOutboundTaskBizDataResponseBodyData setBizData(String bizData) {
            this.bizData = bizData;
            return this;
        }
        public String getBizData() {
            return this.bizData;
        }

        public GetAiOutboundTaskBizDataResponseBodyData setCaseId(Long caseId) {
            this.caseId = caseId;
            return this;
        }
        public Long getCaseId() {
            return this.caseId;
        }

        public GetAiOutboundTaskBizDataResponseBodyData setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }
        public String getPhoneNum() {
            return this.phoneNum;
        }

        public GetAiOutboundTaskBizDataResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
