// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeFCTriggerResponseBody extends TeaModel {
    // The Function Compute trigger that you want to query.
    @NameInMap("FCTrigger")
    public DescribeFCTriggerResponseBodyFCTrigger FCTrigger;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFCTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFCTriggerResponseBody self = new DescribeFCTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFCTriggerResponseBody setFCTrigger(DescribeFCTriggerResponseBodyFCTrigger FCTrigger) {
        this.FCTrigger = FCTrigger;
        return this;
    }
    public DescribeFCTriggerResponseBodyFCTrigger getFCTrigger() {
        return this.FCTrigger;
    }

    public DescribeFCTriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFCTriggerResponseBodyFCTrigger extends TeaModel {
        // The name of the event.
        @NameInMap("EventMetaName")
        public String eventMetaName;

        // The version of the event.
        @NameInMap("EventMetaVersion")
        public String eventMetaVersion;

        // The remarks.
        @NameInMap("Notes")
        public String notes;

        // The assigned Resource Access Management (RAM) role.
        @NameInMap("RoleARN")
        public String roleARN;

        // The resources and filters for event listening.
        @NameInMap("SourceArn")
        public String sourceArn;

        // The trigger that corresponds to the Function Compute service.
        @NameInMap("TriggerARN")
        public String triggerARN;

        public static DescribeFCTriggerResponseBodyFCTrigger build(java.util.Map<String, ?> map) throws Exception {
            DescribeFCTriggerResponseBodyFCTrigger self = new DescribeFCTriggerResponseBodyFCTrigger();
            return TeaModel.build(map, self);
        }

        public DescribeFCTriggerResponseBodyFCTrigger setEventMetaName(String eventMetaName) {
            this.eventMetaName = eventMetaName;
            return this;
        }
        public String getEventMetaName() {
            return this.eventMetaName;
        }

        public DescribeFCTriggerResponseBodyFCTrigger setEventMetaVersion(String eventMetaVersion) {
            this.eventMetaVersion = eventMetaVersion;
            return this;
        }
        public String getEventMetaVersion() {
            return this.eventMetaVersion;
        }

        public DescribeFCTriggerResponseBodyFCTrigger setNotes(String notes) {
            this.notes = notes;
            return this;
        }
        public String getNotes() {
            return this.notes;
        }

        public DescribeFCTriggerResponseBodyFCTrigger setRoleARN(String roleARN) {
            this.roleARN = roleARN;
            return this;
        }
        public String getRoleARN() {
            return this.roleARN;
        }

        public DescribeFCTriggerResponseBodyFCTrigger setSourceArn(String sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }
        public String getSourceArn() {
            return this.sourceArn;
        }

        public DescribeFCTriggerResponseBodyFCTrigger setTriggerARN(String triggerARN) {
            this.triggerARN = triggerARN;
            return this;
        }
        public String getTriggerARN() {
            return this.triggerARN;
        }

    }

}
