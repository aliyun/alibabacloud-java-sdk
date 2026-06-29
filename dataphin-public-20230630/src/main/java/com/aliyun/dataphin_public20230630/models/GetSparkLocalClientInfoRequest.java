// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetSparkLocalClientInfoRequest extends TeaModel {
    /**
     * <p>The environment identifier. Valid values:</p>
     * <ul>
     * <li>DEV: development environment.</li>
     * <li>PROD: production environment.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEV</p>
     */
    @NameInMap("EnvEnum")
    public String envEnum;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>232432343</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static GetSparkLocalClientInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkLocalClientInfoRequest self = new GetSparkLocalClientInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkLocalClientInfoRequest setEnvEnum(String envEnum) {
        this.envEnum = envEnum;
        return this;
    }
    public String getEnvEnum() {
        return this.envEnum;
    }

    public GetSparkLocalClientInfoRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetSparkLocalClientInfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
