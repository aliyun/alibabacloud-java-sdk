// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class AssociateAdditionalCertificatesWithListenerRequest extends TeaModel {
    /**
     * <p>The list of additional certificates.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<AssociateAdditionalCertificatesWithListenerRequestCertificates> certificates;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3F******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: prechecks the request without associating the additional certificates with the HTTPS or QUIC listener. The system checks whether the required parameters are specified, the request format is valid, and the service limits are met. If the request fails the precheck, the system returns an error. If the request passes the precheck, the system returns the <code>DryRunOperation</code> error code.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends the request. If the request passes the precheck, the system returns an HTTP <code>2xx</code> status code and performs the operation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the listener.</p>
     * <p>This parameter is valid only for HTTPS and QUIC listeners.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsn-5qnirjhpt******</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    public static AssociateAdditionalCertificatesWithListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateAdditionalCertificatesWithListenerRequest self = new AssociateAdditionalCertificatesWithListenerRequest();
        return TeaModel.build(map, self);
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

    public AssociateAdditionalCertificatesWithListenerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public AssociateAdditionalCertificatesWithListenerRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public static class AssociateAdditionalCertificatesWithListenerRequestCertificates extends TeaModel {
        /**
         * <p>The ID of the certificate. Only server certificates are supported.</p>
         * <blockquote>
         * <p>The certificate ID is a globally unique ID that ends with a region ID, such as 1011****-cn-hangzhou.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1011****-cn-hangzhou</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        public static AssociateAdditionalCertificatesWithListenerRequestCertificates build(java.util.Map<String, ?> map) throws Exception {
            AssociateAdditionalCertificatesWithListenerRequestCertificates self = new AssociateAdditionalCertificatesWithListenerRequestCertificates();
            return TeaModel.build(map, self);
        }

        public AssociateAdditionalCertificatesWithListenerRequestCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

    }

}
