// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccountMFAInfoResponseBody extends TeaModel {
    /**
     * <p>Indicates whether MFA devices are enabled. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsMFAEnable")
    public Boolean isMFAEnable;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4BE83135-0B08-467C-B3A2-27B312FD0F57</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAccountMFAInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountMFAInfoResponseBody self = new GetAccountMFAInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountMFAInfoResponseBody setIsMFAEnable(Boolean isMFAEnable) {
        this.isMFAEnable = isMFAEnable;
        return this;
    }
    public Boolean getIsMFAEnable() {
        return this.isMFAEnable;
    }

    public GetAccountMFAInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
