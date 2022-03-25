// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimOriginModelResponseBody extends TeaModel {
    @NameInMap("Datas")
    public GetBimOriginModelResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static GetBimOriginModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimOriginModelResponseBody self = new GetBimOriginModelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimOriginModelResponseBody setDatas(GetBimOriginModelResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public GetBimOriginModelResponseBodyDatas getDatas() {
        return this.datas;
    }

    public GetBimOriginModelResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimOriginModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimOriginModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetBimOriginModelResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class GetBimOriginModelResponseBodyDatas extends TeaModel {
        @NameInMap("FileId")
        public Long fileId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("Path")
        public String path;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("Type")
        public String type;

        public static GetBimOriginModelResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimOriginModelResponseBodyDatas self = new GetBimOriginModelResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimOriginModelResponseBodyDatas setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetBimOriginModelResponseBodyDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBimOriginModelResponseBodyDatas setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetBimOriginModelResponseBodyDatas setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetBimOriginModelResponseBodyDatas setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetBimOriginModelResponseBodyDatas setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
