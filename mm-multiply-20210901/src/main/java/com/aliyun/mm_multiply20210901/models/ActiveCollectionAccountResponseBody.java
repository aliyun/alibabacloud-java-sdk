// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ActiveCollectionAccountResponseBody extends TeaModel {
    @NameInMap("ActiveSuccess")
    public Boolean activeSuccess;

    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ActiveCollectionAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActiveCollectionAccountResponseBody self = new ActiveCollectionAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ActiveCollectionAccountResponseBody setActiveSuccess(Boolean activeSuccess) {
        this.activeSuccess = activeSuccess;
        return this;
    }
    public Boolean getActiveSuccess() {
        return this.activeSuccess;
    }

    public ActiveCollectionAccountResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ActiveCollectionAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ActiveCollectionAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ActiveCollectionAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
