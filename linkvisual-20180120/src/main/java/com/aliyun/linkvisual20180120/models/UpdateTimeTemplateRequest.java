// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateTimeTemplateRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Name")
    public String name;

    @NameInMap("AllDay")
    public Integer allDay;

    @NameInMap("TimeSections")
    public java.util.List<UpdateTimeTemplateRequestTimeSections> timeSections;

    public static UpdateTimeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTimeTemplateRequest self = new UpdateTimeTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTimeTemplateRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public UpdateTimeTemplateRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public UpdateTimeTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateTimeTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTimeTemplateRequest setAllDay(Integer allDay) {
        this.allDay = allDay;
        return this;
    }
    public Integer getAllDay() {
        return this.allDay;
    }

    public UpdateTimeTemplateRequest setTimeSections(java.util.List<UpdateTimeTemplateRequestTimeSections> timeSections) {
        this.timeSections = timeSections;
        return this;
    }
    public java.util.List<UpdateTimeTemplateRequestTimeSections> getTimeSections() {
        return this.timeSections;
    }

    public static class UpdateTimeTemplateRequestTimeSections extends TeaModel {
        @NameInMap("DayOfWeek")
        public Integer dayOfWeek;

        @NameInMap("Begin")
        public Integer begin;

        @NameInMap("End")
        public Integer end;

        public static UpdateTimeTemplateRequestTimeSections build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimeTemplateRequestTimeSections self = new UpdateTimeTemplateRequestTimeSections();
            return TeaModel.build(map, self);
        }

        public UpdateTimeTemplateRequestTimeSections setDayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public Integer getDayOfWeek() {
            return this.dayOfWeek;
        }

        public UpdateTimeTemplateRequestTimeSections setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
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
