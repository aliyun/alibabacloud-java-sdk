// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateSnatEntryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>018EED6A-69CA-58C8-A345-498927D5D34E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the SNAT entry.</p>
     * 
     * <strong>example:</strong>
     * <p>snat-5tc08qfj5ecblfdn2rqr9****</p>
     */
    @NameInMap("SnatEntryId")
    public String snatEntryId;

    public static CreateSnatEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSnatEntryResponseBody self = new CreateSnatEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSnatEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSnatEntryResponseBody setSnatEntryId(String snatEntryId) {
        this.snatEntryId = snatEntryId;
        return this;
    }
    public String getSnatEntryId() {
        return this.snatEntryId;
    }

}
