// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RegistAnonymousTbAccountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>FC994CBE-F97C-5C58-ACF3-86F0292C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RegistAnonymousTbAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegistAnonymousTbAccountResponseBody self = new RegistAnonymousTbAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public RegistAnonymousTbAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RegistAnonymousTbAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RegistAnonymousTbAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
