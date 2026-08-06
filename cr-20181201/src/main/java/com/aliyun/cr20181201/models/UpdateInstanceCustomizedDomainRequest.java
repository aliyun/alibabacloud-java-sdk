// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class UpdateInstanceCustomizedDomainRequest extends TeaModel {
    /**
     * <p>The certificate ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21118442</p>
     */
    @NameInMap("CertId")
    public String certId;

    /**
     * <p>The region where the certificate resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("CertRegionId")
    public String certRegionId;

    /**
     * <p>The custom domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>registry-cn-guangzhou.ack.aliyuncs.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-h0tvspmnglam5jw5</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The modified domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Registry</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

    public static UpdateInstanceCustomizedDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceCustomizedDomainRequest self = new UpdateInstanceCustomizedDomainRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceCustomizedDomainRequest setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public UpdateInstanceCustomizedDomainRequest setCertRegionId(String certRegionId) {
        this.certRegionId = certRegionId;
        return this;
    }
    public String getCertRegionId() {
        return this.certRegionId;
    }

    public UpdateInstanceCustomizedDomainRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateInstanceCustomizedDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceCustomizedDomainRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

}
