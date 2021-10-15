// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListWorkflowTaskLogsResponseBody extends TeaModel {
    @NameInMap("data")
    public ListWorkflowTaskLogsResponseBodyData data;

    @NameInMap("code")
    public String code;

    @NameInMap("msg")
    public String msg;

    public static ListWorkflowTaskLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowTaskLogsResponseBody self = new ListWorkflowTaskLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkflowTaskLogsResponseBody setData(ListWorkflowTaskLogsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListWorkflowTaskLogsResponseBodyData getData() {
        return this.data;
    }

    public ListWorkflowTaskLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWorkflowTaskLogsResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class ListWorkflowTaskLogsResponseBodyData extends TeaModel {
        @NameInMap("total")
        public Long total;

        @NameInMap("pageNum")
        public Long pageNum;

        @NameInMap("pageSize")
        public Long pageSize;

        // 日志数据
        @NameInMap("list")
        public java.util.List<String> list;

        public static ListWorkflowTaskLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowTaskLogsResponseBodyData self = new ListWorkflowTaskLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWorkflowTaskLogsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public ListWorkflowTaskLogsResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListWorkflowTaskLogsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListWorkflowTaskLogsResponseBodyData setList(java.util.List<String> list) {
            this.list = list;
            return this;
        }
        public java.util.List<String> getList() {
            return this.list;
        }

    }

}
