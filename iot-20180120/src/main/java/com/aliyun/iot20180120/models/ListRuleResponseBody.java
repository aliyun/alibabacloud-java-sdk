// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Data")
    public ListRuleResponseBodyData data;

    public static ListRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRuleResponseBody self = new ListRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRuleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListRuleResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListRuleResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListRuleResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRuleResponseBody setData(ListRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRuleResponseBodyData getData() {
        return this.data;
    }

    public static class ListRuleResponseBodyDataRuleInfo extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Select")
        public String select;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("ShortTopic")
        public String shortTopic;

        @NameInMap("Where")
        public String where;

        @NameInMap("Status")
        public String status;

        @NameInMap("CreateUserId")
        public Long createUserId;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("Name")
        public String name;

        @NameInMap("DataType")
        public String dataType;

        @NameInMap("RuleDesc")
        public String ruleDesc;

        @NameInMap("Created")
        public String created;

        @NameInMap("UtcCreated")
        public String utcCreated;

        @NameInMap("Modified")
        public String modified;

        @NameInMap("UtcModified")
        public String utcModified;

        public static ListRuleResponseBodyDataRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRuleResponseBodyDataRuleInfo self = new ListRuleResponseBodyDataRuleInfo();
            return TeaModel.build(map, self);
        }

        public ListRuleResponseBodyDataRuleInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRuleResponseBodyDataRuleInfo setSelect(String select) {
            this.select = select;
            return this;
        }
        public String getSelect() {
            return this.select;
        }

        public ListRuleResponseBodyDataRuleInfo setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public ListRuleResponseBodyDataRuleInfo setShortTopic(String shortTopic) {
            this.shortTopic = shortTopic;
            return this;
        }
        public String getShortTopic() {
            return this.shortTopic;
        }

        public ListRuleResponseBodyDataRuleInfo setWhere(String where) {
            this.where = where;
            return this;
        }
        public String getWhere() {
            return this.where;
        }

        public ListRuleResponseBodyDataRuleInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRuleResponseBodyDataRuleInfo setCreateUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public Long getCreateUserId() {
            return this.createUserId;
        }

        public ListRuleResponseBodyDataRuleInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListRuleResponseBodyDataRuleInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRuleResponseBodyDataRuleInfo setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListRuleResponseBodyDataRuleInfo setRuleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        public ListRuleResponseBodyDataRuleInfo setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public ListRuleResponseBodyDataRuleInfo setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public ListRuleResponseBodyDataRuleInfo setModified(String modified) {
            this.modified = modified;
            return this;
        }
        public String getModified() {
            return this.modified;
        }

        public ListRuleResponseBodyDataRuleInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

    public static class ListRuleResponseBodyData extends TeaModel {
        @NameInMap("RuleInfo")
        public java.util.List<ListRuleResponseBodyDataRuleInfo> ruleInfo;

        public static ListRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRuleResponseBodyData self = new ListRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRuleResponseBodyData setRuleInfo(java.util.List<ListRuleResponseBodyDataRuleInfo> ruleInfo) {
            this.ruleInfo = ruleInfo;
            return this;
        }
        public java.util.List<ListRuleResponseBodyDataRuleInfo> getRuleInfo() {
            return this.ruleInfo;
        }

    }

}
