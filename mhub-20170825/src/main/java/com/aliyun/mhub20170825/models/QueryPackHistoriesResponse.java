// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryPackHistoriesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PackInfos")
    @Validation(required = true)
    public QueryPackHistoriesResponsePackInfos packInfos;

    public static QueryPackHistoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPackHistoriesResponse self = new QueryPackHistoriesResponse();
        return TeaModel.build(map, self);
    }

    public QueryPackHistoriesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPackHistoriesResponse setPackInfos(QueryPackHistoriesResponsePackInfos packInfos) {
        this.packInfos = packInfos;
        return this;
    }
    public QueryPackHistoriesResponsePackInfos getPackInfos() {
        return this.packInfos;
    }

    public static class QueryPackHistoriesResponsePackInfosPackInfo extends TeaModel {
        @NameInMap("OS")
        @Validation(required = true)
        public String OS;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("Info")
        @Validation(required = true)
        public String info;

        public static QueryPackHistoriesResponsePackInfosPackInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryPackHistoriesResponsePackInfosPackInfo self = new QueryPackHistoriesResponsePackInfosPackInfo();
            return TeaModel.build(map, self);
        }

        public QueryPackHistoriesResponsePackInfosPackInfo setOS(String OS) {
            this.OS = OS;
            return this;
        }
        public String getOS() {
            return this.OS;
        }

        public QueryPackHistoriesResponsePackInfosPackInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryPackHistoriesResponsePackInfosPackInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryPackHistoriesResponsePackInfosPackInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryPackHistoriesResponsePackInfosPackInfo setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

    }

    public static class QueryPackHistoriesResponsePackInfos extends TeaModel {
        @NameInMap("PackInfo")
        @Validation(required = true)
        public java.util.List<QueryPackHistoriesResponsePackInfosPackInfo> packInfo;

        public static QueryPackHistoriesResponsePackInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryPackHistoriesResponsePackInfos self = new QueryPackHistoriesResponsePackInfos();
            return TeaModel.build(map, self);
        }

        public QueryPackHistoriesResponsePackInfos setPackInfo(java.util.List<QueryPackHistoriesResponsePackInfosPackInfo> packInfo) {
            this.packInfo = packInfo;
            return this;
        }
        public java.util.List<QueryPackHistoriesResponsePackInfosPackInfo> getPackInfo() {
            return this.packInfo;
        }

    }

}
