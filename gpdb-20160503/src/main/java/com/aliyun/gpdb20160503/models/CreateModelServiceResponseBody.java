// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateModelServiceResponseBody extends TeaModel {
    /**
     * <p>The model service ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ms-xxxxxxxxx</p>
     */
    @NameInMap("ModelServiceId")
    public String modelServiceId;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateModelServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateModelServiceResponseBody self = new CreateModelServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateModelServiceResponseBody setModelServiceId(String modelServiceId) {
        this.modelServiceId = modelServiceId;
        return this;
    }
    public String getModelServiceId() {
        return this.modelServiceId;
    }

    public CreateModelServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
