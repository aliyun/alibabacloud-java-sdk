// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RefreshAccessUrlResponseBody extends TeaModel {
    @NameInMap("AccessUrl")
    public String accessUrl;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static RefreshAccessUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefreshAccessUrlResponseBody self = new RefreshAccessUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public RefreshAccessUrlResponseBody setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
        return this;
    }
    public String getAccessUrl() {
        return this.accessUrl;
    }

    public RefreshAccessUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RefreshAccessUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RefreshAccessUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefreshAccessUrlResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
