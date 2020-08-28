// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleAttributeResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Result")
    @Validation(required = true)
    public DescribeEventRuleAttributeResponseResult result;

    public static DescribeEventRuleAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventRuleAttributeResponse self = new DescribeEventRuleAttributeResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeEventRuleAttributeResponseResultEventPatternNameList extends TeaModel {
        @NameInMap("NameList")
        @Validation(required = true)
        public java.util.List<String> nameList;

        public static DescribeEventRuleAttributeResponseResultEventPatternNameList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleAttributeResponseResultEventPatternNameList self = new DescribeEventRuleAttributeResponseResultEventPatternNameList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEventRuleAttributeResponseResultEventPatternStatusList extends TeaModel {
        @NameInMap("StatusList")
        @Validation(required = true)
        public java.util.List<String> statusList;

        public static DescribeEventRuleAttributeResponseResultEventPatternStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleAttributeResponseResultEventPatternStatusList self = new DescribeEventRuleAttributeResponseResultEventPatternStatusList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEventRuleAttributeResponseResultEventPatternLevelList extends TeaModel {
        @NameInMap("LevelList")
        @Validation(required = true)
        public java.util.List<String> levelList;

        public static DescribeEventRuleAttributeResponseResultEventPatternLevelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleAttributeResponseResultEventPatternLevelList self = new DescribeEventRuleAttributeResponseResultEventPatternLevelList();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEventRuleAttributeResponseResultEventPattern extends TeaModel {
        @NameInMap("Product")
        @Validation(required = true)
        public String product;

        @NameInMap("NameList")
        @Validation(required = true)
        public DescribeEventRuleAttributeResponseResultEventPatternNameList nameList;

        @NameInMap("StatusList")
        @Validation(required = true)
        public DescribeEventRuleAttributeResponseResultEventPatternStatusList statusList;

        @NameInMap("LevelList")
        @Validation(required = true)
        public DescribeEventRuleAttributeResponseResultEventPatternLevelList levelList;

        public static DescribeEventRuleAttributeResponseResultEventPattern build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleAttributeResponseResultEventPattern self = new DescribeEventRuleAttributeResponseResultEventPattern();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeEventRuleAttributeResponseResult extends TeaModel {
        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("EventType")
        @Validation(required = true)
        public String eventType;

        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("State")
        @Validation(required = true)
        public String state;

        @NameInMap("EventPattern")
        @Validation(required = true)
        public DescribeEventRuleAttributeResponseResultEventPattern eventPattern;

        public static DescribeEventRuleAttributeResponseResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleAttributeResponseResult self = new DescribeEventRuleAttributeResponseResult();
            return TeaModel.build(map, self);
        }

    }

}
