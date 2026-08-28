// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class RefreshPluginOAuthCodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>566C6A32-A971-59F2-A9C6-9C73277BA0B8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static RefreshPluginOAuthCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshPluginOAuthCodeResponseBody self = new RefreshPluginOAuthCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshPluginOAuthCodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RefreshPluginOAuthCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RefreshPluginOAuthCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
