// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListOutboundStrategiesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("OutboundStrategies")
    public java.util.List<ListOutboundStrategiesResponseBodyOutboundStrategies> outboundStrategies;

    @NameInMap("RequestId")
    public String requestId;

    public static ListOutboundStrategiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOutboundStrategiesResponseBody self = new ListOutboundStrategiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOutboundStrategiesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOutboundStrategiesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOutboundStrategiesResponseBody setOutboundStrategies(java.util.List<ListOutboundStrategiesResponseBodyOutboundStrategies> outboundStrategies) {
        this.outboundStrategies = outboundStrategies;
        return this;
    }
    public java.util.List<ListOutboundStrategiesResponseBodyOutboundStrategies> getOutboundStrategies() {
        return this.outboundStrategies;
    }

    public ListOutboundStrategiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListOutboundStrategiesResponseBodyOutboundStrategies extends TeaModel {
        @NameInMap("BuId")
        public Long buId;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("ExtAttr")
        public String extAttr;

        @NameInMap("GmtCreateStr")
        public String gmtCreateStr;

        @NameInMap("GmtModifiedStr")
        public String gmtModifiedStr;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModifierId")
        public Long modifierId;

        @NameInMap("ModifierName")
        public String modifierName;

        @NameInMap("NumType")
        public Integer numType;

        @NameInMap("OutboundNum")
        public String outboundNum;

        @NameInMap("Process")
        public Integer process;

        @NameInMap("ResourceAllocation")
        public Integer resourceAllocation;

        @NameInMap("RobotId")
        public String robotId;

        @NameInMap("RobotName")
        public String robotName;

        @NameInMap("RobotType")
        public Integer robotType;

        @NameInMap("RuleCode")
        public Long ruleCode;

        @NameInMap("SceneName")
        public String sceneName;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SuccessRate")
        public Integer successRate;

        @NameInMap("name")
        public String name;

        public static ListOutboundStrategiesResponseBodyOutboundStrategies build(java.util.Map<String, ?> map) throws Exception {
            ListOutboundStrategiesResponseBodyOutboundStrategies self = new ListOutboundStrategiesResponseBodyOutboundStrategies();
            return TeaModel.build(map, self);
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setExtAttr(String extAttr) {
            this.extAttr = extAttr;
            return this;
        }
        public String getExtAttr() {
            return this.extAttr;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setGmtCreateStr(String gmtCreateStr) {
            this.gmtCreateStr = gmtCreateStr;
            return this;
        }
        public String getGmtCreateStr() {
            return this.gmtCreateStr;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setGmtModifiedStr(String gmtModifiedStr) {
            this.gmtModifiedStr = gmtModifiedStr;
            return this;
        }
        public String getGmtModifiedStr() {
            return this.gmtModifiedStr;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setModifierId(Long modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public Long getModifierId() {
            return this.modifierId;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setModifierName(String modifierName) {
            this.modifierName = modifierName;
            return this;
        }
        public String getModifierName() {
            return this.modifierName;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setNumType(Integer numType) {
            this.numType = numType;
            return this;
        }
        public Integer getNumType() {
            return this.numType;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setOutboundNum(String outboundNum) {
            this.outboundNum = outboundNum;
            return this;
        }
        public String getOutboundNum() {
            return this.outboundNum;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setProcess(Integer process) {
            this.process = process;
            return this;
        }
        public Integer getProcess() {
            return this.process;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setResourceAllocation(Integer resourceAllocation) {
            this.resourceAllocation = resourceAllocation;
            return this;
        }
        public Integer getResourceAllocation() {
            return this.resourceAllocation;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setRobotId(String robotId) {
            this.robotId = robotId;
            return this;
        }
        public String getRobotId() {
            return this.robotId;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setRobotName(String robotName) {
            this.robotName = robotName;
            return this;
        }
        public String getRobotName() {
            return this.robotName;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setRobotType(Integer robotType) {
            this.robotType = robotType;
            return this;
        }
        public Integer getRobotType() {
            return this.robotType;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setRuleCode(Long ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }
        public Long getRuleCode() {
            return this.ruleCode;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setSuccessRate(Integer successRate) {
            this.successRate = successRate;
            return this;
        }
        public Integer getSuccessRate() {
            return this.successRate;
        }

        public ListOutboundStrategiesResponseBodyOutboundStrategies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
