// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class MakeDoubleCallResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 调用是否成功
    @NameInMap("Success")
    public Boolean success;

    // 错误码
    @NameInMap("Code")
    public String code;

    // 错误信息
    @NameInMap("Message")
    public String message;

    // 返回数据
    @NameInMap("Data")
    public MakeDoubleCallResponseBodyData data;

    public static MakeDoubleCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MakeDoubleCallResponseBody self = new MakeDoubleCallResponseBody();
        return TeaModel.build(map, self);
    }

    public MakeDoubleCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MakeDoubleCallResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MakeDoubleCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MakeDoubleCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MakeDoubleCallResponseBody setData(MakeDoubleCallResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MakeDoubleCallResponseBodyData getData() {
        return this.data;
    }

    public static class MakeDoubleCallResponseBodyData extends TeaModel {
        // 会话id
        @NameInMap("Acid")
        public String acid;

        public static MakeDoubleCallResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MakeDoubleCallResponseBodyData self = new MakeDoubleCallResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MakeDoubleCallResponseBodyData setAcid(String acid) {
            this.acid = acid;
            return this;
        }
        public String getAcid() {
            return this.acid;
        }

    }

}
