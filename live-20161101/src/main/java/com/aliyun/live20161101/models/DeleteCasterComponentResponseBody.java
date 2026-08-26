// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterComponentResponseBody extends TeaModel {
    /**
     * <p>The ID of the production studio. This ID can be used in subsequent API calls to query the component list, add a program, or modify a component of the production studio.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The component ID. This ID can be used in subsequent API calls to query or modify the component.</p>
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
