// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListTargetsResponseBody extends TeaModel {
    /**
     * <p>The returned response code. Valid values:</p>
     * <br>
     * <p>    Success: The request is successful. </p>
     * <br>
     * <p>    Other codes: The request failed. For more information about error codes, see Error codes.</p>
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
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>    true: The request is successful. </p>
     * <br>
     * <p>    false: The request failed.</p>
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
        @NameInMap("Form")
        public String form;

        @NameInMap("ResourceKey")
        public String resourceKey;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("ErrorsTolerance")
        public String errorsTolerance;

        @NameInMap("EventBusName")
        public String eventBusName;

        @NameInMap("Id")
        public String id;

        @NameInMap("ParamList")
        public java.util.List<ListTargetsResponseBodyDataTargetsParamList> paramList;

        @NameInMap("RuleName")
        public String ruleName;

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
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The name of the event rule.</p>
         */
        @NameInMap("Targets")
        public java.util.List<ListTargetsResponseBodyDataTargets> targets;

        /**
         * <p>The total number of entries.</p>
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
