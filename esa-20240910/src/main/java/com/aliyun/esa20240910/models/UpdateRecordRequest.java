// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRecordRequest extends TeaModel {
    /**
     * <p>The origin authentication settings for the CNAME record.</p>
     */
    @NameInMap("AuthConf")
    public UpdateRecordRequestAuthConf authConf;

    /**
     * <p>The use case for proxy acceleration. Omit this parameter if proxy acceleration is disabled. Valid values:</p>
     * <ul>
     * <li><p><strong>video_image</strong>: Video and images.</p>
     * </li>
     * <li><p><strong>api</strong>: APIs.</p>
     * </li>
     * <li><p><strong>web</strong>: Web pages.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>web</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>A comment for the record.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a remark.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The DNS data for the record. The required content varies based on the record type. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/2708761.html">Documentation</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/doc-detail/2708761.html">Documentation</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;value&quot;:&quot;2.2.2.2&quot;
     * }</p>
     */
    @NameInMap("Data")
    public UpdateRecordRequestData data;

    /**
     * <p>The origin HOST policy. This policy, which applies only to CNAME records, determines the value of the <code>HOST</code> header in requests sent to the origin. Valid values:</p>
     * <ul>
     * <li><p><strong>follow_hostname</strong>: Follows the host record.</p>
     * </li>
     * <li><p><strong>follow_origin_domain</strong>: Follows the origin domain name.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>follow_origin_domain</p>
     */
    @NameInMap("HostPolicy")
    public String hostPolicy;

    @NameInMap("HttpPorts")
    public String httpPorts;

    @NameInMap("HttpsPorts")
    public String httpsPorts;

    /**
     * <p>Indicates whether to enable proxy acceleration for the record. Only CNAME and A/AAAA records support proxy acceleration. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enables proxy acceleration.</p>
     * </li>
     * <li><p><strong>false</strong>: Disables proxy acceleration.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Proxied")
    public Boolean proxied;

    /**
     * <p>The record ID. Call the <a href="https://help.aliyun.com/document_detail/2850265.html">ListRecords</a> operation to get this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>The origin type for the CNAME record. This parameter is required for CNAME records. Valid values:</p>
     * <ul>
     * <li><p><strong>OSS</strong>: An OSS origin.</p>
     * </li>
     * <li><p><strong>S3</strong>: An S3 origin.</p>
     * </li>
     * <li><p><strong>LB</strong>: A load balancer origin.</p>
     * </li>
     * <li><p><strong>OP</strong>: An origin address pool origin.</p>
     * </li>
     * <li><p><strong>Domain</strong>: A standard domain name origin.</p>
     * </li>
     * </ul>
     * <p>If this parameter is omitted or left empty, the default value is <code>Domain</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The record\&quot;s time to live (TTL) in seconds. The value must be an integer from <strong>30 to 86400</strong> or 1. A value of 1 sets the TTL to automatic.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    @NameInMap("Type")
    public String type;

    public static UpdateRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordRequest self = new UpdateRecordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecordRequest setAuthConf(UpdateRecordRequestAuthConf authConf) {
        this.authConf = authConf;
        return this;
    }
    public UpdateRecordRequestAuthConf getAuthConf() {
        return this.authConf;
    }

    public UpdateRecordRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public UpdateRecordRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateRecordRequest setData(UpdateRecordRequestData data) {
        this.data = data;
        return this;
    }
    public UpdateRecordRequestData getData() {
        return this.data;
    }

    public UpdateRecordRequest setHostPolicy(String hostPolicy) {
        this.hostPolicy = hostPolicy;
        return this;
    }
    public String getHostPolicy() {
        return this.hostPolicy;
    }

    public UpdateRecordRequest setHttpPorts(String httpPorts) {
        this.httpPorts = httpPorts;
        return this;
    }
    public String getHttpPorts() {
        return this.httpPorts;
    }

    public UpdateRecordRequest setHttpsPorts(String httpsPorts) {
        this.httpsPorts = httpsPorts;
        return this;
    }
    public String getHttpsPorts() {
        return this.httpsPorts;
    }

    public UpdateRecordRequest setProxied(Boolean proxied) {
        this.proxied = proxied;
        return this;
    }
    public Boolean getProxied() {
        return this.proxied;
    }

    public UpdateRecordRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public UpdateRecordRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public UpdateRecordRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public UpdateRecordRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class UpdateRecordRequestAuthConf extends TeaModel {
        /**
         * <p>The access key for the account that owns the origin. This is required for private, cross-account access to OSS origins, and for S3 origins where the authentication type is <strong>private</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>VIxuvJSA2S03f******kp208dy5w7</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The origin authentication type. This parameter is required when the <strong>SourceType</strong> is <strong>OSS</strong> or <strong>S3</strong>. Supported authentication types vary depending on the origin type. Valid values:</p>
         * <ul>
         * <li><p><strong>public</strong>: Public read. Use for publicly readable OSS or S3 origins.</p>
         * </li>
         * <li><p><strong>private</strong>: Private read. Use for private S3 origins.</p>
         * </li>
         * <li><p><strong>private_same_account</strong>: Private read within the same account. Use for private OSS origins accessed from the same Alibaba Cloud account.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The region where the origin is located. This parameter is required when the origin type is S3. You can find the region ID on the official S3 website.</p>
         * <ul>
         * <li><p><strong>v2</strong></p>
         * </li>
         * <li><p><strong>v4</strong></p>
         * </li>
         * </ul>
         * <p>If you do not specify a value, it defaults to v4.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The secret key for the account that owns the origin. This is required for private, cross-account access to OSS origins, and for S3 origins where the authentication type is <strong>private</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>u0Nkg5gBK*******QF5wvKMM504JUHt</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The signing algorithm version. This parameter is required when the origin type is S3 and the authentication type is <strong>private</strong>. Supported versions: v2 and v4. If this parameter is not specified, the default value is v4.</p>
         * 
         * <strong>example:</strong>
         * <p>us-east-1</p>
         */
        @NameInMap("Version")
        public String version;

        public static UpdateRecordRequestAuthConf build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecordRequestAuthConf self = new UpdateRecordRequestAuthConf();
            return TeaModel.build(map, self);
        }

        public UpdateRecordRequestAuthConf setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public UpdateRecordRequestAuthConf setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public UpdateRecordRequestAuthConf setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateRecordRequestAuthConf setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public UpdateRecordRequestAuthConf setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateRecordRequestData extends TeaModel {
        /**
         * <p>The encryption algorithm specified in the record. The value must be an integer from <strong>0 to 255</strong>. This parameter is required for CERT and SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Algorithm")
        public Integer algorithm;

        /**
         * <p>The public key certificate data for the record. This parameter is required for CERT, SMIMEA, and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>dGVzdGFkYWxrcw==</p>
         */
        @NameInMap("Certificate")
        public String certificate;

        /**
         * <p>The public key fingerprint for the record. This parameter is required for SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdef1234567890</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The flag for the record. For a CAA record, this flag indicates its priority and handling behavior. The value must be an integer from <strong>0 to 255</strong>. This parameter is required for CAA records.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>The public key identifier for the record. The value must be an integer from <strong>0 to 65535</strong>. This parameter is required for CERT records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("KeyTag")
        public Integer keyTag;

        /**
         * <p>The algorithm policy used to match or validate the certificate. The value must be an integer from <strong>0 to 255</strong>. This parameter is required for SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MatchingType")
        public Integer matchingType;

        /**
         * <p>The port number for the record. The value must be an integer from <strong>0 to 65535</strong>. This parameter is required for SRV records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The record\&quot;s priority. The value must be an integer from <strong>0 to 65535</strong>, where a lower value indicates higher priority. This parameter is required for MX, SRV, and URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The type of certificate or public key specified in the record. The value must be an integer from <strong>0 to 255</strong>. This parameter is required for SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Selector")
        public Integer selector;

        /**
         * <p>The tag for the record. For a CAA record, the tag specifies the record\&quot;s type and purpose. This parameter is required for CAA records.</p>
         * 
         * <strong>example:</strong>
         * <p>issue</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The certificate type for a CERT record, or the public key type for an SSHFP record. This parameter is required for CERT and SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The usage identifier for the record. The value must be an integer from <strong>0 to 255</strong>. This parameter is required for SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Usage")
        public Integer usage;

        /**
         * <p>The value of the record or part of its content. This parameter is required for A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI records. The meaning of this parameter varies by record type:</p>
         * <ul>
         * <li><p><strong>A/AAAA</strong>: The target IP address. To specify multiple IP addresses, separate them with a comma (,). At least one IPv4 address is required.</p>
         * </li>
         * <li><p><strong>CNAME</strong>: The target domain name.</p>
         * </li>
         * <li><p><strong>NS</strong>: The name server for the domain.</p>
         * </li>
         * <li><p><strong>MX</strong>: A valid domain name for the target mail server.</p>
         * </li>
         * <li><p><strong>TXT</strong>: A valid text string.</p>
         * </li>
         * <li><p><strong>CAA</strong>: A valid domain name for the certificate authority.</p>
         * </li>
         * <li><p><strong>SRV</strong>: A valid domain name for the target host.</p>
         * </li>
         * <li><p><strong>URI</strong>: A valid URI string.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The weight of the record. The value must be an integer from <strong>0 to 65535</strong>. This parameter is required for SRV and URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static UpdateRecordRequestData build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecordRequestData self = new UpdateRecordRequestData();
            return TeaModel.build(map, self);
        }

        public UpdateRecordRequestData setAlgorithm(Integer algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public Integer getAlgorithm() {
            return this.algorithm;
        }

        public UpdateRecordRequestData setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public UpdateRecordRequestData setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public UpdateRecordRequestData setFlag(Integer flag) {
            this.flag = flag;
            return this;
        }
        public Integer getFlag() {
            return this.flag;
        }

        public UpdateRecordRequestData setKeyTag(Integer keyTag) {
            this.keyTag = keyTag;
            return this;
        }
        public Integer getKeyTag() {
            return this.keyTag;
        }

        public UpdateRecordRequestData setMatchingType(Integer matchingType) {
            this.matchingType = matchingType;
            return this;
        }
        public Integer getMatchingType() {
            return this.matchingType;
        }

        public UpdateRecordRequestData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateRecordRequestData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateRecordRequestData setSelector(Integer selector) {
            this.selector = selector;
            return this;
        }
        public Integer getSelector() {
            return this.selector;
        }

        public UpdateRecordRequestData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public UpdateRecordRequestData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public UpdateRecordRequestData setUsage(Integer usage) {
            this.usage = usage;
            return this;
        }
        public Integer getUsage() {
            return this.usage;
        }

        public UpdateRecordRequestData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public UpdateRecordRequestData setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
