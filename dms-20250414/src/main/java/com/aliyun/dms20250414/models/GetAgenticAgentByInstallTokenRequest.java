// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetAgenticAgentByInstallTokenRequest extends TeaModel {
    /**
     * <p>The one-time install token issued by IssueAgenticInstallToken. The token starts with dit_ followed by 40 URL-safe Base64 characters, making a total length of 44 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dit_0123456789abcdefghijklmnopqrstuvwxyzABCD</p>
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
