// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneResponseBody extends TeaModel {
    /**
     * <p>The status code. The value 200 is returned if the request is successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public CreateOrUpdateSwimmingLaneResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateOrUpdateSwimmingLaneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateSwimmingLaneResponseBody self = new CreateOrUpdateSwimmingLaneResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateSwimmingLaneResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateOrUpdateSwimmingLaneResponseBody setData(CreateOrUpdateSwimmingLaneResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOrUpdateSwimmingLaneResponseBodyData getData() {
        return this.data;
    }

    public CreateOrUpdateSwimmingLaneResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateOrUpdateSwimmingLaneResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateOrUpdateSwimmingLaneResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOrUpdateSwimmingLaneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrUpdateSwimmingLaneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateOrUpdateSwimmingLaneResponseBodyDataEntryRulesRestItems extends TeaModel {
        @NameInMap("cond")
        public String cond;

        @NameInMap("datum")
        public String datum;

        @NameInMap("divisor")
        public Integer divisor;

        @NameInMap("name")
        public String name;

        @NameInMap("nameList")
        public java.util.List<String> nameList;

        @NameInMap("operator")
        public String operator;

        @NameInMap("rate")
        public Integer rate;

        @NameInMap("remainder")
        public Integer remainder;

        @NameInMap("type")
        public String type;

        @NameInMap("value")
        public String value;

        public static CreateOrUpdateSwimmingLaneResponseBodyDataEntryRulesRestItems build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSwimmingLaneResponseBodyDataEntryRulesRestItems self = new CreateOrUpdateSwimmingLaneResponseBodyDataEntryRulesRestItems();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSwimmingLaneResponseBodyDataEntryRulesRestItems setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyDataEntryRulesRestItems setDatum(String datum) {
            this.datum = datum;
            return this;
        }
        public String getDatum() {
            return this.datum;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyDataEntryRulesRestItems setDivisor(Integer divisor) {
            this.divisor = divisor;
            return this;
        }
        public Integer getDivisor() {
            return this.divisor;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyDataEntryRulesRestItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyDataEntryRulesRestItems setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyDataEntryRulesRestItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyDataEntryRulesRestItems setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyDataEntryRulesRestItems setRemainder(Integer remainder) {
            this.remainder = remainder;
            return this;
        }
        public Integer getRemainder() {
            return this.remainder;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyDataEntryRulesRestItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyDataEntryRulesRestItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateOrUpdateSwimmingLaneResponseBodyDataEntryRules extends TeaModel {
        @NameInMap("condition")
        public String condition;

        @NameInMap("path")
        public String path;

        @NameInMap("paths")
        public java.util.List<String> paths;

        @NameInMap("restItems")
        public java.util.List<CreateOrUpdateSwimmingLaneResponseBodyDataEntryRulesRestItems> restItems;

        public static CreateOrUpdateSwimmingLaneResponseBodyDataEntryRules build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSwimmingLaneResponseBodyDataEntryRules self = new CreateOrUpdateSwimmingLaneResponseBodyDataEntryRules();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSwimmingLaneResponseBodyDataEntryRules setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyDataEntryRules setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyDataEntryRules setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyDataEntryRules setRestItems(java.util.List<CreateOrUpdateSwimmingLaneResponseBodyDataEntryRulesRestItems> restItems) {
            this.restItems = restItems;
            return this;
        }
        public java.util.List<CreateOrUpdateSwimmingLaneResponseBodyDataEntryRulesRestItems> getRestItems() {
            return this.restItems;
        }

    }

    public static class CreateOrUpdateSwimmingLaneResponseBodyData extends TeaModel {
        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("enableRules")
        public Boolean enableRules;

        @NameInMap("entryRule")
        public String entryRule;

        @NameInMap("entryRules")
        public java.util.List<CreateOrUpdateSwimmingLaneResponseBodyDataEntryRules> entryRules;

        @NameInMap("gatewaySwimmingLaneRouteJson")
        public String gatewaySwimmingLaneRouteJson;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("groupId")
        public Long groupId;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("pathIndependentPercentageEnable")
        public Boolean pathIndependentPercentageEnable;

        @NameInMap("regionId")
        public String regionId;

        @NameInMap("status")
        public Integer status;

        @NameInMap("tag")
        public String tag;

        public static CreateOrUpdateSwimmingLaneResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateSwimmingLaneResponseBodyData self = new CreateOrUpdateSwimmingLaneResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateSwimmingLaneResponseBodyData setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyData setEnableRules(Boolean enableRules) {
            this.enableRules = enableRules;
            return this;
        }
        public Boolean getEnableRules() {
            return this.enableRules;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyData setEntryRule(String entryRule) {
            this.entryRule = entryRule;
            return this;
        }
        public String getEntryRule() {
            return this.entryRule;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyData setEntryRules(java.util.List<CreateOrUpdateSwimmingLaneResponseBodyDataEntryRules> entryRules) {
            this.entryRules = entryRules;
            return this;
        }
        public java.util.List<CreateOrUpdateSwimmingLaneResponseBodyDataEntryRules> getEntryRules() {
            return this.entryRules;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyData setGatewaySwimmingLaneRouteJson(String gatewaySwimmingLaneRouteJson) {
            this.gatewaySwimmingLaneRouteJson = gatewaySwimmingLaneRouteJson;
            return this;
        }
        public String getGatewaySwimmingLaneRouteJson() {
            return this.gatewaySwimmingLaneRouteJson;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyData setPathIndependentPercentageEnable(Boolean pathIndependentPercentageEnable) {
            this.pathIndependentPercentageEnable = pathIndependentPercentageEnable;
            return this;
        }
        public Boolean getPathIndependentPercentageEnable() {
            return this.pathIndependentPercentageEnable;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateOrUpdateSwimmingLaneResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
