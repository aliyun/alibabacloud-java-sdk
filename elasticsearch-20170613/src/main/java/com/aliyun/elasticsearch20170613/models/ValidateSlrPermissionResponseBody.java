// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ValidateSlrPermissionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BC4ED7DD-8C84-49B5-8A95-456F82E44D13</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static ValidateSlrPermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateSlrPermissionResponseBody self = new ValidateSlrPermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateSlrPermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateSlrPermissionResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
