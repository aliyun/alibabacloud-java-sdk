// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskBizDataResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    // 本次呼叫关联的业务信息
    @NameInMap("Data")
    public GetAiOutboundTaskBizDataResponseBodyData data;

    public static GetAiOutboundTaskBizDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskBizDataResponseBody self = new GetAiOutboundTaskBizDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskBizDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAiOutboundTaskBizDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAiOutboundTaskBizDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAiOutboundTaskBizDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAiOutboundTaskBizDataResponseBody setData(GetAiOutboundTaskBizDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAiOutboundTaskBizDataResponseBodyData getData() {
        return this.data;
    }

    public static class GetAiOutboundTaskBizDataResponseBodyData extends TeaModel {
        // id
        @NameInMap("CaseId")
        public Long caseId;

        // 外呼号码
        @NameInMap("PhoneNum")
        public String phoneNum;

        // 业务自定义信息
        @NameInMap("BizData")
        public String bizData;

        // 任务ID
        @NameInMap("TaskId")
        public Long taskId;

        public static GetAiOutboundTaskBizDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAiOutboundTaskBizDataResponseBodyData self = new GetAiOutboundTaskBizDataResponseBodyData();
            return TeaModel.build(map, self);
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

        public GetAiOutboundTaskBizDataResponseBodyData setBizData(String bizData) {
            this.bizData = bizData;
            return this;
        }
        public String getBizData() {
            return this.bizData;
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
