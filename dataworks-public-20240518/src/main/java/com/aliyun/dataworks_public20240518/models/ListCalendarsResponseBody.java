// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCalendarsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListCalendarsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCalendarsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCalendarsResponseBody self = new ListCalendarsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCalendarsResponseBody setPagingInfo(ListCalendarsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListCalendarsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListCalendarsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCalendarsResponseBodyPagingInfoCalendarsSchedulePolicy extends TeaModel {
        /**
         * <p>The list of normal scheduling dates.</p>
         */
        @NameInMap("NormalDates")
        public java.util.List<String> normalDates;

        /**
         * <p>The list of non-scheduling dates. Tasks perform dry runs on these dates.</p>
         */
        @NameInMap("SkipDates")
        public java.util.List<String> skipDates;

        public static ListCalendarsResponseBodyPagingInfoCalendarsSchedulePolicy build(java.util.Map<String, ?> map) throws Exception {
            ListCalendarsResponseBodyPagingInfoCalendarsSchedulePolicy self = new ListCalendarsResponseBodyPagingInfoCalendarsSchedulePolicy();
            return TeaModel.build(map, self);
        }

        public ListCalendarsResponseBodyPagingInfoCalendarsSchedulePolicy setNormalDates(java.util.List<String> normalDates) {
            this.normalDates = normalDates;
            return this;
        }
        public java.util.List<String> getNormalDates() {
            return this.normalDates;
        }

        public ListCalendarsResponseBodyPagingInfoCalendarsSchedulePolicy setSkipDates(java.util.List<String> skipDates) {
            this.skipDates = skipDates;
            return this;
        }
        public java.util.List<String> getSkipDates() {
            return this.skipDates;
        }

    }

    public static class ListCalendarsResponseBodyPagingInfoCalendars extends TeaModel {
        /**
         * <p>Indicates whether the calendar is applicable to all workspaces.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllProjects")
        public Boolean allProjects;

        /**
         * <p>The description of the scheduling calendar.</p>
         * 
         * <strong>example:</strong>
         * <p>Weekday scheduling calendar</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The end date of the calendar validity period. Format: <code>yyyy-mm-dd</code>. This parameter is returned only for strongly constrained calendars.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-09</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <p>The expiration reminder. This parameter is returned only for strongly constrained calendars. Valid values:</p>
         * <ul>
         * <li>OneMonthBefore: One month in advance.</li>
         * <li>OneWeekBefore: One week in advance.</li>
         * <li>ThreeDaysBefore: Three days in advance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OneMonthBefore</p>
         */
        @NameInMap("ExpirationReminder")
        public String expirationReminder;

        /**
         * <p>The default scheduling policy for dates that are not configured. This parameter is returned only for weakly constrained calendars. Valid values:</p>
         * <ul>
         * <li>Normal: Normal scheduling.</li>
         * <li>Pause: Pause scheduling.</li>
         * <li>Skip: Dry run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("FallbackPolicy")
        public String fallbackPolicy;

        /**
         * <p>The ID of the scheduling calendar.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The time when the calendar was modified. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640000000000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The name of the scheduling calendar.</p>
         * 
         * <strong>example:</strong>
         * <p>work_calendar</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The scheduling policy after the calendar expires. This parameter is returned only for strongly constrained calendars. Valid values:</p>
         * <ul>
         * <li>Normal: Normal scheduling.</li>
         * <li>Pause: Pause scheduling.</li>
         * <li>Skip: Dry run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Skip</p>
         */
        @NameInMap("OverduePolicy")
        public String overduePolicy;

        /**
         * <p>The account ID of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The list of applicable workspace IDs. An empty array is returned if AllProjects is set to true.</p>
         */
        @NameInMap("ProjectIds")
        public java.util.List<Long> projectIds;

        /**
         * <p>The date scheduling policy.</p>
         */
        @NameInMap("SchedulePolicy")
        public ListCalendarsResponseBodyPagingInfoCalendarsSchedulePolicy schedulePolicy;

        /**
         * <p>The start date of the calendar validity period. Format: <code>yyyy-mm-dd</code>. This parameter is returned only for strongly constrained calendars.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-08</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <p>The calendar type. Valid values:</p>
         * <ul>
         * <li>StrongConstraint: Strongly constrained calendar.</li>
         * <li>WeakConstraint: Weakly constrained calendar.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>StrongConstraint</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Integer version;

        public static ListCalendarsResponseBodyPagingInfoCalendars build(java.util.Map<String, ?> map) throws Exception {
            ListCalendarsResponseBodyPagingInfoCalendars self = new ListCalendarsResponseBodyPagingInfoCalendars();
            return TeaModel.build(map, self);
        }

        public ListCalendarsResponseBodyPagingInfoCalendars setAllProjects(Boolean allProjects) {
            this.allProjects = allProjects;
            return this;
        }
        public Boolean getAllProjects() {
            return this.allProjects;
        }

        public ListCalendarsResponseBodyPagingInfoCalendars setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCalendarsResponseBodyPagingInfoCalendars setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListCalendarsResponseBodyPagingInfoCalendars setExpirationReminder(String expirationReminder) {
            this.expirationReminder = expirationReminder;
            return this;
        }
        public String getExpirationReminder() {
            return this.expirationReminder;
        }

        public ListCalendarsResponseBodyPagingInfoCalendars setFallbackPolicy(String fallbackPolicy) {
            this.fallbackPolicy = fallbackPolicy;
            return this;
        }
        public String getFallbackPolicy() {
            return this.fallbackPolicy;
        }

        public ListCalendarsResponseBodyPagingInfoCalendars setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCalendarsResponseBodyPagingInfoCalendars setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ListCalendarsResponseBodyPagingInfoCalendars setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCalendarsResponseBodyPagingInfoCalendars setOverduePolicy(String overduePolicy) {
            this.overduePolicy = overduePolicy;
            return this;
        }
        public String getOverduePolicy() {
            return this.overduePolicy;
        }

        public ListCalendarsResponseBodyPagingInfoCalendars setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListCalendarsResponseBodyPagingInfoCalendars setProjectIds(java.util.List<Long> projectIds) {
            this.projectIds = projectIds;
            return this;
        }
        public java.util.List<Long> getProjectIds() {
            return this.projectIds;
        }

        public ListCalendarsResponseBodyPagingInfoCalendars setSchedulePolicy(ListCalendarsResponseBodyPagingInfoCalendarsSchedulePolicy schedulePolicy) {
            this.schedulePolicy = schedulePolicy;
            return this;
        }
        public ListCalendarsResponseBodyPagingInfoCalendarsSchedulePolicy getSchedulePolicy() {
            return this.schedulePolicy;
        }

        public ListCalendarsResponseBodyPagingInfoCalendars setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListCalendarsResponseBodyPagingInfoCalendars setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListCalendarsResponseBodyPagingInfoCalendars setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

    public static class ListCalendarsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The list of scheduling calendars.</p>
         */
        @NameInMap("Calendars")
        public java.util.List<ListCalendarsResponseBodyPagingInfoCalendars> calendars;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of items per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCalendarsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCalendarsResponseBodyPagingInfo self = new ListCalendarsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListCalendarsResponseBodyPagingInfo setCalendars(java.util.List<ListCalendarsResponseBodyPagingInfoCalendars> calendars) {
            this.calendars = calendars;
            return this;
        }
        public java.util.List<ListCalendarsResponseBodyPagingInfoCalendars> getCalendars() {
            return this.calendars;
        }

        public ListCalendarsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCalendarsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCalendarsResponseBodyPagingInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
