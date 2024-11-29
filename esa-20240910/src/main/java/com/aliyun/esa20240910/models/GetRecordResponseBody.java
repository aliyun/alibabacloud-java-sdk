// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRecordResponseBody extends TeaModel {
    /**
     * <p>The information about the queried record.</p>
     */
    @NameInMap("RecordModel")
    public GetRecordResponseBodyRecordModel recordModel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F32C57AA-7BF8-49AE-A2CC-9F42390F5A19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecordResponseBody self = new GetRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecordResponseBody setRecordModel(GetRecordResponseBodyRecordModel recordModel) {
        this.recordModel = recordModel;
        return this;
    }
    public GetRecordResponseBodyRecordModel getRecordModel() {
        return this.recordModel;
    }

    public GetRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRecordResponseBodyRecordModelAuthConf extends TeaModel {
        /**
         * <p>The access key ID of the account to which the origin server belongs. This parameter is returned if the origin type is OSS and AuthType is set to private_cross_account, or the origin type is S3 and AuthType is set to private.</p>
         * 
         * <strong>example:</strong>
         * <p>VIxuvJSA2S03f******kp208dy5w7</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The authentication type of the origin server. Different origins support different authentication types. The origin type refers to the SourceType parameter in this operation. This parameter is returned if the origin type is OSS or S3Valid values:</p>
         * <ul>
         * <li><strong>public</strong>: public read. This value is returned when the origin is a public OSS or S3 bucket.</li>
         * <li><strong>private</strong>: private read. This value is returned when the origin is a private S3 bucket.</li>
         * <li><strong>private_same_account</strong>: private read in the same account. This value is returned when the origin is a private OSS bucket in your account.</li>
         * <li><strong>private_cross_account</strong>: private read across accounts. This value is returned when the origin is a private OSS bucket in a different Alibaba Cloud account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The region of the origin. If the origin type is S3, you must specify this value. You can obtain the region information from the official website of S3.</p>
         * 
         * <strong>example:</strong>
         * <p>us-east-1</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The secret access key of the account to which the origin server belongs. This parameter is returned if the origin type is OSS and AuthType is set to private_cross_account, or the origin type is S3 and AuthType is set to private.SecretKey</p>
         * 
         * <strong>example:</strong>
         * <p>u0Nkg5gBK*******QF5wvKMM504JUHt</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The version of the signature algorithm. This parameter is returned when the origin type is S3 and AuthType is private. The following two types are supported:</p>
         * <ul>
         * <li><strong>v2</strong></li>
         * <li><strong>v4</strong></li>
         * </ul>
         * <p>If this parameter is left empty, the default value v4 is used.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetRecordResponseBodyRecordModelAuthConf build(java.util.Map<String, ?> map) throws Exception {
            GetRecordResponseBodyRecordModelAuthConf self = new GetRecordResponseBodyRecordModelAuthConf();
            return TeaModel.build(map, self);
        }

        public GetRecordResponseBodyRecordModelAuthConf setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public GetRecordResponseBodyRecordModelAuthConf setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public GetRecordResponseBodyRecordModelAuthConf setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetRecordResponseBodyRecordModelAuthConf setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public GetRecordResponseBodyRecordModelAuthConf setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetRecordResponseBodyRecordModelData extends TeaModel {
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
         * <p>The public key identification for the record. Valid values: 0 to 65535. This parameter is required when you add a CAA record.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>The port of the record. Valid values: 0 to 65535. This parameter is required when you add an SRV record.</p>
         * 
         * <strong>example:</strong>
         * <p>8707</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority of the record. Valid values: 0 to 65535. A smaller value indicates a higher priority. This parameter is required when you add MX, SRV, and URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The type of the certificate or public key, specified within the range of 0 to 255. This parameter is required when you add SMIMEA or TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Selector")
        public Integer selector;

        /**
         * <p>The tag of the record. The Tag of a CAA record indicate its specific type and usage.</p>
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
         * <p>0</p>
         */
        @NameInMap("Usage")
        public Integer usage;

        /**
         * <p>The record value or part of the record content. This parameter is returned when you add A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI records. It has different meanings based on types of records.</p>
         * <ul>
         * <li><strong>A/AAAA</strong>: the IP address. Multiple IP addresses are separated with commas (,). There is at least one IPv4 address.</li>
         * <li><strong>CNAME</strong>: the target domain name.</li>
         * <li><strong>NS</strong>: the nameserver for the domain name.</li>
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
         * <p>The weight of the record, specified within the range of 0 to 65535. This parameter is required when you add SRV or URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static GetRecordResponseBodyRecordModelData build(java.util.Map<String, ?> map) throws Exception {
            GetRecordResponseBodyRecordModelData self = new GetRecordResponseBodyRecordModelData();
            return TeaModel.build(map, self);
        }

        public GetRecordResponseBodyRecordModelData setAlgorithm(Integer algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public Integer getAlgorithm() {
            return this.algorithm;
        }

        public GetRecordResponseBodyRecordModelData setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public GetRecordResponseBodyRecordModelData setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public GetRecordResponseBodyRecordModelData setFlag(Integer flag) {
            this.flag = flag;
            return this;
        }
        public Integer getFlag() {
            return this.flag;
        }

        public GetRecordResponseBodyRecordModelData setKeyTag(Integer keyTag) {
            this.keyTag = keyTag;
            return this;
        }
        public Integer getKeyTag() {
            return this.keyTag;
        }

        public GetRecordResponseBodyRecordModelData setMatchingType(Integer matchingType) {
            this.matchingType = matchingType;
            return this;
        }
        public Integer getMatchingType() {
            return this.matchingType;
        }

        public GetRecordResponseBodyRecordModelData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetRecordResponseBodyRecordModelData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetRecordResponseBodyRecordModelData setSelector(Integer selector) {
            this.selector = selector;
            return this;
        }
        public Integer getSelector() {
            return this.selector;
        }

        public GetRecordResponseBodyRecordModelData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetRecordResponseBodyRecordModelData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetRecordResponseBodyRecordModelData setUsage(Integer usage) {
            this.usage = usage;
            return this;
        }
        public Integer getUsage() {
            return this.usage;
        }

        public GetRecordResponseBodyRecordModelData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetRecordResponseBodyRecordModelData setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class GetRecordResponseBodyRecordModel extends TeaModel {
        /**
         * <p>The origin authentication information of the CNAME record.</p>
         */
        @NameInMap("AuthConf")
        public GetRecordResponseBodyRecordModelAuthConf authConf;

        /**
         * <p>The business scenario of the record for acceleration. Leave this parameter empty if your record is not proxied. Valid values:</p>
         * <ul>
         * <li><strong>image_video</strong></li>
         * <li><strong>api</strong></li>
         * <li><strong>web</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>image_video</p>
         */
        @NameInMap("BizName")
        public String bizName;

        /**
         * <p>The comments of the record.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a comment.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The time when the record was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10T13:30:39Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The DNS record information. The content returned by this parameter varies based on the record type.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;value&quot;:&quot;1.1.1.1&quot;}</p>
         */
        @NameInMap("Data")
        public GetRecordResponseBodyRecordModelData data;

        /**
         * <p>The origin host policy. This policy takes effect when the record type is CNAME. Valid values:</p>
         * <ul>
         * <li>follow_hostname: matches the requested domain name.</li>
         * <li>follow_origin_domain: matches the origin\&quot;s domain name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>follow_origin_domain</p>
         */
        @NameInMap("HostPolicy")
        public String hostPolicy;

        /**
         * <p>Indicates whether the record is proxied. Only CNAME and A/AAAA records can be proxied. Valid values:</p>
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
         * <p>The CNAME. If you use CNAME setup when you add your website to ESA, the value is the CNAME that you configured then.</p>
         * 
         * <strong>example:</strong>
         * <p>a.example.com.cnamezone.com</p>
         */
        @NameInMap("RecordCname")
        public String recordCname;

        /**
         * <p>The record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        @NameInMap("RecordId")
        public Long recordId;

        /**
         * <p>The record name.</p>
         * 
         * <strong>example:</strong>
         * <p>a.example.com</p>
         */
        @NameInMap("RecordName")
        public String recordName;

        /**
         * <p>The origin type for the CNAME record. This parameter is required when you add a CNAME record. Valid values:</p>
         * <ul>
         * <li><strong>OSS</strong>: OSS bucket.</li>
         * <li><strong>S3</strong>: S3 bucket.</li>
         * <li><strong>LB</strong>: load balancer.</li>
         * <li><strong>OP</strong>: origin pool.</li>
         * <li><strong>Domain</strong>: domain name.</li>
         * </ul>
         * <p>If you do not pass this parameter or if you leave its value empty, Domain is returned by default.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("RecordSourceType")
        public String recordSourceType;

        /**
         * <p>The type of the DNS record, such as <strong>A/AAAA, CNAME, and TXT</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>A/AAAA</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <p>The website name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        /**
         * <p>The TTL of the record. Unit: seconds. If the value is 1, the TTL of the record is determined by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
         * <p>The time when the record was updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-27T02:26:22Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetRecordResponseBodyRecordModel build(java.util.Map<String, ?> map) throws Exception {
            GetRecordResponseBodyRecordModel self = new GetRecordResponseBodyRecordModel();
            return TeaModel.build(map, self);
        }

        public GetRecordResponseBodyRecordModel setAuthConf(GetRecordResponseBodyRecordModelAuthConf authConf) {
            this.authConf = authConf;
            return this;
        }
        public GetRecordResponseBodyRecordModelAuthConf getAuthConf() {
            return this.authConf;
        }

        public GetRecordResponseBodyRecordModel setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public GetRecordResponseBodyRecordModel setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetRecordResponseBodyRecordModel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetRecordResponseBodyRecordModel setData(GetRecordResponseBodyRecordModelData data) {
            this.data = data;
            return this;
        }
        public GetRecordResponseBodyRecordModelData getData() {
            return this.data;
        }

        public GetRecordResponseBodyRecordModel setHostPolicy(String hostPolicy) {
            this.hostPolicy = hostPolicy;
            return this;
        }
        public String getHostPolicy() {
            return this.hostPolicy;
        }

        public GetRecordResponseBodyRecordModel setProxied(Boolean proxied) {
            this.proxied = proxied;
            return this;
        }
        public Boolean getProxied() {
            return this.proxied;
        }

        public GetRecordResponseBodyRecordModel setRecordCname(String recordCname) {
            this.recordCname = recordCname;
            return this;
        }
        public String getRecordCname() {
            return this.recordCname;
        }

        public GetRecordResponseBodyRecordModel setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public GetRecordResponseBodyRecordModel setRecordName(String recordName) {
            this.recordName = recordName;
            return this;
        }
        public String getRecordName() {
            return this.recordName;
        }

        public GetRecordResponseBodyRecordModel setRecordSourceType(String recordSourceType) {
            this.recordSourceType = recordSourceType;
            return this;
        }
        public String getRecordSourceType() {
            return this.recordSourceType;
        }

        public GetRecordResponseBodyRecordModel setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public GetRecordResponseBodyRecordModel setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

        public GetRecordResponseBodyRecordModel setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

        public GetRecordResponseBodyRecordModel setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public GetRecordResponseBodyRecordModel setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
