// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RuleInfo")
    public GetRuleResponseBodyRuleInfo ruleInfo;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuleResponseBody self = new GetRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRuleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetRuleResponseBody setRuleInfo(GetRuleResponseBodyRuleInfo ruleInfo) {
        this.ruleInfo = ruleInfo;
        return this;
    }
    public GetRuleResponseBodyRuleInfo getRuleInfo() {
        return this.ruleInfo;
    }

    public GetRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRuleResponseBodyRuleInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Modified")
        public String modified;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("Select")
        public String select;

        @NameInMap("UtcCreated")
        public String utcCreated;

        @NameInMap("CreateUserId")
        public Long createUserId;

        @NameInMap("TopicType")
        public Integer topicType;

        @NameInMap("Where")
        public String where;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("ShortTopic")
        public String shortTopic;

        @NameInMap("RuleDesc")
        public String ruleDesc;

        @NameInMap("Name")
        public String name;

        @NameInMap("Created")
        public String created;

        @NameInMap("Id")
        public Long id;

        public static GetRuleResponseBodyRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyRuleInfo self = new GetRuleResponseBodyRuleInfo();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyRuleInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRuleResponseBodyRuleInfo setModified(String modified) {
            this.modified = modified;
            return this;
        }
        public String getModified() {
            return this.modified;
        }

        public GetRuleResponseBodyRuleInfo setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetRuleResponseBodyRuleInfo setSelect(String select) {
            this.select = select;
            return this;
        }
        public String getSelect() {
            return this.select;
        }

        public GetRuleResponseBodyRuleInfo setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public GetRuleResponseBodyRuleInfo setCreateUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public Long getCreateUserId() {
            return this.createUserId;
        }

        public GetRuleResponseBodyRuleInfo setTopicType(Integer topicType) {
            this.topicType = topicType;
            return this;
        }
        public Integer getTopicType() {
            return this.topicType;
        }

        public GetRuleResponseBodyRuleInfo setWhere(String where) {
            this.where = where;
            return this;
        }
        public String getWhere() {
            return this.where;
        }

        public GetRuleResponseBodyRuleInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public GetRuleResponseBodyRuleInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public GetRuleResponseBodyRuleInfo setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetRuleResponseBodyRuleInfo setShortTopic(String shortTopic) {
            this.shortTopic = shortTopic;
            return this;
        }
        public String getShortTopic() {
            return this.shortTopic;
        }

        public GetRuleResponseBodyRuleInfo setRuleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        public GetRuleResponseBodyRuleInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRuleResponseBodyRuleInfo setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public GetRuleResponseBodyRuleInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
