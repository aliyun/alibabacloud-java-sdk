// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class AssociateAdditionalCertificatesWithListenerRequest extends TeaModel {
    /**
     * <p>The additional certificates.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<AssociateAdditionalCertificatesWithListenerRequestCertificates> certificates;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a `2xx HTTP` status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The listener ID. You must specify the ID of an HTTPS listener or a QUIC listener.</p>
     * <br>
     * <p>This parameter is required.</p>
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
         * <p>The certificate ID. Only server certificates are supported.</p>
         * <br>
         * <p>This parameter is required.</p>
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
