// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class InitializeVccResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public InitializeVccResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static InitializeVccResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitializeVccResponseBody self = new InitializeVccResponseBody();
        return TeaModel.build(map, self);
    }

    public InitializeVccResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public InitializeVccResponseBody setContent(InitializeVccResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public InitializeVccResponseBodyContent getContent() {
        return this.content;
    }

    public InitializeVccResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitializeVccResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InitializeVccResponseBodyContent extends TeaModel {
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("RoleName")
        public String roleName;

        public static InitializeVccResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            InitializeVccResponseBodyContent self = new InitializeVccResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public InitializeVccResponseBodyContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public InitializeVccResponseBodyContent setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

}
