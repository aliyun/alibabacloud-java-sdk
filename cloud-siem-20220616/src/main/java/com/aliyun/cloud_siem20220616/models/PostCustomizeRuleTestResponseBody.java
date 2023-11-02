// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class PostCustomizeRuleTestResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public Object data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PostCustomizeRuleTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PostCustomizeRuleTestResponseBody self = new PostCustomizeRuleTestResponseBody();
        return TeaModel.build(map, self);
    }

    public PostCustomizeRuleTestResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public PostCustomizeRuleTestResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public PostCustomizeRuleTestResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PostCustomizeRuleTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PostCustomizeRuleTestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
