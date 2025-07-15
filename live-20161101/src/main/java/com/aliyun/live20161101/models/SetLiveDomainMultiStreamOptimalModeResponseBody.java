// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveDomainMultiStreamOptimalModeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetLiveDomainMultiStreamOptimalModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetLiveDomainMultiStreamOptimalModeResponseBody self = new SetLiveDomainMultiStreamOptimalModeResponseBody();
        return TeaModel.build(map, self);
    }

    public SetLiveDomainMultiStreamOptimalModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
