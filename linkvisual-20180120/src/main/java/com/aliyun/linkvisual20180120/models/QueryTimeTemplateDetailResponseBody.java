// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryTimeTemplateDetailResponseBody extends TeaModel {
    /**
     * <p>The response code:</p>
     * <ul>
     * <li><strong>200</strong>: The call is successful.</li>
     * <li>Other values: error codes. For more information, see <a href="https://help.aliyun.com/document_detail/145071.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time template information returned when the call was successful.</p>
     */
    @NameInMap("Data")
    public QueryTimeTemplateDetailResponseBodyData data;

    /**
     * <p>The error message returned when the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>template owner error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>06DC77A0-4622-42DB-9EE0-25FIOHS82JK1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryTimeTemplateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTimeTemplateDetailResponseBody self = new QueryTimeTemplateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTimeTemplateDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTimeTemplateDetailResponseBody setData(QueryTimeTemplateDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTimeTemplateDetailResponseBodyData getData() {
        return this.data;
    }

    public QueryTimeTemplateDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryTimeTemplateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTimeTemplateDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryTimeTemplateDetailResponseBodyDataTimeSectionList extends TeaModel {
        /**
         * <p>The start time of each day, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("Begin")
        public Integer begin;

        /**
         * <p>The day of the week. Valid values: 0 to 6, where 0 indicates Sunday and 6 indicates Saturday.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DayOfWeek")
        public Integer dayOfWeek;

        /**
         * <p>The end time of each day, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60000</p>
         */
        @NameInMap("End")
        public Integer end;

        public static QueryTimeTemplateDetailResponseBodyDataTimeSectionList build(java.util.Map<String, ?> map) throws Exception {
            QueryTimeTemplateDetailResponseBodyDataTimeSectionList self = new QueryTimeTemplateDetailResponseBodyDataTimeSectionList();
            return TeaModel.build(map, self);
        }

        public QueryTimeTemplateDetailResponseBodyDataTimeSectionList setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public QueryTimeTemplateDetailResponseBodyDataTimeSectionList setDayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public Integer getDayOfWeek() {
            return this.dayOfWeek;
        }

        public QueryTimeTemplateDetailResponseBodyDataTimeSectionList setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class QueryTimeTemplateDetailResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether 24/7 recording is enabled:</p>
         * <ul>
         * <li><strong>1</strong>: Yes.</li>
         * <li><strong>0</strong>: No. For detailed configuration, see the <strong>TimeSectionList</strong> parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AllDay")
        public Integer allDay;

        /**
         * <p>Indicates whether the template is the default template:</p>
         * <ul>
         * <li><strong>1</strong>: Default template.</li>
         * <li><strong>0</strong>: Custom template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Default")
        public Integer _default;

        /**
         * <p>The name of the time template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the time template.</p>
         * 
         * <strong>example:</strong>
         * <p>36f06322442e4e3f85a5ae8862c9****</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The list of time sections in the time template.</p>
         */
        @NameInMap("TimeSectionList")
        public java.util.List<QueryTimeTemplateDetailResponseBodyDataTimeSectionList> timeSectionList;

        public static QueryTimeTemplateDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTimeTemplateDetailResponseBodyData self = new QueryTimeTemplateDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTimeTemplateDetailResponseBodyData setAllDay(Integer allDay) {
            this.allDay = allDay;
            return this;
        }
        public Integer getAllDay() {
            return this.allDay;
        }

        public QueryTimeTemplateDetailResponseBodyData set_default(Integer _default) {
            this._default = _default;
            return this;
        }
        public Integer get_default() {
            return this._default;
        }

        public QueryTimeTemplateDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTimeTemplateDetailResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryTimeTemplateDetailResponseBodyData setTimeSectionList(java.util.List<QueryTimeTemplateDetailResponseBodyDataTimeSectionList> timeSectionList) {
            this.timeSectionList = timeSectionList;
            return this;
        }
        public java.util.List<QueryTimeTemplateDetailResponseBodyDataTimeSectionList> getTimeSectionList() {
            return this.timeSectionList;
        }

    }

}
