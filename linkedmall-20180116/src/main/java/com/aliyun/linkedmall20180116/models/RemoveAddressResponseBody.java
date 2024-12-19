// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RemoveAddressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5E2D59BA-4EB0-45C4-A0D7-D98C1A4B320B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveAddressResponseBody self = new RemoveAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveAddressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveAddressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
