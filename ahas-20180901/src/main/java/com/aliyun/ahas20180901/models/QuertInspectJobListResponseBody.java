// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuertInspectJobListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuertInspectJobListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static QuertInspectJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuertInspectJobListResponseBody self = new QuertInspectJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QuertInspectJobListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuertInspectJobListResponseBody setData(QuertInspectJobListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuertInspectJobListResponseBodyData getData() {
        return this.data;
    }

    public QuertInspectJobListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuertInspectJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuertInspectJobListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class QuertInspectJobListResponseBodyDataResult extends TeaModel {
        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("Cron")
        public String cron;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("Id")
        public Long id;

        @NameInMap("LastExecutionTime")
        public String lastExecutionTime;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("NextExecutionTime")
        public String nextExecutionTime;

        @NameInMap("Termination")
        public String termination;

        @NameInMap("Type")
        public String type;

        public static QuertInspectJobListResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            QuertInspectJobListResponseBodyDataResult self = new QuertInspectJobListResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public QuertInspectJobListResponseBodyDataResult setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public QuertInspectJobListResponseBodyDataResult setCron(String cron) {
            this.cron = cron;
            return this;
        }
        public String getCron() {
            return this.cron;
        }

        public QuertInspectJobListResponseBodyDataResult setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public QuertInspectJobListResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QuertInspectJobListResponseBodyDataResult setLastExecutionTime(String lastExecutionTime) {
            this.lastExecutionTime = lastExecutionTime;
            return this;
        }
        public String getLastExecutionTime() {
            return this.lastExecutionTime;
        }

        public QuertInspectJobListResponseBodyDataResult setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QuertInspectJobListResponseBodyDataResult setNextExecutionTime(String nextExecutionTime) {
            this.nextExecutionTime = nextExecutionTime;
            return this;
        }
        public String getNextExecutionTime() {
            return this.nextExecutionTime;
        }

        public QuertInspectJobListResponseBodyDataResult setTermination(String termination) {
            this.termination = termination;
            return this;
        }
        public String getTermination() {
            return this.termination;
        }

        public QuertInspectJobListResponseBodyDataResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QuertInspectJobListResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<QuertInspectJobListResponseBodyDataResult> result;

        @NameInMap("TotalItem")
        public Integer totalItem;

        public static QuertInspectJobListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuertInspectJobListResponseBodyData self = new QuertInspectJobListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuertInspectJobListResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QuertInspectJobListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QuertInspectJobListResponseBodyData setResult(java.util.List<QuertInspectJobListResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QuertInspectJobListResponseBodyDataResult> getResult() {
            return this.result;
        }

        public QuertInspectJobListResponseBodyData setTotalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }
        public Integer getTotalItem() {
            return this.totalItem;
        }

    }

}
