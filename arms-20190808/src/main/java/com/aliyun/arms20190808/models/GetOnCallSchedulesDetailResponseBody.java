// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetOnCallSchedulesDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetOnCallSchedulesDetailResponseBodyData data;

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
        @NameInMap("Id")
        public Long id;

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
        @NameInMap("End")
        public String end;

        @NameInMap("SimpleContact")
        public GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntriesSimpleContact simpleContact;

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
        @NameInMap("Id")
        public Long id;

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
        @NameInMap("Start")
        public String start;

        @NameInMap("End")
        public String end;

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
        @NameInMap("Id")
        public Long id;

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
        @NameInMap("End")
        public String end;

        @NameInMap("SimpleContact")
        public GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntriesSimpleContact simpleContact;

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
        @NameInMap("EndTimeOfDay")
        public String endTimeOfDay;

        @NameInMap("RestrictionType")
        public String restrictionType;

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
        @NameInMap("ContactIds")
        public java.util.List<Long> contactIds;

        @NameInMap("Restrictions")
        public java.util.List<GetOnCallSchedulesDetailResponseBodyDataScheduleLayersRestrictions> restrictions;

        @NameInMap("RotationType")
        public String rotationType;

        @NameInMap("ShiftLength")
        public Long shiftLength;

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
        @NameInMap("AlertRobotId")
        public Long alertRobotId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("RenderedFinnalEntries")
        public java.util.List<GetOnCallSchedulesDetailResponseBodyDataRenderedFinnalEntries> renderedFinnalEntries;

        @NameInMap("RenderedLayerEntries")
        public java.util.List<java.util.List<GetOnCallSchedulesDetailResponseBodyDataRenderedLayerEntries>> renderedLayerEntries;

        @NameInMap("RenderedSubstitudeEntries")
        public java.util.List<GetOnCallSchedulesDetailResponseBodyDataRenderedSubstitudeEntries> renderedSubstitudeEntries;

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
