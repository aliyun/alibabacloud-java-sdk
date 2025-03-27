// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRecordRequest extends TeaModel {
    /**
     * <p>The origin authentication information of the CNAME record.</p>
     */
    @NameInMap("AuthConf")
    public CreateRecordRequestAuthConf authConf;

    /**
     * <p>The business scenario of the record for acceleration. Leave the parameter empty if your record is not proxied. Valid values:</p>
     * <ul>
     * <li><strong>image_video</strong>: video and image.</li>
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
     * <p>The comment of the record. The maximum length is 100 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a remark.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The DNS record information. The format of this field varies based on the record type. For more information, see <a href="https://www.alibabacloud.com/help/doc-detail/2708761.html">References</a> .</p>
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
     * <p>The origin host policy. This policy takes effect when the record type is CNAME. You can set the policy in two modes:</p>
     * <ul>
     * <li>follow_hostname: Follow the host record.</li>
     * <li>follow_origin_domain: match the origin\&quot;s domain name.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>follow_origin_domain</p>
     */
    @NameInMap("HostPolicy")
    public String hostPolicy;

    /**
     * <p>Specifies whether to proxy the record. Only CNAME and A/AAAA records can be proxied. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
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
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The origin type for the CNAME record. This parameter is required when you add a CNAME record. Valid values:</p>
     * <ul>
     * <li><strong>OSS</strong>: OSS bucket.</li>
     * <li><strong>S3</strong>: S3 bucket.</li>
     * <li><strong>LB</strong>: load balancer.</li>
     * <li><strong>OP</strong>: origin pool.</li>
     * <li><strong>Domain</strong>: domain name.</li>
     * </ul>
     * <p>If you do not pass this parameter or if you leave its value empty, Domain is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The TTL of the record. Unit: seconds. If the value is 1, the TTL of the record is determined by the system.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The type of the DNS record. For example, A/AAAA, TXT, MX, or CNAME.</p>
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
         * <p>The access key of the account to which the origin server belongs. This parameter is required when the SourceType is OSS, and AuthType is private_cross_account, or when the SourceType is S3 and AuthType is private.</p>
         * 
         * <strong>example:</strong>
         * <p>u0Nkg5gBK*******QF5wvKMM504JUHt</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The authentication type of the origin server. Different origins support different authentication types. The type of origin refers to the SourceType parameter in this operation. If the type of origin is OSS or S3, you must specify the authentication type of the origin. Valid values:</p>
         * <ul>
         * <li><strong>public</strong>: public read. Select this value when the origin type is OSS or S3 and the origin access is public read.</li>
         * <li><strong>private</strong>: private read. Select this value when the origin type is S3 and the origin access is private read.</li>
         * <li><strong>private_same_account</strong>: private read under the same account. Select this value when the origin type is OSS, the origins belong to the same Alibaba Cloud account, and the origins have private read access.</li>
         * <li><strong>private_cross_account</strong>: private read cross accounts. Select this value when the origin type is OSS, the origins belong to different Alibaba Cloud accounts, and the origins have private read access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The region of the origin. If the origin type is S3, you must specify this value. You can get the region information from the official website of S3.</p>
         * 
         * <strong>example:</strong>
         * <p>us-east-1</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The secret access key of the account to which the origin server belongs. This parameter is required when the SourceType is OSS, and AuthType is private_same_account, or when the SourceType is S3 and AuthType is private.</p>
         * 
         * <strong>example:</strong>
         * <p>VIxuvJSA2S03f******kp208dy5w7</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The version of the signature algorithm. This parameter is required when the origin type is S3 and AuthType is private. The following two types are supported:</p>
         * <ul>
         * <li><strong>v2</strong></li>
         * <li><strong>v4</strong></li>
         * </ul>
         * <p>If you leave this parameter empty, the default value v4 is used.</p>
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
         * <p>The encryption algorithm used for the record, specified within the range from 0 to 255. This parameter is required when you add CERT or SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Algorithm")
        public Integer algorithm;

        /**
         * <p>The public key of the certificate. This parameter is required when you add CERT, SMIMEA, or TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>dGVzdGFkYWxrcw==</p>
         */
        @NameInMap("Certificate")
        public String certificate;

        /**
         * <p>The public key fingerprint of the record. This parameter is required when you add a SSHFP record.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdef1234567890</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The flag bit of the record. The Flag for a CAA record indicates its priority and how it is processed, specified within the range of 0 to 255. This parameter is required when you add a CAA record.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>The public key identification for the record, specified within the range of 0 to 65,535. This parameter is required when you add a CAA record.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("KeyTag")
        public Integer keyTag;

        /**
         * <p>The algorithm policy used to match or validate the certificate, specified within the range 0 to 255. This parameter is required when you add SMIMEA or TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MatchingType")
        public Integer matchingType;

        /**
         * <p>The port of the record, specified within the range of 0 to 65,535. This parameter is required when you add an SRV record.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority of the record, specified within the range of 0 to 65,535. A smaller value indicates a higher priority. This parameter is required when you add MX, SRV, and URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The type of certificate or public key, specified within the range of 0 to 255. This parameter is required when you add SMIMEA or TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Selector")
        public Integer selector;

        /**
         * <p>The label of the record. The Tag of a CAA record indicate its specific type and usage. This parameter is required when you add a CAA record. Valid values:</p>
         * <ul>
         * <li><strong>issue</strong>: indicates that a CA is authorized to issue a certificate for the domain name. This is usually followed by the domain name of the CA.</li>
         * <li><strong>issuewild</strong>: indicates that a CA is authorized to issue a wildcard certificate (such as \*.example.com) for the domain name.</li>
         * <li><strong>iodef</strong>: specifies a URI to receive reports about CAA record violations.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>issue</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The certificate type of the record (in CERT records), or the public key type (in SSHFP records). This parameter is required when you add CERT or SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The usage identifier of the record, specified within the range of 0 to 255. This parameter is required when you add SMIMEA or TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Usage")
        public Integer usage;

        /**
         * <p>Record value or part of the record content. This parameter is required when you add A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI records. It has different meanings based on types of records:</p>
         * <ul>
         * <li><strong>A/AAAA</strong>: the IP address(es). Separate IP addresses with commas (,). You must have at least one IPv4 address.</li>
         * <li><strong>CNAME</strong>: the target domain name.</li>
         * <li><strong>NS</strong>: the name servers for the domain name.</li>
         * <li><strong>MX</strong>: a valid domain name of the target mail server.</li>
         * <li><strong>TXT</strong>: a valid text string.</li>
         * <li><strong>CAA</strong>: a valid domain name of the certificate authority.</li>
         * <li><strong>SRV</strong>: a valid domain name of the target host.</li>
         * <li><strong>URI</strong>: a valid URI string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The weight of the record, specified within the range of 0 to 65,535. This parameter is required when you add SRV or URI records.</p>
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
