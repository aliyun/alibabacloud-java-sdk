// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateComponentResponseBody extends TeaModel {
    /**
     * <p>The ID of the dataset acceleration component. To obtain the component ID, see <a href="https://help.aliyun.com/document_detail/2979566.html">ListComponents</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123123123123123</p>
     */
    @NameInMap("ComponentId")
    public String componentId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>adssd****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateComponentResponseBody self = new CreateComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateComponentResponseBody setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

    public CreateComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
