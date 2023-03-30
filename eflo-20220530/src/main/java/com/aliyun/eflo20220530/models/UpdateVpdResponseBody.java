// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateVpdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public UpdateVpdResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateVpdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpdResponseBody self = new UpdateVpdResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVpdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateVpdResponseBody setContent(UpdateVpdResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public UpdateVpdResponseBodyContent getContent() {
        return this.content;
    }

    public UpdateVpdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateVpdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateVpdResponseBodyContent extends TeaModel {
        @NameInMap("VpdId")
        public String vpdId;

        public static UpdateVpdResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateVpdResponseBodyContent self = new UpdateVpdResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public UpdateVpdResponseBodyContent setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

}
