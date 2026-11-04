// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateTimeTemplateRequest extends TeaModel {
    /**
     * <p>Specifies whether 24/7 recording is enabled.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>1: yes.</li>
     * <li>0: no. For detailed configurations, see the TimeSections.N.DayOfWeek, TimeSections.N.Begin, and TimeSections.N.End parameters.</li>
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
     * <p>The name must be less than 48 characters in length and can contain letters, digits, and the following special characters: hyphens (-), underscores (_), at signs (@), periods (.), and colons (:).</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the time template. You can call the <a href="https://help.aliyun.com/document_detail/107890.html">QueryTimeTemplate</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fc82774fa749485bad7d719f9670****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The list of time sections.</p>
     */
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
        /**
         * <p>The start time of the day. Valid values: 0 to 86399. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("Begin")
        public Integer begin;

        /**
         * <p>The day of the week. Valid values: 0 to 6, which indicate Sunday to Saturday.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DayOfWeek")
        public Integer dayOfWeek;

        /**
         * <p>The end time of the day. Valid values: 1 to 86399. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60000</p>
         */
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
