// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyPhoneBusinessProfileResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The URL of the website.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The websites.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyPhoneBusinessProfileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyPhoneBusinessProfileResponseBody self = new ModifyPhoneBusinessProfileResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyPhoneBusinessProfileResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ModifyPhoneBusinessProfileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyPhoneBusinessProfileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyPhoneBusinessProfileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
