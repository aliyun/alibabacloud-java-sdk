// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteVpdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public Object content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVpdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpdResponseBody self = new DeleteVpdResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVpdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteVpdResponseBody setContent(Object content) {
        this.content = content;
        return this;
    }
    public Object getContent() {
        return this.content;
    }

    public DeleteVpdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteVpdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
