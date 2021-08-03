// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class PrimitiveOutputIntegerRequest extends TeaModel {
    @NameInMap("input")
    public PrimitiveOutputIntegerRequestInput input;

    public static PrimitiveOutputIntegerRequest build(java.util.Map<String, ?> map) throws Exception {
        PrimitiveOutputIntegerRequest self = new PrimitiveOutputIntegerRequest();
        return TeaModel.build(map, self);
    }

    public PrimitiveOutputIntegerRequest setInput(PrimitiveOutputIntegerRequestInput input) {
        this.input = input;
        return this;
    }
    public PrimitiveOutputIntegerRequestInput getInput() {
        return this.input;
    }

    public static class PrimitiveOutputIntegerRequestInput extends TeaModel {
        @NameInMap("request")
        public Integer request;

        @NameInMap("requestId")
        public String requestId;

        public static PrimitiveOutputIntegerRequestInput build(java.util.Map<String, ?> map) throws Exception {
            PrimitiveOutputIntegerRequestInput self = new PrimitiveOutputIntegerRequestInput();
            return TeaModel.build(map, self);
        }

        public PrimitiveOutputIntegerRequestInput setRequest(Integer request) {
            this.request = request;
            return this;
        }
        public Integer getRequest() {
            return this.request;
        }

        public PrimitiveOutputIntegerRequestInput setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
