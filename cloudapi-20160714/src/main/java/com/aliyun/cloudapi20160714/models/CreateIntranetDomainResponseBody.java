// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateIntranetDomainResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>auditing</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIntranetDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIntranetDomainResponseBody self = new CreateIntranetDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIntranetDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateIntranetDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
