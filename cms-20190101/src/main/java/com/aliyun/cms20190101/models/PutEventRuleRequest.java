// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutEventRuleRequest extends TeaModel {
    @NameInMap("RuleName")
    @Validation(required = true)
    public String ruleName;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("Description")
    public String description;

    @NameInMap("State")
    public String state;

    @NameInMap("EventPattern")
    @Validation(required = true)
    public java.util.List<PutEventRuleRequestEventPattern> eventPattern;

    public static PutEventRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutEventRuleRequest self = new PutEventRuleRequest();
        return TeaModel.build(map, self);
    }

    public static class PutEventRuleRequestEventPattern extends TeaModel {
        @NameInMap("Product")
        public String product;

        @NameInMap("NameList")
        @Validation(required = true)
        public java.util.List<String> nameList;

        @NameInMap("StatusList")
        @Validation(required = true)
        public java.util.List<String> statusList;

        @NameInMap("LevelList")
        @Validation(required = true)
        public java.util.List<String> levelList;

        @NameInMap("EventTypeList")
        @Validation(required = true)
        public java.util.List<String> eventTypeList;

        public static PutEventRuleRequestEventPattern build(java.util.Map<String, ?> map) throws Exception {
            PutEventRuleRequestEventPattern self = new PutEventRuleRequestEventPattern();
            return TeaModel.build(map, self);
        }

    }

}
