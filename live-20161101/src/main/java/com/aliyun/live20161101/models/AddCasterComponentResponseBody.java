// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterComponentResponseBody extends TeaModel {
    /**
     * <p>The component ID. The value can be used as the value of a request parameter to query, modify, or delete a production studio.</p>
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

    public static AddCasterComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCasterComponentResponseBody self = new AddCasterComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCasterComponentResponseBody setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

    public AddCasterComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
