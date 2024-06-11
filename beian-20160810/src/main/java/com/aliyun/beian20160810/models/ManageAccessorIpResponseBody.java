// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class ManageAccessorIpResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ManageAccessorIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ManageAccessorIpResponseBody self = new ManageAccessorIpResponseBody();
        return TeaModel.build(map, self);
    }

    public ManageAccessorIpResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ManageAccessorIpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ManageAccessorIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
