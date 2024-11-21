// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchCreateRecordsRequest extends TeaModel {
    /**
     * <p>The list of DNS records to be created.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordList")
    public java.util.List<BatchCreateRecordsRequestRecordList> recordList;

    /**
     * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
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
        @NameInMap("AccessKey")
        public String accessKey;

        @NameInMap("AuthType")
        public String authType;

        @NameInMap("Region")
        public String region;

        @NameInMap("SecretKey")
        public String secretKey;

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
         * <p>The encryption algorithm used for the record. Valid values: 0 to 255. Applicable to CERT and SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Algorithm")
        public Integer algorithm;

        /**
         * <p>The public key of the certificate. Applicable to CERT, SMIMEA, and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>dGVzdGFkYWxrcw==</p>
         */
        @NameInMap("Certificate")
        public String certificate;

        /**
         * <p>The public key fingerprint of the record. Applicable to SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdef1234567890</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The Flag for a CAA record indicates its priority and how it is processed. Valid values: 0 to 255.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>The public key identification for the record. Valid values: 0 to 65535. Applicable to CERT records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("KeyTag")
        public Integer keyTag;

        /**
         * <p>The algorithm policy used to match or validate the certificate. Valid values: 0 to 255. Applicable to SMIMEA, and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MatchingType")
        public Integer matchingType;

        /**
         * <p>The port of the record. Valid values: 0 to 65535. Exclusive to SRV records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority of the record. Valid values: 0 to 65535. A smaller value indicates a higher priority. This parameter is required when you add MX, SRV, and URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The type of certificate or public key. Valid values: 0 to 255. Applicable to SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Selector")
        public Integer selector;

        /**
         * <p>The tag of a CAA record, which indicates its specific type and purpose, such as issue, issuewild, and iodef.</p>
         * 
         * <strong>example:</strong>
         * <p>issue</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The certificate type of the record (in CERT records), or the public key type (in SSHFP records).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The usage identifier of the record. Valid values: 0 to 255. Applicable to SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Usage")
        public Integer usage;

        /**
         * <p>The record value or part of the record content. A/AAAA: the IP address being pointed to. CNAME: the target domain name being pointed to. MX: valid target mail server domain name. TXT: valid text string. CAA: valid certificate authority domain name. SRV: valid target host domain name. URI: valid URI string.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The weight of the record. Valid values: 0 to 65,535. Applicable to SRV and URI records.</p>
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
        @NameInMap("AuthConf")
        public BatchCreateRecordsRequestRecordListAuthConf authConf;

        /**
         * <p>The business scenario of the record for acceleration. Valid values:</p>
         * <ul>
         * <li><strong>image_video</strong></li>
         * <li><strong>api</strong></li>
         * <li><strong>web</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>web</p>
         */
        @NameInMap("BizName")
        public String bizName;

        /**
         * <p>The DNS information of the record. Enter fields based on the record type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;value&quot;:&quot;2.2.2.2&quot;
         * }</p>
         */
        @NameInMap("Data")
        public BatchCreateRecordsRequestRecordListData data;

        /**
         * <p>Specifies whether to proxy the record. Only CNAME and A/AAAA records can be proxied. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
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
