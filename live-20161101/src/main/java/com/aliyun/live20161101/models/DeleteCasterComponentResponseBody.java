// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterComponentResponseBody extends TeaModel {
    /**
     * <p>The ID of the production studio. You can use the ID as a request parameter in the API operation that is called to query the components in the production studio, add an episode list to the production studio, or modify a component in the production studio.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The component ID. You can use the ID as a request parameter in the API operation that is called to query the component in the production studio or modify the component in the production studio.</p>
     * 
     * <strong>example:</strong>
     * <p>21926b36-7dd2-4fde-ae25-51b5bc8e****</p>
     */
    @NameInMap("ComponentId")
    public String componentId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCasterComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterComponentResponseBody self = new DeleteCasterComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCasterComponentResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DeleteCasterComponentResponseBody setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

    public DeleteCasterComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
