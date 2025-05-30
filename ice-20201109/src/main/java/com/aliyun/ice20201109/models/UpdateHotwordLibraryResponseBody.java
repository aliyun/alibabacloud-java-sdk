// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateHotwordLibraryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><em>3B-0E1A-586A-AC29-742247</em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
     */
    @NameInMap("Success")
    public String success;

    public static UpdateHotwordLibraryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHotwordLibraryResponseBody self = new UpdateHotwordLibraryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHotwordLibraryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateHotwordLibraryResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
