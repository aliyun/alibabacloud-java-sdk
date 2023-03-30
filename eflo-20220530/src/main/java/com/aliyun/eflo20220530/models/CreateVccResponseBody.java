// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVccResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public CreateVccResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateVccResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVccResponseBody self = new CreateVccResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVccResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateVccResponseBody setContent(CreateVccResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateVccResponseBodyContent getContent() {
        return this.content;
    }

    public CreateVccResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVccResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateVccResponseBodyContent extends TeaModel {
        @NameInMap("VccId")
        public String vccId;

        public static CreateVccResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateVccResponseBodyContent self = new CreateVccResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateVccResponseBodyContent setVccId(String vccId) {
            this.vccId = vccId;
            return this;
        }
        public String getVccId() {
            return this.vccId;
        }

    }

}
