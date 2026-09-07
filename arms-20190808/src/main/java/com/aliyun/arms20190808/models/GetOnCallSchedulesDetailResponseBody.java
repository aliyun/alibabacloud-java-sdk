// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetOnCallSchedulesDetailResponseBody extends TeaModel {
    /**
     * <p>The details of the on-call schedule.</p>
     */
    @NameInMap("Data")
    public GetOnCallSchedulesDetailResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>21E85B16-75A6-429A-9F65-8AAC9A54****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetOnCallSchedulesDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOnCallSchedulesDetailResponseBody self = new GetOnCallSchedulesDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOnCallSchedulesDetailResponseBody setData(GetOnCallSchedulesDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetOnCallSchedulesDetailResponseBodyData getData() {
        return this.data;
    }

    public GetOnCallSchedulesDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntriesSimpleContact extends TeaModel {
        /**
         * <p>The contact ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The contact name.</p>
         * 
         * <strong>example:</strong>
         * <p>员工1</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntriesSimpleContact build(java.util.Map<String, ?> map) throws Exception {
            GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntriesSimpleContact self = new GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntriesSimpleContact();
            return TeaModel.build(map, self);
        }

        public GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntriesSimpleContact setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntriesSimpleContact setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntries extends TeaModel {
        /**
         * <p>The end time of the on-call duty for the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-30</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>Details of the final on-call contact.</p>
         */
        @NameInMap("SimpleContact")
        public GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntriesSimpleContact simpleContact;

        /**
         * <p>The start time of the on-call duty for the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-01</p>
         */
        @NameInMap("Start")
        public String start;

        public static GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntries build(java.util.Map<String, ?> map) throws Exception {
            GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntries self = new GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntries();
            return TeaModel.build(map, self);
        }

        public GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntries setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntries setSimpleContact(GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntriesSimpleContact simpleContact) {
            this.simpleContact = simpleContact;
            return this;
        }
        public GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntriesSimpleContact getSimpleContact() {
            return this.simpleContact;
        }

        public GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntries setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntriesSimpleContact extends TeaModel {
        /**
         * <p>The contact ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The contact name.</p>
         * 
         * <strong>example:</strong>
         * <p>员工1</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntriesSimpleContact build(java.util.Map<String, ?> map) throws Exception {
            GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntriesSimpleContact self = new GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntriesSimpleContact();
            return TeaModel.build(map, self);
        }

        public GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntriesSimpleContact setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntriesSimpleContact setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntries extends TeaModel {
        /**
         * <p>The start time of the on-call duty for the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-01</p>
         */
        @NameInMap("Start")
        public String start;

        /**
         * <p>The end time of the on-call duty for the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-30</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>Details of the on-duty contact.</p>
         */
        @NameInMap("SimpleContact")
        public GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntriesSimpleContact simpleContact;

        public static GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntries build(java.util.Map<String, ?> map) throws Exception {
            GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntries self = new GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntries();
            return TeaModel.build(map, self);
        }

        public GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntries setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntries setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntries setSimpleContact(GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntriesSimpleContact simpleContact) {
            this.simpleContact = simpleContact;
            return this;
        }
        public GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntriesSimpleContact getSimpleContact() {
            return this.simpleContact;
        }

    }

    public static class GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntriesSimpleContact extends TeaModel {
        /**
         * <p>The substitute ID.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The substitute name.</p>
         * 
         * <strong>example:</strong>
         * <p>员工2</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntriesSimpleContact build(java.util.Map<String, ?> map) throws Exception {
            GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntriesSimpleContact self = new GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntriesSimpleContact();
            return TeaModel.build(map, self);
        }

        public GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntriesSimpleContact setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntriesSimpleContact setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntries extends TeaModel {
        /**
         * <p>The end time of the on-call duty for the substitute.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-30</p>
         */
        @NameInMap("End")
        public String end;

        /**
         * <p>Details of the substitute.</p>
         */
        @NameInMap("SimpleContact")
        public GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntriesSimpleContact simpleContact;

        /**
         * <p>The start time of the on-call duty for the substitute.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-01</p>
         */
        @NameInMap("Start")
        public String start;

        public static GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntries build(java.util.Map<String, ?> map) throws Exception {
            GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntries self = new GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntries();
            return TeaModel.build(map, self);
        }

        public GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntries setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntries setSimpleContact(GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntriesSimpleContact simpleContact) {
            this.simpleContact = simpleContact;
            return this;
        }
        public GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntriesSimpleContact getSimpleContact() {
            return this.simpleContact;
        }

        public GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntries setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class GetOnCallSchedulesDetailResponseBodyDataScheduleLayersRestrictions extends TeaModel {
        /**
         * <p>The end time for on-call duty each day.</p>
         * 
         * <strong>example:</strong>
         * <p>18:00</p>
         */
        @NameInMap("EndTimeOfDay")
        public String endTimeOfDay;

        /**
         * <p>The type of restriction. Valid values:</p>
         * <ul>
         * <li><p><code>daily_restriction</code>: A daily time-based restriction.</p>
         * </li>
         * <li><p><code>weekly_restriction</code>: A weekly time-based restriction.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>daily_restriction</p>
         */
        @NameInMap("RestrictionType")
        public String restrictionType;

        /**
         * <p>The start time for on-call duty each day.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00</p>
         */
        @NameInMap("StartTimeOfDay")
        public String startTimeOfDay;

        public static GetOnCallSchedulesDetailResponseBodyDataScheduleLayersRestrictions build(java.util.Map<String, ?> map) throws Exception {
            GetOnCallSchedulesDetailResponseBodyDataScheduleLayersRestrictions self = new GetOnCallSchedulesDetailResponseBodyDataScheduleLayersRestrictions();
            return TeaModel.build(map, self);
        }

        public GetOnCallSchedulesDetailResponseBodyDataScheduleLayersRestrictions setEndTimeOfDay(String endTimeOfDay) {
            this.endTimeOfDay = endTimeOfDay;
            return this;
        }
        public String getEndTimeOfDay() {
            return this.endTimeOfDay;
        }

        public GetOnCallSchedulesDetailResponseBodyDataScheduleLayersRestrictions setRestrictionType(String restrictionType) {
            this.restrictionType = restrictionType;
            return this;
        }
        public String getRestrictionType() {
            return this.restrictionType;
        }

        public GetOnCallSchedulesDetailResponseBodyDataScheduleLayersRestrictions setStartTimeOfDay(String startTimeOfDay) {
            this.startTimeOfDay = startTimeOfDay;
            return this;
        }
        public String getStartTimeOfDay() {
            return this.startTimeOfDay;
        }

    }

    public static class GetOnCallSchedulesDetailResponseBodyDataScheduleLayers extends TeaModel {
        /**
         * <p>A list of contact IDs for the schedule layer.</p>
         */
        @NameInMap("ContactIds")
        public java.util.List<Long> contactIds;

        /**
         * <p>A list of restrictions for the schedule layer.</p>
         */
        @NameInMap("Restrictions")
        public java.util.List<GetOnCallSchedulesDetailResponseBodyDataScheduleLayersRestrictions> restrictions;

        /**
         * <p>The rotation type. Valid values:</p>
         * <ul>
         * <li><p><code>DAY</code>: Rotates every day.</p>
         * </li>
         * <li><p><code>WEEK</code>: Rotates every week.</p>
         * </li>
         * <li><p><code>CUSTOM</code>: Rotates based on a custom schedule.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAY</p>
         */
        @NameInMap("RotationType")
        public String rotationType;

        /**
         * <p>The shift length for the rotation, in hours.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("ShiftLength")
        public Long shiftLength;

        /**
         * <p>The start time for the rotation.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-01</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static GetOnCallSchedulesDetailResponseBodyDataScheduleLayers build(java.util.Map<String, ?> map) throws Exception {
            GetOnCallSchedulesDetailResponseBodyDataScheduleLayers self = new GetOnCallSchedulesDetailResponseBodyDataScheduleLayers();
            return TeaModel.build(map, self);
        }

        public GetOnCallSchedulesDetailResponseBodyDataScheduleLayers setContactIds(java.util.List<Long> contactIds) {
            this.contactIds = contactIds;
            return this;
        }
        public java.util.List<Long> getContactIds() {
            return this.contactIds;
        }

        public GetOnCallSchedulesDetailResponseBodyDataScheduleLayers setRestrictions(java.util.List<GetOnCallSchedulesDetailResponseBodyDataScheduleLayersRestrictions> restrictions) {
            this.restrictions = restrictions;
            return this;
        }
        public java.util.List<GetOnCallSchedulesDetailResponseBodyDataScheduleLayersRestrictions> getRestrictions() {
            return this.restrictions;
        }

        public GetOnCallSchedulesDetailResponseBodyDataScheduleLayers setRotationType(String rotationType) {
            this.rotationType = rotationType;
            return this;
        }
        public String getRotationType() {
            return this.rotationType;
        }

        public GetOnCallSchedulesDetailResponseBodyDataScheduleLayers setShiftLength(Long shiftLength) {
            this.shiftLength = shiftLength;
            return this;
        }
        public Long getShiftLength() {
            return this.shiftLength;
        }

        public GetOnCallSchedulesDetailResponseBodyDataScheduleLayers setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class GetOnCallSchedulesDetailResponseBodyData extends TeaModel {
        /**
         * <p>The webhook URL of the DingTalk bot for rotation notifications.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=69d4e009547e11069c6513309414937b7bf0482fb9284125b5">https://oapi.dingtalk.com/robot/send?access_token=69d4e009547e11069c6513309414937b7bf0482fb9284125b5</a>******</p>
         */
        @NameInMap("AlertRobotId")
        public Long alertRobotId;

        /**
         * <p>The description of the on-call schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the on-call schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the on-call schedule.</p>
         * 
         * <strong>example:</strong>
         * <p>排班策略测试</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The final list of on-call contacts, after accounting for all rotations and substitutions.</p>
         */
        @NameInMap("RenderedFinnalEntries")
        public java.util.List<GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntries> renderedFinnalEntries;

        /**
         * <p>A list of contacts on duty within the specified time range, as defined by the schedule layers.</p>
         */
        @NameInMap("RenderedLayerEntries")
        public java.util.List<java.util.List<GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntries>> renderedLayerEntries;

        /**
         * <p>A list of substitutes scheduled within the specified time range.</p>
         */
        @NameInMap("RenderedSubstitudeEntries")
        public java.util.List<GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntries> renderedSubstitudeEntries;

        /**
         * <p>A list of schedule layers.</p>
         */
        @NameInMap("ScheduleLayers")
        public java.util.List<GetOnCallSchedulesDetailResponseBodyDataScheduleLayers> scheduleLayers;

        public static GetOnCallSchedulesDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetOnCallSchedulesDetailResponseBodyData self = new GetOnCallSchedulesDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetOnCallSchedulesDetailResponseBodyData setAlertRobotId(Long alertRobotId) {
            this.alertRobotId = alertRobotId;
            return this;
        }
        public Long getAlertRobotId() {
            return this.alertRobotId;
        }

        public GetOnCallSchedulesDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetOnCallSchedulesDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetOnCallSchedulesDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetOnCallSchedulesDetailResponseBodyData setRenderedFinnalEntries(java.util.List<GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntries> renderedFinnalEntries) {
            this.renderedFinnalEntries = renderedFinnalEntries;
            return this;
        }
        public java.util.List<GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntries> getRenderedFinnalEntries() {
            return this.renderedFinnalEntries;
        }

        public GetOnCallSchedulesDetailResponseBodyData setRenderedLayerEntries(java.util.List<java.util.List<GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntries>> renderedLayerEntries) {
            this.renderedLayerEntries = renderedLayerEntries;
            return this;
        }
        public java.util.List<java.util.List<GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntries>> getRenderedLayerEntries() {
            return this.renderedLayerEntries;
        }

        public GetOnCallSchedulesDetailResponseBodyData setRenderedSubstitudeEntries(java.util.List<GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntries> renderedSubstitudeEntries) {
            this.renderedSubstitudeEntries = renderedSubstitudeEntries;
            return this;
        }
        public java.util.List<GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntries> getRenderedSubstitudeEntries() {
            return this.renderedSubstitudeEntries;
        }

        public GetOnCallSchedulesDetailResponseBodyData setScheduleLayers(java.util.List<GetOnCallSchedulesDetailResponseBodyDataScheduleLayers> scheduleLayers) {
            this.scheduleLayers = scheduleLayers;
            return this;
        }
        public java.util.List<GetOnCallSchedulesDetailResponseBodyDataScheduleLayers> getScheduleLayers() {
            return this.scheduleLayers;
        }

    }

}
