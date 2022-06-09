// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnFullDomainsBlockIPResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SetDcdnFullDomainsBlockIPResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnFullDomainsBlockIPResponseBody self = new SetDcdnFullDomainsBlockIPResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDcdnFullDomainsBlockIPResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SetDcdnFullDomainsBlockIPResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetDcdnFullDomainsBlockIPResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
