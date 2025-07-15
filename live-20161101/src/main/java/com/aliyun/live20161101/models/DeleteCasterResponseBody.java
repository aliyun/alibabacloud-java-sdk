// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterResponseBody extends TeaModel {
    /**
     * <p>The ID of the production studio. You can use the ID as a request parameter in the API operation that is used to add input sources, layouts, components, or an episode list to the production studio or query the layouts of the production studio.</p>
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
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCasterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterResponseBody self = new DeleteCasterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCasterResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DeleteCasterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
