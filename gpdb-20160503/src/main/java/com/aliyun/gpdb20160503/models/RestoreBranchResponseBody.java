// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class RestoreBranchResponseBody extends TeaModel {
    /**
     * <p>The branch ID that uniquely identifies a Supabase branch.</p>
     * 
     * <strong>example:</strong>
     * <p>br-xxxx</p>
     */
    @NameInMap("BranchId")
    public String branchId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestoreBranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestoreBranchResponseBody self = new RestoreBranchResponseBody();
        return TeaModel.build(map, self);
    }

    public RestoreBranchResponseBody setBranchId(String branchId) {
        this.branchId = branchId;
        return this;
    }
    public String getBranchId() {
        return this.branchId;
    }

    public RestoreBranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
