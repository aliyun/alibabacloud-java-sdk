// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListRuleResponseBody extends TeaModel {
    /**
     * <p>The error code that is returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The rules returned if the call is successful. For more information, see the "**RuleInfo**" section of this topic.</p>
     * <br>
     * <p>>  The returned rules are sorted in reverse-chronological order based on the time when the rules were created.</p>
     */
    @NameInMap("Data")
    public ListRuleResponseBodyData data;

    /**
     * <p>The error message that is returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of pages returned.</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRuleResponseBody self = new ListRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRuleResponseBody setData(ListRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRuleResponseBodyData getData() {
        return this.data;
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

    public ListRuleResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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

    public ListRuleResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListRuleResponseBodyDataRuleInfo extends TeaModel {
        /**
         * <p>The ID of the user who created the rule.</p>
         */
        @NameInMap("CreateUserId")
        public Long createUserId;

        /**
         * <p>The time when the rule was created. The time is displayed in UTC-6.</p>
         */
        @NameInMap("Created")
        public String created;

        /**
         * <p>The data type of the rule. Valid values: **JSON** and **BINARY**.</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The time when the rule was last modified. The time is displayed in UTC-6.</p>
         */
        @NameInMap("Modified")
        public String modified;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The **ProductKey** of the product to which the rule applies.</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The description of the rule.</p>
         */
        @NameInMap("RuleDesc")
        public String ruleDesc;

        /**
         * <p>The content that follows the **Select** keyword in the SQL statement of the rule.</p>
         */
        @NameInMap("Select")
        public String select;

        /**
         * <p>The topic to which the rule applies. The topic does not include the ProductKey level. Format: `${deviceName}/topicShortName`. ${deviceName} indicates the name of the device, and topicShortName indicates the custom name of the topic.</p>
         * <br>
         * <p>>  For information about how to use a plus sign (`+`) or a number sign (`#`) as a wildcard character in a topic, see [Topic wildcards](~~73731~~).</p>
         */
        @NameInMap("ShortTopic")
        public String shortTopic;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <br>
         * <p>*   **RUNNING**: The rule is running.</p>
         * <p>*   **STOP**: The rule is disabled.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The topic to which the rule applies. Format: `${productKey}/${deviceName}/topicShortName`.</p>
         * <br>
         * <p>>  For information about how to use a plus sign (`+`) or a number sign (`#`) as a wildcard character in a topic, see [Topic wildcards](~~73731~~).</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The time when the device was created. The time is displayed in UTC.</p>
         */
        @NameInMap("UtcCreated")
        public String utcCreated;

        /**
         * <p>The time when the rule was last modified.</p>
         */
        @NameInMap("UtcModified")
        public String utcModified;

        /**
         * <p>The **Where** query condition in the SQL statement of the rule.</p>
         */
        @NameInMap("Where")
        public String where;

        public static ListRuleResponseBodyDataRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRuleResponseBodyDataRuleInfo self = new ListRuleResponseBodyDataRuleInfo();
            return TeaModel.build(map, self);
        }

        public ListRuleResponseBodyDataRuleInfo setCreateUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public Long getCreateUserId() {
            return this.createUserId;
        }

        public ListRuleResponseBodyDataRuleInfo setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public ListRuleResponseBodyDataRuleInfo setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public ListRuleResponseBodyDataRuleInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRuleResponseBodyDataRuleInfo setModified(String modified) {
            this.modified = modified;
            return this;
        }
        public String getModified() {
            return this.modified;
        }

        public ListRuleResponseBodyDataRuleInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRuleResponseBodyDataRuleInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListRuleResponseBodyDataRuleInfo setRuleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        public ListRuleResponseBodyDataRuleInfo setSelect(String select) {
            this.select = select;
            return this;
        }
        public String getSelect() {
            return this.select;
        }

        public ListRuleResponseBodyDataRuleInfo setShortTopic(String shortTopic) {
            this.shortTopic = shortTopic;
            return this;
        }
        public String getShortTopic() {
            return this.shortTopic;
        }

        public ListRuleResponseBodyDataRuleInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRuleResponseBodyDataRuleInfo setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public ListRuleResponseBodyDataRuleInfo setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public ListRuleResponseBodyDataRuleInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public ListRuleResponseBodyDataRuleInfo setWhere(String where) {
            this.where = where;
            return this;
        }
        public String getWhere() {
            return this.where;
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
