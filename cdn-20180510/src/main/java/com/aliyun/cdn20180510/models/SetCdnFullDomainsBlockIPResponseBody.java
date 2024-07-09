// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnFullDomainsBlockIPResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>23ACE7E2-2302-42E3-98F8-E5E697FD86C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetCdnFullDomainsBlockIPResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCdnFullDomainsBlockIPResponseBody self = new SetCdnFullDomainsBlockIPResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCdnFullDomainsBlockIPResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SetCdnFullDomainsBlockIPResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetCdnFullDomainsBlockIPResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
