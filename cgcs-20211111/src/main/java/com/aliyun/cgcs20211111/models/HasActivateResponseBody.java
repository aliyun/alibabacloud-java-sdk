// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class HasActivateResponseBody extends TeaModel {
    // 业务处理结果Code
    @NameInMap("Code")
    public String code;

    // 业务对象
    @NameInMap("Data")
    public HasActivateResponseBodyData data;

    // 业务处理消息摘要
    @NameInMap("Message")
    public String message;

    // 操作请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 业务处理是否成功
    @NameInMap("Success")
    public Boolean success;

    public static HasActivateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HasActivateResponseBody self = new HasActivateResponseBody();
        return TeaModel.build(map, self);
    }

    public HasActivateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HasActivateResponseBody setData(HasActivateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public HasActivateResponseBodyData getData() {
        return this.data;
    }

    public HasActivateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HasActivateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HasActivateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class HasActivateResponseBodyData extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        public static HasActivateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            HasActivateResponseBodyData self = new HasActivateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public HasActivateResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
