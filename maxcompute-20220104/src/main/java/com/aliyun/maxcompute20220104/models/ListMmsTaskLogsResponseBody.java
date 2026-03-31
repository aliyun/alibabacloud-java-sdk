// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsTaskLogsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListMmsTaskLogsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>A3AE5649-EF90-54BD-86D0-C632FA950988</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMmsTaskLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMmsTaskLogsResponseBody self = new ListMmsTaskLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMmsTaskLogsResponseBody setData(java.util.List<ListMmsTaskLogsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMmsTaskLogsResponseBodyData> getData() {
        return this.data;
    }

    public ListMmsTaskLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMmsTaskLogsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>create schema if not exists mms_test.default;</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>2024-12-17 15:44:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("msg")
        public String msg;

        /**
         * <strong>example:</strong>
         * <p>2000015</p>
         */
        @NameInMap("sourceId")
        public Long sourceId;

        /**
         * <strong>example:</strong>
         * <p>DATA_DOING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>4023</p>
         */
        @NameInMap("taskId")
        public Long taskId;

        public static ListMmsTaskLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMmsTaskLogsResponseBodyData self = new ListMmsTaskLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMmsTaskLogsResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListMmsTaskLogsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMmsTaskLogsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMmsTaskLogsResponseBodyData setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ListMmsTaskLogsResponseBodyData setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public ListMmsTaskLogsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMmsTaskLogsResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
