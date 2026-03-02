// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class RemoveFingerprintFromOIDCProviderRequest extends TeaModel {
    @NameInMap("Fingerprint")
    public String fingerprint;

    @NameInMap("OIDCProviderName")
    public String OIDCProviderName;

    public static RemoveFingerprintFromOIDCProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveFingerprintFromOIDCProviderRequest self = new RemoveFingerprintFromOIDCProviderRequest();
        return TeaModel.build(map, self);
    }

    public RemoveFingerprintFromOIDCProviderRequest setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }

    public RemoveFingerprintFromOIDCProviderRequest setOIDCProviderName(String OIDCProviderName) {
        this.OIDCProviderName = OIDCProviderName;
        return this;
    }
    public String getOIDCProviderName() {
        return this.OIDCProviderName;
    }

}
