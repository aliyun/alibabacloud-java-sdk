// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetRuleResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>58D4CEC0-3E95-4DBE-AFC1-809D1400E52F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The rule information returned if the call is successful. For more information, see RuleInfo.</p>
     */
    @NameInMap("RuleInfo")
    public GetRuleResponseBodyRuleInfo ruleInfo;

    /**
     * <p>Indicates whether the call was successful.</p>
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

    public static GetRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuleResponseBody self = new GetRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRuleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRuleResponseBody setRuleInfo(GetRuleResponseBodyRuleInfo ruleInfo) {
        this.ruleInfo = ruleInfo;
        return this;
    }
    public GetRuleResponseBodyRuleInfo getRuleInfo() {
        return this.ruleInfo;
    }

    public GetRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRuleResponseBodyRuleInfo extends TeaModel {
        /**
         * <p>The ID of the user who created the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>100000000000000</p>
         */
        @NameInMap("CreateUserId")
        public Long createUserId;

        /**
         * <p>The time when the rule was created. The time is displayed in UTC-6.</p>
         * 
         * <strong>example:</strong>
         * <p>Thu Feb 28 14:14:33 CST 2019</p>
         */
        @NameInMap("Created")
        public String created;

        /**
         * <p>The data type of the rule. Valid values: <strong>JSON</strong> and <strong>BINARY</strong> .</p>
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
         * <p>100000</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The time when the rule was last modified. The time is displayed in UTC-6.</p>
         * 
         * <strong>example:</strong>
         * <p>Thu Feb 28 14:20:58 CST 2019</p>
         */
        @NameInMap("Modified")
        public String modified;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>iotrules</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ProductKey of the product to which the rule applies.</p>
         * 
         * <strong>example:</strong>
         * <p>a1KiV******</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The description of this rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rule1Desc</p>
         */
        @NameInMap("RuleDesc")
        public String ruleDesc;

        /**
         * <p>The values of <strong>Select</strong> in the SQL statements of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>deviceName() as deviceName</p>
         */
        @NameInMap("Select")
        public String select;

        /**
         * <p>The topic to which the rule applies. The topic does not include the ProductKey level. Format: <code>${deviceName}/topicShortName</code>. ${deviceName} indicates the name of the device, and topicShortName indicates the custom name of the topic.</p>
         * <blockquote>
         * <p> For information about how to use the <code>+</code> or <code>#</code> wildcard in a topic, see <a href="https://help.aliyun.com/document_detail/73731.html">Topic wildcards</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>+/user/pm25data</p>
         */
        @NameInMap("ShortTopic")
        public String shortTopic;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li><strong>RUNNING</strong>: Running</li>
         * <li><strong>STOP</strong>: Stopped</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>STOP</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The complete topic to which the rule applies. Format: <code>${productKey}/${deviceName}/topicShortName</code>.</p>
         * <blockquote>
         * <p> For information about how to use the <code>+</code> or <code>#</code> wildcard in a topic, see <a href="https://help.aliyun.com/document_detail/73731.html">Topic wildcards</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/a1QsMlL44pp/+/user/pm25data</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The type of the topic. This parameter is returned if you set the SQL statement for the rule. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: a basic communication topic or TSL communication topic.</li>
         * <li><strong>1</strong>: a custom topic.</li>
         * <li><strong>2</strong>: a device status topic.</li>
         * </ul>
         * <p>If no SQL statement is set for the rule, the value <strong>-1</strong> is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TopicType")
        public Integer topicType;

        /**
         * <p>The time when the rule was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-28T06:14:33.000Z</p>
         */
        @NameInMap("UtcCreated")
        public String utcCreated;

        /**
         * <p>The time when the rule was last modified. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-28T06:20:58.000Z</p>
         */
        @NameInMap("UtcModified")
        public String utcModified;

        /**
         * <p>The <strong>Where</strong> query condition in the SQL statements of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Temperature&gt;35</p>
         */
        @NameInMap("Where")
        public String where;

        public static GetRuleResponseBodyRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyRuleInfo self = new GetRuleResponseBodyRuleInfo();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyRuleInfo setCreateUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public Long getCreateUserId() {
            return this.createUserId;
        }

        public GetRuleResponseBodyRuleInfo setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public GetRuleResponseBodyRuleInfo setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public GetRuleResponseBodyRuleInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetRuleResponseBodyRuleInfo setModified(String modified) {
            this.modified = modified;
            return this;
        }
        public String getModified() {
            return this.modified;
        }

        public GetRuleResponseBodyRuleInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRuleResponseBodyRuleInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public GetRuleResponseBodyRuleInfo setRuleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        public GetRuleResponseBodyRuleInfo setSelect(String select) {
            this.select = select;
            return this;
        }
        public String getSelect() {
            return this.select;
        }

        public GetRuleResponseBodyRuleInfo setShortTopic(String shortTopic) {
            this.shortTopic = shortTopic;
            return this;
        }
        public String getShortTopic() {
            return this.shortTopic;
        }

        public GetRuleResponseBodyRuleInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRuleResponseBodyRuleInfo setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetRuleResponseBodyRuleInfo setTopicType(Integer topicType) {
            this.topicType = topicType;
            return this;
        }
        public Integer getTopicType() {
            return this.topicType;
        }

        public GetRuleResponseBodyRuleInfo setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public GetRuleResponseBodyRuleInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public GetRuleResponseBodyRuleInfo setWhere(String where) {
            this.where = where;
            return this;
        }
        public String getWhere() {
            return this.where;
        }

    }

}
