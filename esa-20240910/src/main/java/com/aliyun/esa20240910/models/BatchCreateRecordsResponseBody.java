// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchCreateRecordsResponseBody extends TeaModel {
    /**
     * <p>The list of record creation results, including details of successfully and unsuccessfully created records.</p>
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
         * <p>The flag of the record, which indicates its priority and processing method. This parameter applies to CAA records.</p>
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
         * <p>The port number of the record. This parameter applies only to SRV records.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority of the record. Value range: <strong>0 to 65535</strong>. A smaller value indicates a higher priority. This parameter applies to MX, SRV, and URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The record value or partial content. This parameter is included in A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI records. The meaning varies by record type:</p>
         * <ul>
         * <li><strong>A/AAAA</strong>: the IP address. Separate multiple IP addresses with commas (,). At least one IPv4 address is required.</li>
         * <li><strong>CNAME</strong>: the target domain name.</li>
         * <li><strong>NS</strong>: the name server of the specified domain name.</li>
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
         * <p>The weight of the record. This parameter applies to SRV and URI records.</p>
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
         * <p>The DNS information of the record, including record values and related properties for various record types.</p>
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
         * <p>The record name is invalid.</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("HttpPorts")
        public String httpPorts;

        @NameInMap("HttpsPorts")
        public String httpsPorts;

        /**
         * <p>Indicates whether proxied acceleration is enabled for the record. Only CNAME records and A/AAAA records support proxied acceleration. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Proxied acceleration is enabled.</li>
         * <li><strong>false</strong>: Proxied acceleration is disabled.</li>
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
         * <p>The DNS type of the record, such as <strong>A/AAAA, CNAME, or TXT</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>A/AAAA</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <p>The origin type of the CNAME record. This field is empty for other record types. Valid values:</p>
         * <ul>
         * <li><strong>OSS</strong>: OSS origin.</li>
         * <li><strong>S3</strong>: S3 origin.</li>
         * <li><strong>LB</strong>: load balancing origin.</li>
         * <li><strong>OP</strong>: IPAM pool origin.</li>
         * <li><strong>Domain</strong>: common domain name origin.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The time-to-live (TTL) of the record, in seconds. A value of 1 indicates that the TTL is set to automatic.</p>
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
         * <p>The flag of the record, which indicates its priority and processing method. This parameter applies to CAA records.</p>
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
         * <p>The priority of the record. Value range: <strong>0 to 65535</strong>. A smaller value indicates a higher priority. This parameter applies to MX, SRV, and URI records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>The record value or partial content. This parameter is included in A/AAAA, CNAME, NS, MX, TXT, CAA, SRV, and URI records. The meaning varies by record type:</p>
         * <ul>
         * <li><strong>A/AAAA</strong>: the IP address. Separate multiple IP addresses with commas (,). At least one IPv4 address is required.</li>
         * <li><strong>CNAME</strong>: the target domain name.</li>
         * <li><strong>NS</strong>: the name server of the specified domain name.</li>
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
         * <p>The DNS information of the record.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;value&quot;:&quot;1.1.1.1&quot;}</p>
         */
        @NameInMap("Data")
        public BatchCreateRecordsResponseBodyRecordResultListSuccessData data;

        /**
         * <p>The description of the creation result.</p>
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
         * <p>Specifies whether to enable proxied acceleration for the record. Only CNAME records and A/AAAA records support proxied acceleration. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Proxied acceleration is enabled.</li>
         * <li><strong>false</strong>: Proxied acceleration is disabled.</li>
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
         * <p>The DNS type of the record, such as <strong>A/AAAA, CNAME, or TXT</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>A/AAAA</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <p>The origin type of the CNAME record. This field is empty for other record types. Valid values:</p>
         * <ul>
         * <li><strong>OSS</strong>: OSS origin.</li>
         * <li><strong>S3</strong>: S3 origin.</li>
         * <li><strong>LB</strong>: load balancing origin.</li>
         * <li><strong>OP</strong>: IPAM pool origin.</li>
         * <li><strong>Domain</strong>: common domain name origin.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The time-to-live (TTL) of the record, in seconds. A value of 1 indicates that the TTL is set to automatic.</p>
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
         * <p>The list of records that failed to be created.</p>
         */
        @NameInMap("Failed")
        public java.util.List<BatchCreateRecordsResponseBodyRecordResultListFailed> failed;

        /**
         * <p>The list of successfully created records.</p>
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
