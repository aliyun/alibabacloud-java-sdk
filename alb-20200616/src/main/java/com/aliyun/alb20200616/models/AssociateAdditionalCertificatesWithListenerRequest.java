// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class AssociateAdditionalCertificatesWithListenerRequest extends TeaModel {
    // 证书列表
    @NameInMap("Certificates")
    public java.util.List<AssociateAdditionalCertificatesWithListenerRequestCertificates> certificates;

    // 幂等Token
    @NameInMap("ClientToken")
    public String clientToken;

    // dryRun
    @NameInMap("DryRun")
    public Boolean dryRun;

    // 监听Id
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
        // 证书Id
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
