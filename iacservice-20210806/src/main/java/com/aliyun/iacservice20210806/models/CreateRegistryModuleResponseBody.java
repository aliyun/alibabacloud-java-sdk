// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateRegistryModuleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C896FE0A-1BEA-5D01-BFF4-B03B82B9CA3D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The template source, which is a concatenation of \<namespaceName>/\<ModuleName>.</p>
     * 
     * <strong>example:</strong>
     * <p>namespaceName/ModuleName</p>
     */
    @NameInMap("source")
    public String source;

    public static CreateRegistryModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRegistryModuleResponseBody self = new CreateRegistryModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRegistryModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRegistryModuleResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
