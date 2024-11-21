// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchCreateRecordsResponseBody extends TeaModel {
    /**
     * <p>The records that have been created and failed to be created.</p>
     */
    @NameInMap("RecordResultList")
    public BatchCreateRecordsResponseBodyRecordResultList recordResultList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2430E05E-1340-5773-B5E1-B743929F46F2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchCreateRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateRecordsResponseBody self = new BatchCreateRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateRecordsResponseBody setRecordResultList(BatchCreateRecordsResponseBodyRecordResultList recordResultList) {
        this.recordResultList = recordResultList;
        return this;
    }
    public BatchCreateRecordsResponseBodyRecordResultList getRecordResultList() {
        return this.recordResultList;
    }

    public BatchCreateRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchCreateRecordsResponseBodyRecordResultListFailedData extends TeaModel {
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
         * <p>The flag bit of the record. Indicates its priority and handling method, used in CAA records.</p>
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
         * <p>The algorithm policy used to match or validate the certificate. Valid values: 0 to 255. Applicable to SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("MatchingType")
        public Integer matchingType;

        /**
         * <p>The port number of the record, associated with the SRV record. Exclusive to SRV records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority of the record. Valid values: 0 to 65535. A smaller value indicates a higher priority. Applicable to MX, SRV, and URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>Indicates its priority and handling method, used in CAA records.</p>
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
         * <p>The record value or part of the record content. This value is returned when the record is A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, or URI. It has different meanings based on types of records:</p>
         * <ul>
         * <li><strong>A/AAAA</strong>: the IP addresses. IP addresses are separated by commas (,). There is at least one IPv4 address.</li>
         * <li><strong>CNAME</strong>: the mapped domain name.</li>
         * <li><strong>NS</strong>: the nameservers for the domain name.</li>
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
         * <p>The weight of the record. Applicable to SRV and URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static BatchCreateRecordsResponseBodyRecordResultListFailedData build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateRecordsResponseBodyRecordResultListFailedData self = new BatchCreateRecordsResponseBodyRecordResultListFailedData();
            return TeaModel.build(map, self);
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailedData setAlgorithm(Integer algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public Integer getAlgorithm() {
            return this.algorithm;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailedData setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailedData setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailedData setFlag(Integer flag) {
            this.flag = flag;
            return this;
        }
        public Integer getFlag() {
            return this.flag;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailedData setKeyTag(Integer keyTag) {
            this.keyTag = keyTag;
            return this;
        }
        public Integer getKeyTag() {
            return this.keyTag;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailedData setMatchingType(Integer matchingType) {
            this.matchingType = matchingType;
            return this;
        }
        public Integer getMatchingType() {
            return this.matchingType;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailedData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailedData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailedData setSelector(Integer selector) {
            this.selector = selector;
            return this;
        }
        public Integer getSelector() {
            return this.selector;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailedData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailedData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailedData setUsage(Integer usage) {
            this.usage = usage;
            return this;
        }
        public Integer getUsage() {
            return this.usage;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailedData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailedData setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class BatchCreateRecordsResponseBodyRecordResultListFailed extends TeaModel {
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
         * <p>The DNS information about the record, which contains various types of record values and their related attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;value&quot;:&quot;2.2.2.2&quot;}</p>
         */
        @NameInMap("Data")
        public BatchCreateRecordsResponseBodyRecordResultListFailedData data;

        /**
         * <p>The result description.</p>
         */
        @NameInMap("Description")
        public String description;

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
         * <p>The DNS type of the record, such as <strong>A/AAAA, CNAME, and TXT</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>A/AAAA</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <p>The origin type of the CNAME record. This field is left empty for other types of records. The type of the origin server. Valid values:</p>
         * <ul>
         * <li><strong>OSS</strong>: OSS bucket.</li>
         * <li><strong>S3</strong>: S3 bucket.</li>
         * <li><strong>LB</strong>: load balancer.</li>
         * <li><strong>OP</strong>: origin pool.</li>
         * <li><strong>Domain</strong>: domain name.</li>
         * </ul>
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
         * <p>60</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        public static BatchCreateRecordsResponseBodyRecordResultListFailed build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateRecordsResponseBodyRecordResultListFailed self = new BatchCreateRecordsResponseBodyRecordResultListFailed();
            return TeaModel.build(map, self);
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailed setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailed setData(BatchCreateRecordsResponseBodyRecordResultListFailedData data) {
            this.data = data;
            return this;
        }
        public BatchCreateRecordsResponseBodyRecordResultListFailedData getData() {
            return this.data;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailed setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailed setProxied(Boolean proxied) {
            this.proxied = proxied;
            return this;
        }
        public Boolean getProxied() {
            return this.proxied;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailed setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailed setRecordName(String recordName) {
            this.recordName = recordName;
            return this;
        }
        public String getRecordName() {
            return this.recordName;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailed setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailed setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailed setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

    }

    public static class BatchCreateRecordsResponseBodyRecordResultListSuccessData extends TeaModel {
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
         * <p>The flag bit of the record. Indicates its priority and handling method, used in CAA records.</p>
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
         * <p>The algorithm policy used to match or validate the certificate. Valid values: 0 to 255. Applicable to SMIMEA and TLSA records.</p>
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
         * <p>The priority of the record. Valid values: 0 to 65535. A smaller value indicates a higher priority. Applicable to MX, SRV, and URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The label of a CAA record, which indicates its specific type and purpose, such as issue, issuewild, and iodef.</p>
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
         * <p>The record value or part of the record content. This value is returned when the record is A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, or URI. It has different meanings based on types of records:</p>
         * <ul>
         * <li><strong>A/AAAA</strong>: the IP addresses. Multiple IPs are separated by commas (,). There is at least one IPv4 address.</li>
         * <li><strong>CNAME</strong>: the mapped domain name.</li>
         * <li><strong>NS</strong>: the nameservers for the domain name.</li>
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
         * <p>The weight of the record. Valid values: 0 to 65535. Applicable to SRV and URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static BatchCreateRecordsResponseBodyRecordResultListSuccessData build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateRecordsResponseBodyRecordResultListSuccessData self = new BatchCreateRecordsResponseBodyRecordResultListSuccessData();
            return TeaModel.build(map, self);
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccessData setAlgorithm(Integer algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public Integer getAlgorithm() {
            return this.algorithm;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccessData setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccessData setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccessData setFlag(Integer flag) {
            this.flag = flag;
            return this;
        }
        public Integer getFlag() {
            return this.flag;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccessData setKeyTag(Integer keyTag) {
            this.keyTag = keyTag;
            return this;
        }
        public Integer getKeyTag() {
            return this.keyTag;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccessData setMatchingType(Integer matchingType) {
            this.matchingType = matchingType;
            return this;
        }
        public Integer getMatchingType() {
            return this.matchingType;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccessData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccessData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccessData setSelector(Integer selector) {
            this.selector = selector;
            return this;
        }
        public Integer getSelector() {
            return this.selector;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccessData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccessData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccessData setUsage(Integer usage) {
            this.usage = usage;
            return this;
        }
        public Integer getUsage() {
            return this.usage;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccessData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccessData setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class BatchCreateRecordsResponseBodyRecordResultListSuccess extends TeaModel {
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
         * <p>The DNS record information.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;value&quot;:&quot;1.1.1.1&quot;}</p>
         */
        @NameInMap("Data")
        public BatchCreateRecordsResponseBodyRecordResultListSuccessData data;

        /**
         * <p>The result description.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Description")
        public String description;

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
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("RecordName")
        public String recordName;

        /**
         * <p>The DNS type of the record, such as <strong>A/AAAA, CNAME, and TXT</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>A/AAAA</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <p>The origin type of the CNAME record. This field is left empty for other types of records. The type of the origin server. Valid values:</p>
         * <ul>
         * <li><strong>OSS</strong>: OSS bucket.</li>
         * <li><strong>S3</strong>: S3 bucket.</li>
         * <li><strong>LB</strong>: load balancer.</li>
         * <li><strong>OP</strong>: origin pool.</li>
         * <li><strong>Domain</strong>: domain name.</li>
         * </ul>
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
         * <p>60</p>
         */
        @NameInMap("Ttl")
        public Integer ttl;

        public static BatchCreateRecordsResponseBodyRecordResultListSuccess build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateRecordsResponseBodyRecordResultListSuccess self = new BatchCreateRecordsResponseBodyRecordResultListSuccess();
            return TeaModel.build(map, self);
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccess setBizName(String bizName) {
            this.bizName = bizName;
            return this;
        }
        public String getBizName() {
            return this.bizName;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccess setData(BatchCreateRecordsResponseBodyRecordResultListSuccessData data) {
            this.data = data;
            return this;
        }
        public BatchCreateRecordsResponseBodyRecordResultListSuccessData getData() {
            return this.data;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccess setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccess setProxied(Boolean proxied) {
            this.proxied = proxied;
            return this;
        }
        public Boolean getProxied() {
            return this.proxied;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccess setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccess setRecordName(String recordName) {
            this.recordName = recordName;
            return this;
        }
        public String getRecordName() {
            return this.recordName;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccess setRecordType(String recordType) {
            this.recordType = recordType;
            return this;
        }
        public String getRecordType() {
            return this.recordType;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccess setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccess setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

    }

    public static class BatchCreateRecordsResponseBodyRecordResultList extends TeaModel {
        /**
         * <p>The records that failed to be created.</p>
         */
        @NameInMap("Failed")
        public java.util.List<BatchCreateRecordsResponseBodyRecordResultListFailed> failed;

        /**
         * <p>The records that have been created.</p>
         */
        @NameInMap("Success")
        public java.util.List<BatchCreateRecordsResponseBodyRecordResultListSuccess> success;

        /**
         * <p>The total number of returned records.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static BatchCreateRecordsResponseBodyRecordResultList build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateRecordsResponseBodyRecordResultList self = new BatchCreateRecordsResponseBodyRecordResultList();
            return TeaModel.build(map, self);
        }

        public BatchCreateRecordsResponseBodyRecordResultList setFailed(java.util.List<BatchCreateRecordsResponseBodyRecordResultListFailed> failed) {
            this.failed = failed;
            return this;
        }
        public java.util.List<BatchCreateRecordsResponseBodyRecordResultListFailed> getFailed() {
            return this.failed;
        }

        public BatchCreateRecordsResponseBodyRecordResultList setSuccess(java.util.List<BatchCreateRecordsResponseBodyRecordResultListSuccess> success) {
            this.success = success;
            return this;
        }
        public java.util.List<BatchCreateRecordsResponseBodyRecordResultListSuccess> getSuccess() {
            return this.success;
        }

        public BatchCreateRecordsResponseBodyRecordResultList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
