// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRecordsResponseBody extends TeaModel {
    /**
     * <p>The current page number, same as the PageNumber request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records displayed per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>DNS information of the records. For details, refer to &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/document_detail/2708761.html">Documentation</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/doc-detail/2708761.html">Documentation</a>.</p>
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
         * <p>The AccessKey of the account to which the origin belongs. This parameter is available when the origin type is OSS with private cross-account read authentication, or when the origin type is S3 with private read authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>u0Nkg5gBK***QF5wvKMM504JUHt</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The origin authentication type. Different origin types support different authentication types. The origin type refers to the SourceType parameter in this API. When the origin type is OSS or S3, the origin authentication type must be specified. Valid values:</p>
         * <ul>
         * <li><strong>public</strong>: Public read. Use this value when the origin type is OSS or S3 and the origin has public read access.</li>
         * <li><strong>private</strong>: Private read. Use this value when the origin type is S3 and the origin has private read access.</li>
         * <li><strong>private_same_account</strong>: Private same-account read. Use this value when the origin type is OSS, the origin is under the same Alibaba Cloud account, and the origin has private read access.</li>
         * <li><strong>private_cross_account</strong>: Private cross-account read. Use this value when the origin type is OSS, the origin is not under the same Alibaba Cloud account, and the origin has private read access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The region where the origin is located. This parameter is available when the origin type is S3. The region of the origin can be obtained from the official S3 website.</p>
         * 
         * <strong>example:</strong>
         * <p>us-east-1</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The SecretKey of the account to which the origin belongs. This parameter is available when the origin type is OSS with private cross-account read authentication, or when the origin type is S3 with private read authentication.</p>
         * 
         * <strong>example:</strong>
         * <p>VIxuvJSA2S03f***kp208dy5w7</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The signature algorithm version. This parameter is available when the origin type is S3 and the origin authentication type is private read. Valid values:</p>
         * <ul>
         * <li><strong>v2</strong></li>
         * <li><strong>v4</strong></li>
         * </ul>
         * <p>Default value: v4.</p>
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
         * <p>The encryption algorithm used by the record. Valid values: <strong>0 to 255</strong>. Exclusive to CERT and SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Algorithm")
        public Integer algorithm;

        /**
         * <p>The public key certificate information of the record. Exclusive to CERT, SMIMEA, and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>dGVzdGFkYWxrcw==</p>
         */
        @NameInMap("Certificate")
        public String certificate;

        /**
         * <p>The public key fingerprint value of the record. Exclusive to SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdef1234567890</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The flag of the record. The Flag of a CAA record indicates its priority and processing method. Valid values: <strong>0 to 255</strong>. Exclusive to CAA records.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>The public key identifier of the record. Valid values: <strong>0 to 65535</strong>. Exclusive to CERT records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("KeyTag")
        public Integer keyTag;

        /**
         * <p>The algorithm strategy used by the record for matching or verifying certificates. Valid values: <strong>0 to 255</strong>. Exclusive to SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MatchingType")
        public Integer matchingType;

        /**
         * <p>The port of the record. Valid values: <strong>0 to 65535</strong>. Exclusive to SRV records.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority of the record. Valid values: <strong>0 to 65535</strong>. A smaller value indicates a higher priority. Exclusive to MX, SRV, and URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The type of certificate or public key used by the record. Valid values: <strong>0 to 255</strong>. Exclusive to SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Selector")
        public Integer selector;

        /**
         * <p>The tag of the record. The Tag of a CAA record indicates its specific type and purpose. Exclusive to CAA records.</p>
         * 
         * <strong>example:</strong>
         * <p>issue</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The tags of the record.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Name\&quot;:\&quot;PARAMETER\&quot;}</p>
         */
        @NameInMap("Tags")
        public java.util.Map<String, ?> tags;

        /**
         * <p>The certificate type of the record (in CERT records), or the public key type (in SSHFP records).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The usage identifier of the record. Valid values: <strong>0 to 255</strong>. Exclusive to SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Usage")
        public Integer usage;

        /**
         * <p>The record value or partial content. This parameter is included in A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI records. It has different meanings for different record types:</p>
         * <ul>
         * <li><strong>A/AAAA</strong>: The IP address pointed to. When there are multiple IPs, they are separated by commas (,). At least one IPv4 address is required.</li>
         * <li><strong>CNAME</strong>: The target domain name pointed to.</li>
         * <li><strong>NS</strong>: The name server for the specified domain.</li>
         * <li><strong>MX</strong>: A valid target mail server domain name.</li>
         * <li><strong>TXT</strong>: A valid text string.</li>
         * <li><strong>CAA</strong>: A valid certificate authority domain name.</li>
         * <li><strong>SRV</strong>: A valid target host domain name.</li>
         * <li><strong>URI</strong>: A valid URI string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CNAME</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The weight of the record. Valid values: <strong>0 to 65535</strong>. Exclusive to SRV and URI records.</p>
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
         * <p>The origin authentication information of the CNAME record.</p>
         */
        @NameInMap("AuthConf")
        public ListRecordsResponseBodyRecordsAuthConf authConf;

        /**
         * <p>The business scenario for record acceleration. Valid values:</p>
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
         * <p>The comment of the record.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a remark.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The creation time of the record. The date format follows the ISO 8601 standard and uses UTC time in the format of yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-12-24T02:01:11Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CustomPort")
        public String customPort;

        /**
         * <p>The specific DNS information of the record. Different record types contain different information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;value&quot;:&quot;1.1.1.1&quot;}</p>
         */
        @NameInMap("Data")
        public ListRecordsResponseBodyRecordsData data;

        /**
         * <p>The origin host policy. This takes effect when the record type is CNAME. It sets the policy for the host header used during origin requests. Two modes are available:</p>
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
         * <p>Indicates whether proxy acceleration is enabled for the record. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Proxy enabled.</li>
         * <li><strong>false</strong>: Proxy acceleration disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Proxied")
        public Boolean proxied;

        /**
         * <p>The CNAME of the record. This is the CNAME value that needs to be configured for the record when the site access method is CNAME access.</p>
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
         * <p>The origin type of the CNAME record. This parameter is required when adding a CNAME record. Valid values:</p>
         * <ul>
         * <li><strong>OSS</strong>: OSS origin.</li>
         * <li><strong>S3</strong>: S3 origin.</li>
         * <li><strong>LB</strong>: Load balancer origin.</li>
         * <li><strong>OP</strong>: Origin pool.</li>
         * <li><strong>Domain</strong>: Standard domain origin.</li>
         * </ul>
         * <p>If this parameter is not specified or left empty, the default value is Domain, which indicates a standard domain origin type.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("RecordSourceType")
        public String recordSourceType;

        /**
         * <p>The DNS type of the record, such as <strong>A/AAAA, CNAME, TXT</strong>, etc.</p>
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
         * <p>The TTL (Time to Live) of the record, in seconds. When the value is 1, it indicates that the TTL is set to automatic.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Ttl")
        public Long ttl;

        /**
         * <p>The update time of the record. The date format follows the ISO 8601 standard and uses UTC time in the format of yyyy-MM-ddTHH:mm:ssZ.</p>
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
