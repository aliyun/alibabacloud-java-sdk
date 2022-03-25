// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ValidAliyunUidResponseBody extends TeaModel {
    @NameInMap("IsValid")
    public String isValid;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ValidAliyunUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidAliyunUidResponseBody self = new ValidAliyunUidResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidAliyunUidResponseBody setIsValid(String isValid) {
        this.isValid = isValid;
        return this;
    }
    public String getIsValid() {
        return this.isValid;
    }

    public ValidAliyunUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ValidAliyunUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
