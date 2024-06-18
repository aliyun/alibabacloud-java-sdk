// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DissociateAdditionalCertificatesFromListenerRequest extends TeaModel {
    /**
     * <p>The additional certificates.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<DissociateAdditionalCertificatesFromListenerRequestCertificates> certificates;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a <strong>2xx HTTP</strong> status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The listener ID. You must specify the ID of an HTTPS listener or a QUIC listener.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1bpn0kn908w4nbw****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    public static DissociateAdditionalCertificatesFromListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        DissociateAdditionalCertificatesFromListenerRequest self = new DissociateAdditionalCertificatesFromListenerRequest();
        return TeaModel.build(map, self);
    }

    public DissociateAdditionalCertificatesFromListenerRequest setCertificates(java.util.List<DissociateAdditionalCertificatesFromListenerRequestCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<DissociateAdditionalCertificatesFromListenerRequestCertificates> getCertificates() {
        return this.certificates;
    }

    public DissociateAdditionalCertificatesFromListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DissociateAdditionalCertificatesFromListenerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DissociateAdditionalCertificatesFromListenerRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public static class DissociateAdditionalCertificatesFromListenerRequestCertificates extends TeaModel {
        /**
         * <p>The certificate ID. Only server certificates are supported. A maximum of 20 certificate IDs are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12315790343_166f8204689_1714763408_70998****</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        public static DissociateAdditionalCertificatesFromListenerRequestCertificates build(java.util.Map<String, ?> map) throws Exception {
            DissociateAdditionalCertificatesFromListenerRequestCertificates self = new DissociateAdditionalCertificatesFromListenerRequestCertificates();
            return TeaModel.build(map, self);
        }

        public DissociateAdditionalCertificatesFromListenerRequestCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

    }

}
