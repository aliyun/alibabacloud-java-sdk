// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Records")
    public java.util.List<ListRecordsResponseBodyRecords> records;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>u0Nkg5gBK***QF5wvKMM504JUHt</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <strong>example:</strong>
         * <p>us-east-1</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>VIxuvJSA2S03f***kp208dy5w7</p>
         */
        @NameInMap("SecretKey")
        public String secretKey;

        /**
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
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>CNAME</p>
         */
        @NameInMap("Value")
        public String value;

        /**
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
        @NameInMap("AuthConf")
        public ListRecordsResponseBodyRecordsAuthConf authConf;

        /**
         * <strong>example:</strong>
         * <p>web</p>
         */
        @NameInMap("BizName")
        public String bizName;

        /**
         * <strong>example:</strong>
         * <p>this is a remark.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>2023-12-24T02:01:11Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>{&quot;value&quot;:&quot;1.1.1.1&quot;}</p>
         */
        @NameInMap("Data")
        public ListRecordsResponseBodyRecordsData data;

        @NameInMap("HostPolicy")
        public String hostPolicy;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Proxied")
        public Boolean proxied;

        /**
         * <strong>example:</strong>
         * <p>a.example.com.cnamezone.com</p>
         */
        @NameInMap("RecordCname")
        public String recordCname;

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
         * <p>OSS</p>
         */
        @NameInMap("RecordSourceType")
        public String recordSourceType;

        /**
         * <strong>example:</strong>
         * <p>A/AAAA</p>
         */
        @NameInMap("RecordType")
        public String recordType;

        /**
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Ttl")
        public Long ttl;

        /**
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
