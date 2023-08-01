// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListK8sSecretsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned query results of Kubernetes Secrets.</p>
     */
    @NameInMap("Result")
    public ListK8sSecretsResponseBodyResult result;

    public static ListK8sSecretsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListK8sSecretsResponseBody self = new ListK8sSecretsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListK8sSecretsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListK8sSecretsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListK8sSecretsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListK8sSecretsResponseBody setResult(ListK8sSecretsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListK8sSecretsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListK8sSecretsResponseBodyResultSecretsCertDetail extends TeaModel {
        /**
         * <p>Domain names that are associated with the SSL certificate.</p>
         */
        @NameInMap("DomainNames")
        public java.util.List<String> domainNames;

        /**
         * <p>The time when the SSL certificate expired.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The certificate authority (CA) that issued the SSL certificate.</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The time when the SSL certificate started to take effect.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The state of the SSL certificate. Valid values:</p>
         * <br>
         * <p>*   normal: The SSL certificate is valid.</p>
         * <p>*   invalid: The SSL certificate is invalid.</p>
         * <p>*   expired: The SSL certificate has expired.</p>
         * <p>*   not_yet_valid: The SSL certificate is currently invalid.</p>
         * <p>*   about_to_expire: The SSL certificate is about to expire.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListK8sSecretsResponseBodyResultSecretsCertDetail build(java.util.Map<String, ?> map) throws Exception {
            ListK8sSecretsResponseBodyResultSecretsCertDetail self = new ListK8sSecretsResponseBodyResultSecretsCertDetail();
            return TeaModel.build(map, self);
        }

        public ListK8sSecretsResponseBodyResultSecretsCertDetail setDomainNames(java.util.List<String> domainNames) {
            this.domainNames = domainNames;
            return this;
        }
        public java.util.List<String> getDomainNames() {
            return this.domainNames;
        }

        public ListK8sSecretsResponseBodyResultSecretsCertDetail setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListK8sSecretsResponseBodyResultSecretsCertDetail setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ListK8sSecretsResponseBodyResultSecretsCertDetail setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListK8sSecretsResponseBodyResultSecretsCertDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListK8sSecretsResponseBodyResultSecretsData extends TeaModel {
        /**
         * <p>The user-defined key of the Kubernetes Secret.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The user-defined value of the Kubernetes Secret.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListK8sSecretsResponseBodyResultSecretsData build(java.util.Map<String, ?> map) throws Exception {
            ListK8sSecretsResponseBodyResultSecretsData self = new ListK8sSecretsResponseBodyResultSecretsData();
            return TeaModel.build(map, self);
        }

        public ListK8sSecretsResponseBodyResultSecretsData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListK8sSecretsResponseBodyResultSecretsData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListK8sSecretsResponseBodyResultSecretsRelatedApps extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        public static ListK8sSecretsResponseBodyResultSecretsRelatedApps build(java.util.Map<String, ?> map) throws Exception {
            ListK8sSecretsResponseBodyResultSecretsRelatedApps self = new ListK8sSecretsResponseBodyResultSecretsRelatedApps();
            return TeaModel.build(map, self);
        }

        public ListK8sSecretsResponseBodyResultSecretsRelatedApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListK8sSecretsResponseBodyResultSecretsRelatedApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class ListK8sSecretsResponseBodyResultSecretsRelatedIngressRulesRelatedApps extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the EDAS application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        public static ListK8sSecretsResponseBodyResultSecretsRelatedIngressRulesRelatedApps build(java.util.Map<String, ?> map) throws Exception {
            ListK8sSecretsResponseBodyResultSecretsRelatedIngressRulesRelatedApps self = new ListK8sSecretsResponseBodyResultSecretsRelatedIngressRulesRelatedApps();
            return TeaModel.build(map, self);
        }

        public ListK8sSecretsResponseBodyResultSecretsRelatedIngressRulesRelatedApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListK8sSecretsResponseBodyResultSecretsRelatedIngressRulesRelatedApps setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

    }

    public static class ListK8sSecretsResponseBodyResultSecretsRelatedIngressRules extends TeaModel {
        /**
         * <p>The name of the rule in the Ingress.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespaces of the Kubernetes cluster.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>Aplications that are associated with the Ingress.</p>
         */
        @NameInMap("RelatedApps")
        public java.util.List<ListK8sSecretsResponseBodyResultSecretsRelatedIngressRulesRelatedApps> relatedApps;

        public static ListK8sSecretsResponseBodyResultSecretsRelatedIngressRules build(java.util.Map<String, ?> map) throws Exception {
            ListK8sSecretsResponseBodyResultSecretsRelatedIngressRules self = new ListK8sSecretsResponseBodyResultSecretsRelatedIngressRules();
            return TeaModel.build(map, self);
        }

        public ListK8sSecretsResponseBodyResultSecretsRelatedIngressRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListK8sSecretsResponseBodyResultSecretsRelatedIngressRules setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListK8sSecretsResponseBodyResultSecretsRelatedIngressRules setRelatedApps(java.util.List<ListK8sSecretsResponseBodyResultSecretsRelatedIngressRulesRelatedApps> relatedApps) {
            this.relatedApps = relatedApps;
            return this;
        }
        public java.util.List<ListK8sSecretsResponseBodyResultSecretsRelatedIngressRulesRelatedApps> getRelatedApps() {
            return this.relatedApps;
        }

    }

    public static class ListK8sSecretsResponseBodyResultSecrets extends TeaModel {
        /**
         * <p>Indicates whether the data is Base64-encoded. Valid values:</p>
         * <br>
         * <p>*   true: The data is Base64-encoded.</p>
         * <p>*   false: The data is not Base64-encoded.</p>
         */
        @NameInMap("Base64Encoded")
        public Boolean base64Encoded;

        /**
         * <p>The details of the Secure Sockets Layer (SSL) certificate.</p>
         */
        @NameInMap("CertDetail")
        public ListK8sSecretsResponseBodyResultSecretsCertDetail certDetail;

        /**
         * <p>The ID of the certificate provided by Alibaba Cloud Certificate Management Service.</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The region in which the certificate is stored.</p>
         */
        @NameInMap("CertRegionId")
        public String certRegionId;

        /**
         * <p>The ID of the cluster in Enterprise Distributed Application Service (EDAS).</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The name of the cluster.</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The time when the Secret was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*hh:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The data of the Kubernetes Secret.</p>
         */
        @NameInMap("Data")
        public java.util.List<ListK8sSecretsResponseBodyResultSecretsData> data;

        /**
         * <p>The name of the Secret. The name must start with a letter, and can contain digits, letters, and hyphens (-). It can be up to 63 characters in length.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace of the Kubernetes cluster.</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>Applications that use the Secret.</p>
         */
        @NameInMap("RelatedApps")
        public java.util.List<ListK8sSecretsResponseBodyResultSecretsRelatedApps> relatedApps;

        /**
         * <p>Rules in the Ingress that is associated with the Secret.</p>
         */
        @NameInMap("RelatedIngressRules")
        public java.util.List<ListK8sSecretsResponseBodyResultSecretsRelatedIngressRules> relatedIngressRules;

        /**
         * <p>The type of the Secret. Valid values:</p>
         * <br>
         * <p>*   Opaque: user-defined data</p>
         * <p>*   kubernetes.io/tls: Transport Layer Security (TLS) certificate</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListK8sSecretsResponseBodyResultSecrets build(java.util.Map<String, ?> map) throws Exception {
            ListK8sSecretsResponseBodyResultSecrets self = new ListK8sSecretsResponseBodyResultSecrets();
            return TeaModel.build(map, self);
        }

        public ListK8sSecretsResponseBodyResultSecrets setBase64Encoded(Boolean base64Encoded) {
            this.base64Encoded = base64Encoded;
            return this;
        }
        public Boolean getBase64Encoded() {
            return this.base64Encoded;
        }

        public ListK8sSecretsResponseBodyResultSecrets setCertDetail(ListK8sSecretsResponseBodyResultSecretsCertDetail certDetail) {
            this.certDetail = certDetail;
            return this;
        }
        public ListK8sSecretsResponseBodyResultSecretsCertDetail getCertDetail() {
            return this.certDetail;
        }

        public ListK8sSecretsResponseBodyResultSecrets setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
        }

        public ListK8sSecretsResponseBodyResultSecrets setCertRegionId(String certRegionId) {
            this.certRegionId = certRegionId;
            return this;
        }
        public String getCertRegionId() {
            return this.certRegionId;
        }

        public ListK8sSecretsResponseBodyResultSecrets setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListK8sSecretsResponseBodyResultSecrets setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListK8sSecretsResponseBodyResultSecrets setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListK8sSecretsResponseBodyResultSecrets setData(java.util.List<ListK8sSecretsResponseBodyResultSecretsData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListK8sSecretsResponseBodyResultSecretsData> getData() {
            return this.data;
        }

        public ListK8sSecretsResponseBodyResultSecrets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListK8sSecretsResponseBodyResultSecrets setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListK8sSecretsResponseBodyResultSecrets setRelatedApps(java.util.List<ListK8sSecretsResponseBodyResultSecretsRelatedApps> relatedApps) {
            this.relatedApps = relatedApps;
            return this;
        }
        public java.util.List<ListK8sSecretsResponseBodyResultSecretsRelatedApps> getRelatedApps() {
            return this.relatedApps;
        }

        public ListK8sSecretsResponseBodyResultSecrets setRelatedIngressRules(java.util.List<ListK8sSecretsResponseBodyResultSecretsRelatedIngressRules> relatedIngressRules) {
            this.relatedIngressRules = relatedIngressRules;
            return this;
        }
        public java.util.List<ListK8sSecretsResponseBodyResultSecretsRelatedIngressRules> getRelatedIngressRules() {
            return this.relatedIngressRules;
        }

        public ListK8sSecretsResponseBodyResultSecrets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListK8sSecretsResponseBodyResult extends TeaModel {
        /**
         * <p>The information about Kubernetes Secrets.</p>
         */
        @NameInMap("Secrets")
        public java.util.List<ListK8sSecretsResponseBodyResultSecrets> secrets;

        /**
         * <p>The total number of entries that are returned.</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListK8sSecretsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListK8sSecretsResponseBodyResult self = new ListK8sSecretsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListK8sSecretsResponseBodyResult setSecrets(java.util.List<ListK8sSecretsResponseBodyResultSecrets> secrets) {
            this.secrets = secrets;
            return this;
        }
        public java.util.List<ListK8sSecretsResponseBodyResultSecrets> getSecrets() {
            return this.secrets;
        }

        public ListK8sSecretsResponseBodyResult setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
