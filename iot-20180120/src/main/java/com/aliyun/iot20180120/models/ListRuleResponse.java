// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListRuleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Page")
    @Validation(required = true)
    public Integer page;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Data")
    @Validation(required = true)
    public ListRuleResponseData data;

    public static ListRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRuleResponse self = new ListRuleResponse();
        return TeaModel.build(map, self);
    }

    public ListRuleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRuleResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRuleResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRuleResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRuleResponse setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListRuleResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListRuleResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRuleResponse setData(ListRuleResponseData data) {
        this.data = data;
        return this;
    }
    public ListRuleResponseData getData() {
        return this.data;
    }

    public static class ListRuleResponseDataRuleInfo extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("Select")
        @Validation(required = true)
        public String select;

        @NameInMap("Topic")
        @Validation(required = true)
        public String topic;

        @NameInMap("ShortTopic")
        @Validation(required = true)
        public String shortTopic;

        @NameInMap("Where")
        @Validation(required = true)
        public String where;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("CreateUserId")
        @Validation(required = true)
        public Long createUserId;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("DataType")
        @Validation(required = true)
        public String dataType;

        @NameInMap("RuleDesc")
        @Validation(required = true)
        public String ruleDesc;

        @NameInMap("Created")
        @Validation(required = true)
        public String created;

        @NameInMap("UtcCreated")
        @Validation(required = true)
        public String utcCreated;

        @NameInMap("Modified")
        @Validation(required = true)
        public String modified;

        @NameInMap("UtcModified")
        @Validation(required = true)
        public String utcModified;

        public static ListRuleResponseDataRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRuleResponseDataRuleInfo self = new ListRuleResponseDataRuleInfo();
            return TeaModel.build(map, self);
        }

        public ListRuleResponseDataRuleInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRuleResponseDataRuleInfo setSelect(String select) {
            this.select = select;
            return this;
        }
        public String getSelect() {
            return this.select;
        }

        public ListRuleResponseDataRuleInfo setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public ListRuleResponseDataRuleInfo setShortTopic(String shortTopic) {
            this.shortTopic = shortTopic;
            return this;
        }
        public String getShortTopic() {
            return this.shortTopic;
        }

        public ListRuleResponseDataRuleInfo setWhere(String where) {
            this.where = where;
            return this;
        }
        public String getWhere() {
            return this.where;
        }

        public ListRuleResponseDataRuleInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRuleResponseDataRuleInfo setCreateUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public Long getCreateUserId() {
            return this.createUserId;
        }

        public ListRuleResponseDataRuleInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListRuleResponseDataRuleInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRuleResponseDataRuleInfo setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListRuleResponseDataRuleInfo setRuleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        public ListRuleResponseDataRuleInfo setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public ListRuleResponseDataRuleInfo setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public ListRuleResponseDataRuleInfo setModified(String modified) {
            this.modified = modified;
            return this;
        }
        public String getModified() {
            return this.modified;
        }

        public ListRuleResponseDataRuleInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class ListRuleResponseData extends TeaModel {
        @NameInMap("RuleInfo")
        @Validation(required = true)
        public java.util.List<ListRuleResponseDataRuleInfo> ruleInfo;

        public static ListRuleResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListRuleResponseData self = new ListRuleResponseData();
            return TeaModel.build(map, self);
        }

        public ListRuleResponseData setRuleInfo(java.util.List<ListRuleResponseDataRuleInfo> ruleInfo) {
            this.ruleInfo = ruleInfo;
            return this;
        }
        public java.util.List<ListRuleResponseDataRuleInfo> getRuleInfo() {
            return this.ruleInfo;
        }

    }

}
