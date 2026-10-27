// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ScheduleValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>testId</p>
     */
    @NameInMap("contactId")
    public String contactId;

    /**
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("contactName")
    public String contactName;

    /**
     * <strong>example:</strong>
     * <p>2024-10-01 02:00:00</p>
     */
    @NameInMap("end")
    public String end;

    /**
     * <strong>example:</strong>
     * <p>2024-10-01 22:00:00</p>
     */
    @NameInMap("start")
    public String start;

    public static ScheduleValue build(java.util.Map<String, ?> map) throws Exception {
        ScheduleValue self = new ScheduleValue();
        return TeaModel.build(map, self);
    }

    public ScheduleValue setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public ScheduleValue setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public ScheduleValue setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public ScheduleValue setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

}
