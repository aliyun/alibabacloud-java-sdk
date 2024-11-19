// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySoundCodeScheduleListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot.soundcodeservice.NotSigned</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySoundCodeScheduleListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>sound code service has not been signed</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>66FF51D3-<em><strong>-49F1-B1A2-</strong></em></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySoundCodeScheduleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySoundCodeScheduleListResponseBody self = new QuerySoundCodeScheduleListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySoundCodeScheduleListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySoundCodeScheduleListResponseBody setData(QuerySoundCodeScheduleListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySoundCodeScheduleListResponseBodyData getData() {
        return this.data;
    }

    public QuerySoundCodeScheduleListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySoundCodeScheduleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySoundCodeScheduleListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySoundCodeScheduleListResponseBodyDataListItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2022-03-28</p>
         */
        @NameInMap("EndDate")
        public String endDate;

        /**
         * <strong>example:</strong>
         * <p>23:59</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>1620634297000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>INNER</p>
         */
        @NameInMap("OpenType")
        public String openType;

        /**
         * <strong>example:</strong>
         * <p>Md3ZiTL888K9llXDy7890***********</p>
         */
        @NameInMap("ScheduleCode")
        public String scheduleCode;

        /**
         * <strong>example:</strong>
         * <p>2022-03-28</p>
         */
        @NameInMap("StartDate")
        public String startDate;

        /**
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>WORKING</p>
         */
        @NameInMap("Status")
        public String status;

        public static QuerySoundCodeScheduleListResponseBodyDataListItems build(java.util.Map<String, ?> map) throws Exception {
            QuerySoundCodeScheduleListResponseBodyDataListItems self = new QuerySoundCodeScheduleListResponseBodyDataListItems();
            return TeaModel.build(map, self);
        }

        public QuerySoundCodeScheduleListResponseBodyDataListItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QuerySoundCodeScheduleListResponseBodyDataListItems setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public QuerySoundCodeScheduleListResponseBodyDataListItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QuerySoundCodeScheduleListResponseBodyDataListItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QuerySoundCodeScheduleListResponseBodyDataListItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QuerySoundCodeScheduleListResponseBodyDataListItems setOpenType(String openType) {
            this.openType = openType;
            return this;
        }
        public String getOpenType() {
            return this.openType;
        }

        public QuerySoundCodeScheduleListResponseBodyDataListItems setScheduleCode(String scheduleCode) {
            this.scheduleCode = scheduleCode;
            return this;
        }
        public String getScheduleCode() {
            return this.scheduleCode;
        }

        public QuerySoundCodeScheduleListResponseBodyDataListItems setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public QuerySoundCodeScheduleListResponseBodyDataListItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QuerySoundCodeScheduleListResponseBodyDataListItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class QuerySoundCodeScheduleListResponseBodyDataList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<QuerySoundCodeScheduleListResponseBodyDataListItems> items;

        public static QuerySoundCodeScheduleListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySoundCodeScheduleListResponseBodyDataList self = new QuerySoundCodeScheduleListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QuerySoundCodeScheduleListResponseBodyDataList setItems(java.util.List<QuerySoundCodeScheduleListResponseBodyDataListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QuerySoundCodeScheduleListResponseBodyDataListItems> getItems() {
            return this.items;
        }

    }

    public static class QuerySoundCodeScheduleListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public QuerySoundCodeScheduleListResponseBodyDataList list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageId")
        public Integer pageId;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QuerySoundCodeScheduleListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySoundCodeScheduleListResponseBodyData self = new QuerySoundCodeScheduleListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySoundCodeScheduleListResponseBodyData setList(QuerySoundCodeScheduleListResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public QuerySoundCodeScheduleListResponseBodyDataList getList() {
            return this.list;
        }

        public QuerySoundCodeScheduleListResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public QuerySoundCodeScheduleListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuerySoundCodeScheduleListResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
