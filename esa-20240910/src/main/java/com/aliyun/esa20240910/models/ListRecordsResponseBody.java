// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRecordsResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>A list of DNS records. For details, see the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/2708761.html">documentation</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/doc-detail/2708761.html">documentation</a>.</p>
     */
    @NameInMap("Records")
    public java.util.List<ListRecordsResponseBodyRecords> records;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecordsResponseBody self = new ListRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecordsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRecordsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRecordsResponseBody setRecords(java.util.List<ListRecordsResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ListRecordsResponseBodyRecords> getRecords() {
        return this.records;
    }

    public ListRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecordsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRecordsResponseBodyRecordsAuthConf extends TeaModel {
        /**
         * <p>The AccessKey for the account that owns the origin server. This parameter is required if the origin type is OSS and the authentication type is <code>private_cross_account</code>, or if the origin type is S3 and the authentication type is <code>private</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>u0Nkg5gBK***QF5wvKMM504JUHt</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The origin authentication type. The available authentication types depend on the origin type, which is specified by the <code>RecordSourceType</code> parameter. This parameter is required if the origin type is OSS or S3. Valid values:</p>
         * <ul>
         * <li><p><strong>public</strong>: Public read. Use this value if the origin type is OSS or S3 and the origin server allows public read access.</p>
         * </li>
         * <li><p><strong>private</strong>: Private read. Use this value if the origin type is S3 and the origin server requires private read access.</p>
         * </li>
         * <li><p><strong>private_same_account</strong>: Private read within the same account. Use this value if the origin type is OSS, the origin server is in the same Alibaba Cloud account, and requires private read access.</p>
         * </li>
         * <li><p><strong>private_cross_account</strong>: Private read across different accounts. Use this value if the origin type is OSS, the origin server is in a different Alibaba Cloud account, and requires private read access.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The region where the origin server is located. This parameter is required if the origin type is S3. For valid region names, refer to the official S3 documentation.</p>
         * 
         * <strong>example:</strong>
         * <p>us-east-1</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The SecretKey for the account that owns the origin server. This parameter is required if the origin type is OSS and the authentication type is <code>private_cross_account</code>, or if the origin type is S3 and the authentication type is <code>private</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>VIxuvJSA2S03f***kp208dy5w7</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The signature algorithm version. This parameter is required if the origin type is S3 and the authentication type is <code>private</code>. Valid values:</p>
         * <ul>
         * <li><p><strong>v2</strong></p>
         * </li>
         * <li><p><strong>v4</strong></p>
         * </li>
         * </ul>
         * <p>The default is <code>v4</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>v4</p>
         */
        @NameInMap("Version")
        public String version;

        public static ListRecordsResponseBodyRecordsAuthConf build(java.util.Map<String, ?> map) throws Exception {
            ListRecordsResponseBodyRecordsAuthConf self = new ListRecordsResponseBodyRecordsAuthConf();
            return TeaModel.build(map, self);
        }

        public ListRecordsResponseBodyRecordsAuthConf setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public ListRecordsResponseBodyRecordsAuthConf setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public ListRecordsResponseBodyRecordsAuthConf setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListRecordsResponseBodyRecordsAuthConf setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public ListRecordsResponseBodyRecordsAuthConf setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListRecordsResponseBodyRecordsData extends TeaModel {
        /**
         * <p>The encryption algorithm for the record. The value ranges from <strong>0 to 255</strong>. This parameter is valid only for CERT and SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Algorithm")
        public Integer algorithm;

        /**
         * <p>The public key certificate. This parameter is valid only for CERT, SMIMEA, and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>dGVzdGFkYWxrcw==</p>
         */
        @NameInMap("Certificate")
        public String certificate;

        /**
         * <p>The public key fingerprint. This parameter is valid only for SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdef1234567890</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The record\&quot;s flag. For a CAA record, the flag determines how a certificate authority (CA) processes the record. The value ranges from <strong>0 to 255</strong>. This parameter applies only to CAA records.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>The public key identifier. The value ranges from <strong>0 to 65535</strong>. This parameter is valid only for CERT records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("KeyTag")
        public Integer keyTag;

        /**
         * <p>The algorithm policy for matching or validating certificates. The value ranges from <strong>0 to 255</strong>. This parameter is valid only for SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MatchingType")
        public Integer matchingType;

        /**
         * <p>The port number, which must be an integer from <strong>0 to 65535</strong>. This parameter applies only to SRV records.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority of the record, which must be an integer from <strong>0 to 65535</strong>. A lower value indicates a higher priority. This parameter applies only to MX, SRV, and URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The type of certificate or public key for the record. The value ranges from <strong>0 to 255</strong>. This parameter is valid only for SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Selector")
        public Integer selector;

        /**
         * <p>The record\&quot;s tag. For a CAA record, the tag indicates its specific type and purpose. This parameter is valid only for CAA records.</p>
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
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The usage identifier. The value ranges from <strong>0 to 255</strong>. This parameter is valid only for SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Usage")
        public Integer usage;

        /**
         * <p>The value of the record. This parameter applies to A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI records. The meaning of this parameter varies based on the record type:</p>
         * <ul>
         * <li><p><strong>A/AAAA</strong>: The target IP address. Use an IPv4 address for an A record and an IPv6 address for an AAAA record.</p>
         * </li>
         * <li><p><strong>CNAME</strong>: The target domain name.</p>
         * </li>
         * <li><p><strong>NS</strong>: The name server for the specified domain.</p>
         * </li>
         * <li><p><strong>MX</strong>: The domain name of the target mail server.</p>
         * </li>
         * <li><p><strong>TXT</strong>: A text string.</p>
         * </li>
         * <li><p><strong>CAA</strong>: The domain name of the certificate authority.</p>
         * </li>
         * <li><p><strong>SRV</strong>: The domain name of the target host.</p>
         * </li>
         * <li><p><strong>URI</strong>: A URI string.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CNAME</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The weight of the record, which must be an integer from <strong>0 to 65535</strong>. This parameter applies only to SRV and URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static ListRecordsResponseBodyRecordsData build(java.util.Map<String, ?> map) throws Exception {
            ListRecordsResponseBodyRecordsData self = new ListRecordsResponseBodyRecordsData();
            return TeaModel.build(map, self);
        }

        public ListRecordsResponseBodyRecordsData setAlgorithm(Integer algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public Integer getAlgorithm() {
            return this.algorithm;
        }

        public ListRecordsResponseBodyRecordsData setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public ListRecordsResponseBodyRecordsData setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public ListRecordsResponseBodyRecordsData setFlag(Integer flag) {
            this.flag = flag;
            return this;
        }
        public Integer getFlag() {
            return this.flag;
        }

        public ListRecordsResponseBodyRecordsData setKeyTag(Integer keyTag) {
            this.keyTag = keyTag;
            return this;
        }
        public Integer getKeyTag() {
            return this.keyTag;
        }

        public ListRecordsResponseBodyRecordsData setMatchingType(Integer matchingType) {
            this.matchingType = matchingType;
            return this;
        }
        public Integer getMatchingType() {
            return this.matchingType;
        }

        public ListRecordsResponseBodyRecordsData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListRecordsResponseBodyRecordsData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListRecordsResponseBodyRecordsData setSelector(Integer selector) {
            this.selector = selector;
            return this;
        }
        public Integer getSelector() {
            return this.selector;
        }

        public ListRecordsResponseBodyRecordsData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListRecordsResponseBodyRecordsData setTags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, ?> getTags() {
            return this.tags;
        }

        public ListRecordsResponseBodyRecordsData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListRecordsResponseBodyRecordsData setUsage(Integer usage) {
            this.usage = usage;
            return this;
        }
        public Integer getUsage() {
            return this.usage;
        }

        public ListRecordsResponseBodyRecordsData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListRecordsResponseBodyRecordsData setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class ListRecordsResponseBodyRecords extends TeaModel {
        /**
         * <p>The origin authentication settings for the CNAME record.</p>
         */
        @NameInMap("AuthConf")
        public ListRecordsResponseBodyRecordsAuthConf authConf;

        /**
         * <p>The business scenario for record acceleration. Valid values:</p>
         * <ul>
         * <li><p><strong>image_video</strong>: Images and videos.</p>
         * </li>
         * <li><p><strong>api</strong>: API.</p>
         * </li>
         * <li><p><strong>web</strong>: Web page.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>web</p>
         */
        @NameInMap("BizName")
        public String bizName;

        /**
         * <p>The record\&quot;s comment.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a remark.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The UTC time when the record was created, in ISO 8601 format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-24T02:01:11Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CustomPort")
        public String customPort;

        /**
         * <p>The DNS details of the record. The fields in this object vary based on the record type.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;value&quot;:&quot;1.1.1.1&quot;}</p>
         */
        @NameInMap("Data")
        public ListRecordsResponseBodyRecordsData data;

        /**
         * <p>The policy for the <code>HOST</code> header in back-to-origin requests. This parameter applies only to CNAME records. Valid values:</p>
         * <ul>
         * <li><p><strong>follow_hostname</strong>: Uses the <code>HOST</code> header of the incoming request.</p>
         * </li>
         * <li><p><strong>follow_origin_domain</strong>: Uses the domain name of the origin server.</p>
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
         * <p>Indicates whether proxy acceleration is enabled for the record. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Proxy acceleration is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Proxy acceleration is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Proxied")
        public Boolean proxied;

        /**
         * <p>The CNAME value assigned to this record. To enable the service, create a CNAME record in your DNS provider\&quot;s settings that points to this value.</p>
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
         * <p>The type of origin for the CNAME record. This parameter is required when you add a CNAME record. Valid values:</p>
         * <ul>
         * <li><p><strong>OSS</strong>: OSS origin.</p>
         * </li>
         * <li><p><strong>S3</strong>: S3 origin.</p>
         * </li>
         * <li><p><strong>LB</strong>: Load balancer origin.</p>
         * </li>
         * <li><p><strong>OP</strong>: Origin pool.</p>
         * </li>
         * <li><p><strong>Domain</strong>: Domain origin.</p>
         * </li>
         * </ul>
         * <p>If this parameter is not specified, the default value is <code>Domain</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("RecordSourceType")
        public String recordSourceType;

        /**
         * <p>The DNS record type, such as <strong>A/AAAA, CNAME, and TXT</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>A/AAAA</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <p>The ID of the site to which the record belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <p>The name of the site to which the record belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        /**
         * <p>The Time to Live (TTL) for the record, in seconds. A value of 1 indicates that the TTL is automatic.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Ttl")
        public Long ttl;

        /**
         * <p>The UTC time when the record was last updated, in ISO 8601 format: <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-07T10:02:59Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListRecordsResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ListRecordsResponseBodyRecords self = new ListRecordsResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ListRecordsResponseBodyRecords setAuthConf(ListRecordsResponseBodyRecordsAuthConf authConf) {
            this.authConf = authConf;
            return this;
        }
        public ListRecordsResponseBodyRecordsAuthConf getAuthConf() {
            return this.authConf;
        }

        public ListRecordsResponseBodyRecords setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public ListRecordsResponseBodyRecords setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListRecordsResponseBodyRecords setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRecordsResponseBodyRecords setCustomPort(String customPort) {
            this.customPort = customPort;
            return this;
        }
        public String getCustomPort() {
            return this.customPort;
        }

        public ListRecordsResponseBodyRecords setData(ListRecordsResponseBodyRecordsData data) {
            this.data = data;
            return this;
        }
        public ListRecordsResponseBodyRecordsData getData() {
            return this.data;
        }

        public ListRecordsResponseBodyRecords setHostPolicy(String hostPolicy) {
            this.hostPolicy = hostPolicy;
            return this;
        }
        public String getHostPolicy() {
            return this.hostPolicy;
        }

        public ListRecordsResponseBodyRecords setHttpPorts(String httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }
        public String getHttpPorts() {
            return this.httpPorts;
        }

        public ListRecordsResponseBodyRecords setHttpsPorts(String httpsPorts) {
            this.httpsPorts = httpsPorts;
            return this;
        }
        public String getHttpsPorts() {
            return this.httpsPorts;
        }

        public ListRecordsResponseBodyRecords setProxied(Boolean proxied) {
            this.proxied = proxied;
            return this;
        }
        public Boolean getProxied() {
            return this.proxied;
        }

        public ListRecordsResponseBodyRecords setRecordCname(String recordCname) {
            this.recordCname = recordCname;
            return this;
        }
        public String getRecordCname() {
            return this.recordCname;
        }

        public ListRecordsResponseBodyRecords setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public ListRecordsResponseBodyRecords setRecordName(String recordName) {
            this.recordName = recordName;
            return this;
        }
        public String getRecordName() {
            return this.recordName;
        }

        public ListRecordsResponseBodyRecords setRecordSourceType(String recordSourceType) {
            this.recordSourceType = recordSourceType;
            return this;
        }
        public String getRecordSourceType() {
            return this.recordSourceType;
        }

        public ListRecordsResponseBodyRecords setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public ListRecordsResponseBodyRecords setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

        public ListRecordsResponseBodyRecords setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

        public ListRecordsResponseBodyRecords setTtl(Long ttl) {
            this.ttl = ttl;
            return this;
        }
        public Long getTtl() {
            return this.ttl;
        }

        public ListRecordsResponseBodyRecords setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
