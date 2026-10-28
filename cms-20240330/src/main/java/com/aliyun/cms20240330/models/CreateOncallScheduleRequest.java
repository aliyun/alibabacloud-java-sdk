// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateOncallScheduleRequest extends TeaModel {
    /**
     * <p>The unique identifier of the on-call schedule.</p>
     * 
     * <strong>example:</strong>
     * <p>testOncallScheduleId</p>
     */
    @NameInMap("oncallScheduleId")
    public String oncallScheduleId;

    /**
     * <p>The name of the on-call schedule.</p>
     * 
     * <strong>example:</strong>
     * <p>testOncallScheduleName</p>
     */
    @NameInMap("oncallScheduleName")
    public String oncallScheduleName;

    /**
     * <p>The list of rotations.</p>
     */
    @NameInMap("rotations")
    public java.util.List<CreateOncallScheduleRequestRotations> rotations;

    /**
     * <p>The ID of the chatbot for shift reminders.</p>
     * 
     * <strong>example:</strong>
     * <p>testRobotId</p>
     */
    @NameInMap("shiftRobotId")
    public String shiftRobotId;

    /**
     * <p>The list of substitution rules.</p>
     */
    @NameInMap("substitudes")
    public java.util.List<CreateOncallScheduleRequestSubstitudes> substitudes;

    /**
     * <p>The name of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-5884500827389836-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static CreateOncallScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOncallScheduleRequest self = new CreateOncallScheduleRequest();
        return TeaModel.build(map, self);
    }

    public CreateOncallScheduleRequest setOncallScheduleId(String oncallScheduleId) {
        this.oncallScheduleId = oncallScheduleId;
        return this;
    }
    public String getOncallScheduleId() {
        return this.oncallScheduleId;
    }

    public CreateOncallScheduleRequest setOncallScheduleName(String oncallScheduleName) {
        this.oncallScheduleName = oncallScheduleName;
        return this;
    }
    public String getOncallScheduleName() {
        return this.oncallScheduleName;
    }

    public CreateOncallScheduleRequest setRotations(java.util.List<CreateOncallScheduleRequestRotations> rotations) {
        this.rotations = rotations;
        return this;
    }
    public java.util.List<CreateOncallScheduleRequestRotations> getRotations() {
        return this.rotations;
    }

    public CreateOncallScheduleRequest setShiftRobotId(String shiftRobotId) {
        this.shiftRobotId = shiftRobotId;
        return this;
    }
    public String getShiftRobotId() {
        return this.shiftRobotId;
    }

    public CreateOncallScheduleRequest setSubstitudes(java.util.List<CreateOncallScheduleRequestSubstitudes> substitudes) {
        this.substitudes = substitudes;
        return this;
    }
    public java.util.List<CreateOncallScheduleRequestSubstitudes> getSubstitudes() {
        return this.substitudes;
    }

    public CreateOncallScheduleRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class CreateOncallScheduleRequestRotations extends TeaModel {
        /**
         * <p>The days of the week when the rotation is active.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("activeDays")
        public java.util.List<Integer> activeDays;

        /**
         * <p>The list of contacts.</p>
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
         * <p>testRotationName</p>
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
         * <p>The length of the shift interval. Use this parameter in conjunction with shiftRecurrenceFrequency. For example, set this parameter to 3 to rotate to the next on-call contact every 3 days.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("shiftLength")
        public Integer shiftLength;

        /**
         * <p>The unit of the shift interval. Use this parameter in conjunction with shiftRecurrenceFrequency. For example, set this parameter to week to rotate to the next on-call contact every week.</p>
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
         * <p>2024-08-14</p>
         */
        @NameInMap("startDate")
        public String startDate;

        /**
         * <p>The name of the time zone. The time zone must follow the <strong>IANA Time Zone Database</strong> standard, such as <code>Asia/Shanghai</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timeZone")
        public String timeZone;

        public static CreateOncallScheduleRequestRotations build(java.util.Map<String, ?> map) throws Exception {
            CreateOncallScheduleRequestRotations self = new CreateOncallScheduleRequestRotations();
            return TeaModel.build(map, self);
        }

        public CreateOncallScheduleRequestRotations setActiveDays(java.util.List<Integer> activeDays) {
            this.activeDays = activeDays;
            return this;
        }
        public java.util.List<Integer> getActiveDays() {
            return this.activeDays;
        }

        public CreateOncallScheduleRequestRotations setContacts(java.util.List<String> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<String> getContacts() {
            return this.contacts;
        }

        public CreateOncallScheduleRequestRotations setRotationEndTime(String rotationEndTime) {
            this.rotationEndTime = rotationEndTime;
            return this;
        }
        public String getRotationEndTime() {
            return this.rotationEndTime;
        }

        public CreateOncallScheduleRequestRotations setRotationName(String rotationName) {
            this.rotationName = rotationName;
            return this;
        }
        public String getRotationName() {
            return this.rotationName;
        }

        public CreateOncallScheduleRequestRotations setRotationStartTime(String rotationStartTime) {
            this.rotationStartTime = rotationStartTime;
            return this;
        }
        public String getRotationStartTime() {
            return this.rotationStartTime;
        }

        public CreateOncallScheduleRequestRotations setShiftLength(Integer shiftLength) {
            this.shiftLength = shiftLength;
            return this;
        }
        public Integer getShiftLength() {
            return this.shiftLength;
        }

        public CreateOncallScheduleRequestRotations setShiftRecurrenceFrequency(String shiftRecurrenceFrequency) {
            this.shiftRecurrenceFrequency = shiftRecurrenceFrequency;
            return this;
        }
        public String getShiftRecurrenceFrequency() {
            return this.shiftRecurrenceFrequency;
        }

        public CreateOncallScheduleRequestRotations setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public CreateOncallScheduleRequestRotations setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class CreateOncallScheduleRequestSubstitudes extends TeaModel {
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

        public static CreateOncallScheduleRequestSubstitudes build(java.util.Map<String, ?> map) throws Exception {
            CreateOncallScheduleRequestSubstitudes self = new CreateOncallScheduleRequestSubstitudes();
            return TeaModel.build(map, self);
        }

        public CreateOncallScheduleRequestSubstitudes setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public CreateOncallScheduleRequestSubstitudes setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CreateOncallScheduleRequestSubstitudes setReplacedContactId(String replacedContactId) {
            this.replacedContactId = replacedContactId;
            return this;
        }
        public String getReplacedContactId() {
            return this.replacedContactId;
        }

        public CreateOncallScheduleRequestSubstitudes setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
