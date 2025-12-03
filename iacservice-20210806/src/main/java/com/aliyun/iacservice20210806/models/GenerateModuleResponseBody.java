// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GenerateModuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("module")
    public String module;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("properties")
    public java.util.Map<String, ?> properties;

    /**
     * <strong>example:</strong>
     * <p>6B40D088-E929-504B-8802-C1759A993FA2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GenerateModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateModuleResponseBody self = new GenerateModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateModuleResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public GenerateModuleResponseBody setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

    public GenerateModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
