// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamBlockResponseBody extends TeaModel {
    /**
     * <p>The result description. If the request was successful, ok is returned. If the request failed, the failure detail is returned.</p>
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
     * <p>B908FF89-B03C-4831-B55B-48D2A7DA0A68</p>
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

    public static DeleteLiveStreamBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamBlockResponseBody self = new DeleteLiveStreamBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamBlockResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DeleteLiveStreamBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLiveStreamBlockResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
