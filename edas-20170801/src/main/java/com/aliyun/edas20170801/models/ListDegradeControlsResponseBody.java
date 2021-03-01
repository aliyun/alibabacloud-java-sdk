// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListDegradeControlsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FlowControlsMap")
    public ListDegradeControlsResponseBodyFlowControlsMap flowControlsMap;

    @NameInMap("Code")
    public Integer code;

    public static ListDegradeControlsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDegradeControlsResponseBody self = new ListDegradeControlsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDegradeControlsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDegradeControlsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDegradeControlsResponseBody setFlowControlsMap(ListDegradeControlsResponseBodyFlowControlsMap flowControlsMap) {
        this.flowControlsMap = flowControlsMap;
        return this;
    }
    public ListDegradeControlsResponseBodyFlowControlsMap getFlowControlsMap() {
        return this.flowControlsMap;
    }

    public ListDegradeControlsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethodMethods extends TeaModel {
        @NameInMap("Method")
        public java.util.List<String> method;

        public static ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethodMethods build(java.util.Map<String, ?> map) throws Exception {
            ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethodMethods self = new ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethodMethods();
            return TeaModel.build(map, self);
        }

        public ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethodMethods setMethod(java.util.List<String> method) {
            this.method = method;
            return this;
        }
        public java.util.List<String> getMethod() {
            return this.method;
        }

    }

    public static class ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod extends TeaModel {
        @NameInMap("Version")
        public String version;

        @NameInMap("name")
        public String name;

        @NameInMap("Methods")
        public ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethodMethods methods;

        public static ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod build(java.util.Map<String, ?> map) throws Exception {
            ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod self = new ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod();
            return TeaModel.build(map, self);
        }

        public ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod setMethods(ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethodMethods methods) {
            this.methods = methods;
            return this;
        }
        public ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethodMethods getMethods() {
            return this.methods;
        }

    }

    public static class ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethods extends TeaModel {
        @NameInMap("InterfaceMethod")
        public java.util.List<ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod> interfaceMethod;

        public static ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethods build(java.util.Map<String, ?> map) throws Exception {
            ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethods self = new ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethods();
            return TeaModel.build(map, self);
        }

        public ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethods setInterfaceMethod(java.util.List<ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod> interfaceMethod) {
            this.interfaceMethod = interfaceMethod;
            return this;
        }
        public java.util.List<ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethodsInterfaceMethod> getInterfaceMethod() {
            return this.interfaceMethod;
        }

    }

    public static class ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultListRule extends TeaModel {
        @NameInMap("Resource")
        public String resource;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("State")
        public Integer state;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("RtThreshold")
        public Integer rtThreshold;

        @NameInMap("RuleId")
        public String ruleId;

        public static ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultListRule build(java.util.Map<String, ?> map) throws Exception {
            ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultListRule self = new ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultListRule();
            return TeaModel.build(map, self);
        }

        public ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

        public ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setRtThreshold(Integer rtThreshold) {
            this.rtThreshold = rtThreshold;
            return this;
        }
        public Integer getRtThreshold() {
            return this.rtThreshold;
        }

        public ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultListRule setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

    }

    public static class ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultList extends TeaModel {
        @NameInMap("Rule")
        public java.util.List<ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultListRule> rule;

        public static ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultList build(java.util.Map<String, ?> map) throws Exception {
            ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultList self = new ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultList();
            return TeaModel.build(map, self);
        }

        public ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultList setRule(java.util.List<ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultListRule> rule) {
            this.rule = rule;
            return this;
        }
        public java.util.List<ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultListRule> getRule() {
            return this.rule;
        }

    }

    public static class ListDegradeControlsResponseBodyFlowControlsMapRuleList extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("TotalSize")
        public Integer totalSize;

        @NameInMap("RuleResultList")
        public ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultList ruleResultList;

        @NameInMap("pageSize")
        public Integer pageSize;

        public static ListDegradeControlsResponseBodyFlowControlsMapRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListDegradeControlsResponseBodyFlowControlsMapRuleList self = new ListDegradeControlsResponseBodyFlowControlsMapRuleList();
            return TeaModel.build(map, self);
        }

        public ListDegradeControlsResponseBodyFlowControlsMapRuleList setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListDegradeControlsResponseBodyFlowControlsMapRuleList setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public ListDegradeControlsResponseBodyFlowControlsMapRuleList setRuleResultList(ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultList ruleResultList) {
            this.ruleResultList = ruleResultList;
            return this;
        }
        public ListDegradeControlsResponseBodyFlowControlsMapRuleListRuleResultList getRuleResultList() {
            return this.ruleResultList;
        }

        public ListDegradeControlsResponseBodyFlowControlsMapRuleList setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListDegradeControlsResponseBodyFlowControlsMap extends TeaModel {
        @NameInMap("InterfaceMethods")
        public ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethods interfaceMethods;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("RuleList")
        public ListDegradeControlsResponseBodyFlowControlsMapRuleList ruleList;

        public static ListDegradeControlsResponseBodyFlowControlsMap build(java.util.Map<String, ?> map) throws Exception {
            ListDegradeControlsResponseBodyFlowControlsMap self = new ListDegradeControlsResponseBodyFlowControlsMap();
            return TeaModel.build(map, self);
        }

        public ListDegradeControlsResponseBodyFlowControlsMap setInterfaceMethods(ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethods interfaceMethods) {
            this.interfaceMethods = interfaceMethods;
            return this;
        }
        public ListDegradeControlsResponseBodyFlowControlsMapInterfaceMethods getInterfaceMethods() {
            return this.interfaceMethods;
        }

        public ListDegradeControlsResponseBodyFlowControlsMap setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListDegradeControlsResponseBodyFlowControlsMap setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListDegradeControlsResponseBodyFlowControlsMap setRuleList(ListDegradeControlsResponseBodyFlowControlsMapRuleList ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public ListDegradeControlsResponseBodyFlowControlsMapRuleList getRuleList() {
            return this.ruleList;
        }

    }

}
