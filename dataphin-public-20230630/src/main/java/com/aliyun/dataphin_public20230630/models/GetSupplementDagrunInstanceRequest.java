// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSupplementDagrunInstanceRequest extends TeaModel {
    /**
     * <p>Dagrun ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dr_2242792_14542</p>
     */
    @NameInMap("DagrunId")
    public String dagrunId;

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

    public static GetSupplementDagrunInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSupplementDagrunInstanceRequest self = new GetSupplementDagrunInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetSupplementDagrunInstanceRequest setDagrunId(String dagrunId) {
        this.dagrunId = dagrunId;
        return this;
    }
    public String getDagrunId() {
        return this.dagrunId;
    }

    public GetSupplementDagrunInstanceRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetSupplementDagrunInstanceRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
