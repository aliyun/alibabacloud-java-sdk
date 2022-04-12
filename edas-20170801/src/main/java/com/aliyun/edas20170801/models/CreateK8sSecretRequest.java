// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateK8sSecretRequest extends TeaModel {
    @NameInMap("Base64Encoded")
    public Boolean base64Encoded;

    @NameInMap("CertId")
    public String certId;

    @NameInMap("CertRegionId")
    public String certRegionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Data")
    public String data;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Type")
    public String type;

    public static CreateK8sSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateK8sSecretRequest self = new CreateK8sSecretRequest();
        return TeaModel.build(map, self);
    }

    public CreateK8sSecretRequest setBase64Encoded(Boolean base64Encoded) {
        this.base64Encoded = base64Encoded;
        return this;
    }
    public Boolean getBase64Encoded() {
        return this.base64Encoded;
    }

    public CreateK8sSecretRequest setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public CreateK8sSecretRequest setCertRegionId(String certRegionId) {
        this.certRegionId = certRegionId;
        return this;
    }
    public String getCertRegionId() {
        return this.certRegionId;
    }

    public CreateK8sSecretRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateK8sSecretRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateK8sSecretRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateK8sSecretRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateK8sSecretRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
