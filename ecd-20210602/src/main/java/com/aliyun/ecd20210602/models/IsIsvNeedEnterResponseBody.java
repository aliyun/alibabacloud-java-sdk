// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class IsIsvNeedEnterResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsNeed")
    public Boolean isNeed;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static IsIsvNeedEnterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IsIsvNeedEnterResponseBody self = new IsIsvNeedEnterResponseBody();
        return TeaModel.build(map, self);
    }

    public IsIsvNeedEnterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IsIsvNeedEnterResponseBody setIsNeed(Boolean isNeed) {
        this.isNeed = isNeed;
        return this;
    }
    public Boolean getIsNeed() {
        return this.isNeed;
    }

    public IsIsvNeedEnterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IsIsvNeedEnterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
