// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListEnvironmentNodesResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListEnvironmentNodesResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static ListEnvironmentNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentNodesResponseBody self = new ListEnvironmentNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentNodesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEnvironmentNodesResponseBody setData(ListEnvironmentNodesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEnvironmentNodesResponseBodyData getData() {
        return this.data;
    }

    public ListEnvironmentNodesResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class ListEnvironmentNodesResponseBodyData extends TeaModel {
        @NameInMap("list")
        public java.util.List<InstanceInfo> list;

        @NameInMap("pageNum")
        public Long pageNum;

        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("total")
        public Long total;

        public static ListEnvironmentNodesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnvironmentNodesResponseBodyData self = new ListEnvironmentNodesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnvironmentNodesResponseBodyData setList(java.util.List<InstanceInfo> list) {
            this.list = list;
            return this;
        }
        public java.util.List<InstanceInfo> getList() {
            return this.list;
        }

        public ListEnvironmentNodesResponseBodyData setPageNum(Long pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Long getPageNum() {
            return this.pageNum;
        }

        public ListEnvironmentNodesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListEnvironmentNodesResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
