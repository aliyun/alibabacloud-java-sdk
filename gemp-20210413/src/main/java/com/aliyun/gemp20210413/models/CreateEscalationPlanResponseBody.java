// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateEscalationPlanResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public CreateEscalationPlanResponseBodyData data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static CreateEscalationPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEscalationPlanResponseBody self = new CreateEscalationPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEscalationPlanResponseBody setData(CreateEscalationPlanResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEscalationPlanResponseBodyData getData() {
        return this.data;
    }

    public CreateEscalationPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateEscalationPlanResponseBodyData extends TeaModel {
        // 升级计划id
        @NameInMap("escalationPlanId")
        public Long escalationPlanId;

        public static CreateEscalationPlanResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEscalationPlanResponseBodyData self = new CreateEscalationPlanResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEscalationPlanResponseBodyData setEscalationPlanId(Long escalationPlanId) {
            this.escalationPlanId = escalationPlanId;
            return this;
        }
        public Long getEscalationPlanId() {
            return this.escalationPlanId;
        }

    }

}
