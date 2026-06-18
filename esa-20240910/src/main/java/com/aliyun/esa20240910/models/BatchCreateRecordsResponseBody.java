// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchCreateRecordsResponseBody extends TeaModel {
    /**
     * <p>The results of the batch record creation, with details for both successful and failed records.</p>
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
         * <p>The encryption algorithm used by the record. The value ranges from <strong>0</strong> to <strong>255</strong>. This parameter applies to CERT and SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Algorithm")
        public Integer algorithm;

        /**
         * <p>The public key certificate for the record. This parameter applies to CERT, SMIMEA, and TLSA records.</p>
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
         * <p>The flag for the record, which indicates its priority and processing method. This parameter applies to CAA records.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>The public key identifier for the record. The value ranges from <strong>0</strong> to <strong>65535</strong>. This parameter applies to CERT records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("KeyTag")
        public Integer keyTag;

        /**
         * <p>The algorithm policy used by the record to match or validate certificates. The value ranges from <strong>0</strong> to <strong>255</strong>. This parameter applies to SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("MatchingType")
        public Integer matchingType;

        /**
         * <p>The port for the record. The value ranges from 0 to 65535. This parameter applies only to SRV records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority of the record. The value ranges from <strong>0</strong> to <strong>65535</strong>. A smaller value indicates a higher priority. This parameter applies to MX, SRV, and URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The type of certificate or public key used by the record. The value ranges from <strong>0</strong> to <strong>255</strong>. This parameter applies to SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Selector")
        public Integer selector;

        /**
         * <p>The tag for a CAA record, which specifies its type and purpose, such as <code>issue</code>, <code>issuewild</code>, or <code>iodef</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>issue</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The certificate type for CERT records or the public key type for SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The usage identifier for the record. The value ranges from <strong>0</strong> to <strong>255</strong>. This parameter applies to SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Usage")
        public Integer usage;

        /**
         * <p>The record value. This parameter applies to A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI records. The meaning of this parameter varies based on the record type:</p>
         * <ul>
         * <li><p><strong>A/AAAA</strong>: The IP address. To specify multiple addresses, separate them with a comma (,). At least one IPv4 address is required.</p>
         * </li>
         * <li><p><strong>CNAME</strong>: The target domain name.</p>
         * </li>
         * <li><p><strong>NS</strong>: The name server for the domain.</p>
         * </li>
         * <li><p><strong>MX</strong>: The domain name of a valid target mail server.</p>
         * </li>
         * <li><p><strong>TXT</strong>: A valid text string.</p>
         * </li>
         * <li><p><strong>CAA</strong>: The domain name of a valid certificate authority.</p>
         * </li>
         * <li><p><strong>SRV</strong>: The domain name of a valid target host.</p>
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
         * <p>The weight of the record. The value ranges from 0 to 65535. This parameter applies to SRV and URI records.</p>
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
         * <p>The acceleration use case for the record. Valid values:</p>
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
         * <p>The DNS information for the record.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;value&quot;:&quot;2.2.2.2&quot;}</p>
         */
        @NameInMap("Data")
        public BatchCreateRecordsResponseBodyRecordResultListFailedData data;

        /**
         * <p>The result description.</p>
         * 
         * <strong>example:</strong>
         * <p>记录的名称非法</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("HttpPorts")
        public String httpPorts;

        @NameInMap("HttpsPorts")
        public String httpsPorts;

        /**
         * <p>Specifies whether proxy acceleration is enabled for the record. This option is available only for CNAME, A, and AAAA records. Valid values:</p>
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
         * <p>The DNS type of the record, such as <strong>A/AAAA</strong>, <strong>CNAME</strong>, or <strong>TXT</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>A/AAAA</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <p>The type of origin for a CNAME record. This parameter is empty for other record types. Valid values:</p>
         * <ul>
         * <li><p><strong>OSS</strong>: An OSS origin.</p>
         * </li>
         * <li><p><strong>S3</strong>: An S3 origin.</p>
         * </li>
         * <li><p><strong>LB</strong>: A load balancer origin.</p>
         * </li>
         * <li><p><strong>OP</strong>: An origin pool.</p>
         * </li>
         * <li><p><strong>Domain</strong>: A domain name origin.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The TTL of the record in seconds. A value of 1 sets the TTL to Automatic.</p>
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

        public BatchCreateRecordsResponseBodyRecordResultListFailed setHttpPorts(String httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }
        public String getHttpPorts() {
            return this.httpPorts;
        }

        public BatchCreateRecordsResponseBodyRecordResultListFailed setHttpsPorts(String httpsPorts) {
            this.httpsPorts = httpsPorts;
            return this;
        }
        public String getHttpsPorts() {
            return this.httpsPorts;
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
         * <p>The encryption algorithm used by the record. The value ranges from <strong>0</strong> to <strong>255</strong>. This parameter applies to CERT and SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Algorithm")
        public Integer algorithm;

        /**
         * <p>The public key certificate for the record. This parameter applies to CERT, SMIMEA, and TLSA records.</p>
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
         * <p>The flag for the record, which indicates its priority and processing method. This parameter applies to CAA records.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <p>The public key identifier for the record. The value ranges from <strong>0</strong> to <strong>65535</strong>. This parameter applies to CERT records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("KeyTag")
        public Integer keyTag;

        /**
         * <p>The algorithm policy used by the record to match or validate certificates. The value ranges from <strong>0</strong> to <strong>255</strong>. This parameter applies to SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MatchingType")
        public Integer matchingType;

        /**
         * <p>The port for the record. The value ranges from <strong>0</strong> to <strong>65535</strong>. This parameter applies only to SRV records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority of the record. The value ranges from <strong>0</strong> to <strong>65535</strong>. A smaller value indicates a higher priority. This parameter applies to MX, SRV, and URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The type of certificate or public key used by the record. The value ranges from <strong>0</strong> to <strong>255</strong>. This parameter applies to SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Selector")
        public Integer selector;

        /**
         * <p>The tag for a CAA record, which specifies its type and purpose, such as <code>issue</code>, <code>issuewild</code>, or <code>iodef</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>issue</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The certificate type for CERT records or the public key type for SSHFP records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The usage identifier for the record. The value ranges from <strong>0</strong> to <strong>255</strong>. This parameter applies to SMIMEA and TLSA records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Usage")
        public Integer usage;

        /**
         * <p>The record value. This parameter applies to A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI records. The meaning of this parameter varies based on the record type:</p>
         * <ul>
         * <li><p><strong>A/AAAA</strong>: The IP address. To specify multiple addresses, separate them with a comma (,). At least one IPv4 address is required.</p>
         * </li>
         * <li><p><strong>CNAME</strong>: The target domain name.</p>
         * </li>
         * <li><p><strong>NS</strong>: The name server for the domain.</p>
         * </li>
         * <li><p><strong>MX</strong>: The domain name of a valid target mail server.</p>
         * </li>
         * <li><p><strong>TXT</strong>: A valid text string.</p>
         * </li>
         * <li><p><strong>CAA</strong>: The domain name of a valid certificate authority.</p>
         * </li>
         * <li><p><strong>SRV</strong>: The domain name of a valid target host.</p>
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
         * <p>The weight of the record. The value ranges from <strong>0</strong> to <strong>65535</strong>. This parameter applies to SRV and URI records.</p>
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
         * <p>The acceleration use case for the record. Valid values:</p>
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
         * <p>The DNS information for the record.</p>
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

        @NameInMap("HttpPorts")
        public String httpPorts;

        @NameInMap("HttpsPorts")
        public String httpsPorts;

        /**
         * <p>Specifies whether proxy acceleration is enabled for the record. This option is available only for CNAME, A, and AAAA records. Valid values:</p>
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
         * <p>The DNS type of the record, such as <strong>A/AAAA</strong>, <strong>CNAME</strong>, or <strong>TXT</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>A/AAAA</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <p>The type of origin for a CNAME record. This parameter is empty for other record types. Valid values:</p>
         * <ul>
         * <li><p><strong>OSS</strong>: An OSS origin.</p>
         * </li>
         * <li><p><strong>S3</strong>: An S3 origin.</p>
         * </li>
         * <li><p><strong>LB</strong>: A load balancer origin.</p>
         * </li>
         * <li><p><strong>OP</strong>: An origin pool.</p>
         * </li>
         * <li><p><strong>Domain</strong>: A domain name origin.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The TTL of the record in seconds. A value of 1 sets the TTL to Automatic.</p>
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

        public BatchCreateRecordsResponseBodyRecordResultListSuccess setHttpPorts(String httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }
        public String getHttpPorts() {
            return this.httpPorts;
        }

        public BatchCreateRecordsResponseBodyRecordResultListSuccess setHttpsPorts(String httpsPorts) {
            this.httpsPorts = httpsPorts;
            return this;
        }
        public String getHttpsPorts() {
            return this.httpsPorts;
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
         * <p>A list of records that failed to be created.</p>
         */
        @NameInMap("Failed")
        public java.util.List<BatchCreateRecordsResponseBodyRecordResultListFailed> failed;

        /**
         * <p>A list of successfully created records.</p>
         */
        @NameInMap("Success")
        public java.util.List<BatchCreateRecordsResponseBodyRecordResultListSuccess> success;

        /**
         * <p>The total number of records in the creation operation.</p>
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
