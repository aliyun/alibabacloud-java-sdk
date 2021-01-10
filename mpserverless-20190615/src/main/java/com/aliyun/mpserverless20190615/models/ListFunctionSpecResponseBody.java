// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListFunctionSpecResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuntimeList")
    public java.util.List<ListFunctionSpecResponseBodyRuntimeList> runtimeList;

    @NameInMap("MemoryList")
    public java.util.List<ListFunctionSpecResponseBodyMemoryList> memoryList;

    public static ListFunctionSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionSpecResponseBody self = new ListFunctionSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFunctionSpecResponseBody setRuntimeList(java.util.List<ListFunctionSpecResponseBodyRuntimeList> runtimeList) {
        this.runtimeList = runtimeList;
        return this;
    }
    public java.util.List<ListFunctionSpecResponseBodyRuntimeList> getRuntimeList() {
        return this.runtimeList;
    }

    public ListFunctionSpecResponseBody setMemoryList(java.util.List<ListFunctionSpecResponseBodyMemoryList> memoryList) {
        this.memoryList = memoryList;
        return this;
    }
    public java.util.List<ListFunctionSpecResponseBodyMemoryList> getMemoryList() {
        return this.memoryList;
    }

    public static class ListFunctionSpecResponseBodyRuntimeList extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static ListFunctionSpecResponseBodyRuntimeList build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionSpecResponseBodyRuntimeList self = new ListFunctionSpecResponseBodyRuntimeList();
            return TeaModel.build(map, self);
        }

        public ListFunctionSpecResponseBodyRuntimeList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListFunctionSpecResponseBodyMemoryList extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static ListFunctionSpecResponseBodyMemoryList build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionSpecResponseBodyMemoryList self = new ListFunctionSpecResponseBodyMemoryList();
            return TeaModel.build(map, self);
        }

        public ListFunctionSpecResponseBodyMemoryList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
