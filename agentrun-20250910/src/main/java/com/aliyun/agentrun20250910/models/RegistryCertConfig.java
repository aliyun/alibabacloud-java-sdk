// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class RegistryCertConfig extends TeaModel {
    /**
     * <p>是否跳过TLS证书验证，设置为true时将不验证镜像仓库的证书</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("insecure")
    public Boolean insecure;

    /**
     * <p>镜像仓库的根CA证书Base64编码，用于自签名证书的验证</p>
     * 
     * <strong>example:</strong>
     * <p>cm9vdF9jYV9jZXJ0X2Jhc2U2NA==</p>
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
