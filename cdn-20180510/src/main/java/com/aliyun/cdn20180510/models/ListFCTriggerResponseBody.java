// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ListFCTriggerResponseBody extends TeaModel {
    /**
     * <p>The information about the Function Compute trigger returned.</p>
     */
    @NameInMap("FCTriggers")
    public java.util.List<ListFCTriggerResponseBodyFCTriggers> FCTriggers;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListFCTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFCTriggerResponseBody self = new ListFCTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFCTriggerResponseBody setFCTriggers(java.util.List<ListFCTriggerResponseBodyFCTriggers> FCTriggers) {
        this.FCTriggers = FCTriggers;
        return this;
    }
    public java.util.List<ListFCTriggerResponseBodyFCTriggers> getFCTriggers() {
        return this.FCTriggers;
    }

    public ListFCTriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFCTriggerResponseBodyFCTriggers extends TeaModel {
        /**
         * <p>The name of the event for which the Function Compute trigger is set.</p>
         */
        @NameInMap("EventMetaName")
        public String eventMetaName;

        /**
         * <p>The version of the event for which the Function Compute trigger is set.</p>
         */
        @NameInMap("EventMetaVersion")
        public String eventMetaVersion;

        /**
         * <p>The remarks for the event.</p>
         */
        @NameInMap("Notes")
        public String notes;

        /**
         * <p>The Resource Access Management (RAM) role.</p>
         */
        @NameInMap("RoleARN")
        public String roleARN;

        /**
         * <p>The resources and filters for event listening.</p>
         */
        @NameInMap("SourceArn")
        public String sourceArn;

        /**
         * <p>The trigger corresponding to the Function Compute service.</p>
         */
        @NameInMap("TriggerARN")
        public String triggerARN;

        public static ListFCTriggerResponseBodyFCTriggers build(java.util.Map<String, ?> map) throws Exception {
            ListFCTriggerResponseBodyFCTriggers self = new ListFCTriggerResponseBodyFCTriggers();
            return TeaModel.build(map, self);
        }

        public ListFCTriggerResponseBodyFCTriggers setEventMetaName(String eventMetaName) {
            this.eventMetaName = eventMetaName;
            return this;
        }
        public String getEventMetaName() {
            return this.eventMetaName;
        }

        public ListFCTriggerResponseBodyFCTriggers setEventMetaVersion(String eventMetaVersion) {
            this.eventMetaVersion = eventMetaVersion;
            return this;
        }
        public String getEventMetaVersion() {
            return this.eventMetaVersion;
        }

        public ListFCTriggerResponseBodyFCTriggers setNotes(String notes) {
            this.notes = notes;
            return this;
        }
        public String getNotes() {
            return this.notes;
        }

        public ListFCTriggerResponseBodyFCTriggers setRoleARN(String roleARN) {
            this.roleARN = roleARN;
            return this;
        }
        public String getRoleARN() {
            return this.roleARN;
        }

        public ListFCTriggerResponseBodyFCTriggers setSourceArn(String sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }
        public String getSourceArn() {
            return this.sourceArn;
        }

        public ListFCTriggerResponseBodyFCTriggers setTriggerARN(String triggerARN) {
            this.triggerARN = triggerARN;
            return this;
        }
        public String getTriggerARN() {
            return this.triggerARN;
        }

    }

}
