// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class RespondEventRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>primary</p>
     */
    @NameInMap("CalendarId")
    public String calendarId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RHN2REJFc2w4VHNiUUlvcVB0ejFydz09</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>accepted</p>
     */
    @NameInMap("ResponseStatus")
    public String responseStatus;

    @NameInMap("TenantContext")
    public RespondEventRequestTenantContext tenantContext;

    public static RespondEventRequest build(java.util.Map<String, ?> map) throws Exception {
        RespondEventRequest self = new RespondEventRequest();
        return TeaModel.build(map, self);
    }

    public RespondEventRequest setCalendarId(String calendarId) {
        this.calendarId = calendarId;
        return this;
    }
    public String getCalendarId() {
        return this.calendarId;
    }

    public RespondEventRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public RespondEventRequest setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
        return this;
    }
    public String getResponseStatus() {
        return this.responseStatus;
    }

    public RespondEventRequest setTenantContext(RespondEventRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public RespondEventRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class RespondEventRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static RespondEventRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            RespondEventRequestTenantContext self = new RespondEventRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public RespondEventRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
