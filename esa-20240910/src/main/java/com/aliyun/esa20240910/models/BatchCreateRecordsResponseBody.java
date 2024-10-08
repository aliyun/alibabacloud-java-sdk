// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchCreateRecordsResponseBody extends TeaModel {
    @NameInMap("RecordResultList")
    public BatchCreateRecordsResponseBodyRecordResultList recordResultList;

    /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Algorithm")
        public Integer algorithm;

        /**
         * <strong>example:</strong>
         * <p>dGVzdGFkYWxrcw==</p>
         */
        @NameInMap("Certificate")
        public String certificate;

        /**
         * <strong>example:</strong>
         * <p>abcdef1234567890</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("KeyTag")
        public Integer keyTag;

        /**
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("MatchingType")
        public Integer matchingType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Selector")
        public Integer selector;

        /**
         * <strong>example:</strong>
         * <p>issue</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Usage")
        public Integer usage;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Value")
        public String value;

        /**
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
         * <strong>example:</strong>
         * <p>web</p>
         */
        @NameInMap("BizName")
        public String bizName;

        /**
         * <strong>example:</strong>
         * <p>{&quot;value&quot;:&quot;2.2.2.2&quot;}</p>
         */
        @NameInMap("Data")
        public BatchCreateRecordsResponseBodyRecordResultListFailedData data;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Proxied")
        public Boolean proxied;

        /**
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        @NameInMap("RecordId")
        public Long recordId;

        /**
         * <strong>example:</strong>
         * <p>a.example.com</p>
         */
        @NameInMap("RecordName")
        public String recordName;

        /**
         * <strong>example:</strong>
         * <p>A/AAAA</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Algorithm")
        public Integer algorithm;

        /**
         * <strong>example:</strong>
         * <p>dGVzdGFkYWxrcw==</p>
         */
        @NameInMap("Certificate")
        public String certificate;

        /**
         * <strong>example:</strong>
         * <p>abcdef1234567890</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Flag")
        public Integer flag;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("KeyTag")
        public Integer keyTag;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MatchingType")
        public Integer matchingType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Selector")
        public Integer selector;

        /**
         * <strong>example:</strong>
         * <p>issue</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Usage")
        public Integer usage;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Value")
        public String value;

        /**
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
         * <strong>example:</strong>
         * <p>web</p>
         */
        @NameInMap("BizName")
        public String bizName;

        /**
         * <strong>example:</strong>
         * <p>{&quot;value&quot;:&quot;1.1.1.1&quot;}</p>
         */
        @NameInMap("Data")
        public BatchCreateRecordsResponseBodyRecordResultListSuccessData data;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Proxied")
        public Boolean proxied;

        /**
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        @NameInMap("RecordId")
        public Long recordId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("RecordName")
        public String recordName;

        /**
         * <strong>example:</strong>
         * <p>A/AAAA</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
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
        @NameInMap("Failed")
        public java.util.List<BatchCreateRecordsResponseBodyRecordResultListFailed> failed;

        @NameInMap("Success")
        public java.util.List<BatchCreateRecordsResponseBodyRecordResultListSuccess> success;

        /**
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
