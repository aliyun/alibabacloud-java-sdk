// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetServerVersionRequest extends TeaModel {
    /**
     * <p><strong>[Deprecated]</strong> The environment identifier. Valid values:</p>
     * <ul>
     * <li>DEV: Development environment. </li>
     * <li>PROD (default): Production environment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("Env")
    public String env;

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
     * <p>The ID of the operation user.</p>
     * 
     * <strong>example:</strong>
     * <p>30010012</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static GetServerVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServerVersionRequest self = new GetServerVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetServerVersionRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetServerVersionRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetServerVersionRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

}
