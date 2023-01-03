// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateVccResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public UpdateVccResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateVccResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVccResponseBody self = new UpdateVccResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVccResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateVccResponseBody setContent(UpdateVccResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public UpdateVccResponseBodyContent getContent() {
        return this.content;
    }

    public UpdateVccResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateVccResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateVccResponseBodyContent extends TeaModel {
        @NameInMap("VccId")
        public String vccId;

        public static UpdateVccResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateVccResponseBodyContent self = new UpdateVccResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public UpdateVccResponseBodyContent setVccId(String vccId) {
            this.vccId = vccId;
            return this;
        }
        public String getVccId() {
            return this.vccId;
        }

    }

}
