// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRecordRequest extends TeaModel {
    /**
     * <p>The origin authentication information of the CNAME record.</p>
     */
    @NameInMap("AuthConf")
    public UpdateRecordRequestAuthConf authConf;

    /**
     * <p>The business scenario for record acceleration. This parameter is not required for records without acceleration enabled. Valid values:</p>
     * <ul>
     * <li><strong>video_image</strong>: video and image.</li>
     * <li><strong>api</strong>: API.</li>
     * <li><strong>web</strong>: web page.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>web</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>The comment for the record.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a remark.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The DNS information of the record. The content varies depending on the record type. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/2708761.html">documentation</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/doc-detail/2708761.html">documentation</a>.</p>
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
     * <p>The back-to-origin HOST policy. This parameter takes effect when the record type is CNAME. Settings the HOST policy for back-to-origin requests. Valid values:</p>
     * <ul>
     * <li><strong>follow_hostname</strong>: follows the host record.</li>
     * <li><strong>follow_origin_domain</strong>: follows the Origin Domain Name.</li>
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
     * <p>Specifies whether to enable proxy acceleration for the record. Only CNAME records and A/AAAA records support proxy acceleration. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enable proxy acceleration.</li>
     * <li><strong>false</strong>: Disable proxy acceleration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Proxied")
    public Boolean proxied;

    /**
     * <p>The ID of the record. You can call <a href="https://help.aliyun.com/document_detail/2850265.html">ListRecords</a> to obtain the record ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>The origin server type of the CNAME record. This parameter is required when you add a CNAME record. Valid values:</p>
     * <ul>
     * <li><strong>OSS</strong>: OSS origin server.</li>
     * <li><strong>S3</strong>: S3 origin server.</li>
     * <li><strong>LB</strong>: load balancing origin server.</li>
     * <li><strong>OP</strong>: IPAM pool origin server.</li>
     * <li><strong>Domain</strong>: standard domain name origin server.</li>
     * </ul>
     * <p>If this parameter is not specified or is left empty, the default value is Domain, which indicates a standard domain name origin server type.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The time-to-live (TTL) of the record, in seconds. Valid values: <strong>30 to 86400</strong>, or 1. A value of 1 indicates that the TTL of the record is automatically determined.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The DNS type of the record, such as A/AAAA, CNAME, or TXT.</p>
     * 
     * <strong>example:</strong>
     * <p>A/AAAA</p>
     */
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
         * <p>The AccessKey of the account to which the origin server belongs. This parameter is required when the origin server type is OSS and the origin authentication type is private cross-account read, or when the origin server type is S3 and the origin authentication type is private read.</p>
         * 
         * <strong>example:</strong>
         * <p>VIxuvJSA2S03f******kp208dy5w7</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The origin authentication type. Different origin server types support different authentication types. The origin server type refers to the SourceType parameter in this operation. When the origin server type is OSS or S3, you must specify the origin authentication type. Valid values:</p>
         * <ul>
         * <li><strong>public</strong>: public read. Select this value when the origin server type is OSS or S3 and the origin server allows public read access.</li>
         * <li><strong>private</strong>: private read. Select this value when the origin server type is S3 and the origin server allows only private read access.</li>
         * <li><strong>private_same_account</strong>: private same-account read. Select this value when the origin server type is OSS, the origin server is under the same Alibaba Cloud account, and the origin server allows only private read access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The signature algorithm version. This parameter is required when the origin server type is S3 and the origin authentication type is private read. Valid values:</p>
         * <ul>
         * <li><p><strong>v2</strong></p>
         * </li>
         * <li><p><strong>v4</strong></p>
         * </li>
         * </ul>
         * <p>Default value: v4.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The SecretKey of the account to which the origin server belongs. This parameter is required when the origin server type is OSS and the origin authentication type is private cross-account read, or when the origin server type is S3 and the origin authentication type is private read.</p>
         * 
         * <strong>example:</strong>
         * <p>u0Nkg5gBK*******QF5wvKMM504JUHt</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The region to which the origin server belongs. This parameter is required when the origin server type is S3. Obtain the region from the official S3 website.</p>
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
         * <p>The encryption algorithm used by the record. Valid values: <strong>0 to 255</strong>. This parameter is required when you add CERT or SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Algorithm")
        public Integer algorithm;

        /**
         * <p>The public key certificate information of the record. This parameter is required when you add CERT, SMIMEA, or TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>dGVzdGFkYWxrcw==</p>
         */
        @NameInMap("Certificate")
        public String certificate;

        /**
         * <p>The public key fingerprint value of the record. This parameter is required when you add SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdef1234567890</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The flag of the record. The Flag of a CAA record indicates its priority and processing method. Valid values: <strong>0 to 255</strong>. This parameter is required when you add CAA records.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>The public key identifier of the record. Valid values: <strong>0 to 65535</strong>. This parameter is required when you add CERT records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("KeyTag")
        public Integer keyTag;

        /**
         * <p>The algorithm policy used by the record for matching or verifying certificates. Valid values: <strong>0 to 255</strong>. This parameter is required when you add SMIMEA or TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MatchingType")
        public Integer matchingType;

        /**
         * <p>The port of the record. Valid values: <strong>0 to 65535</strong>. This parameter is required when you add SRV records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority of the record. Valid values: <strong>0 to 65535</strong>. A smaller value indicates a higher priority. This parameter is required when you add MX, SRV, or URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The type of certificate or public key used by the record. Valid values: <strong>0 to 255</strong>. This parameter is required when you add SMIMEA or TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Selector")
        public Integer selector;

        /**
         * <p>The tag of the record. The Tag of a CAA record indicates its specific type and purpose. This parameter is required when you add CAA records.</p>
         * 
         * <strong>example:</strong>
         * <p>issue</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The certificate type of the record (for CERT records) or the public key type (for SSHFP records). This parameter is required when you add CERT or SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The usage identifier of the record. Valid values: <strong>0 to 255</strong>. This parameter is required when you add SMIMEA or TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Usage")
        public Integer usage;

        /**
         * <p>The record value or partial content. This parameter is required when you add A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, or URI records. The meaning varies depending on the record type:</p>
         * <ul>
         * <li><strong>A/AAAA</strong>: The IP address to which the record points. Separate multiple IP addresses with commas (,). At least one IPv4 address is required.</li>
         * <li><strong>CNAME</strong>: The target domain name to which the record points.</li>
         * <li><strong>NS</strong>: The name server for the specified domain name.</li>
         * <li><strong>MX</strong>: A valid target mail server domain name.</li>
         * <li><strong>TXT</strong>: A valid text string.</li>
         * <li><strong>CAA</strong>: A valid certification authority domain name.</li>
         * <li><strong>SRV</strong>: A valid target host domain name.</li>
         * <li><strong>URI</strong>: A valid URI string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The weight of the record. Valid values: <strong>0 to 65535</strong>. This parameter is required when you add SRV or URI records.</p>
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
