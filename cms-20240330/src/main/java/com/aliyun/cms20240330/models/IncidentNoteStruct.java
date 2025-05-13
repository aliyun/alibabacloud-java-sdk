// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentNoteStruct extends TeaModel {
    @NameInMap("content")
    public String content;

    @NameInMap("format")
    public String format;

    @NameInMap("incidentId")
    public String incidentId;

    @NameInMap("noteId")
    public String noteId;

    @NameInMap("operator")
    public IncidentNoteStructOperator operator;

    @NameInMap("time")
    public Long time;

    @NameInMap("type")
    public String type;

    public static IncidentNoteStruct build(java.util.Map<String, ?> map) throws Exception {
        IncidentNoteStruct self = new IncidentNoteStruct();
        return TeaModel.build(map, self);
    }

    public IncidentNoteStruct setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public IncidentNoteStruct setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public IncidentNoteStruct setIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public String getIncidentId() {
        return this.incidentId;
    }

    public IncidentNoteStruct setNoteId(String noteId) {
        this.noteId = noteId;
        return this;
    }
    public String getNoteId() {
        return this.noteId;
    }

    public IncidentNoteStruct setOperator(IncidentNoteStructOperator operator) {
        this.operator = operator;
        return this;
    }
    public IncidentNoteStructOperator getOperator() {
        return this.operator;
    }

    public IncidentNoteStruct setTime(Long time) {
        this.time = time;
        return this;
    }
    public Long getTime() {
        return this.time;
    }

    public IncidentNoteStruct setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class IncidentNoteStructOperator extends TeaModel {
        @NameInMap("contact")
        public String contact;

        @NameInMap("contactId")
        public String contactId;

        @NameInMap("name")
        public String name;

        @NameInMap("userId")
        public Long userId;

        public static IncidentNoteStructOperator build(java.util.Map<String, ?> map) throws Exception {
            IncidentNoteStructOperator self = new IncidentNoteStructOperator();
            return TeaModel.build(map, self);
        }

        public IncidentNoteStructOperator setContact(String contact) {
            this.contact = contact;
            return this;
        }
        public String getContact() {
            return this.contact;
        }

        public IncidentNoteStructOperator setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public IncidentNoteStructOperator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public IncidentNoteStructOperator setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
