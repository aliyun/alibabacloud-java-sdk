// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class CreateEndpointResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2C5DAA30-****-5181-9B87-9D6181016197</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CreateEndpointResponseBodyResult result;

    public static CreateEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEndpointResponseBody self = new CreateEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEndpointResponseBody setResult(CreateEndpointResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateEndpointResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateEndpointResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>essep-abd***dks</p>
         */
        @NameInMap("endpointId")
        public String endpointId;

        public static CreateEndpointResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateEndpointResponseBodyResult self = new CreateEndpointResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateEndpointResponseBodyResult setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

    }

}
