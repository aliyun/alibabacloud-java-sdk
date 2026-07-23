// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetAgenticAgentByInstallTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstallToken")
    public String installToken;

    public static GetAgenticAgentByInstallTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgenticAgentByInstallTokenRequest self = new GetAgenticAgentByInstallTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetAgenticAgentByInstallTokenRequest setInstallToken(String installToken) {
        this.installToken = installToken;
        return this;
    }
    public String getInstallToken() {
        return this.installToken;
    }

}
