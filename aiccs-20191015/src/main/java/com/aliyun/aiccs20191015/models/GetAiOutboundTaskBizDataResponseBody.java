// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskBizDataResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business information associated with this call.</p>
     */
    @NameInMap("Data")
    public GetAiOutboundTaskBizDataResponseBodyData data;

    /**
     * <p>Description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call succeeded.</p>
     * <ul>
     * <li><strong>true</strong>: Succeeded.</li>
     * <li><strong>false</strong>: Failed.</li>
     * </ul>
     * 
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
         * <p>Custom business information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;customer&quot;:123}</p>
         */
        @NameInMap("BizData")
        public String bizData;

        /**
         * <p>The Activity ID associated with this outbound call.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CaseId")
        public Long caseId;

        /**
         * <p>The outbound phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>158****0000</p>
         */
        @NameInMap("PhoneNum")
        public String phoneNum;

        /**
         * <p>The job ID.</p>
         * 
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
