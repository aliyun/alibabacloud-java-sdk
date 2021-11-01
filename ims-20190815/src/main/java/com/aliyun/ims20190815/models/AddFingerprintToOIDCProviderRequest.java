// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class AddFingerprintToOIDCProviderRequest extends TeaModel {
    @NameInMap("Fingerprint")
    public String fingerprint;

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
