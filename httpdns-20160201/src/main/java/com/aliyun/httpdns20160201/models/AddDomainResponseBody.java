// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class AddDomainResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>ADA27798-6911-4B06-AF34-53F62F62XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDomainResponseBody self = new AddDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
