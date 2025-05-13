// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentMemberStruct extends TeaModel {
    @NameInMap("acknowledge")
    public IncidentMemberStructAcknowledge acknowledge;

    @NameInMap("contactId")
    public String contactId;

    @NameInMap("contacts")
    public java.util.List<IncidentMemberStructContacts> contacts;

    @NameInMap("escalation")
    public IncidentMemberStructEscalation escalation;

    @NameInMap("incidentId")
    public String incidentId;

    @NameInMap("incidentMemberId")
    public String incidentMemberId;

    @NameInMap("scheduleGroup")
    public IncidentMemberStructScheduleGroup scheduleGroup;

    @NameInMap("time")
    public Long time;

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
        @NameInMap("breakLevel")
        public String breakLevel;

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
        @NameInMap("channel")
        public String channel;

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
        @NameInMap("description")
        public String description;

        @NameInMap("incidentEscalationId")
        public String incidentEscalationId;

        @NameInMap("name")
        public String name;

        @NameInMap("stageIndex")
        public String stageIndex;

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
        @NameInMap("contactId")
        public String contactId;

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
