// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ConvertFlowDSLRequest extends TeaModel {
    /**
     * <p>The request body for the conversion.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public ConvertFlowDSLInput body;

    public static ConvertFlowDSLRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertFlowDSLRequest self = new ConvertFlowDSLRequest();
        return TeaModel.build(map, self);
    }

    public ConvertFlowDSLRequest setBody(ConvertFlowDSLInput body) {
        this.body = body;
        return this;
    }
    public ConvertFlowDSLInput getBody() {
        return this.body;
    }

}
