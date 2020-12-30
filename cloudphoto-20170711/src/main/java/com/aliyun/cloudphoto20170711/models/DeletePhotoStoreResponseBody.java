// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class DeletePhotoStoreResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static DeletePhotoStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePhotoStoreResponseBody self = new DeletePhotoStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePhotoStoreResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public DeletePhotoStoreResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeletePhotoStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeletePhotoStoreResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
