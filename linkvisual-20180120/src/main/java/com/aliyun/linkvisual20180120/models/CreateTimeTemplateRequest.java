// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateTimeTemplateRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("Name")
    public String name;

    @NameInMap("AllDay")
    public Integer allDay;

    @NameInMap("TimeSections")
    public java.util.List<CreateTimeTemplateRequestTimeSections> timeSections;

    public static CreateTimeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTimeTemplateRequest self = new CreateTimeTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTimeTemplateRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public CreateTimeTemplateRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public CreateTimeTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTimeTemplateRequest setAllDay(Integer allDay) {
        this.allDay = allDay;
        return this;
    }
    public Integer getAllDay() {
        return this.allDay;
    }

    public CreateTimeTemplateRequest setTimeSections(java.util.List<CreateTimeTemplateRequestTimeSections> timeSections) {
        this.timeSections = timeSections;
        return this;
    }
    public java.util.List<CreateTimeTemplateRequestTimeSections> getTimeSections() {
        return this.timeSections;
    }

    public static class CreateTimeTemplateRequestTimeSections extends TeaModel {
        @NameInMap("DayOfWeek")
        public Integer dayOfWeek;

        @NameInMap("Begin")
        public Integer begin;

        @NameInMap("End")
        public Integer end;

        public static CreateTimeTemplateRequestTimeSections build(java.util.Map<String, ?> map) throws Exception {
            CreateTimeTemplateRequestTimeSections self = new CreateTimeTemplateRequestTimeSections();
            return TeaModel.build(map, self);
        }

        public CreateTimeTemplateRequestTimeSections setDayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public Integer getDayOfWeek() {
            return this.dayOfWeek;
        }

        public CreateTimeTemplateRequestTimeSections setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public CreateTimeTemplateRequestTimeSections setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

}
