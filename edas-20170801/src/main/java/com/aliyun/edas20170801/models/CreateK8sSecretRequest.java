// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateK8sSecretRequest extends TeaModel {
    /**
     * <p>Specifies whether the data has been encoded in Base64. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Base64Encoded")
    public Boolean base64Encoded;

    /**
     * <p>The certificate ID provided by Alibaba Cloud Certificate Management Service.</p>
     * 
     * <strong>example:</strong>
     * <p>6651483</p>
     */
    @NameInMap("CertId")
    public String certId;

    /**
     * <p>The region in which the certificate is stored.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("CertRegionId")
    public String certRegionId;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>712082c3-<strong><strong>-</strong></strong>-9217-a947b5cde6ee</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The data of the Secret. The value must be a JSON array that contains the following information:</p>
     * <ul>
     * <li>Key: Secret key</li>
     * <li>Value: Secret value</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Key&quot;:&quot;name&quot;,&quot;Value&quot;:&quot;william&quot;},{&quot;Key&quot;:&quot;age&quot;,&quot;Value&quot;:&quot;12&quot;}]</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The name of the Secret. The name must start with a letter, and can contain digits, letters, and hyphens (-). It can be up to 63 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>my-secret</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace of the Kubernetes cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The Secret type. Valid values:</p>
     * <ul>
     * <li>Opaque: user-defined data</li>
     * <li>kubernetes.io/tls: Transport Layer Security (TLS) certificate</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Opaque</p>
     */
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
