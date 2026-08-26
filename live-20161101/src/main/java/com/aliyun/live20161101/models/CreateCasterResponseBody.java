// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateCasterResponseBody extends TeaModel {
    /**
     * <p>The ID of the production studio. You can use this ID as a request parameter to query stream URLs, start the production studio, add video resources, add layouts, query the layout list, add components, and add playlists.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCasterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCasterResponseBody self = new CreateCasterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCasterResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public CreateCasterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
