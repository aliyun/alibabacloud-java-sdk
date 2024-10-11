// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class PushColdStartDocumentRequest extends TeaModel {
    @NameInMap("body")
    public java.util.List<PushColdStartDocumentRequestBody> body;

    public static PushColdStartDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        PushColdStartDocumentRequest self = new PushColdStartDocumentRequest();
        return TeaModel.build(map, self);
    }

    public PushColdStartDocumentRequest setBody(java.util.List<PushColdStartDocumentRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<PushColdStartDocumentRequestBody> getBody() {
        return this.body;
    }

    public static class PushColdStartDocumentRequestBody extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("cmd")
        public String cmd;

        /**
         * <strong>example:</strong>
         * <p>userId</p>
         */
        @NameInMap("fields")
        public Object fields;

        public static PushColdStartDocumentRequestBody build(java.util.Map<String, ?> map) throws Exception {
            PushColdStartDocumentRequestBody self = new PushColdStartDocumentRequestBody();
            return TeaModel.build(map, self);
        }

        public PushColdStartDocumentRequestBody setCmd(String cmd) {
            this.cmd = cmd;
            return this;
        }
        public String getCmd() {
            return this.cmd;
        }

        public PushColdStartDocumentRequestBody setFields(Object fields) {
            this.fields = fields;
            return this;
        }
        public Object getFields() {
            return this.fields;
        }

    }

}
