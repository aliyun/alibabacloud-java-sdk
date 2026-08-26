// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveStreamMergeResponseBody extends TeaModel {
    /**
     * <ul>
     * <li><p>A message that indicates the result of the request. If the request fails, this message helps the caller identify the issue.</p>
     * </li>
     * <li><p>Valid values: OK, config invalid, degrade to no livemerger.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddLiveStreamMergeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLiveStreamMergeResponseBody self = new AddLiveStreamMergeResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLiveStreamMergeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddLiveStreamMergeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
