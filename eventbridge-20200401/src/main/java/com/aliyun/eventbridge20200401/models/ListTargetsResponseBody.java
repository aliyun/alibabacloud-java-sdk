// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListTargetsResponseBody extends TeaModel {
    /**
     * <p>The returned response code. Valid values:</p>
     * <ul>
     * <li>Success: The request is successful.</li>
     * <li>Other codes: The request failed. For a list of error codes, see Error codes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListTargetsResponseBodyData data;

    /**
     * <p>The returned error message.</p>
     * 
     * <strong>example:</strong>
     * <p>EventRuleNotExisted</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5DAF96FB-A4B6-548C-B999-0BFDCB2261B9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTargetsResponseBody self = new ListTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTargetsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTargetsResponseBody setData(ListTargetsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTargetsResponseBodyData getData() {
        return this.data;
    }

    public ListTargetsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTargetsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTargetsResponseBodyDataTargetsParamList extends TeaModel {
        /**
         * <p>The format that is used by the event target parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The resource parameter of the event target.</p>
         * 
         * <strong>example:</strong>
         * <p>body</p>
         */
        @NameInMap("ResourceKey")
        public String resourceKey;

        /**
         * <p>The template that is used by the event target parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value of the event target parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;key\&quot;=\&quot;value\&quot;}</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTargetsResponseBodyDataTargetsParamList build(java.util.Map<String, ?> map) throws Exception {
            ListTargetsResponseBodyDataTargetsParamList self = new ListTargetsResponseBodyDataTargetsParamList();
            return TeaModel.build(map, self);
        }

        public ListTargetsResponseBodyDataTargetsParamList setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public ListTargetsResponseBodyDataTargetsParamList setResourceKey(String resourceKey) {
            this.resourceKey = resourceKey;
            return this;
        }
        public String getResourceKey() {
            return this.resourceKey;
        }

        public ListTargetsResponseBodyDataTargetsParamList setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListTargetsResponseBodyDataTargetsParamList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTargetsResponseBodyDataTargets extends TeaModel {
        /**
         * <p>The endpoint of the event target.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-hangzhou:123456789098****:services/guide.LATEST/functions/HelloFC</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("ErrorsTolerance")
        public String errorsTolerance;

        /**
         * <p>The name of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>sls-beijing-one1-tf</p>
         */
        @NameInMap("EventBusName")
        public String eventBusName;

        /**
         * <p>The ID of the event target.</p>
         * 
         * <strong>example:</strong>
         * <p>1453</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The parameters that are configured for the event target.</p>
         */
        @NameInMap("ParamList")
        public java.util.List<ListTargetsResponseBodyDataTargetsParamList> paramList;

        /**
         * <p>The name of the event rule.</p>
         * 
         * <strong>example:</strong>
         * <p>rule-uKAK2</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The type of the event target. For more information, see <a href="https://help.aliyun.com/document_detail/183698.html">Event target parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>acs.fc.function</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListTargetsResponseBodyDataTargets build(java.util.Map<String, ?> map) throws Exception {
            ListTargetsResponseBodyDataTargets self = new ListTargetsResponseBodyDataTargets();
            return TeaModel.build(map, self);
        }

        public ListTargetsResponseBodyDataTargets setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListTargetsResponseBodyDataTargets setErrorsTolerance(String errorsTolerance) {
            this.errorsTolerance = errorsTolerance;
            return this;
        }
        public String getErrorsTolerance() {
            return this.errorsTolerance;
        }

        public ListTargetsResponseBodyDataTargets setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public String getEventBusName() {
            return this.eventBusName;
        }

        public ListTargetsResponseBodyDataTargets setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListTargetsResponseBodyDataTargets setParamList(java.util.List<ListTargetsResponseBodyDataTargetsParamList> paramList) {
            this.paramList = paramList;
            return this;
        }
        public java.util.List<ListTargetsResponseBodyDataTargetsParamList> getParamList() {
            return this.paramList;
        }

        public ListTargetsResponseBodyDataTargets setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListTargetsResponseBodyDataTargets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListTargetsResponseBodyData extends TeaModel {
        /**
         * <p>If excess return values exist, this parameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The event targets.</p>
         */
        @NameInMap("Targets")
        public java.util.List<ListTargetsResponseBodyDataTargets> targets;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListTargetsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTargetsResponseBodyData self = new ListTargetsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTargetsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListTargetsResponseBodyData setTargets(java.util.List<ListTargetsResponseBodyDataTargets> targets) {
            this.targets = targets;
            return this;
        }
        public java.util.List<ListTargetsResponseBodyDataTargets> getTargets() {
            return this.targets;
        }

        public ListTargetsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
