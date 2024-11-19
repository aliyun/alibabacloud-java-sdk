// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListRuleResponseBody extends TeaModel {
    /**
     * <p>The error code that is returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The rules returned if the call is successful. For more information, see the &quot;<strong>RuleInfo</strong>&quot; section of this topic.</p>
     * <blockquote>
     * <p> The returned rules are sorted in reverse-chronological order based on the time when the rules were created.</p>
     * </blockquote>
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
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1564B626-DE97-452D-9E9B-305888AC6105</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
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
         * 
         * <strong>example:</strong>
         * <p>1231579085000000</p>
         */
        @NameInMap("CreateUserId")
        public Long createUserId;

        /**
         * <p>The time when the rule was created. The time is displayed in UTC-6.</p>
         * 
         * <strong>example:</strong>
         * <p>Wed Feb 27 20:45:43 CST 2019</p>
         */
        @NameInMap("Created")
        public String created;

        /**
         * <p>The data type of the rule. Valid values: <strong>JSON</strong> and <strong>BINARY</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>151454</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The time when the rule was last modified. The time is displayed in UTC-6.</p>
         * 
         * <strong>example:</strong>
         * <p>Wed Feb 27 20:45:43 CST 2019</p>
         */
        @NameInMap("Modified")
        public String modified;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the rule applies.</p>
         * 
         * <strong>example:</strong>
         * <p>a1KiV******</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rule1Desc</p>
         */
        @NameInMap("RuleDesc")
        public String ruleDesc;

        /**
         * <p>The content that follows the <strong>Select</strong> keyword in the SQL statement of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>deviceName() as deviceName</p>
         */
        @NameInMap("Select")
        public String select;

        /**
         * <p>The topic to which the rule applies. The topic does not include the ProductKey level. Format: <code>${deviceName}/topicShortName</code>. ${deviceName} indicates the name of the device, and topicShortName indicates the custom name of the topic.</p>
         * <blockquote>
         * <p> For information about how to use a plus sign (<code>+</code>) or a number sign (<code>#</code>) as a wildcard character in a topic, see <a href="https://help.aliyun.com/document_detail/73731.html">Topic wildcards</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>+/thing/event/property/post</p>
         */
        @NameInMap("ShortTopic")
        public String shortTopic;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li><strong>RUNNING</strong>: The rule is running.</li>
         * <li><strong>STOP</strong>: The rule is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STOP</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The topic to which the rule applies. Format: <code>${productKey}/${deviceName}/topicShortName</code>.</p>
         * <blockquote>
         * <p> For information about how to use a plus sign (<code>+</code>) or a number sign (<code>#</code>) as a wildcard character in a topic, see <a href="https://help.aliyun.com/document_detail/73731.html">Topic wildcards</a>.</p>
         * </blockquote>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The time when the device was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-27T12:40:43.000Z</p>
         */
        @NameInMap("UtcCreated")
        public String utcCreated;

        /**
         * <p>The time when the rule was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-27T12:45:43.000Z</p>
         */
        @NameInMap("UtcModified")
        public String utcModified;

        /**
         * <p>The <strong>Where</strong> query condition in the SQL statement of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Temperature&gt;35</p>
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
