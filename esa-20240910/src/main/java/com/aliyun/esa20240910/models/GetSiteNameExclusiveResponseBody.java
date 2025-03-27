// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteNameExclusiveResponseBody extends TeaModel {
    /**
     * <p>Indicates whether site hold is enabled. Valid values:</p>
     * <ul>
     * <li>on</li>
     * <li>off</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enable")
    public String enable;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>35C66C7B-671H-4297-9187-2C4477247A78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSiteNameExclusiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSiteNameExclusiveResponseBody self = new GetSiteNameExclusiveResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSiteNameExclusiveResponseBody setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public GetSiteNameExclusiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
