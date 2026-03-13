// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CDNTriggerConfig extends TeaModel {
    /**
     * <p>The name of the trigger event. For more information, see <a href="https://help.aliyun.com/document_detail/2513636.html">CDN events</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>CdnDomainStarted</p>
     */
    @NameInMap("eventName")
    public String eventName;

    /**
     * <p>The version of the trigger event. Only the 1.0.0 event version is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("eventVersion")
    public String eventVersion;

    /**
     * <p>The details of the event filtering rules.</p>
     */
    @NameInMap("filter")
    public java.util.Map<String, java.util.List<String>> filter;

    /**
     * <p>The description of the trigger.</p>
     */
    @NameInMap("notes")
    public String notes;

    public static CDNTriggerConfig build(java.util.Map<String, ?> map) throws Exception {
        CDNTriggerConfig self = new CDNTriggerConfig();
        return TeaModel.build(map, self);
    }

    public CDNTriggerConfig setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public CDNTriggerConfig setEventVersion(String eventVersion) {
        this.eventVersion = eventVersion;
        return this;
    }
    public String getEventVersion() {
        return this.eventVersion;
    }

    public CDNTriggerConfig setFilter(java.util.Map<String, java.util.List<String>> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.Map<String, java.util.List<String>> getFilter() {
        return this.filter;
    }

    public CDNTriggerConfig setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

}
