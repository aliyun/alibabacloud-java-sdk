// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSitePauseResponseBody extends TeaModel {
    /**
     * <p>Indicates whether acceleration has been paused. Possible values:</p>
     * <ul>
     * <li>true: The site\&quot;s acceleration is paused.</li>
     * <li>false: The site is accelerating normally.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Paused")
    public Boolean paused;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSitePauseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSitePauseResponseBody self = new GetSitePauseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSitePauseResponseBody setPaused(Boolean paused) {
        this.paused = paused;
        return this;
    }
    public Boolean getPaused() {
        return this.paused;
    }

    public GetSitePauseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
