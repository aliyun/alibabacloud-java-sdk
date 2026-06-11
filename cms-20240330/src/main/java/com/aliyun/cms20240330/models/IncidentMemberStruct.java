// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentMemberStruct extends TeaModel {
    /**
     * <p>The structure of the confirmation information.</p>
     */
    @NameInMap("acknowledge")
    public IncidentMemberStructAcknowledge acknowledge;

    /**
     * <p>The ID of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>user-12345</p>
     */
    @NameInMap("contactId")
    public String contactId;

    /**
     * <p>A list of contacts.</p>
     */
    @NameInMap("contacts")
    public java.util.List<IncidentMemberStructContacts> contacts;

    /**
     * <p>Information about the escalation stage.</p>
     */
    @NameInMap("escalation")
    public IncidentMemberStructEscalation escalation;

    /**
     * <p>The ID of the event.</p>
     * 
     * <strong>example:</strong>
     * <p>incident-001</p>
     */
    @NameInMap("incidentId")
    public String incidentId;

    /**
     * <p>The ID of the event member.</p>
     * 
     * <strong>example:</strong>
     * <p>member-001</p>
     */
    @NameInMap("incidentMemberId")
    public String incidentMemberId;

    /**
     * <p>The scheduling group.</p>
     */
    @NameInMap("scheduleGroup")
    public IncidentMemberStructScheduleGroup scheduleGroup;

    /**
     * <p>The time.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-10-08 10:18:58</p>
     */
    @NameInMap("time")
    public Long time;

    /**
     * <p>The user ID.</p>
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
         * <p>The confirmation level.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("breakLevel")
        public String breakLevel;

        /**
         * <p>The verification time.</p>
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
         * <p>The channel.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        @NameInMap("channel")
        public String channel;

        /**
         * <p>The masked ID of the contact.</p>
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
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>通知运维团队</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The ID of the event escalation.</p>
         * 
         * <strong>example:</strong>
         * <p>escalation-001</p>
         */
        @NameInMap("incidentEscalationId")
        public String incidentEscalationId;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>第一阶段</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The index of the escalation stage.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("stageIndex")
        public String stageIndex;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>告警升级至运维团队</p>
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
         * <p>The ID of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>group-001</p>
         */
        @NameInMap("contactId")
        public String contactId;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>夜间值班组</p>
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
