// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListCalendarsResponseBody extends TeaModel {
    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("response")
    public ListCalendarsResponseBodyResponse response;

    public static ListCalendarsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCalendarsResponseBody self = new ListCalendarsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCalendarsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCalendarsResponseBody setResponse(ListCalendarsResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public ListCalendarsResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class ListCalendarsResponseBodyResponseCalendars extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("ETag")
        public String ETag;

        @NameInMap("Id")
        public String id;

        @NameInMap("Privilege")
        public String privilege;

        @NameInMap("Summary")
        public String summary;

        @NameInMap("TimeZone")
        public String timeZone;

        @NameInMap("Type")
        public String type;

        public static ListCalendarsResponseBodyResponseCalendars build(java.util.Map<String, ?> map) throws Exception {
            ListCalendarsResponseBodyResponseCalendars self = new ListCalendarsResponseBodyResponseCalendars();
            return TeaModel.build(map, self);
        }

        public ListCalendarsResponseBodyResponseCalendars setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCalendarsResponseBodyResponseCalendars setETag(String ETag) {
            this.ETag = ETag;
            return this;
        }
        public String getETag() {
            return this.ETag;
        }

        public ListCalendarsResponseBodyResponseCalendars setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListCalendarsResponseBodyResponseCalendars setPrivilege(String privilege) {
            this.privilege = privilege;
            return this;
        }
        public String getPrivilege() {
            return this.privilege;
        }

        public ListCalendarsResponseBodyResponseCalendars setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListCalendarsResponseBodyResponseCalendars setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

        public ListCalendarsResponseBodyResponseCalendars setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListCalendarsResponseBodyResponse extends TeaModel {
        @NameInMap("Calendars")
        public java.util.List<ListCalendarsResponseBodyResponseCalendars> calendars;

        public static ListCalendarsResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            ListCalendarsResponseBodyResponse self = new ListCalendarsResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public ListCalendarsResponseBodyResponse setCalendars(java.util.List<ListCalendarsResponseBodyResponseCalendars> calendars) {
            this.calendars = calendars;
            return this;
        }
        public java.util.List<ListCalendarsResponseBodyResponseCalendars> getCalendars() {
            return this.calendars;
        }

    }

}
