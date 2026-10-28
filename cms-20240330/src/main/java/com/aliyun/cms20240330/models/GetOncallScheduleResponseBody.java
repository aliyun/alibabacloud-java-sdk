// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetOncallScheduleResponseBody extends TeaModel {
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
     * <p>testOncallScheduleName</p>
     */
    @NameInMap("oncallScheduleName")
    public String oncallScheduleName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of rotations.</p>
     */
    @NameInMap("rotations")
    public java.util.List<GetOncallScheduleResponseBodyRotations> rotations;

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
    public java.util.List<GetOncallScheduleResponseBodySubstitudes> substitudes;

    /**
     * <p>The name of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-5884500827389836-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static GetOncallScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOncallScheduleResponseBody self = new GetOncallScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOncallScheduleResponseBody setOncallScheduleId(String oncallScheduleId) {
        this.oncallScheduleId = oncallScheduleId;
        return this;
    }
    public String getOncallScheduleId() {
        return this.oncallScheduleId;
    }

    public GetOncallScheduleResponseBody setOncallScheduleName(String oncallScheduleName) {
        this.oncallScheduleName = oncallScheduleName;
        return this;
    }
    public String getOncallScheduleName() {
        return this.oncallScheduleName;
    }

    public GetOncallScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOncallScheduleResponseBody setRotations(java.util.List<GetOncallScheduleResponseBodyRotations> rotations) {
        this.rotations = rotations;
        return this;
    }
    public java.util.List<GetOncallScheduleResponseBodyRotations> getRotations() {
        return this.rotations;
    }

    public GetOncallScheduleResponseBody setShiftRobotId(String shiftRobotId) {
        this.shiftRobotId = shiftRobotId;
        return this;
    }
    public String getShiftRobotId() {
        return this.shiftRobotId;
    }

    public GetOncallScheduleResponseBody setSubstitudes(java.util.List<GetOncallScheduleResponseBodySubstitudes> substitudes) {
        this.substitudes = substitudes;
        return this;
    }
    public java.util.List<GetOncallScheduleResponseBodySubstitudes> getSubstitudes() {
        return this.substitudes;
    }

    public GetOncallScheduleResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class GetOncallScheduleResponseBodyRotations extends TeaModel {
        /**
         * <p>The days of the week when the rotation is active.</p>
         */
        @NameInMap("activeDays")
        public java.util.List<Integer> activeDays;

        /**
         * <p>The contact ID.</p>
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
         * <p>The length of the shift rotation cycle. Used in combination with shiftRecurrenceFrequency. For example, set this parameter to 3 to rotate to the next on-call contact every 3 days.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("shiftLength")
        public Integer shiftLength;

        /**
         * <p>The unit of the shift rotation cycle. Used in combination with shiftRecurrenceFrequency. For example, set this parameter to Week to rotate to the next on-call contact every week.</p>
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
         * <p>2024-10-10</p>
         */
        @NameInMap("startDate")
        public String startDate;

        /**
         * <p>The time zone name based on the IANA Time Zone Database standard. Example: Asia/Shanghai.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timeZone")
        public String timeZone;

        public static GetOncallScheduleResponseBodyRotations build(java.util.Map<String, ?> map) throws Exception {
            GetOncallScheduleResponseBodyRotations self = new GetOncallScheduleResponseBodyRotations();
            return TeaModel.build(map, self);
        }

        public GetOncallScheduleResponseBodyRotations setActiveDays(java.util.List<Integer> activeDays) {
            this.activeDays = activeDays;
            return this;
        }
        public java.util.List<Integer> getActiveDays() {
            return this.activeDays;
        }

        public GetOncallScheduleResponseBodyRotations setContacts(java.util.List<String> contacts) {
            this.contacts = contacts;
            return this;
        }
        public java.util.List<String> getContacts() {
            return this.contacts;
        }

        public GetOncallScheduleResponseBodyRotations setRotationEndTime(String rotationEndTime) {
            this.rotationEndTime = rotationEndTime;
            return this;
        }
        public String getRotationEndTime() {
            return this.rotationEndTime;
        }

        public GetOncallScheduleResponseBodyRotations setRotationName(String rotationName) {
            this.rotationName = rotationName;
            return this;
        }
        public String getRotationName() {
            return this.rotationName;
        }

        public GetOncallScheduleResponseBodyRotations setRotationStartTime(String rotationStartTime) {
            this.rotationStartTime = rotationStartTime;
            return this;
        }
        public String getRotationStartTime() {
            return this.rotationStartTime;
        }

        public GetOncallScheduleResponseBodyRotations setShiftLength(Integer shiftLength) {
            this.shiftLength = shiftLength;
            return this;
        }
        public Integer getShiftLength() {
            return this.shiftLength;
        }

        public GetOncallScheduleResponseBodyRotations setShiftRecurrenceFrequency(String shiftRecurrenceFrequency) {
            this.shiftRecurrenceFrequency = shiftRecurrenceFrequency;
            return this;
        }
        public String getShiftRecurrenceFrequency() {
            return this.shiftRecurrenceFrequency;
        }

        public GetOncallScheduleResponseBodyRotations setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public GetOncallScheduleResponseBodyRotations setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class GetOncallScheduleResponseBodySubstitudes extends TeaModel {
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
         * <p>The contact ID of the replaced contact.</p>
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

        public static GetOncallScheduleResponseBodySubstitudes build(java.util.Map<String, ?> map) throws Exception {
            GetOncallScheduleResponseBodySubstitudes self = new GetOncallScheduleResponseBodySubstitudes();
            return TeaModel.build(map, self);
        }

        public GetOncallScheduleResponseBodySubstitudes setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }
        public String getContactId() {
            return this.contactId;
        }

        public GetOncallScheduleResponseBodySubstitudes setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetOncallScheduleResponseBodySubstitudes setReplacedContactId(String replacedContactId) {
            this.replacedContactId = replacedContactId;
            return this;
        }
        public String getReplacedContactId() {
            return this.replacedContactId;
        }

        public GetOncallScheduleResponseBodySubstitudes setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
