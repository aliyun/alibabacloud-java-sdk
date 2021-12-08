// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreateAxgGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAxgGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAxgGroupResponseBody self = new CreateAxgGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAxgGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAxgGroupResponseBody setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateAxgGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAxgGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
