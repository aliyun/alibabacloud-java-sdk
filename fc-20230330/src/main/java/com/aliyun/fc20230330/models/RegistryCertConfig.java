// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class RegistryCertConfig extends TeaModel {
    /**
     * <p>Whether to skip certificate verification.</p>
     */
    @NameInMap("insecure")
    public Boolean insecure;

    /**
     * <p>The certificate authority (CA) certificate of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>cm9vdF9jYV9jZXJ0</p>
     */
    @NameInMap("rootCaCertBase64")
    public String rootCaCertBase64;

    public static RegistryCertConfig build(java.util.Map<String, ?> map) throws Exception {
        RegistryCertConfig self = new RegistryCertConfig();
        return TeaModel.build(map, self);
    }

    public RegistryCertConfig setInsecure(Boolean insecure) {
        this.insecure = insecure;
        return this;
    }
    public Boolean getInsecure() {
        return this.insecure;
    }

    public RegistryCertConfig setRootCaCertBase64(String rootCaCertBase64) {
        this.rootCaCertBase64 = rootCaCertBase64;
        return this;
    }
    public String getRootCaCertBase64() {
        return this.rootCaCertBase64;
    }

}
