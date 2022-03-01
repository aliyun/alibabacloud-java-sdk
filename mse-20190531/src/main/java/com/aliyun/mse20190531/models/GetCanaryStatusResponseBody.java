// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetCanaryStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<GetCanaryStatusResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCanaryStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCanaryStatusResponseBody self = new GetCanaryStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCanaryStatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetCanaryStatusResponseBody setData(java.util.List<GetCanaryStatusResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetCanaryStatusResponseBodyData> getData() {
        return this.data;
    }

    public GetCanaryStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCanaryStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCanaryStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCanaryStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCanaryStatusResponseBodyDataInstanceInfoListTags extends TeaModel {
        @NameInMap("Tag")
        public String tag;

        @NameInMap("Type")
        public String type;

        public static GetCanaryStatusResponseBodyDataInstanceInfoListTags build(java.util.Map<String, ?> map) throws Exception {
            GetCanaryStatusResponseBodyDataInstanceInfoListTags self = new GetCanaryStatusResponseBodyDataInstanceInfoListTags();
            return TeaModel.build(map, self);
        }

        public GetCanaryStatusResponseBodyDataInstanceInfoListTags setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetCanaryStatusResponseBodyDataInstanceInfoListTags setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetCanaryStatusResponseBodyDataInstanceInfoList extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        @NameInMap("Port")
        public String port;

        @NameInMap("Tags")
        public java.util.List<GetCanaryStatusResponseBodyDataInstanceInfoListTags> tags;

        public static GetCanaryStatusResponseBodyDataInstanceInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetCanaryStatusResponseBodyDataInstanceInfoList self = new GetCanaryStatusResponseBodyDataInstanceInfoList();
            return TeaModel.build(map, self);
        }

        public GetCanaryStatusResponseBodyDataInstanceInfoList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetCanaryStatusResponseBodyDataInstanceInfoList setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetCanaryStatusResponseBodyDataInstanceInfoList setTags(java.util.List<GetCanaryStatusResponseBodyDataInstanceInfoListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetCanaryStatusResponseBodyDataInstanceInfoListTags> getTags() {
            return this.tags;
        }

    }

    public static class GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRulesArgumentItems extends TeaModel {
        @NameInMap("Cond")
        public String cond;

        @NameInMap("Datum")
        public String datum;

        @NameInMap("Divisor")
        public Long divisor;

        @NameInMap("Expr")
        public String expr;

        @NameInMap("Index")
        public Long index;

        @NameInMap("NameList")
        public java.util.List<String> nameList;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Rate")
        public Long rate;

        @NameInMap("Remainder")
        public Long remainder;

        public static GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRulesArgumentItems build(java.util.Map<String, ?> map) throws Exception {
            GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRulesArgumentItems self = new GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRulesArgumentItems();
            return TeaModel.build(map, self);
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRulesArgumentItems setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRulesArgumentItems setDatum(String datum) {
            this.datum = datum;
            return this;
        }
        public String getDatum() {
            return this.datum;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRulesArgumentItems setDivisor(Long divisor) {
            this.divisor = divisor;
            return this;
        }
        public Long getDivisor() {
            return this.divisor;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRulesArgumentItems setExpr(String expr) {
            this.expr = expr;
            return this;
        }
        public String getExpr() {
            return this.expr;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRulesArgumentItems setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRulesArgumentItems setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRulesArgumentItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRulesArgumentItems setRate(Long rate) {
            this.rate = rate;
            return this;
        }
        public Long getRate() {
            return this.rate;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRulesArgumentItems setRemainder(Long remainder) {
            this.remainder = remainder;
            return this;
        }
        public Long getRemainder() {
            return this.remainder;
        }

    }

    public static class GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRules extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("ArgumentItems")
        public java.util.List<GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRulesArgumentItems> argumentItems;

        @NameInMap("CarryData")
        public Boolean carryData;

        @NameInMap("Condition")
        public String condition;

        @NameInMap("Group")
        public String group;

        @NameInMap("MethodName")
        public String methodName;

        @NameInMap("ParamTypes")
        public java.util.List<String> paramTypes;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("TriggerPolicy")
        public String triggerPolicy;

        @NameInMap("Version")
        public String version;

        public static GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRules build(java.util.Map<String, ?> map) throws Exception {
            GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRules self = new GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRules();
            return TeaModel.build(map, self);
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRules setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRules setArgumentItems(java.util.List<GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRulesArgumentItems> argumentItems) {
            this.argumentItems = argumentItems;
            return this;
        }
        public java.util.List<GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRulesArgumentItems> getArgumentItems() {
            return this.argumentItems;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRules setCarryData(Boolean carryData) {
            this.carryData = carryData;
            return this;
        }
        public Boolean getCarryData() {
            return this.carryData;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRules setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRules setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRules setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRules setParamTypes(java.util.List<String> paramTypes) {
            this.paramTypes = paramTypes;
            return this;
        }
        public java.util.List<String> getParamTypes() {
            return this.paramTypes;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRules setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRules setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRules setTriggerPolicy(String triggerPolicy) {
            this.triggerPolicy = triggerPolicy;
            return this;
        }
        public String getTriggerPolicy() {
            return this.triggerPolicy;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRules setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetCanaryStatusResponseBodyDataRoutePolicyScRulesRestItems extends TeaModel {
        @NameInMap("Cond")
        public String cond;

        @NameInMap("Datum")
        public String datum;

        @NameInMap("Divisor")
        public Long divisor;

        @NameInMap("Name")
        public String name;

        @NameInMap("NameList")
        public java.util.List<String> nameList;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Rate")
        public Long rate;

        @NameInMap("Remainder")
        public Long remainder;

        @NameInMap("Type")
        public String type;

        public static GetCanaryStatusResponseBodyDataRoutePolicyScRulesRestItems build(java.util.Map<String, ?> map) throws Exception {
            GetCanaryStatusResponseBodyDataRoutePolicyScRulesRestItems self = new GetCanaryStatusResponseBodyDataRoutePolicyScRulesRestItems();
            return TeaModel.build(map, self);
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyScRulesRestItems setCond(String cond) {
            this.cond = cond;
            return this;
        }
        public String getCond() {
            return this.cond;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyScRulesRestItems setDatum(String datum) {
            this.datum = datum;
            return this;
        }
        public String getDatum() {
            return this.datum;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyScRulesRestItems setDivisor(Long divisor) {
            this.divisor = divisor;
            return this;
        }
        public Long getDivisor() {
            return this.divisor;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyScRulesRestItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyScRulesRestItems setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyScRulesRestItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyScRulesRestItems setRate(Long rate) {
            this.rate = rate;
            return this;
        }
        public Long getRate() {
            return this.rate;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyScRulesRestItems setRemainder(Long remainder) {
            this.remainder = remainder;
            return this;
        }
        public Long getRemainder() {
            return this.remainder;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyScRulesRestItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetCanaryStatusResponseBodyDataRoutePolicyScRules extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CarryData")
        public Boolean carryData;

        @NameInMap("Condition")
        public String condition;

        @NameInMap("Path")
        public String path;

        @NameInMap("RestItems")
        public java.util.List<GetCanaryStatusResponseBodyDataRoutePolicyScRulesRestItems> restItems;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        @NameInMap("TriggerPolicy")
        public String triggerPolicy;

        public static GetCanaryStatusResponseBodyDataRoutePolicyScRules build(java.util.Map<String, ?> map) throws Exception {
            GetCanaryStatusResponseBodyDataRoutePolicyScRules self = new GetCanaryStatusResponseBodyDataRoutePolicyScRules();
            return TeaModel.build(map, self);
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyScRules setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyScRules setCarryData(Boolean carryData) {
            this.carryData = carryData;
            return this;
        }
        public Boolean getCarryData() {
            return this.carryData;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyScRules setCondition(String condition) {
            this.condition = condition;
            return this;
        }
        public String getCondition() {
            return this.condition;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyScRules setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyScRules setRestItems(java.util.List<GetCanaryStatusResponseBodyDataRoutePolicyScRulesRestItems> restItems) {
            this.restItems = restItems;
            return this;
        }
        public java.util.List<GetCanaryStatusResponseBodyDataRoutePolicyScRulesRestItems> getRestItems() {
            return this.restItems;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyScRules setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicyScRules setTriggerPolicy(String triggerPolicy) {
            this.triggerPolicy = triggerPolicy;
            return this;
        }
        public String getTriggerPolicy() {
            return this.triggerPolicy;
        }

    }

    public static class GetCanaryStatusResponseBodyDataRoutePolicy extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CarryData")
        public Boolean carryData;

        @NameInMap("DubboArgRules")
        public java.util.List<GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRules> dubboArgRules;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IstioRules")
        public String istioRules;

        @NameInMap("Rate")
        public Integer rate;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ScRules")
        public java.util.List<GetCanaryStatusResponseBodyDataRoutePolicyScRules> scRules;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("TriggerPolicy")
        public String triggerPolicy;

        public static GetCanaryStatusResponseBodyDataRoutePolicy build(java.util.Map<String, ?> map) throws Exception {
            GetCanaryStatusResponseBodyDataRoutePolicy self = new GetCanaryStatusResponseBodyDataRoutePolicy();
            return TeaModel.build(map, self);
        }

        public GetCanaryStatusResponseBodyDataRoutePolicy setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicy setCarryData(Boolean carryData) {
            this.carryData = carryData;
            return this;
        }
        public Boolean getCarryData() {
            return this.carryData;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicy setDubboArgRules(java.util.List<GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRules> dubboArgRules) {
            this.dubboArgRules = dubboArgRules;
            return this;
        }
        public java.util.List<GetCanaryStatusResponseBodyDataRoutePolicyDubboArgRules> getDubboArgRules() {
            return this.dubboArgRules;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicy setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicy setIstioRules(String istioRules) {
            this.istioRules = istioRules;
            return this;
        }
        public String getIstioRules() {
            return this.istioRules;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicy setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicy setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicy setScRules(java.util.List<GetCanaryStatusResponseBodyDataRoutePolicyScRules> scRules) {
            this.scRules = scRules;
            return this;
        }
        public java.util.List<GetCanaryStatusResponseBodyDataRoutePolicyScRules> getScRules() {
            return this.scRules;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicy setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetCanaryStatusResponseBodyDataRoutePolicy setTriggerPolicy(String triggerPolicy) {
            this.triggerPolicy = triggerPolicy;
            return this;
        }
        public String getTriggerPolicy() {
            return this.triggerPolicy;
        }

    }

    public static class GetCanaryStatusResponseBodyData extends TeaModel {
        @NameInMap("InstanceInfoList")
        public java.util.List<GetCanaryStatusResponseBodyDataInstanceInfoList> instanceInfoList;

        @NameInMap("Old")
        public Boolean old;

        @NameInMap("Rate")
        public Integer rate;

        @NameInMap("RoutePolicy")
        public GetCanaryStatusResponseBodyDataRoutePolicy routePolicy;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("Version")
        public String version;

        public static GetCanaryStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCanaryStatusResponseBodyData self = new GetCanaryStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCanaryStatusResponseBodyData setInstanceInfoList(java.util.List<GetCanaryStatusResponseBodyDataInstanceInfoList> instanceInfoList) {
            this.instanceInfoList = instanceInfoList;
            return this;
        }
        public java.util.List<GetCanaryStatusResponseBodyDataInstanceInfoList> getInstanceInfoList() {
            return this.instanceInfoList;
        }

        public GetCanaryStatusResponseBodyData setOld(Boolean old) {
            this.old = old;
            return this;
        }
        public Boolean getOld() {
            return this.old;
        }

        public GetCanaryStatusResponseBodyData setRate(Integer rate) {
            this.rate = rate;
            return this;
        }
        public Integer getRate() {
            return this.rate;
        }

        public GetCanaryStatusResponseBodyData setRoutePolicy(GetCanaryStatusResponseBodyDataRoutePolicy routePolicy) {
            this.routePolicy = routePolicy;
            return this;
        }
        public GetCanaryStatusResponseBodyDataRoutePolicy getRoutePolicy() {
            return this.routePolicy;
        }

        public GetCanaryStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCanaryStatusResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetCanaryStatusResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
