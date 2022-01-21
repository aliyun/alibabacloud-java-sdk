// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateDynamicTagGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Id")
    public String id;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateDynamicTagGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDynamicTagGroupResponseBody self = new CreateDynamicTagGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDynamicTagGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDynamicTagGroupResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateDynamicTagGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDynamicTagGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDynamicTagGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
