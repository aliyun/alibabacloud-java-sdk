// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateErResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public CreateErResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateErResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateErResponseBody self = new CreateErResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateErResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateErResponseBody setContent(CreateErResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateErResponseBodyContent getContent() {
        return this.content;
    }

    public CreateErResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateErResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateErResponseBodyContent extends TeaModel {
        @NameInMap("ErId")
        public String erId;

        public static CreateErResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateErResponseBodyContent self = new CreateErResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateErResponseBodyContent setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

    }

}
