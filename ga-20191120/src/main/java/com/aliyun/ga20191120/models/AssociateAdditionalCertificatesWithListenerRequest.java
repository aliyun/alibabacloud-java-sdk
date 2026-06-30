// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class AssociateAdditionalCertificatesWithListenerRequest extends TeaModel {
    /**
     * <p>The instance ID of the Alibaba Cloud Global Accelerator (GA).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The list of additional certificates.</p>
     * <p>You can specify up to 10 certificates at a time.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<AssociateAdditionalCertificatesWithListenerRequestCertificates> certificates;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a parameter value from your client to ensure uniqueness across different requests. ClientToken supports only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID of the listener. Only HTTPS listeners are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1bpn0kn908w4nbw****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The region ID of the Alibaba Cloud Global Accelerator (GA) instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AssociateAdditionalCertificatesWithListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateAdditionalCertificatesWithListenerRequest self = new AssociateAdditionalCertificatesWithListenerRequest();
        return TeaModel.build(map, self);
    }

    public AssociateAdditionalCertificatesWithListenerRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public AssociateAdditionalCertificatesWithListenerRequest setCertificates(java.util.List<AssociateAdditionalCertificatesWithListenerRequestCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<AssociateAdditionalCertificatesWithListenerRequestCertificates> getCertificates() {
        return this.certificates;
    }

    public AssociateAdditionalCertificatesWithListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssociateAdditionalCertificatesWithListenerRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public AssociateAdditionalCertificatesWithListenerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class AssociateAdditionalCertificatesWithListenerRequestCertificates extends TeaModel {
        /**
         * <p>The domain name for which the certificate takes effect. Each domain name can be bound to only one additional certificate.</p>
         * <p>You can specify up to 10 domain names at a time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The certificate ID. Only server certificates are supported.</p>
         * <p>You can specify up to 10 certificate IDs at a time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6092**-cn-hangzhou</p>
         */
        @NameInMap("Id")
        public String id;

        public static AssociateAdditionalCertificatesWithListenerRequestCertificates build(java.util.Map<String, ?> map) throws Exception {
            AssociateAdditionalCertificatesWithListenerRequestCertificates self = new AssociateAdditionalCertificatesWithListenerRequestCertificates();
            return TeaModel.build(map, self);
        }

        public AssociateAdditionalCertificatesWithListenerRequestCertificates setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public AssociateAdditionalCertificatesWithListenerRequestCertificates setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
