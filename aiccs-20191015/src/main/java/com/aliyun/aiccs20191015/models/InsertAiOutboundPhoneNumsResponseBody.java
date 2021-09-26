// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class InsertAiOutboundPhoneNumsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    // 导入结果
    @NameInMap("Data")
    public InsertAiOutboundPhoneNumsResponseBodyData data;

    public static InsertAiOutboundPhoneNumsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertAiOutboundPhoneNumsResponseBody self = new InsertAiOutboundPhoneNumsResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertAiOutboundPhoneNumsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsertAiOutboundPhoneNumsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsertAiOutboundPhoneNumsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InsertAiOutboundPhoneNumsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InsertAiOutboundPhoneNumsResponseBody setData(InsertAiOutboundPhoneNumsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InsertAiOutboundPhoneNumsResponseBodyData getData() {
        return this.data;
    }

    public static class InsertAiOutboundPhoneNumsResponseBodyDataFailInfo extends TeaModel {
        // 自定义信息
        @NameInMap("BizData")
        public String bizData;

        // 外呼被叫号码
        @NameInMap("PhoneNum")
        public String phoneNum;

        // 失败原因描述
        @NameInMap("Msg")
        public String msg;

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

        public InsertAiOutboundPhoneNumsResponseBodyDataFailInfo setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }
        public String getPhoneNum() {
            return this.phoneNum;
        }

        public InsertAiOutboundPhoneNumsResponseBodyDataFailInfo setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

    }

    public static class InsertAiOutboundPhoneNumsResponseBodyData extends TeaModel {
        // 导入总数
        @NameInMap("TotalCount")
        public Integer totalCount;

        // 导入成功数量
        @NameInMap("SuccessCount")
        public Integer successCount;

        // 失败号码详情
        @NameInMap("FailInfo")
        public java.util.List<InsertAiOutboundPhoneNumsResponseBodyDataFailInfo> failInfo;

        public static InsertAiOutboundPhoneNumsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InsertAiOutboundPhoneNumsResponseBodyData self = new InsertAiOutboundPhoneNumsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InsertAiOutboundPhoneNumsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public InsertAiOutboundPhoneNumsResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public InsertAiOutboundPhoneNumsResponseBodyData setFailInfo(java.util.List<InsertAiOutboundPhoneNumsResponseBodyDataFailInfo> failInfo) {
            this.failInfo = failInfo;
            return this;
        }
        public java.util.List<InsertAiOutboundPhoneNumsResponseBodyDataFailInfo> getFailInfo() {
            return this.failInfo;
        }

    }

}
