// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentMemberStruct extends TeaModel {
    /**
     * <p>Acknowledgement Information Structure.</p>
     */
    @NameInMap("acknowledge")
    public IncidentMemberStructAcknowledge acknowledge;

    /**
     * <p>Contact ID.</p>
     * 
     * <strong>example:</strong>
     * <p>user-12345</p>
     */
    @NameInMap("contactId")
    public String contactId;

    /**
     * <p>Contact list.</p>
     */
    @NameInMap("contacts")
    public java.util.List<IncidentMemberStructContacts> contacts;

    /**
     * <p>Escalation phase information.</p>
     */
    @NameInMap("escalation")
    public IncidentMemberStructEscalation escalation;

    /**
     * <p>Incident ID.</p>
     * 
     * <strong>example:</strong>
     * <p>incident-001</p>
     */
    @NameInMap("incidentId")
    public String incidentId;

    /**
     * <p>Event Member ID.</p>
     * 
     * <strong>example:</strong>
     * <p>member-001</p>
     */
    @NameInMap("incidentMemberId")
    public String incidentMemberId;

    /**
     * <p>Schedule group.</p>
     */
    @NameInMap("scheduleGroup")
    public IncidentMemberStructScheduleGroup scheduleGroup;

    /**
     * <p>Time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-10-08 10:18:58</p>
     */
    @NameInMap("time")
    public Long time;

    /**
     * <p>User ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4123456</p>
     */
    @NameInMap("userId")
    public Long userId;

    public static IncidentMemberStruct build(java.util.Map<String, ?> map) throws Exception {
        IncidentMemberStruct self = new IncidentMemberStruct();
        return TeaModel.build(map, self);
    }

    public IncidentMemberStruct setAcknowledge(IncidentMemberStructAcknowledge acknowledge) {
        this.acknowledge = acknowledge;
        return this;
    }
    public IncidentMemberStructAcknowledge getAcknowledge() {
        return this.acknowledge;
    }

    public IncidentMemberStruct setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public IncidentMemberStruct setContacts(java.util.List<IncidentMemberStructContacts> contacts) {
        this.contacts = contacts;
        return this;
    }
    public java.util.List<IncidentMemberStructContacts> getContacts() {
        return this.contacts;
    }

    public IncidentMemberStruct setEscalation(IncidentMemberStructEscalation escalation) {
        this.escalation = escalation;
        return this;
    }
    public IncidentMemberStructEscalation getEscalation() {
        return this.escalation;
    }

    public IncidentMemberStruct setIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public String getIncidentId() {
        return this.incidentId;
    }

    public IncidentMemberStruct setIncidentMemberId(String incidentMemberId) {
        this.incidentMemberId = incidentMemberId;
        return this;
    }
    public String getIncidentMemberId() {
        return this.incidentMemberId;
    }

    public IncidentMemberStruct setScheduleGroup(IncidentMemberStructScheduleGroup scheduleGroup) {
        this.scheduleGroup = scheduleGroup;
        return this;
    }
    public IncidentMemberStructScheduleGroup getScheduleGroup() {
        return this.scheduleGroup;
    }

    public IncidentMemberStruct setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public IncidentMemberStruct setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public static class IncidentMemberStructAcknowledge extends TeaModel {
        /**
         * <p>Acknowledgement level.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("breakLevel")
        public String breakLevel;

        /**
         * <p>Verification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1741234567890</p>
         */
        @NameInMap("verifyTime")
        public Long verifyTime;

        public static IncidentMemberStructAcknowledge build(java.util.Map<String, ?> map) throws Exception {
            IncidentMemberStructAcknowledge self = new IncidentMemberStructAcknowledge();
            return TeaModel.build(map, self);
        }

        public IncidentMemberStructAcknowledge setBreakLevel(String breakLevel) {
            this.breakLevel = breakLevel;
            return this;
        }
        public String getBreakLevel() {
            return this.breakLevel;
        }

        public IncidentMemberStructAcknowledge setVerifyTime(Long verifyTime) {
            this.verifyTime = verifyTime;
            return this;
        }
        public Long getVerifyTime() {
            return this.verifyTime;
        }

    }

    public static class IncidentMemberStructContacts extends TeaModel {
        /**
         * <p>Channel.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        @NameInMap("channel")
        public String channel;

        /**
         * <p>Contact ID (masked).</p>
         * 
         * <strong>example:</strong>
         * <p>user-12345</p>
         */
        @NameInMap("contactMask")
        public String contactMask;

        public static IncidentMemberStructContacts build(java.util.Map<String, ?> map) throws Exception {
            IncidentMemberStructContacts self = new IncidentMemberStructContacts();
            return TeaModel.build(map, self);
        }

        public IncidentMemberStructContacts setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public IncidentMemberStructContacts setContactMask(String contactMask) {
            this.contactMask = contactMask;
            return this;
        }
        public String getContactMask() {
            return this.contactMask;
        }

    }

    public static class IncidentMemberStructEscalation extends TeaModel {
        /**
         * <p>Description.</p>
         * 
         * <strong>example:</strong>
         * <p>Notify the operations team.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Event Escalation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>escalation-001</p>
         */
        @NameInMap("incidentEscalationId")
        public String incidentEscalationId;

        /**
         * <p>Name.</p>
         * 
         * <strong>example:</strong>
         * <p>Phase one.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Escalation phase index.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("stageIndex")
        public String stageIndex;

        /**
         * <p>Title.</p>
         * 
         * <strong>example:</strong>
         * <p>Alert escalated to the operations team.</p>
         */
        @NameInMap("title")
        public String title;

        public static IncidentMemberStructEscalation build(java.util.Map<String, ?> map) throws Exception {
            IncidentMemberStructEscalation self = new IncidentMemberStructEscalation();
            return TeaModel.build(map, self);
        }

        public IncidentMemberStructEscalation setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public IncidentMemberStructEscalation setIncidentEscalationId(String incidentEscalationId) {
            this.incidentEscalationId = incidentEscalationId;
            return this;
        }
        public String getIncidentEscalationId() {
            return this.incidentEscalationId;
        }

        public IncidentMemberStructEscalation setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public IncidentMemberStructEscalation setStageIndex(String stageIndex) {
            this.stageIndex = stageIndex;
            return this;
        }
        public String getStageIndex() {
            return this.stageIndex;
        }

        public IncidentMemberStructEscalation setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class IncidentMemberStructScheduleGroup extends TeaModel {
        /**
         * <p>Contact ID.</p>
         * 
         * <strong>example:</strong>
         * <p>group-001</p>
         */
        @NameInMap("contactId")
        public String contactId;

        /**
         * <p>Name.</p>
         * 
         * <strong>example:</strong>
         * <p>Night shift duty team.</p>
         */
        @NameInMap("name")
        public String name;

        public static IncidentMemberStructScheduleGroup build(java.util.Map<String, ?> map) throws Exception {
            IncidentMemberStructScheduleGroup self = new IncidentMemberStructScheduleGroup();
            return TeaModel.build(map, self);
        }

        public IncidentMemberStructScheduleGroup setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public IncidentMemberStructScheduleGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
