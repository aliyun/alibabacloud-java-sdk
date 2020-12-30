// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeFCTriggerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FCTrigger")
    public DescribeFCTriggerResponseBodyFCTrigger FCTrigger;

    public static DescribeFCTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFCTriggerResponseBody self = new DescribeFCTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFCTriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFCTriggerResponseBody setFCTrigger(DescribeFCTriggerResponseBodyFCTrigger FCTrigger) {
        this.FCTrigger = FCTrigger;
        return this;
    }
    public DescribeFCTriggerResponseBodyFCTrigger getFCTrigger() {
        return this.FCTrigger;
    }

    public static class DescribeFCTriggerResponseBodyFCTrigger extends TeaModel {
        @NameInMap("TriggerARN")
        public String triggerARN;

        @NameInMap("RoleARN")
        public String roleARN;

        @NameInMap("SourceArn")
        public String sourceArn;

        @NameInMap("Notes")
        public String notes;

        @NameInMap("EventMetaName")
        public String eventMetaName;

        @NameInMap("EventMetaVersion")
        public String eventMetaVersion;

        public static DescribeFCTriggerResponseBodyFCTrigger build(java.util.Map<String, ?> map) throws Exception {
            DescribeFCTriggerResponseBodyFCTrigger self = new DescribeFCTriggerResponseBodyFCTrigger();
            return TeaModel.build(map, self);
        }

        public DescribeFCTriggerResponseBodyFCTrigger setTriggerARN(String triggerARN) {
            this.triggerARN = triggerARN;
            return this;
        }
        public String getTriggerARN() {
            return this.triggerARN;
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

        public DescribeFCTriggerResponseBodyFCTrigger setNotes(String notes) {
            this.notes = notes;
            return this;
        }
        public String getNotes() {
            return this.notes;
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

    }

}
