// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class ListFunctionResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<ListFunctionResponseBodyDataList> dataList;

    @NameInMap("Paginator")
    public ListFunctionResponseBodyPaginator paginator;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionResponseBody self = new ListFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionResponseBody setDataList(java.util.List<ListFunctionResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListFunctionResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public ListFunctionResponseBody setPaginator(ListFunctionResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public ListFunctionResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public ListFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFunctionResponseBodyDataListSpec extends TeaModel {
        @NameInMap("InstanceConcurrency")
        public Integer instanceConcurrency;

        @NameInMap("Memory")
        public String memory;

        @NameInMap("Runtime")
        public String runtime;

        @NameInMap("Timeout")
        public String timeout;

        public static ListFunctionResponseBodyDataListSpec build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionResponseBodyDataListSpec self = new ListFunctionResponseBodyDataListSpec();
            return TeaModel.build(map, self);
        }

        public ListFunctionResponseBodyDataListSpec setInstanceConcurrency(Integer instanceConcurrency) {
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }
        public Integer getInstanceConcurrency() {
            return this.instanceConcurrency;
        }

        public ListFunctionResponseBodyDataListSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public ListFunctionResponseBodyDataListSpec setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public ListFunctionResponseBodyDataListSpec setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

    }

    public static class ListFunctionResponseBodyDataList extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("HttpTriggerPath")
        public String httpTriggerPath;

        @NameInMap("ModifiedAt")
        public String modifiedAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Spec")
        public ListFunctionResponseBodyDataListSpec spec;

        @NameInMap("TimingTriggerConfig")
        public String timingTriggerConfig;

        public static ListFunctionResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionResponseBodyDataList self = new ListFunctionResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListFunctionResponseBodyDataList setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListFunctionResponseBodyDataList setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListFunctionResponseBodyDataList setHttpTriggerPath(String httpTriggerPath) {
            this.httpTriggerPath = httpTriggerPath;
            return this;
        }
        public String getHttpTriggerPath() {
            return this.httpTriggerPath;
        }

        public ListFunctionResponseBodyDataList setModifiedAt(String modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }
        public String getModifiedAt() {
            return this.modifiedAt;
        }

        public ListFunctionResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFunctionResponseBodyDataList setSpec(ListFunctionResponseBodyDataListSpec spec) {
            this.spec = spec;
            return this;
        }
        public ListFunctionResponseBodyDataListSpec getSpec() {
            return this.spec;
        }

        public ListFunctionResponseBodyDataList setTimingTriggerConfig(String timingTriggerConfig) {
            this.timingTriggerConfig = timingTriggerConfig;
            return this;
        }
        public String getTimingTriggerConfig() {
            return this.timingTriggerConfig;
        }

    }

    public static class ListFunctionResponseBodyPaginator extends TeaModel {
        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static ListFunctionResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionResponseBodyPaginator self = new ListFunctionResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public ListFunctionResponseBodyPaginator setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public ListFunctionResponseBodyPaginator setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListFunctionResponseBodyPaginator setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFunctionResponseBodyPaginator setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
