// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class ArrayOutputRequest extends TeaModel {
    @NameInMap("innput")
    public ArrayOutputRequestInnput innput;

    public static ArrayOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        ArrayOutputRequest self = new ArrayOutputRequest();
        return TeaModel.build(map, self);
    }

    public ArrayOutputRequest setInnput(ArrayOutputRequestInnput innput) {
        this.innput = innput;
        return this;
    }
    public ArrayOutputRequestInnput getInnput() {
        return this.innput;
    }

    public static class ArrayOutputRequestInnput extends TeaModel {
        @NameInMap("request")
        public String request;

        @NameInMap("requestId")
        public String requestId;

        public static ArrayOutputRequestInnput build(java.util.Map<String, ?> map) throws Exception {
            ArrayOutputRequestInnput self = new ArrayOutputRequestInnput();
            return TeaModel.build(map, self);
        }

        public ArrayOutputRequestInnput setRequest(String request) {
            this.request = request;
            return this;
        }
        public String getRequest() {
            return this.request;
        }

        public ArrayOutputRequestInnput setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
