// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterComponentResponseBody extends TeaModel {
    /**
     * <p>The ID of the component. You can use the ID as a request parameter in the API operation that is called to query components in a production studio.</p>
     * 
     * <strong>example:</strong>
     * <p>05ab713c-676e-49c0-96ce-cc408da1****</p>
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

    public static ModifyCasterComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterComponentResponseBody self = new ModifyCasterComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCasterComponentResponseBody setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

    public ModifyCasterComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
