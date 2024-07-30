// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateDomainResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dm_mtohn6mltdz3ibtly2rxvnvxxx</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainResponseBody self = new CreateDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDomainResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public CreateDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
