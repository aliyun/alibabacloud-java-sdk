// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class IsvGetAppIdResponseBody extends TeaModel {
    /**
     * <p>The message ID.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The HTTP status code returned.</p>
     * <br>
     * <p>*   A value of OK indicates that the call is successful.</p>
     * <p>*   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static IsvGetAppIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IsvGetAppIdResponseBody self = new IsvGetAppIdResponseBody();
        return TeaModel.build(map, self);
    }

    public IsvGetAppIdResponseBody setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public IsvGetAppIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IsvGetAppIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IsvGetAppIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
