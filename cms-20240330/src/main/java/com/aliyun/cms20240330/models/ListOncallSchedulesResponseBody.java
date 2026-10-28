// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListOncallSchedulesResponseBody extends TeaModel {
    /**
     * <p>The list of on-call schedules.</p>
     */
    @NameInMap("oncallSchedules")
    public java.util.List<ListOncallSchedulesResponseBodyOncallSchedules> oncallSchedules;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListOncallSchedulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOncallSchedulesResponseBody self = new ListOncallSchedulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOncallSchedulesResponseBody setOncallSchedules(java.util.List<ListOncallSchedulesResponseBodyOncallSchedules> oncallSchedules) {
        this.oncallSchedules = oncallSchedules;
        return this;
    }
    public java.util.List<ListOncallSchedulesResponseBodyOncallSchedules> getOncallSchedules() {
        return this.oncallSchedules;
    }

    public ListOncallSchedulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOncallSchedulesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListOncallSchedulesResponseBodyOncallSchedulesRotations extends TeaModel {
        /**
         * <p>The days of the week when the rotation is active.</p>
         */
        @NameInMap("activeDays")
        public java.util.List<Integer> activeDays;

        /**
         * <p>The IDs of the contacts.</p>
         */
        @NameInMap("contacts")
        public java.util.List<String> contacts;

        /**
         * <p>The end time of the rotation. Format: HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>24:00</p>
         */
        @NameInMap("rotationEndTime")
        public String rotationEndTime;

        /**
         * <p>The name of the rotation.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("rotationName")
        public String rotationName;

        /**
         * <p>The start time of the rotation. Format: HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("rotationStartTime")
        public String rotationStartTime;

        /**
         * <p>The length of the shift interval. Used in conjunction with shiftRecurrenceFrequency. For example, a value of 3 indicates that the on-call personnel rotates every 3 days.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("shiftLength")
        public Integer shiftLength;

        /**
         * <p>The unit of the shift interval. Used in conjunction with shiftLength. For example, a value of Week indicates that the on-call personnel rotates every week.</p>
         * 
         * <strong>example:</strong>
         * <p>WEEKLY</p>
         */
        @NameInMap("shiftRecurrenceFrequency")
        public String shiftRecurrenceFrequency;

        /**
         * <p>The start date of the rotation. Format: yyyy-MM-dd.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01</p>
         */
        @NameInMap("startDate")
        public String startDate;

        /**
         * <p>The name of the time zone. The IANA Time Zone Database standard is used. Example: Asia/Shanghai.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timeZone")
        public String timeZone;

        public static ListOncallSchedulesResponseBodyOncallSchedulesRotations build(java.util.Map<String, ?> map) throws Exception {
            ListOncallSchedulesResponseBodyOncallSchedulesRotations self = new ListOncallSchedulesResponseBodyOncallSchedulesRotations();
            return TeaModel.build(map, self);
        }

        public ListOncallSchedulesResponseBodyOncallSchedulesRotations setActiveDays(java.util.List<Integer> activeDays) {
            this.activeDays = activeDays;
            return this;
        }
        public java.util.List<Integer> getActiveDays() {
            return this.activeDays;
        }

        public ListOncallSchedulesResponseBodyOncallSchedulesRotations setContacts(java.util.List<String> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<String> getContacts() {
            return this.contacts;
        }

        public ListOncallSchedulesResponseBodyOncallSchedulesRotations setRotationEndTime(String rotationEndTime) {
            this.rotationEndTime = rotationEndTime;
            return this;
        }
        public String getRotationEndTime() {
            return this.rotationEndTime;
        }

        public ListOncallSchedulesResponseBodyOncallSchedulesRotations setRotationName(String rotationName) {
            this.rotationName = rotationName;
            return this;
        }
        public String getRotationName() {
            return this.rotationName;
        }

        public ListOncallSchedulesResponseBodyOncallSchedulesRotations setRotationStartTime(String rotationStartTime) {
            this.rotationStartTime = rotationStartTime;
            return this;
        }
        public String getRotationStartTime() {
            return this.rotationStartTime;
        }

        public ListOncallSchedulesResponseBodyOncallSchedulesRotations setShiftLength(Integer shiftLength) {
            this.shiftLength = shiftLength;
            return this;
        }
        public Integer getShiftLength() {
            return this.shiftLength;
        }

        public ListOncallSchedulesResponseBodyOncallSchedulesRotations setShiftRecurrenceFrequency(String shiftRecurrenceFrequency) {
            this.shiftRecurrenceFrequency = shiftRecurrenceFrequency;
            return this;
        }
        public String getShiftRecurrenceFrequency() {
            return this.shiftRecurrenceFrequency;
        }

        public ListOncallSchedulesResponseBodyOncallSchedulesRotations setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListOncallSchedulesResponseBodyOncallSchedulesRotations setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class ListOncallSchedulesResponseBodyOncallSchedulesSubstitudes extends TeaModel {
        /**
         * <p>The ID of the substitute contact.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        @NameInMap("contactId")
        public String contactId;

        /**
         * <p>The end time of the substitution. Format: YYYY-MM-DD HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-15 18:00</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>The ID of the replaced contact.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        @NameInMap("replacedContactId")
        public String replacedContactId;

        /**
         * <p>The start time of the substitution. Format: YYYY-MM-DD HH:mm.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-10 09:00</p>
         */
        @NameInMap("startTime")
        public String startTime;

        public static ListOncallSchedulesResponseBodyOncallSchedulesSubstitudes build(java.util.Map<String, ?> map) throws Exception {
            ListOncallSchedulesResponseBodyOncallSchedulesSubstitudes self = new ListOncallSchedulesResponseBodyOncallSchedulesSubstitudes();
            return TeaModel.build(map, self);
        }

        public ListOncallSchedulesResponseBodyOncallSchedulesSubstitudes setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public ListOncallSchedulesResponseBodyOncallSchedulesSubstitudes setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListOncallSchedulesResponseBodyOncallSchedulesSubstitudes setReplacedContactId(String replacedContactId) {
            this.replacedContactId = replacedContactId;
            return this;
        }
        public String getReplacedContactId() {
            return this.replacedContactId;
        }

        public ListOncallSchedulesResponseBodyOncallSchedulesSubstitudes setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ListOncallSchedulesResponseBodyOncallSchedules extends TeaModel {
        /**
         * <p>The unique identifier of the on-call schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        @NameInMap("oncallScheduleId")
        public String oncallScheduleId;

        /**
         * <p>The name of the on-call schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        @NameInMap("oncallScheduleName")
        public String oncallScheduleName;

        /**
         * <p>The list of rotations.</p>
         */
        @NameInMap("rotations")
        public java.util.List<ListOncallSchedulesResponseBodyOncallSchedulesRotations> rotations;

        /**
         * <p>The ID of the chatbot that sends shift reminders.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        @NameInMap("shiftRobotId")
        public String shiftRobotId;

        /**
         * <p>The list of substitution rules.</p>
         */
        @NameInMap("substitudes")
        public java.util.List<ListOncallSchedulesResponseBodyOncallSchedulesSubstitudes> substitudes;

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>default-cms-5884500827389836-cn-hangzhou</p>
         */
        @NameInMap("workspace")
        public String workspace;

        public static ListOncallSchedulesResponseBodyOncallSchedules build(java.util.Map<String, ?> map) throws Exception {
            ListOncallSchedulesResponseBodyOncallSchedules self = new ListOncallSchedulesResponseBodyOncallSchedules();
            return TeaModel.build(map, self);
        }

        public ListOncallSchedulesResponseBodyOncallSchedules setOncallScheduleId(String oncallScheduleId) {
            this.oncallScheduleId = oncallScheduleId;
            return this;
        }
        public String getOncallScheduleId() {
            return this.oncallScheduleId;
        }

        public ListOncallSchedulesResponseBodyOncallSchedules setOncallScheduleName(String oncallScheduleName) {
            this.oncallScheduleName = oncallScheduleName;
            return this;
        }
        public String getOncallScheduleName() {
            return this.oncallScheduleName;
        }

        public ListOncallSchedulesResponseBodyOncallSchedules setRotations(java.util.List<ListOncallSchedulesResponseBodyOncallSchedulesRotations> rotations) {
            this.rotations = rotations;
            return this;
        }
        public java.util.List<ListOncallSchedulesResponseBodyOncallSchedulesRotations> getRotations() {
            return this.rotations;
        }

        public ListOncallSchedulesResponseBodyOncallSchedules setShiftRobotId(String shiftRobotId) {
            this.shiftRobotId = shiftRobotId;
            return this;
        }
        public String getShiftRobotId() {
            return this.shiftRobotId;
        }

        public ListOncallSchedulesResponseBodyOncallSchedules setSubstitudes(java.util.List<ListOncallSchedulesResponseBodyOncallSchedulesSubstitudes> substitudes) {
            this.substitudes = substitudes;
            return this;
        }
        public java.util.List<ListOncallSchedulesResponseBodyOncallSchedulesSubstitudes> getSubstitudes() {
            return this.substitudes;
        }

        public ListOncallSchedulesResponseBodyOncallSchedules setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

    }

}
