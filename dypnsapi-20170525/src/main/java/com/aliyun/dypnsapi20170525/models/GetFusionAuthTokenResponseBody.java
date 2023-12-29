// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetFusionAuthTokenResponseBody extends TeaModel {
    /**
     * <p>The response code. If OK is returned, the request is successful. Other values indicate that the request failed. For more information, see Error codes.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The authentication code. The value of this parameter is a string.</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values: true false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetFusionAuthTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFusionAuthTokenResponseBody self = new GetFusionAuthTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFusionAuthTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetFusionAuthTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetFusionAuthTokenResponseBody setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public GetFusionAuthTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFusionAuthTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
