// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class OmniSearchResult extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>35E5608A-A737-2038-AFB6-D9D34C6BFD9E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static OmniSearchResult build(java.util.Map<String, ?> map) throws Exception {
        OmniSearchResult self = new OmniSearchResult();
        return TeaModel.build(map, self);
    }

    public OmniSearchResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OmniSearchResult setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
