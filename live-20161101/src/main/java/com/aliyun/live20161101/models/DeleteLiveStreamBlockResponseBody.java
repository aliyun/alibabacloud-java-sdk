// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamBlockResponseBody extends TeaModel {
    /**
     * <p>The description of the request. A value of ok indicates that the request was successful. An error message is returned if the request failed.</p>
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
     * <p>The status of the operation. Valid values:</p>
     * <ul>
     * <li><p>ok: Success.</p>
     * </li>
     * <li><p>fail: Failure.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The status is ok only if all tasks succeeded.</p>
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
