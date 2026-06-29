// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRecordRequest extends TeaModel {
    /**
     * <p>The origin authentication information for the CNAME record.</p>
     */
    @NameInMap("AuthConf")
    public CreateRecordRequestAuthConf authConf;

    /**
     * <p>Used to tag the business scenario of the DNS record. This parameter is required when proxy acceleration is enabled for the DNS record (i.e., when the proxied parameter is set to true), and is not required when proxy acceleration is disabled (i.e., when the proxied parameter is set to false). Valid values:</p>
     * <ul>
     * <li><strong>image_video</strong>: Image and video.</li>
     * <li><strong>api</strong>: API.</li>
     * <li><strong>web</strong>: Web page.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>web</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>The comment for the record, with a maximum length of 100 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a remark.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The DNS information of the record. Different types of records require different content for this field. For more information, see
     * &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/2708761.html">Documentation</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/doc-detail/2708761.html">Documentation</a>
     * .</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;value&quot;:&quot;2.2.2.2&quot;
     * }</p>
     */
    @NameInMap("Data")
    public CreateRecordRequestData data;

    /**
     * <p>The origin host policy. This takes effect when the record type is CNAME. It specifies the host policy for back-to-origin requests. Two modes are available:</p>
     * <ul>
     * <li><strong>follow_hostname</strong>: Follow the request host.</li>
     * <li><strong>follow_origin_domain</strong>: Follow the origin domain.</li>
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
     * <p>Specifies whether to enable proxy acceleration for the record. Only CNAME records or A/AAAA records (i.e., when the type parameter is set to A/AAAA or CNAME) can enable proxy acceleration. Valid values:</p>
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
     * <p>The record name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>The site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The origin type of the CNAME record. This parameter is required when adding a CNAME record (i.e., when the type parameter is set to CNAME). Valid values:</p>
     * <ul>
     * <li><strong>OSS</strong>: OSS origin.</li>
     * <li><strong>S3</strong>: S3 origin.</li>
     * <li><strong>LB</strong>: Load balancer origin.</li>
     * <li><strong>OP</strong>: Origin pool origin.</li>
     * <li><strong>Domain</strong>: Standard domain origin.</li>
     * </ul>
     * <p>If this parameter is not specified or is left empty, it defaults to Domain, which is the standard domain origin type.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The time-to-live (TTL) of the record, in seconds. When set to 1, the TTL is automatic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The DNS type of the record, such as <strong>A/AAAA</strong>, <strong>CNAME</strong>, <strong>TXT</strong>, etc.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A/AAAA</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRecordRequest self = new CreateRecordRequest();
        return TeaModel.build(map, self);
    }

    public CreateRecordRequest setAuthConf(CreateRecordRequestAuthConf authConf) {
        this.authConf = authConf;
        return this;
    }
    public CreateRecordRequestAuthConf getAuthConf() {
        return this.authConf;
    }

    public CreateRecordRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public CreateRecordRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateRecordRequest setData(CreateRecordRequestData data) {
        this.data = data;
        return this;
    }
    public CreateRecordRequestData getData() {
        return this.data;
    }

    public CreateRecordRequest setHostPolicy(String hostPolicy) {
        this.hostPolicy = hostPolicy;
        return this;
    }
    public String getHostPolicy() {
        return this.hostPolicy;
    }

    public CreateRecordRequest setHttpPorts(String httpPorts) {
        this.httpPorts = httpPorts;
        return this;
    }
    public String getHttpPorts() {
        return this.httpPorts;
    }

    public CreateRecordRequest setHttpsPorts(String httpsPorts) {
        this.httpsPorts = httpsPorts;
        return this;
    }
    public String getHttpsPorts() {
        return this.httpsPorts;
    }

    public CreateRecordRequest setProxied(Boolean proxied) {
        this.proxied = proxied;
        return this;
    }
    public Boolean getProxied() {
        return this.proxied;
    }

    public CreateRecordRequest setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
    }

    public CreateRecordRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateRecordRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateRecordRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public CreateRecordRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateRecordRequestAuthConf extends TeaModel {
        /**
         * <p>The AccessKey of the account that owns the origin. This value is required when the origin type is OSS and the authentication type is private cross-account read, or when the origin type is S3 and the authentication type is private read.</p>
         * 
         * <strong>example:</strong>
         * <p>u0Nkg5gBK*******QF5wvKMM504JUHt</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The origin authentication type. Different origin types support different authentication types. The origin type refers to the SourceType parameter in this API. When the origin type is OSS or S3, you need to specify the origin authentication type. Valid values:</p>
         * <ul>
         * <li><strong>public</strong>: Public read. Select this value when the origin type is OSS or S3 and the origin has public read access.</li>
         * <li><strong>private</strong>: Private read. Select this value when the origin type is S3 and the origin has private read access.</li>
         * <li><strong>private_same_account</strong>: Private same-account read. Select this value when the origin type is OSS, the origin is under the same Alibaba Cloud account, and the origin has private read access.</li>
         * <li><strong>private_cross_account</strong>: Private cross-account read. Select this value when the origin type is OSS, the origin is not under the same Alibaba Cloud account, and the origin has private read access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The region where the origin is located. This value is required when the origin type is S3. The region information can be obtained from the official S3 website.</p>
         * 
         * <strong>example:</strong>
         * <p>us-east-1</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The SecretKey of the account that owns the origin. This value is required when the origin type is OSS and the authentication type is private cross-account read, or when the origin type is S3 and the authentication type is private read.</p>
         * 
         * <strong>example:</strong>
         * <p>VIxuvJSA2S03f******kp208dy5w7</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The signature algorithm version. This is required when the origin type is S3 and the authentication type is private read. The following two versions are supported:</p>
         * <ul>
         * <li><strong>v2</strong></li>
         * <li><strong>v4</strong></li>
         * </ul>
         * <p>If not specified, the default value is v4.</p>
         * 
         * <strong>example:</strong>
         * <p>v4</p>
         */
        @NameInMap("Version")
        public String version;

        public static CreateRecordRequestAuthConf build(java.util.Map<String, ?> map) throws Exception {
            CreateRecordRequestAuthConf self = new CreateRecordRequestAuthConf();
            return TeaModel.build(map, self);
        }

        public CreateRecordRequestAuthConf setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public CreateRecordRequestAuthConf setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public CreateRecordRequestAuthConf setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateRecordRequestAuthConf setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public CreateRecordRequestAuthConf setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateRecordRequestData extends TeaModel {
        /**
         * <p>The encryption algorithm used by the record, ranging from <strong>0 to 255</strong>. This field is required when adding CERT or SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Algorithm")
        public Integer algorithm;

        /**
         * <p>The public key certificate information of the record. This parameter is required when adding CERT, SMIMEA, or TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>dGVzdGFkYWxrcw==</p>
         */
        @NameInMap("Certificate")
        public String certificate;

        /**
         * <p>The public key fingerprint value of the record. This parameter is required when adding an SSHFP record.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdef1234567890</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The flag of the record. The Flag of a CAA record indicates its priority and processing method, with a value range of <strong>0 to 255</strong>. This parameter is required when adding a CAA record.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>The public key identifier of the record, ranging from <strong>0 to 65535</strong>. This parameter is required when adding a CERT record.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("KeyTag")
        public Integer keyTag;

        /**
         * <p>The algorithm policy used by the record to match or verify certificates, ranging from <strong>0 to 255</strong>. This parameter is required when adding SMIMEA or TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MatchingType")
        public Integer matchingType;

        /**
         * <p>The port of the record, ranging from <strong>0 to 65535</strong>. This parameter is required when adding an SRV record.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority of the record, ranging from <strong>0 to 65535</strong>. A smaller value indicates a higher priority. This parameter is required when adding MX, SRV, or URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The type of certificate or public key used by the record, ranging from <strong>0 to 255</strong>. This parameter is required when adding SMIMEA or TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Selector")
        public Integer selector;

        /**
         * <p>The tag of the record. The Tag of a CAA record indicates its specific type and purpose. This parameter is required when adding a CAA record. Valid values for Tag:</p>
         * <ul>
         * <li><strong>issue</strong>: Authorizes a specific CA to issue certificates for the domain. It is usually followed by the CA\&quot;s domain name.</li>
         * <li><strong>issuewild</strong>: Authorizes a specific CA to issue wildcard certificates for the domain (e.g., *.example.com).</li>
         * <li><strong>iodef</strong>: Specifies a URI for receiving reports about violations of CAA records.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>issue</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The certificate type of the record (for CERT records) or the public key type (for SSHFP records). This parameter is required when adding CERT or SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The usage identifier of the record, ranging from <strong>0 to 255</strong>. This parameter is required when adding SMIMEA or TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Usage")
        public Integer usage;

        /**
         * <p>The record value or partial content. This parameter is required when the record type is A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, or URI. It represents different meanings for different record types:</p>
         * <ul>
         * <li><strong>A/AAAA</strong>: The IP address to point to. Multiple IPs are separated by commas (,). At least one IPv4 address is required.</li>
         * <li><strong>CNAME</strong>: The target domain name to point to.</li>
         * <li><strong>NS</strong>: The name server for the specified domain.</li>
         * <li><strong>MX</strong>: A valid target mail server domain name.</li>
         * <li><strong>TXT</strong>: A valid text string.</li>
         * <li><strong>CAA</strong>: A valid certificate authority domain name.</li>
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
         * <p>The weight of the record, ranging from <strong>0 to 65535</strong>. This parameter is required when adding SRV or URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static CreateRecordRequestData build(java.util.Map<String, ?> map) throws Exception {
            CreateRecordRequestData self = new CreateRecordRequestData();
            return TeaModel.build(map, self);
        }

        public CreateRecordRequestData setAlgorithm(Integer algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public Integer getAlgorithm() {
            return this.algorithm;
        }

        public CreateRecordRequestData setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public CreateRecordRequestData setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public CreateRecordRequestData setFlag(Integer flag) {
            this.flag = flag;
            return this;
        }
        public Integer getFlag() {
            return this.flag;
        }

        public CreateRecordRequestData setKeyTag(Integer keyTag) {
            this.keyTag = keyTag;
            return this;
        }
        public Integer getKeyTag() {
            return this.keyTag;
        }

        public CreateRecordRequestData setMatchingType(Integer matchingType) {
            this.matchingType = matchingType;
            return this;
        }
        public Integer getMatchingType() {
            return this.matchingType;
        }

        public CreateRecordRequestData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateRecordRequestData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateRecordRequestData setSelector(Integer selector) {
            this.selector = selector;
            return this;
        }
        public Integer getSelector() {
            return this.selector;
        }

        public CreateRecordRequestData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public CreateRecordRequestData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public CreateRecordRequestData setUsage(Integer usage) {
            this.usage = usage;
            return this;
        }
        public Integer getUsage() {
            return this.usage;
        }

        public CreateRecordRequestData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public CreateRecordRequestData setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
