// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterConfigResponseBody extends TeaModel {
    /**
     * <p>The production studio ID. This ID can be used as a request parameter for querying the production studio stream address, starting the production studio, adding video resources, adding layouts, querying the layout list, adding components, and adding a program list.</p>
     * 
     * <strong>example:</strong>
     * <p>b4810848-bcf9-4aef-bd4a-e6bba2d9****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetCasterConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCasterConfigResponseBody self = new SetCasterConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCasterConfigResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public SetCasterConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
