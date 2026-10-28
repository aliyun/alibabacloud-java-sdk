// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateOncallScheduleRequest extends TeaModel {
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
    public java.util.List<UpdateOncallScheduleRequestRotations> rotations;

    /**
     * <p>The ID of the shift reminder chatbot.</p>
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
    public java.util.List<UpdateOncallScheduleRequestSubstitudes> substitudes;

    public static UpdateOncallScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOncallScheduleRequest self = new UpdateOncallScheduleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOncallScheduleRequest setOncallScheduleName(String oncallScheduleName) {
        this.oncallScheduleName = oncallScheduleName;
        return this;
    }
    public String getOncallScheduleName() {
        return this.oncallScheduleName;
    }

    public UpdateOncallScheduleRequest setRotations(java.util.List<UpdateOncallScheduleRequestRotations> rotations) {
        this.rotations = rotations;
        return this;
    }
    public java.util.List<UpdateOncallScheduleRequestRotations> getRotations() {
        return this.rotations;
    }

    public UpdateOncallScheduleRequest setShiftRobotId(String shiftRobotId) {
        this.shiftRobotId = shiftRobotId;
        return this;
    }
    public String getShiftRobotId() {
        return this.shiftRobotId;
    }

    public UpdateOncallScheduleRequest setSubstitudes(java.util.List<UpdateOncallScheduleRequestSubstitudes> substitudes) {
        this.substitudes = substitudes;
        return this;
    }
    public java.util.List<UpdateOncallScheduleRequestSubstitudes> getSubstitudes() {
        return this.substitudes;
    }

    public static class UpdateOncallScheduleRequestRotations extends TeaModel {
        /**
         * <p>The days of the week when the rotation takes effect.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("activeDays")
        public java.util.List<Integer> activeDays;

        /**
         * <p>The IDs of the contacts.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("contacts")
        public java.util.List<String> contacts;

        /**
         * <p>The end time of the rotation. Format: HH:mm.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>24:00</p>
         */
        @NameInMap("rotationEndTime")
        public String rotationEndTime;

        /**
         * <p>The name of the rotation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("rotationName")
        public String rotationName;

        /**
         * <p>The start time of the rotation. Format: HH:mm.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("rotationStartTime")
        public String rotationStartTime;

        /**
         * <p>The length of the shift cycle. Used in conjunction with shiftRecurrenceFrequency, such as switching to the next on-call person every 3 days.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("shiftLength")
        public Integer shiftLength;

        /**
         * <p>The unit of the shift cycle. Used in conjunction with shiftRecurrenceFrequency, such as switching to the next on-call person every week.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WEEKLY</p>
         */
        @NameInMap("shiftRecurrenceFrequency")
        public String shiftRecurrenceFrequency;

        /**
         * <p>The start date of the rotation. Format: yyyy-MM-dd.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-04</p>
         */
        @NameInMap("startDate")
        public String startDate;

        /**
         * <p>The time zone name. Uses the IANA Time Zone Database standard, such as Asia/Shanghai.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timeZone")
        public String timeZone;

        public static UpdateOncallScheduleRequestRotations build(java.util.Map<String, ?> map) throws Exception {
            UpdateOncallScheduleRequestRotations self = new UpdateOncallScheduleRequestRotations();
            return TeaModel.build(map, self);
        }

        public UpdateOncallScheduleRequestRotations setActiveDays(java.util.List<Integer> activeDays) {
            this.activeDays = activeDays;
            return this;
        }
        public java.util.List<Integer> getActiveDays() {
            return this.activeDays;
        }

        public UpdateOncallScheduleRequestRotations setContacts(java.util.List<String> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<String> getContacts() {
            return this.contacts;
        }

        public UpdateOncallScheduleRequestRotations setRotationEndTime(String rotationEndTime) {
            this.rotationEndTime = rotationEndTime;
            return this;
        }
        public String getRotationEndTime() {
            return this.rotationEndTime;
        }

        public UpdateOncallScheduleRequestRotations setRotationName(String rotationName) {
            this.rotationName = rotationName;
            return this;
        }
        public String getRotationName() {
            return this.rotationName;
        }

        public UpdateOncallScheduleRequestRotations setRotationStartTime(String rotationStartTime) {
            this.rotationStartTime = rotationStartTime;
            return this;
        }
        public String getRotationStartTime() {
            return this.rotationStartTime;
        }

        public UpdateOncallScheduleRequestRotations setShiftLength(Integer shiftLength) {
            this.shiftLength = shiftLength;
            return this;
        }
        public Integer getShiftLength() {
            return this.shiftLength;
        }

        public UpdateOncallScheduleRequestRotations setShiftRecurrenceFrequency(String shiftRecurrenceFrequency) {
            this.shiftRecurrenceFrequency = shiftRecurrenceFrequency;
            return this;
        }
        public String getShiftRecurrenceFrequency() {
            return this.shiftRecurrenceFrequency;
        }

        public UpdateOncallScheduleRequestRotations setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public UpdateOncallScheduleRequestRotations setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class UpdateOncallScheduleRequestSubstitudes extends TeaModel {
        /**
         * <p>The contact ID of the substitute.</p>
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
         * <p>The contact ID of the replaced person.</p>
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

        public static UpdateOncallScheduleRequestSubstitudes build(java.util.Map<String, ?> map) throws Exception {
            UpdateOncallScheduleRequestSubstitudes self = new UpdateOncallScheduleRequestSubstitudes();
            return TeaModel.build(map, self);
        }

        public UpdateOncallScheduleRequestSubstitudes setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public UpdateOncallScheduleRequestSubstitudes setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public UpdateOncallScheduleRequestSubstitudes setReplacedContactId(String replacedContactId) {
            this.replacedContactId = replacedContactId;
            return this;
        }
        public String getReplacedContactId() {
            return this.replacedContactId;
        }

        public UpdateOncallScheduleRequestSubstitudes setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
