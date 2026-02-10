// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CredentialConfiguration extends TeaModel {
    /**
     * <p>凭证的唯一标识符</p>
     * 
     * <strong>example:</strong>
     * <p>deepagent-key</p>
     */
    @NameInMap("credentialName")
    public String credentialName;

    public static CredentialConfiguration build(java.util.Map<String, ?> map) throws Exception {
        CredentialConfiguration self = new CredentialConfiguration();
        return TeaModel.build(map, self);
    }

    public CredentialConfiguration setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }
    public String getCredentialName() {
        return this.credentialName;
    }

}
