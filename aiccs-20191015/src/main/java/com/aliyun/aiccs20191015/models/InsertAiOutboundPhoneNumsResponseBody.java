// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class InsertAiOutboundPhoneNumsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public InsertAiOutboundPhoneNumsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static InsertAiOutboundPhoneNumsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertAiOutboundPhoneNumsResponseBody self = new InsertAiOutboundPhoneNumsResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertAiOutboundPhoneNumsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InsertAiOutboundPhoneNumsResponseBody setData(InsertAiOutboundPhoneNumsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InsertAiOutboundPhoneNumsResponseBodyData getData() {
        return this.data;
    }

    public InsertAiOutboundPhoneNumsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsertAiOutboundPhoneNumsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsertAiOutboundPhoneNumsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InsertAiOutboundPhoneNumsResponseBodyDataFailInfo extends TeaModel {
        @NameInMap("BizData")
        public String bizData;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("PhoneNum")
        public String phoneNum;

        public static InsertAiOutboundPhoneNumsResponseBodyDataFailInfo build(java.util.Map<String, ?> map) throws Exception {
            InsertAiOutboundPhoneNumsResponseBodyDataFailInfo self = new InsertAiOutboundPhoneNumsResponseBodyDataFailInfo();
            return TeaModel.build(map, self);
        }

        public InsertAiOutboundPhoneNumsResponseBodyDataFailInfo setBizData(String bizData) {
            this.bizData = bizData;
            return this;
        }
        public String getBizData() {
            return this.bizData;
        }

        public InsertAiOutboundPhoneNumsResponseBodyDataFailInfo setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public InsertAiOutboundPhoneNumsResponseBodyDataFailInfo setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }
        public String getPhoneNum() {
            return this.phoneNum;
        }

    }

    public static class InsertAiOutboundPhoneNumsResponseBodyData extends TeaModel {
        @NameInMap("FailInfo")
        public java.util.List<InsertAiOutboundPhoneNumsResponseBodyDataFailInfo> failInfo;

        @NameInMap("SuccessCount")
        public Integer successCount;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static InsertAiOutboundPhoneNumsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InsertAiOutboundPhoneNumsResponseBodyData self = new InsertAiOutboundPhoneNumsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InsertAiOutboundPhoneNumsResponseBodyData setFailInfo(java.util.List<InsertAiOutboundPhoneNumsResponseBodyDataFailInfo> failInfo) {
            this.failInfo = failInfo;
            return this;
        }
        public java.util.List<InsertAiOutboundPhoneNumsResponseBodyDataFailInfo> getFailInfo() {
            return this.failInfo;
        }

        public InsertAiOutboundPhoneNumsResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public InsertAiOutboundPhoneNumsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
