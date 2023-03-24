// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class AddFingerprintToOIDCProviderRequest extends TeaModel {
    /**
     * <p>The fingerprint of the HTTPS certificate.</p>
     * <br>
     * <p>The fingerprint can contain letters and digits.</p>
     * <br>
     * <p>The fingerprint can be up to 40 characters in length.</p>
     */
    @NameInMap("Fingerprint")
    public String fingerprint;

    /**
     * <p>The name of the OIDC IdP.</p>
     */
    @NameInMap("OIDCProviderName")
    public String OIDCProviderName;

    public static AddFingerprintToOIDCProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFingerprintToOIDCProviderRequest self = new AddFingerprintToOIDCProviderRequest();
        return TeaModel.build(map, self);
    }

    public AddFingerprintToOIDCProviderRequest setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }

    public AddFingerprintToOIDCProviderRequest setOIDCProviderName(String OIDCProviderName) {
        this.OIDCProviderName = OIDCProviderName;
        return this;
    }
    public String getOIDCProviderName() {
        return this.OIDCProviderName;
    }

}
