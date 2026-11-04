// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateTimeTemplateRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable 24/7 recording. Valid values:</p>
     * <ul>
     * <li>1: Yes.</li>
     * <li>0: No. You must configure the TimeSections.N.DayOfWeek, TimeSections.N.Begin, and TimeSections.N.End parameters.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AllDay")
    public Integer allDay;

    /**
     * <p>The name of the time template.</p>
     * <p>The name must be fewer than 48 characters in length and can contain letters, digits, and the following special characters: hyphens (-), underscores (_), at signs (@), periods (.), and colons (:).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The list of time ranges.</p>
     */
    @NameInMap("TimeSections")
    public java.util.List<CreateTimeTemplateRequestTimeSections> timeSections;

    public static CreateTimeTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTimeTemplateRequest self = new CreateTimeTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateTimeTemplateRequest setAllDay(Integer allDay) {
        this.allDay = allDay;
        return this;
    }
    public Integer getAllDay() {
        return this.allDay;
    }

    public CreateTimeTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTimeTemplateRequest setTimeSections(java.util.List<CreateTimeTemplateRequestTimeSections> timeSections) {
        this.timeSections = timeSections;
        return this;
    }
    public java.util.List<CreateTimeTemplateRequestTimeSections> getTimeSections() {
        return this.timeSections;
    }

    public static class CreateTimeTemplateRequestTimeSections extends TeaModel {
        /**
         * <p>The start time of each day. Valid values: 0 to 86399. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("Begin")
        public Integer begin;

        /**
         * <p>The day of the week. Valid values: 0 to 6, which represent Sunday through Saturday.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DayOfWeek")
        public Integer dayOfWeek;

        /**
         * <p>The end time of each day. Valid values: 1 to 86399. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60000</p>
         */
        @NameInMap("End")
        public Integer end;

        public static CreateTimeTemplateRequestTimeSections build(java.util.Map<String, ?> map) throws Exception {
            CreateTimeTemplateRequestTimeSections self = new CreateTimeTemplateRequestTimeSections();
            return TeaModel.build(map, self);
        }

        public CreateTimeTemplateRequestTimeSections setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public CreateTimeTemplateRequestTimeSections setDayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public Integer getDayOfWeek() {
            return this.dayOfWeek;
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
