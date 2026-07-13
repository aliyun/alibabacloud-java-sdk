// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeAtiRegistrantRequest extends TeaModel {
    /**
     * <p>Ensures the idempotence of the request. Generate a parameter value from your client to ensure uniqueness across different requests. ClientToken supports only ASCII characters and cannot exceed 64 characters in length.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiIsInR5cC.....</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the real-name verified registrant.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2072277378616354816</p>
     */
    @NameInMap("RegistrantId")
    public String registrantId;

    public static DescribeAtiRegistrantRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAtiRegistrantRequest self = new DescribeAtiRegistrantRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAtiRegistrantRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeAtiRegistrantRequest setRegistrantId(String registrantId) {
        this.registrantId = registrantId;
        return this;
    }
    public String getRegistrantId() {
        return this.registrantId;
    }

}
