// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class PrimitiveOutputBooleanRequest extends TeaModel {
    @NameInMap("input")
    public PrimitiveOutputBooleanRequestInput input;

    public static PrimitiveOutputBooleanRequest build(java.util.Map<String, ?> map) throws Exception {
        PrimitiveOutputBooleanRequest self = new PrimitiveOutputBooleanRequest();
        return TeaModel.build(map, self);
    }

    public PrimitiveOutputBooleanRequest setInput(PrimitiveOutputBooleanRequestInput input) {
        this.input = input;
        return this;
    }
    public PrimitiveOutputBooleanRequestInput getInput() {
        return this.input;
    }

    public static class PrimitiveOutputBooleanRequestInput extends TeaModel {
        @NameInMap("request")
        public Boolean request;

        @NameInMap("requestId")
        public java.io.InputStream requestId;

        public static PrimitiveOutputBooleanRequestInput build(java.util.Map<String, ?> map) throws Exception {
            PrimitiveOutputBooleanRequestInput self = new PrimitiveOutputBooleanRequestInput();
            return TeaModel.build(map, self);
        }

        public PrimitiveOutputBooleanRequestInput setRequest(Boolean request) {
            this.request = request;
            return this;
        }
        public Boolean getRequest() {
            return this.request;
        }

        public PrimitiveOutputBooleanRequestInput setRequestId(java.io.InputStream requestId) {
            this.requestId = requestId;
            return this;
        }
        public java.io.InputStream getRequestId() {
            return this.requestId;
        }

    }

}
