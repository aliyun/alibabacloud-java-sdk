// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateForwardEntryResponseBody extends TeaModel {
    /**
     * <p>The ID of the DNAT entry.</p>
     * 
     * <strong>example:</strong>
     * <p>fwd-5tc07cw14metghn3siv4ak8do</p>
     */
    @NameInMap("ForwardEntryId")
    public String forwardEntryId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EF6D6FA4-DACA-5822-A981-81006271D263</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateForwardEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateForwardEntryResponseBody self = new CreateForwardEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateForwardEntryResponseBody setForwardEntryId(String forwardEntryId) {
        this.forwardEntryId = forwardEntryId;
        return this;
    }
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

    public CreateForwardEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
