// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentNoteStruct extends TeaModel {
    /**
     * <p>内容。</p>
     * 
     * <strong>example:</strong>
     * <p>已联系运维团队，正在排查问题。</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>内容格式。</p>
     * 
     * <strong>example:</strong>
     * <p>markdown</p>
     */
    @NameInMap("format")
    public String format;

    /**
     * <p>事件ID。</p>
     * 
     * <strong>example:</strong>
     * <p>incident-001</p>
     */
    @NameInMap("incidentId")
    public String incidentId;

    /**
     * <p>记录ID。</p>
     * 
     * <strong>example:</strong>
     * <p>note-001</p>
     */
    @NameInMap("noteId")
    public String noteId;

    /**
     * <p>操作符。</p>
     */
    @NameInMap("operator")
    public IncidentNoteStructOperator operator;

    /**
     * <p>时间。</p>
     * 
     * <strong>example:</strong>
     * <p>1741234567890</p>
     */
    @NameInMap("time")
    public Long time;

    /**
     * <p>类型。</p>
     * 
     * <strong>example:</strong>
     * <p>apm</p>
     */
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
        /**
         * <p>联系人。</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;mobile_phone_num\&quot;:\&quot;153xxxx8040\&quot;,\&quot;mobile_country_code\&quot;:\&quot;86\&quot;,\&quot;email\&quot;:\&quot;<a href="mailto:flightxxg@dida.com">flightxxg@dida.com</a>\&quot;}</p>
         */
        @NameInMap("contact")
        public String contact;

        /**
         * <p>联系人id。</p>
         * 
         * <strong>example:</strong>
         * <p>user-12345</p>
         */
        @NameInMap("contactId")
        public String contactId;

        /**
         * <p>名称。</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>用户ID。</p>
         * 
         * <strong>example:</strong>
         * <p>4123456</p>
         */
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
