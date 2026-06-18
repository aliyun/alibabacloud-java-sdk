// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchCreateRecordsRequest extends TeaModel {
    /**
     * <p>The list of DNS records to create.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordList")
    public java.util.List<BatchCreateRecordsRequestRecordList> recordList;

    /**
     * <p>The ID of the site. You can get this ID by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    public static BatchCreateRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateRecordsRequest self = new BatchCreateRecordsRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateRecordsRequest setRecordList(java.util.List<BatchCreateRecordsRequestRecordList> recordList) {
        this.recordList = recordList;
        return this;
    }
    public java.util.List<BatchCreateRecordsRequestRecordList> getRecordList() {
        return this.recordList;
    }

    public BatchCreateRecordsRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public static class BatchCreateRecordsRequestRecordListAuthConf extends TeaModel {
        /**
         * <p>The access key ID of the account that owns the origin. This parameter is required when the origin type is <code>OSS</code> and the authentication type is <code>private_cross_account</code>, or when the origin type is <code>S3</code> and the authentication type is <code>private</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>u0Nkg5gBK*******QF5wvKMM504JUHt</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The type of origin authentication. Supported authentication types depend on the origin type, which is specified by the <code>SourceType</code> parameter. This parameter is required when the origin type is <code>OSS</code> or <code>S3</code>. Valid values:</p>
         * <ul>
         * <li><p><strong>public</strong>: For OSS or S3 origins with public read access.</p>
         * </li>
         * <li><p><strong>private</strong>: For S3 origins with private read access.</p>
         * </li>
         * <li><p><strong>private_same_account</strong>: For OSS origins with private read access within the same Alibaba Cloud account.</p>
         * </li>
         * <li><p><strong>private_cross_account</strong>: For OSS origins with private read access from a different Alibaba Cloud account.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The region where the S3 origin is located. This parameter is required when the origin type is <code>S3</code>. For a list of valid region IDs, refer to the official S3 documentation.</p>
         * 
         * <strong>example:</strong>
         * <p>us-east-1</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The secret key associated with the specified AccessKey. This parameter is required when the origin type is <code>OSS</code> and the authentication type is <code>private_cross_account</code>, or when the origin type is <code>S3</code> and the authentication type is <code>private</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>VIxuvJSA2S03f******kp208dy5w7</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The signature algorithm version. This parameter is applicable when the origin type is <code>S3</code> and the authentication type is <code>private</code>. Supported versions:</p>
         * <ul>
         * <li><p><strong>v2</strong></p>
         * </li>
         * <li><p><strong>v4</strong></p>
         * </li>
         * </ul>
         * <p>If omitted, the default version is <code>v4</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>v4</p>
         */
        @NameInMap("Version")
        public String version;

        public static BatchCreateRecordsRequestRecordListAuthConf build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateRecordsRequestRecordListAuthConf self = new BatchCreateRecordsRequestRecordListAuthConf();
            return TeaModel.build(map, self);
        }

        public BatchCreateRecordsRequestRecordListAuthConf setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public BatchCreateRecordsRequestRecordListAuthConf setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public BatchCreateRecordsRequestRecordListAuthConf setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public BatchCreateRecordsRequestRecordListAuthConf setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public BatchCreateRecordsRequestRecordListAuthConf setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class BatchCreateRecordsRequestRecordListData extends TeaModel {
        /**
         * <p>The algorithm identifier for the record. Valid values range from <strong>0-255</strong>. This parameter applies to CERT and SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Algorithm")
        public Integer algorithm;

        /**
         * <p>The certificate or public key data for the record. This parameter applies to CERT, SMIMEA, and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>dGVzdGFkYWxrcw==</p>
         */
        @NameInMap("Certificate")
        public String certificate;

        /**
         * <p>The public key fingerprint for the record. This parameter applies to SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdef1234567890</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The flag for the CAA record, which specifies how a Certificate Authority must handle the record. Valid values range from <strong>0-255</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>The public key identifier for the record. Valid values range from <strong>0-65535</strong>. This parameter applies to CERT records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("KeyTag")
        public Integer keyTag;

        /**
         * <p>The algorithm policy used to match or validate a certificate. Valid values range from <strong>0-255</strong>. This parameter applies to SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MatchingType")
        public Integer matchingType;

        /**
         * <p>The port number for the record. Valid values range from <strong>0-65535</strong>. This parameter applies only to SRV records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority of the record. Valid values range from <strong>0-65535</strong>. A lower value indicates a higher priority. This parameter is required for MX, SRV, or URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The type of certificate or public key used by the record. Valid values range from <strong>0-255</strong>. This parameter applies to SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Selector")
        public Integer selector;

        /**
         * <p>The tag for the CAA record, which specifies its type and purpose, such as <code>issue</code>, <code>issuewild</code>, or <code>iodef</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>issue</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The certificate type for a CERT record or the public key type for an SSHFP record.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The usage identifier for the record. Valid values range from <strong>0-255</strong>. This parameter applies to SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Usage")
        public Integer usage;

        /**
         * <p>The record value. The format depends on the record type.</p>
         * <ul>
         * <li><p><strong>A/AAAA</strong>: An IP address.</p>
         * </li>
         * <li><p><strong>CNAME</strong>: The target domain name.</p>
         * </li>
         * <li><p><strong>MX</strong>: The domain name of the target mail server.</p>
         * </li>
         * <li><p><strong>TXT</strong>: A text string.</p>
         * </li>
         * <li><p><strong>CAA</strong>: The domain name of a Certificate Authority.</p>
         * </li>
         * <li><p><strong>SRV</strong>: The domain name of the target host.</p>
         * </li>
         * <li><p><strong>URI</strong>: A URI string.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The weight of the record. Valid values range from <strong>0-65535</strong>. This parameter applies to SRV and URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static BatchCreateRecordsRequestRecordListData build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateRecordsRequestRecordListData self = new BatchCreateRecordsRequestRecordListData();
            return TeaModel.build(map, self);
        }

        public BatchCreateRecordsRequestRecordListData setAlgorithm(Integer algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public Integer getAlgorithm() {
            return this.algorithm;
        }

        public BatchCreateRecordsRequestRecordListData setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public BatchCreateRecordsRequestRecordListData setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public BatchCreateRecordsRequestRecordListData setFlag(Integer flag) {
            this.flag = flag;
            return this;
        }
        public Integer getFlag() {
            return this.flag;
        }

        public BatchCreateRecordsRequestRecordListData setKeyTag(Integer keyTag) {
            this.keyTag = keyTag;
            return this;
        }
        public Integer getKeyTag() {
            return this.keyTag;
        }

        public BatchCreateRecordsRequestRecordListData setMatchingType(Integer matchingType) {
            this.matchingType = matchingType;
            return this;
        }
        public Integer getMatchingType() {
            return this.matchingType;
        }

        public BatchCreateRecordsRequestRecordListData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public BatchCreateRecordsRequestRecordListData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public BatchCreateRecordsRequestRecordListData setSelector(Integer selector) {
            this.selector = selector;
            return this;
        }
        public Integer getSelector() {
            return this.selector;
        }

        public BatchCreateRecordsRequestRecordListData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public BatchCreateRecordsRequestRecordListData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public BatchCreateRecordsRequestRecordListData setUsage(Integer usage) {
            this.usage = usage;
            return this;
        }
        public Integer getUsage() {
            return this.usage;
        }

        public BatchCreateRecordsRequestRecordListData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public BatchCreateRecordsRequestRecordListData setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class BatchCreateRecordsRequestRecordList extends TeaModel {
        /**
         * <p>The origin authentication information for the CNAME record.</p>
         */
        @NameInMap("AuthConf")
        public BatchCreateRecordsRequestRecordListAuthConf authConf;

        /**
         * <p>The use case for proxy acceleration. Valid values:</p>
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
         * <p>web</p>
         */
        @NameInMap("BizName")
        public String bizName;

        /**
         * <p>The content of the DNS record. The required fields depend on the record type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;value&quot;:&quot;2.2.2.2&quot;
         * }</p>
         */
        @NameInMap("Data")
        public BatchCreateRecordsRequestRecordListData data;

        @NameInMap("HttpPorts")
        public String httpPorts;

        @NameInMap("HttpsPorts")
        public String httpsPorts;

        /**
         * <p>Specifies whether to enable proxy acceleration for the record. Only CNAME and A/AAAA records support proxy acceleration. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enables proxy acceleration.</p>
         * </li>
         * <li><p><strong>false</strong>: Disables proxy acceleration.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Proxied")
        public Boolean proxied;

        /**
         * <p>The name of the record.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("RecordName")
        public String recordName;

        /**
         * <p>The origin type for the CNAME record. This parameter is required when you add a CNAME record. Valid values:</p>
         * <ul>
         * <li><p><strong>OSS</strong>: An OSS origin.</p>
         * </li>
         * <li><p><strong>S3</strong>: An S3 origin.</p>
         * </li>
         * <li><p><strong>LB</strong>: A load balancer origin.</p>
         * </li>
         * <li><p><strong>OP</strong>: An origin pool origin.</p>
         * </li>
         * <li><p><strong>Domain</strong>: A domain name origin.</p>
         * </li>
         * </ul>
         * <p>If omitted or left empty, this parameter defaults to <code>Domain</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The Time to Live (TTL) for the record, in seconds. A value of <code>1</code> indicates an automatic TTL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
         * <p>The type of the DNS record.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>A/AAAA</p>
         */
        @NameInMap("Type")
        public String type;

        public static BatchCreateRecordsRequestRecordList build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateRecordsRequestRecordList self = new BatchCreateRecordsRequestRecordList();
            return TeaModel.build(map, self);
        }

        public BatchCreateRecordsRequestRecordList setAuthConf(BatchCreateRecordsRequestRecordListAuthConf authConf) {
            this.authConf = authConf;
            return this;
        }
        public BatchCreateRecordsRequestRecordListAuthConf getAuthConf() {
            return this.authConf;
        }

        public BatchCreateRecordsRequestRecordList setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public BatchCreateRecordsRequestRecordList setData(BatchCreateRecordsRequestRecordListData data) {
            this.data = data;
            return this;
        }
        public BatchCreateRecordsRequestRecordListData getData() {
            return this.data;
        }

        public BatchCreateRecordsRequestRecordList setHttpPorts(String httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }
        public String getHttpPorts() {
            return this.httpPorts;
        }

        public BatchCreateRecordsRequestRecordList setHttpsPorts(String httpsPorts) {
            this.httpsPorts = httpsPorts;
            return this;
        }
        public String getHttpsPorts() {
            return this.httpsPorts;
        }

        public BatchCreateRecordsRequestRecordList setProxied(Boolean proxied) {
            this.proxied = proxied;
            return this;
        }
        public Boolean getProxied() {
            return this.proxied;
        }

        public BatchCreateRecordsRequestRecordList setRecordName(String recordName) {
            this.recordName = recordName;
            return this;
        }
        public String getRecordName() {
            return this.recordName;
        }

        public BatchCreateRecordsRequestRecordList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public BatchCreateRecordsRequestRecordList setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

        public BatchCreateRecordsRequestRecordList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
