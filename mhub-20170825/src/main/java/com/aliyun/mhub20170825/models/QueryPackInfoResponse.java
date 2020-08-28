// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class QueryPackInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PackInfo")
    @Validation(required = true)
    public QueryPackInfoResponsePackInfo packInfo;

    public static QueryPackInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPackInfoResponse self = new QueryPackInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryPackInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPackInfoResponse setPackInfo(QueryPackInfoResponsePackInfo packInfo) {
        this.packInfo = packInfo;
        return this;
    }
    public QueryPackInfoResponsePackInfo getPackInfo() {
        return this.packInfo;
    }

    public static class QueryPackInfoResponsePackInfo extends TeaModel {
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

        public static QueryPackInfoResponsePackInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryPackInfoResponsePackInfo self = new QueryPackInfoResponsePackInfo();
            return TeaModel.build(map, self);
        }

        public QueryPackInfoResponsePackInfo setOS(String OS) {
            this.OS = OS;
            return this;
        }
        public String getOS() {
            return this.OS;
        }

        public QueryPackInfoResponsePackInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryPackInfoResponsePackInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryPackInfoResponsePackInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryPackInfoResponsePackInfo setInfo(String info) {
            this.info = info;
            return this;
        }
        public String getInfo() {
            return this.info;
        }

    }

}
