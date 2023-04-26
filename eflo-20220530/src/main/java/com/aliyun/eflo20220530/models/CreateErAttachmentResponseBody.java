// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateErAttachmentResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public CreateErAttachmentResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateErAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateErAttachmentResponseBody self = new CreateErAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateErAttachmentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateErAttachmentResponseBody setContent(CreateErAttachmentResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateErAttachmentResponseBodyContent getContent() {
        return this.content;
    }

    public CreateErAttachmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateErAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateErAttachmentResponseBodyContent extends TeaModel {
        @NameInMap("ErAttachmentId")
        public String erAttachmentId;

        public static CreateErAttachmentResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateErAttachmentResponseBodyContent self = new CreateErAttachmentResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateErAttachmentResponseBodyContent setErAttachmentId(String erAttachmentId) {
            this.erAttachmentId = erAttachmentId;
            return this;
        }
        public String getErAttachmentId() {
            return this.erAttachmentId;
        }

    }

}
