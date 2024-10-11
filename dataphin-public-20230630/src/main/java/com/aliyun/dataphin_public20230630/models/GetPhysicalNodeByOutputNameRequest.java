// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPhysicalNodeByOutputNameRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>t_test</p>
     */
    @NameInMap("OutputName")
    public String outputName;

    public static GetPhysicalNodeByOutputNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalNodeByOutputNameRequest self = new GetPhysicalNodeByOutputNameRequest();
        return TeaModel.build(map, self);
    }

    public GetPhysicalNodeByOutputNameRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetPhysicalNodeByOutputNameRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetPhysicalNodeByOutputNameRequest setOutputName(String outputName) {
        this.outputName = outputName;
        return this;
    }
    public String getOutputName() {
        return this.outputName;
    }

}
