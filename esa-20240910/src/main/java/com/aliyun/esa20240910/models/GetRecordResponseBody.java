// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRecordResponseBody extends TeaModel {
    /**
     * <p>Details of the record.</p>
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
         * <p>The AccessKey ID of the account that owns the origin.</p>
         * 
         * <strong>example:</strong>
         * <p>VIxuvJSA2S03f******kp208dy5w7</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The origin authentication type. Valid values:</p>
         * <ul>
         * <li><p><strong>public</strong>: Public read. Select this value when the origin is an OSS or S3 origin with public read access.</p>
         * </li>
         * <li><p><strong>private</strong>: Private read. Select this value when the origin is an S3 origin with private read access.</p>
         * </li>
         * <li><p><strong>private_same_account</strong>: Private read within the same account. Select this value when the origin is an OSS origin with private read access under the same Alibaba Cloud account.</p>
         * </li>
         * <li><p><strong>private_cross_account</strong>: Private read across accounts. Select this value when the origin is an OSS origin with private read access under a different Alibaba Cloud account.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The origin\&quot;s region. For S3 origins, you can find region codes on the official S3 website.</p>
         * 
         * <strong>example:</strong>
         * <p>us-east-1</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The AccessKey secret of the account that owns the origin.</p>
         * 
         * <strong>example:</strong>
         * <p>u0Nkg5gBK*******QF5wvKMM504JUHt</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The version of the signature algorithm. Supported versions:</p>
         * <ul>
         * <li><p><strong>v2</strong></p>
         * </li>
         * <li><p><strong>v4</strong></p>
         * </li>
         * </ul>
         * <p>If unspecified, the default is <code>v4</code>.</p>
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
         * <p>The encryption algorithm of the record, from <strong>0</strong> to <strong>255</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Algorithm")
        public Integer algorithm;

        /**
         * <p>The record\&quot;s public key certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>dGVzdGFkYWxrcw==</p>
         */
        @NameInMap("Certificate")
        public String certificate;

        /**
         * <p>The public key fingerprint of the record.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdef1234567890</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The flag of the record. For CAA records, this flag indicates the priority and processing method. The value must be from <strong>0</strong> to <strong>255</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>The public key identifier of the record, from <strong>0</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("KeyTag")
        public Integer keyTag;

        /**
         * <p>The algorithm policy for matching or verifying the certificate, from <strong>0</strong> to <strong>255</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MatchingType")
        public Integer matchingType;

        /**
         * <p>The port of the record, from <strong>0</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>8707</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority of the record, from <strong>0</strong> to <strong>65535</strong>. A lower value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The record\&quot;s certificate or public key type, from <strong>0</strong> to <strong>255</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Selector")
        public Integer selector;

        /**
         * <p>The tag of the record. For CAA records, the tag indicates the specific type and purpose.</p>
         * 
         * <strong>example:</strong>
         * <p>issue</p>
         */
        @NameInMap("Tag")
        public String tag;

        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The certificate type for a CERT record, or the public key type for an SSHFP record.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The usage identifier of the record, from <strong>0</strong> to <strong>255</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Usage")
        public Integer usage;

        /**
         * <p>The record value. The meaning of this parameter varies by the record type:</p>
         * <ul>
         * <li><p><strong>A/AAAA</strong>: The target IP address. Separate multiple IP addresses with a comma (<code>,</code>). Requires at least one IPv4 address.</p>
         * </li>
         * <li><p><strong>CNAME</strong>: The target domain name.</p>
         * </li>
         * <li><p><strong>NS</strong>: The name server for the specified domain.</p>
         * </li>
         * <li><p><strong>MX</strong>: A valid target mail server domain name.</p>
         * </li>
         * <li><p><strong>TXT</strong>: A valid text string.</p>
         * </li>
         * <li><p><strong>CAA</strong>: A valid Certificate Authority domain name.</p>
         * </li>
         * <li><p><strong>SRV</strong>: A valid target host domain name.</p>
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
         * <p>The weight of the record, from <strong>0</strong> to <strong>65535</strong>.</p>
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

        public GetRecordResponseBodyRecordModelData setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
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
         * <p>The origin authentication settings for the CNAME record.</p>
         */
        @NameInMap("AuthConf")
        public GetRecordResponseBodyRecordModelAuthConf authConf;

        /**
         * <p>The business scenario for record acceleration. Valid values:</p>
         * <ul>
         * <li><p><strong>image_video</strong>: Images and videos.</p>
         * </li>
         * <li><p><strong>api</strong>: APIs.</p>
         * </li>
         * <li><p><strong>web</strong>: Web pages.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>image_video</p>
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
         * <p>The time when the record was created. The time is in UTC and follows the ISO 8601 standard. Format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10T13:30:39Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CustomPort")
        public String customPort;

        /**
         * <p>DNS information for the record. The content varies based on the record type.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;value&quot;:&quot;1.1.1.1&quot;}</p>
         */
        @NameInMap("Data")
        public GetRecordResponseBodyRecordModelData data;

        /**
         * <p>Specifies the policy for the <code>Host</code> header during origin-pull. This parameter applies only to CNAME records. Valid values:</p>
         * <ul>
         * <li><p><strong>follow_hostname</strong>: Follows the host record.</p>
         * </li>
         * <li><p><strong>follow_origin_domain</strong>: Follows the origin domain.</p>
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
         * <p>Indicates whether the proxy is enabled for the record. This feature is supported only for A, AAAA, and CNAME records. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The proxy is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: The proxy is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Proxied")
        public Boolean proxied;

        /**
         * <p>The CNAME of the record.</p>
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
         * <p>The origin type for CNAME records. Valid values:</p>
         * <ul>
         * <li><p><strong>OSS</strong>: OSS origin.</p>
         * </li>
         * <li><p><strong>S3</strong>: S3 origin.</p>
         * </li>
         * <li><p><strong>LB</strong>: A load balancer.</p>
         * </li>
         * <li><p><strong>OP</strong>: An origin pool.</p>
         * </li>
         * <li><p><strong>Domain</strong>: A standard domain.</p>
         * </li>
         * </ul>
         * <p>If unspecified, the default is <code>Domain</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("RecordSourceType")
        public String recordSourceType;

        /**
         * <p>The DNS type of the record, such as <strong>A/AAAA</strong>, <strong>CNAME</strong>, or <strong>TXT</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>A/AAAA</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <p>The site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <p>The site name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        /**
         * <p>The record\&quot;s Time to Live (TTL) in seconds. A value of 1 indicates an automatic TTL.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
         * <p>The time when the record was last updated. The time is in UTC and follows the ISO 8601 standard. Format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
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

        public GetRecordResponseBodyRecordModel setCustomPort(String customPort) {
            this.customPort = customPort;
            return this;
        }
        public String getCustomPort() {
            return this.customPort;
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

        public GetRecordResponseBodyRecordModel setHttpPorts(String httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }
        public String getHttpPorts() {
            return this.httpPorts;
        }

        public GetRecordResponseBodyRecordModel setHttpsPorts(String httpsPorts) {
            this.httpsPorts = httpsPorts;
            return this;
        }
        public String getHttpsPorts() {
            return this.httpsPorts;
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
