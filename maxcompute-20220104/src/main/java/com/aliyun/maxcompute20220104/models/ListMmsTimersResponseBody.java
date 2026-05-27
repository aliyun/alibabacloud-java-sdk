// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsTimersResponseBody extends TeaModel {
    @NameInMap("data")
    public ListMmsTimersResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>0b87b7e716665825896565060e87a4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMmsTimersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMmsTimersResponseBody self = new ListMmsTimersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMmsTimersResponseBody setData(ListMmsTimersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMmsTimersResponseBodyData getData() {
        return this.data;
    }

    public ListMmsTimersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMmsTimersResponseBodyDataObjectList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-12-17 09:29:58</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>196</p>
         */
        @NameInMap("dbId")
        public Long dbId;

        /**
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>migrate_db_1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        @NameInMap("scheduleType")
        public String scheduleType;

        /**
         * <strong>example:</strong>
         * <p>2000015</p>
         */
        @NameInMap("sourceId")
        public Long sourceId;

        /**
         * <strong>example:</strong>
         * <p>db_1</p>
         */
        @NameInMap("srcDbName")
        public String srcDbName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("stopped")
        public Boolean stopped;

        /**
         * <strong>example:</strong>
         * <p>TABLES</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>00:00</p>
         */
        @NameInMap("value")
        public String value;

        public static ListMmsTimersResponseBodyDataObjectList build(java.util.Map<String, ?> map) throws Exception {
            ListMmsTimersResponseBodyDataObjectList self = new ListMmsTimersResponseBodyDataObjectList();
            return TeaModel.build(map, self);
        }

        public ListMmsTimersResponseBodyDataObjectList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMmsTimersResponseBodyDataObjectList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public ListMmsTimersResponseBodyDataObjectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMmsTimersResponseBodyDataObjectList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMmsTimersResponseBodyDataObjectList setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public ListMmsTimersResponseBodyDataObjectList setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public ListMmsTimersResponseBodyDataObjectList setSrcDbName(String srcDbName) {
            this.srcDbName = srcDbName;
            return this;
        }
        public String getSrcDbName() {
            return this.srcDbName;
        }

        public ListMmsTimersResponseBodyDataObjectList setStopped(Boolean stopped) {
            this.stopped = stopped;
            return this;
        }
        public Boolean getStopped() {
            return this.stopped;
        }

        public ListMmsTimersResponseBodyDataObjectList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMmsTimersResponseBodyDataObjectList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListMmsTimersResponseBodyData extends TeaModel {
        @NameInMap("objectList")
        public java.util.List<ListMmsTimersResponseBodyDataObjectList> objectList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ListMmsTimersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMmsTimersResponseBodyData self = new ListMmsTimersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMmsTimersResponseBodyData setObjectList(java.util.List<ListMmsTimersResponseBodyDataObjectList> objectList) {
            this.objectList = objectList;
            return this;
        }
        public java.util.List<ListMmsTimersResponseBodyDataObjectList> getObjectList() {
            return this.objectList;
        }

        public ListMmsTimersResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListMmsTimersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMmsTimersResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
