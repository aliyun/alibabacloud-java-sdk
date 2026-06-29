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
     * <p>The site ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
         * <p>The AccessKey of the account to which the origin belongs. This parameter is required when the origin type is OSS and the authentication type is private cross-account read, or when the origin type is S3 and the authentication type is private read.</p>
         * 
         * <strong>example:</strong>
         * <p>u0Nkg5gBK*******QF5wvKMM504JUHt</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The origin authentication type. Different origin types support different authentication types. The origin type refers to the SourceType parameter in this operation. When the origin type is OSS or S3, you must specify the authentication type. Valid values:</p>
         * <ul>
         * <li><strong>public</strong>: public read. Select this value when the origin type is OSS or S3 and the origin allows public read access.</li>
         * <li><strong>private</strong>: private read. Select this value when the origin type is S3 and the origin allows only private read access.</li>
         * <li><strong>private_same_account</strong>: private same-account read. Select this value when the origin type is OSS, the origin is under the same Alibaba Cloud account, and the origin allows only private read access.</li>
         * <li><strong>private_cross_account</strong>: private cross-account read. Select this value when the origin type is OSS, the origin is under a different Alibaba Cloud account, and the origin allows only private read access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The region of the origin. This parameter is required when the origin type is S3. Obtain the region from the official S3 website.</p>
         * 
         * <strong>example:</strong>
         * <p>us-east-1</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The SecretKey of the account to which the origin belongs. This parameter is required when the origin type is OSS and the authentication type is private cross-account read, or when the origin type is S3 and the authentication type is private read.</p>
         * 
         * <strong>example:</strong>
         * <p>VIxuvJSA2S03f******kp208dy5w7</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
         * <p>The signature algorithm version. This parameter is available when the origin type is S3 and the authentication type is private read. Valid values:</p>
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
         * <p>The encryption algorithm used by the record. Value range: <strong>0 to 255</strong>. This parameter applies to CERT and SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Algorithm")
        public Integer algorithm;

        /**
         * <p>The public key certificate information of the record. This parameter applies to CERT, SMIMEA, and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>dGVzdGFkYWxrcw==</p>
         */
        @NameInMap("Certificate")
        public String certificate;

        /**
         * <p>The public key fingerprint of the record. This parameter applies to SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdef1234567890</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The flag of the CAA record, which indicates its priority and processing method. Value range: <strong>0 to 255</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>The public key identifier of the record. Value range: <strong>0 to 65535</strong>. This parameter applies to CERT records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("KeyTag")
        public Integer keyTag;

        /**
         * <p>The algorithm policy used to match or verify certificates. Value range: <strong>0 to 255</strong>. This parameter applies to SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MatchingType")
        public Integer matchingType;

        /**
         * <p>The port of the record. Value range: <strong>0 to 65535</strong>. This parameter applies only to SRV records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority of the record. Value range: <strong>0 to 65535</strong>. A smaller value indicates a higher priority. This parameter is required when you add MX, SRV, or URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The type of certificate or public key used by the record. Value range: <strong>0 to 255</strong>. This parameter applies to SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Selector")
        public Integer selector;

        /**
         * <p>The tag of the CAA record, which indicates its specific type and purpose, such as issue, issuewild, or iodef.</p>
         * 
         * <strong>example:</strong>
         * <p>issue</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The certificate type (for CERT records) or public key type (for SSHFP records) of the record.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The usage identifier of the record. Value range: <strong>0 to 255</strong>. This parameter applies to SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Usage")
        public Integer usage;

        /**
         * <p>The record value or partial content. The meaning varies by record type:</p>
         * <ul>
         * <li><strong>A/AAAA</strong>: the IP address.</li>
         * <li><strong>CNAME</strong>: the target domain name.</li>
         * <li><strong>MX</strong>: a valid target mail server domain name.</li>
         * <li><strong>TXT</strong>: a valid text string.</li>
         * <li><strong>CAA</strong>: a valid certification authority domain name.</li>
         * <li><strong>SRV</strong>: a valid target host domain name.</li>
         * <li><strong>URI</strong>: a valid URI string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The weight of the record. Value range: <strong>0 to 65535</strong>. This parameter applies to SRV and URI records.</p>
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
         * <p>The origin authentication information of the CNAME record.</p>
         */
        @NameInMap("AuthConf")
        public BatchCreateRecordsRequestRecordListAuthConf authConf;

        /**
         * <p>The business scenario for record acceleration. Valid values:</p>
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
         * <p>The DNS information of the record. Different fields are required based on the record type.</p>
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
         * <p>Specifies whether to enable proxied acceleration for the record. Only CNAME records and A/AAAA records support proxied acceleration. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Proxied acceleration is enabled.</li>
         * <li><strong>false</strong>: Proxied acceleration is disabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The origin type of the CNAME record. This parameter is required when you add a CNAME record. Valid values:</p>
         * <ul>
         * <li><strong>OSS</strong>: OSS origin.</li>
         * <li><strong>S3</strong>: S3 origin.</li>
         * <li><strong>LB</strong>: load balancing origin.</li>
         * <li><strong>OP</strong>: IPAM pool origin.</li>
         * <li><strong>Domain</strong>: common domain name origin.</li>
         * </ul>
         * <p>If this parameter is left empty or not specified, the default value is Domain, which indicates a common domain name origin.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The time-to-live (TTL) of the record, in seconds. A value of 1 indicates that the TTL is set to automatic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        /**
         * <p>The DNS type of the record.</p>
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
