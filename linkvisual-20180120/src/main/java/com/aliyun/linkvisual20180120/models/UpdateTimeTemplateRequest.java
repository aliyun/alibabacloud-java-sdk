// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateTimeTemplateRequest extends TeaModel {
    @NameInMap("AllDay")
    public Integer allDay;

    @NameInMap("Name")
    public String name;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TimeSections")
    public java.util.List<UpdateTimeTemplateRequestTimeSections> timeSections;

    public static UpdateTimeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTimeTemplateRequest self = new UpdateTimeTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTimeTemplateRequest setAllDay(Integer allDay) {
        this.allDay = allDay;
        return this;
    }
    public Integer getAllDay() {
        return this.allDay;
    }

    public UpdateTimeTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTimeTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateTimeTemplateRequest setTimeSections(java.util.List<UpdateTimeTemplateRequestTimeSections> timeSections) {
        this.timeSections = timeSections;
        return this;
    }
    public java.util.List<UpdateTimeTemplateRequestTimeSections> getTimeSections() {
        return this.timeSections;
    }

    public static class UpdateTimeTemplateRequestTimeSections extends TeaModel {
        @NameInMap("Begin")
        public Integer begin;

        @NameInMap("DayOfWeek")
        public Integer dayOfWeek;

        @NameInMap("End")
        public Integer end;

        public static UpdateTimeTemplateRequestTimeSections build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimeTemplateRequestTimeSections self = new UpdateTimeTemplateRequestTimeSections();
            return TeaModel.build(map, self);
        }

        public UpdateTimeTemplateRequestTimeSections setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public UpdateTimeTemplateRequestTimeSections setDayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public Integer getDayOfWeek() {
            return this.dayOfWeek;
        }

        public UpdateTimeTemplateRequestTimeSections setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

}
