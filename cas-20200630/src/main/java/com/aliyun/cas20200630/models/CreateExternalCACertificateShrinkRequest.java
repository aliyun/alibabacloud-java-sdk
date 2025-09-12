// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateExternalCACertificateShrinkRequest extends TeaModel {
    @NameInMap("ApiPassthrough")
    public String apiPassthroughShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST-----
     * MIIBczCCARgCAQAwgYoxFDASBgNVBAMMC2FsaXl1bi50ZXN0MQ0wCwYDVQQ
     * ...
     * vbIgMQIhAKHDWD6/WAMbtezAt4bysJ/BZIDz1jPWuUR5GV4TJ/mS
     * -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cas_deposit-cn-1234abcd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10y</p>
     */
    @NameInMap("Validity")
    public String validity;

    public static CreateExternalCACertificateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalCACertificateShrinkRequest self = new CreateExternalCACertificateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateExternalCACertificateShrinkRequest setApiPassthroughShrink(String apiPassthroughShrink) {
        this.apiPassthroughShrink = apiPassthroughShrink;
        return this;
    }
    public String getApiPassthroughShrink() {
        return this.apiPassthroughShrink;
    }

    public CreateExternalCACertificateShrinkRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public CreateExternalCACertificateShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateExternalCACertificateShrinkRequest setValidity(String validity) {
        this.validity = validity;
        return this;
    }
    public String getValidity() {
        return this.validity;
    }

}
