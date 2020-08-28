// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListOutboundStrategiesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("OutboundStrategies")
    @Validation(required = true)
    public java.util.List<ListOutboundStrategiesResponseOutboundStrategies> outboundStrategies;

    public static ListOutboundStrategiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOutboundStrategiesResponse self = new ListOutboundStrategiesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListOutboundStrategiesResponseOutboundStrategies extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public Long id;

        @NameInMap("GmtCreateStr")
        @Validation(required = true)
        public String gmtCreateStr;

        @NameInMap("GmtModifiedStr")
        @Validation(required = true)
        public String gmtModifiedStr;

        @NameInMap("CreatorId")
        @Validation(required = true)
        public Long creatorId;

        @NameInMap("CreatorName")
        @Validation(required = true)
        public String creatorName;

        @NameInMap("ModifierId")
        @Validation(required = true)
        public Long modifierId;

        @NameInMap("ModifierName")
        @Validation(required = true)
        public String modifierName;

        @NameInMap("BuId")
        @Validation(required = true)
        public Long buId;

        @NameInMap("DepartmentId")
        @Validation(required = true)
        public Long departmentId;

        @NameInMap("name")
        @Validation(required = true)
        public String name;

        @NameInMap("NumType")
        @Validation(required = true)
        public Integer numType;

        @NameInMap("OutboundNum")
        @Validation(required = true)
        public String outboundNum;

        @NameInMap("RobotType")
        @Validation(required = true)
        public Integer robotType;

        @NameInMap("RobotId")
        @Validation(required = true)
        public String robotId;

        @NameInMap("RobotName")
        @Validation(required = true)
        public String robotName;

        @NameInMap("ResourceAllocation")
        @Validation(required = true)
        public Integer resourceAllocation;

        @NameInMap("SceneName")
        @Validation(required = true)
        public String sceneName;

        @NameInMap("RuleCode")
        @Validation(required = true)
        public Long ruleCode;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("ExtAttr")
        @Validation(required = true)
        public String extAttr;

        @NameInMap("Process")
        @Validation(required = true)
        public Integer process;

        @NameInMap("SuccessRate")
        @Validation(required = true)
        public Integer successRate;

        public static ListOutboundStrategiesResponseOutboundStrategies build(java.util.Map<String, ?> map) throws Exception {
            ListOutboundStrategiesResponseOutboundStrategies self = new ListOutboundStrategiesResponseOutboundStrategies();
            return TeaModel.build(map, self);
        }

    }

}
