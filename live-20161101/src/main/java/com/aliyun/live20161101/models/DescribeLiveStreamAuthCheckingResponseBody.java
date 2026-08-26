// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamAuthCheckingResponseBody extends TeaModel {
    /**
     * <p>The error message returned if authentication failed.</p>
     * 
     * <strong>example:</strong>
     * <p>INVALID AUTH_KEY</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16F08B4E-14FD-5D72-AB2F-BAFA4C4D57F1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the authentication is passed.</p>
     * <ul>
     * <li><p>pass: The authentication is passed.</p>
     * </li>
     * <li><p>false: The authentication failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pass</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeLiveStreamAuthCheckingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamAuthCheckingResponseBody self = new DescribeLiveStreamAuthCheckingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamAuthCheckingResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeLiveStreamAuthCheckingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamAuthCheckingResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
