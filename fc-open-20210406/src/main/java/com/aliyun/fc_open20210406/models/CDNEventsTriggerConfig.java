// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CDNEventsTriggerConfig extends TeaModel {
    // eventName
    @NameInMap("eventName")
    public String eventName;

    // eventVersion
    @NameInMap("eventVersion")
    public String eventVersion;

    // filter
    @NameInMap("filter")
    public java.util.Map<String, java.util.List<String>> filter;

    // notes
    @NameInMap("notes")
    public String notes;

    public static CDNEventsTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
        CDNEventsTriggerConfig self = new CDNEventsTriggerConfig();
        return TeaModel.build(map, self);
    }

    public CDNEventsTriggerConfig setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public CDNEventsTriggerConfig setEventVersion(String eventVersion) {
        this.eventVersion = eventVersion;
        return this;
    }
    public String getEventVersion() {
        return this.eventVersion;
    }

    public CDNEventsTriggerConfig setFilter(java.util.Map<String, java.util.List<String>> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.Map<String, java.util.List<String>> getFilter() {
        return this.filter;
    }

    public CDNEventsTriggerConfig setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

}
