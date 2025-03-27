// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSitePauseResponseBody extends TeaModel {
    /**
     * <p>Indicates whether ESA is paused on the website. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Paused")
    public Boolean paused;

    /**
     * <p>The request ID.</p>
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
