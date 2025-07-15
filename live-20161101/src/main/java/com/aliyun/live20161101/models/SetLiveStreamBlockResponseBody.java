// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamBlockResponseBody extends TeaModel {
    /**
     * <p>The result description.</p>
     * <ul>
     * <li>If the request was successful, ok is returned.</li>
     * <li>If the request failed, the failure detail is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3be7ade8-d907-483c-b24a-0dad4595beaf</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status. Valid values:</p>
     * <ul>
     * <li>ok: The request was successful.</li>
     * <li>fail: The request failed.</li>
     * </ul>
     * <blockquote>
     * <p> If any parameter failed to be configured, the request failed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Status")
    public String status;

    public static SetLiveStreamBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetLiveStreamBlockResponseBody self = new SetLiveStreamBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public SetLiveStreamBlockResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SetLiveStreamBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetLiveStreamBlockResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
