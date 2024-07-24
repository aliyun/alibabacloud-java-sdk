// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20230627.models;

import com.aliyun.tea.*;

public class UpdateEndpointResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FBAD8493-87FA-583E-8A4C-D487F2DE90FC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateEndpointResponseBodyResult result;

    public static UpdateEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEndpointResponseBody self = new UpdateEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEndpointResponseBody setResult(UpdateEndpointResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateEndpointResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateEndpointResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ep-bp1i98bcbb1540d0****</p>
         */
        @NameInMap("endpointId")
        public String endpointId;

        public static UpdateEndpointResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateEndpointResponseBodyResult self = new UpdateEndpointResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateEndpointResponseBodyResult setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

    }

}
