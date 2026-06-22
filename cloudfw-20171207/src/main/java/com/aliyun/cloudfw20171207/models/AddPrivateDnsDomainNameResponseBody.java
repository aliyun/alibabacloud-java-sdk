// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddPrivateDnsDomainNameResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F0F82705-CFC7-5F83-86C8-A063892F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddPrivateDnsDomainNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPrivateDnsDomainNameResponseBody self = new AddPrivateDnsDomainNameResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPrivateDnsDomainNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
