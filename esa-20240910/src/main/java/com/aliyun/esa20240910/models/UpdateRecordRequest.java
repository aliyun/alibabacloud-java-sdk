// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateRecordRequest extends TeaModel {
    @NameInMap("AuthConf")
    public UpdateRecordRequestAuthConf authConf;

    @NameInMap("BizName")
    public String bizName;

    @NameInMap("Comment")
    public String comment;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Data")
    public UpdateRecordRequestData data;

    @NameInMap("HostPolicy")
    public String hostPolicy;

    /**
     * <p>是否代理加速</p>
     */
    @NameInMap("Proxied")
    public Boolean proxied;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("Ttl")
    public Integer ttl;

    public static UpdateRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecordRequest self = new UpdateRecordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecordRequest setAuthConf(UpdateRecordRequestAuthConf authConf) {
        this.authConf = authConf;
        return this;
    }
    public UpdateRecordRequestAuthConf getAuthConf() {
        return this.authConf;
    }

    public UpdateRecordRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public UpdateRecordRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateRecordRequest setData(UpdateRecordRequestData data) {
        this.data = data;
        return this;
    }
    public UpdateRecordRequestData getData() {
        return this.data;
    }

    public UpdateRecordRequest setHostPolicy(String hostPolicy) {
        this.hostPolicy = hostPolicy;
        return this;
    }
    public String getHostPolicy() {
        return this.hostPolicy;
    }

    public UpdateRecordRequest setProxied(Boolean proxied) {
        this.proxied = proxied;
        return this;
    }
    public Boolean getProxied() {
        return this.proxied;
    }

    public UpdateRecordRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public UpdateRecordRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public UpdateRecordRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public static class UpdateRecordRequestAuthConf extends TeaModel {
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

        public static UpdateRecordRequestAuthConf build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecordRequestAuthConf self = new UpdateRecordRequestAuthConf();
            return TeaModel.build(map, self);
        }

        public UpdateRecordRequestAuthConf setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public UpdateRecordRequestAuthConf setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public UpdateRecordRequestAuthConf setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateRecordRequestAuthConf setSecretKey(String secretKey) {
            this.secretKey = secretKey;
            return this;
        }
        public String getSecretKey() {
            return this.secretKey;
        }

        public UpdateRecordRequestAuthConf setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateRecordRequestData extends TeaModel {
        @NameInMap("Algorithm")
        public Integer algorithm;

        @NameInMap("Certificate")
        public String certificate;

        @NameInMap("Fingerprint")
        public String fingerprint;

        @NameInMap("Flag")
        public Integer flag;

        @NameInMap("KeyTag")
        public Integer keyTag;

        @NameInMap("MatchingType")
        public Integer matchingType;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Selector")
        public Integer selector;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("Usage")
        public Integer usage;

        @NameInMap("Value")
        public String value;

        @NameInMap("Weight")
        public Integer weight;

        public static UpdateRecordRequestData build(java.util.Map<String, ?> map) throws Exception {
            UpdateRecordRequestData self = new UpdateRecordRequestData();
            return TeaModel.build(map, self);
        }

        public UpdateRecordRequestData setAlgorithm(Integer algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public Integer getAlgorithm() {
            return this.algorithm;
        }

        public UpdateRecordRequestData setCertificate(String certificate) {
            this.certificate = certificate;
            return this;
        }
        public String getCertificate() {
            return this.certificate;
        }

        public UpdateRecordRequestData setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public UpdateRecordRequestData setFlag(Integer flag) {
            this.flag = flag;
            return this;
        }
        public Integer getFlag() {
            return this.flag;
        }

        public UpdateRecordRequestData setKeyTag(Integer keyTag) {
            this.keyTag = keyTag;
            return this;
        }
        public Integer getKeyTag() {
            return this.keyTag;
        }

        public UpdateRecordRequestData setMatchingType(Integer matchingType) {
            this.matchingType = matchingType;
            return this;
        }
        public Integer getMatchingType() {
            return this.matchingType;
        }

        public UpdateRecordRequestData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateRecordRequestData setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateRecordRequestData setSelector(Integer selector) {
            this.selector = selector;
            return this;
        }
        public Integer getSelector() {
            return this.selector;
        }

        public UpdateRecordRequestData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public UpdateRecordRequestData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public UpdateRecordRequestData setUsage(Integer usage) {
            this.usage = usage;
            return this;
        }
        public Integer getUsage() {
            return this.usage;
        }

        public UpdateRecordRequestData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public UpdateRecordRequestData setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
