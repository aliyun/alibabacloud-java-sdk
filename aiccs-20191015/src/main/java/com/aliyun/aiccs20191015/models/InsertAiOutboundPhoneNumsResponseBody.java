// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class InsertAiOutboundPhoneNumsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    // 导入结果
    @NameInMap("Data")
    public InsertAiOutboundPhoneNumsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
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
        // 自定义信息
        @NameInMap("BizData")
        public String bizData;

        // 失败原因描述
        @NameInMap("Msg")
        public String msg;

        // 外呼被叫号码
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
        // 失败号码详情
        @NameInMap("FailInfo")
        public java.util.List<InsertAiOutboundPhoneNumsResponseBodyDataFailInfo> failInfo;

        // 导入成功数量
        @NameInMap("SuccessCount")
        public Integer successCount;

        // 导入总数
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
