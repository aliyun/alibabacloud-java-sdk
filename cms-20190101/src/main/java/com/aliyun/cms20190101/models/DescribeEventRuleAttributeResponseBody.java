// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeEventRuleAttributeResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeEventRuleAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventRuleAttributeResponseBody self = new DescribeEventRuleAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventRuleAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEventRuleAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEventRuleAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventRuleAttributeResponseBody setResult(DescribeEventRuleAttributeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeEventRuleAttributeResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeEventRuleAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEventRuleAttributeResponseBodyResultEventPatternLevelList extends TeaModel {
        @NameInMap("LevelList")
        public java.util.List<String> levelList;

        public static DescribeEventRuleAttributeResponseBodyResultEventPatternLevelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleAttributeResponseBodyResultEventPatternLevelList self = new DescribeEventRuleAttributeResponseBodyResultEventPatternLevelList();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPatternLevelList setLevelList(java.util.List<String> levelList) {
            this.levelList = levelList;
            return this;
        }
        public java.util.List<String> getLevelList() {
            return this.levelList;
        }

    }

    public static class DescribeEventRuleAttributeResponseBodyResultEventPatternNameList extends TeaModel {
        @NameInMap("NameList")
        public java.util.List<String> nameList;

        public static DescribeEventRuleAttributeResponseBodyResultEventPatternNameList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleAttributeResponseBodyResultEventPatternNameList self = new DescribeEventRuleAttributeResponseBodyResultEventPatternNameList();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPatternNameList setNameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }
        public java.util.List<String> getNameList() {
            return this.nameList;
        }

    }

    public static class DescribeEventRuleAttributeResponseBodyResultEventPatternStatusList extends TeaModel {
        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        public static DescribeEventRuleAttributeResponseBodyResultEventPatternStatusList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleAttributeResponseBodyResultEventPatternStatusList self = new DescribeEventRuleAttributeResponseBodyResultEventPatternStatusList();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPatternStatusList setStatusList(java.util.List<String> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

    }

    public static class DescribeEventRuleAttributeResponseBodyResultEventPattern extends TeaModel {
        @NameInMap("LevelList")
        public DescribeEventRuleAttributeResponseBodyResultEventPatternLevelList levelList;

        @NameInMap("NameList")
        public DescribeEventRuleAttributeResponseBodyResultEventPatternNameList nameList;

        @NameInMap("Product")
        public String product;

        @NameInMap("StatusList")
        public DescribeEventRuleAttributeResponseBodyResultEventPatternStatusList statusList;

        public static DescribeEventRuleAttributeResponseBodyResultEventPattern build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleAttributeResponseBodyResultEventPattern self = new DescribeEventRuleAttributeResponseBodyResultEventPattern();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPattern setLevelList(DescribeEventRuleAttributeResponseBodyResultEventPatternLevelList levelList) {
            this.levelList = levelList;
            return this;
        }
        public DescribeEventRuleAttributeResponseBodyResultEventPatternLevelList getLevelList() {
            return this.levelList;
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPattern setNameList(DescribeEventRuleAttributeResponseBodyResultEventPatternNameList nameList) {
            this.nameList = nameList;
            return this;
        }
        public DescribeEventRuleAttributeResponseBodyResultEventPatternNameList getNameList() {
            return this.nameList;
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPattern setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeEventRuleAttributeResponseBodyResultEventPattern setStatusList(DescribeEventRuleAttributeResponseBodyResultEventPatternStatusList statusList) {
            this.statusList = statusList;
            return this;
        }
        public DescribeEventRuleAttributeResponseBodyResultEventPatternStatusList getStatusList() {
            return this.statusList;
        }

    }

    public static class DescribeEventRuleAttributeResponseBodyResult extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("EventPattern")
        public DescribeEventRuleAttributeResponseBodyResultEventPattern eventPattern;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        public static DescribeEventRuleAttributeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventRuleAttributeResponseBodyResult self = new DescribeEventRuleAttributeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeEventRuleAttributeResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeEventRuleAttributeResponseBodyResult setEventPattern(DescribeEventRuleAttributeResponseBodyResultEventPattern eventPattern) {
            this.eventPattern = eventPattern;
            return this;
        }
        public DescribeEventRuleAttributeResponseBodyResultEventPattern getEventPattern() {
            return this.eventPattern;
        }

        public DescribeEventRuleAttributeResponseBodyResult setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeEventRuleAttributeResponseBodyResult setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeEventRuleAttributeResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventRuleAttributeResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
