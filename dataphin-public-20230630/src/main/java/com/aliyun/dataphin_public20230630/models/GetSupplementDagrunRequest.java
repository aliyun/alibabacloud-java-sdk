// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSupplementDagrunRequest extends TeaModel {
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
     * <p>f_8241792_20201202_2099680</p>
     */
    @NameInMap("SupplementId")
    public String supplementId;

    public static GetSupplementDagrunRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSupplementDagrunRequest self = new GetSupplementDagrunRequest();
        return TeaModel.build(map, self);
    }

    public GetSupplementDagrunRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetSupplementDagrunRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetSupplementDagrunRequest setSupplementId(String supplementId) {
        this.supplementId = supplementId;
        return this;
    }
    public String getSupplementId() {
        return this.supplementId;
    }

}
