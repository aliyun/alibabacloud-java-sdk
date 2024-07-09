// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeFCTriggerResponseBody extends TeaModel {
    /**
     * <p>The Function Compute trigger that you want to query.</p>
     */
    @NameInMap("FCTrigger")
    public DescribeFCTriggerResponseBodyFCTrigger FCTrigger;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EC046C5D-8CB4-4B6B-B7F8-B335E51EF90E</p>
     */
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
        /**
         * <p>The name of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>LogFileCreated</p>
         */
        @NameInMap("EventMetaName")
        public String eventMetaName;

        /**
         * <p>The version of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("EventMetaVersion")
        public String eventMetaVersion;

        /**
         * <p>The remarks of the Function Compute trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Notes")
        public String notes;

        /**
         * <p>The assigned Resource Access Management (RAM) role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram:: 1234567890:role/aliyuncdneventnotificationrole</p>
         */
        @NameInMap("RoleARN")
        public String roleARN;

        /**
         * <p>The resources and filters for event listening.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:cdn:*:1234567890:domain/example.com</p>
         */
        @NameInMap("SourceArn")
        public String sourceArn;

        /**
         * <p>The trigger that corresponds to the Function Compute service.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-beijing: 1234567890:services/FCTestService/functions/printEvent/triggers/testtrigger</p>
         */
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
