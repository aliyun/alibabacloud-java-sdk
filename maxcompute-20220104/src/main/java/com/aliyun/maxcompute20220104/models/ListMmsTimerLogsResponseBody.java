// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsTimerLogsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListMmsTimerLogsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0b87b7e716665825896565060e87a4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMmsTimerLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMmsTimerLogsResponseBody self = new ListMmsTimerLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMmsTimerLogsResponseBody setData(ListMmsTimerLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMmsTimerLogsResponseBodyData getData() {
        return this.data;
    }

    public ListMmsTimerLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMmsTimerLogsResponseBodyDataObjectList extends TeaModel {
        /**
         * <p>The logged action for the migration job created by the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>start job</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>The creation time of the log entry.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-17 15:44:17</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The ID of the asynchronous task for the migration job created by the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>1003476</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>A detailed message about the action.</p>
         * 
         * <strong>example:</strong>
         * <p>start job success</p>
         */
        @NameInMap("msg")
        public String msg;

        /**
         * <p>The ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>200018</p>
         */
        @NameInMap("sourceId")
        public Long sourceId;

        /**
         * <p>The status of the migration job created by the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>DOING</p>
         */
        @NameInMap("status")
        public String status;

        public static ListMmsTimerLogsResponseBodyDataObjectList build(java.util.Map<String, ?> map) throws Exception {
            ListMmsTimerLogsResponseBodyDataObjectList self = new ListMmsTimerLogsResponseBodyDataObjectList();
            return TeaModel.build(map, self);
        }

        public ListMmsTimerLogsResponseBodyDataObjectList setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListMmsTimerLogsResponseBodyDataObjectList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMmsTimerLogsResponseBodyDataObjectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMmsTimerLogsResponseBodyDataObjectList setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ListMmsTimerLogsResponseBodyDataObjectList setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public ListMmsTimerLogsResponseBodyDataObjectList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListMmsTimerLogsResponseBodyData extends TeaModel {
        /**
         * <p>The list of logs.</p>
         */
        @NameInMap("objectList")
        public java.util.List<ListMmsTimerLogsResponseBodyDataObjectList> objectList;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ListMmsTimerLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMmsTimerLogsResponseBodyData self = new ListMmsTimerLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMmsTimerLogsResponseBodyData setObjectList(java.util.List<ListMmsTimerLogsResponseBodyDataObjectList> objectList) {
            this.objectList = objectList;
            return this;
        }
        public java.util.List<ListMmsTimerLogsResponseBodyDataObjectList> getObjectList() {
            return this.objectList;
        }

        public ListMmsTimerLogsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListMmsTimerLogsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMmsTimerLogsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
