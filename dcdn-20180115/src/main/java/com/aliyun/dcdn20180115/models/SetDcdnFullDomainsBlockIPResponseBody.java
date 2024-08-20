// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnFullDomainsBlockIPResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <p>If the value of Code is not 0, specific required parameters are missing or the parameter format is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-802B-72F8FD6DA2FE</p>
     */
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
