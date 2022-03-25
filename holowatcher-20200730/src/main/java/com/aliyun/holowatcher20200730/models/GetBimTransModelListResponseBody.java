// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimTransModelListResponseBody extends TeaModel {
    @NameInMap("Datas")
    public java.util.List<GetBimTransModelListResponseBodyDatas> datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimTransModelListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimTransModelListResponseBody self = new GetBimTransModelListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimTransModelListResponseBody setDatas(java.util.List<GetBimTransModelListResponseBodyDatas> datas) {
        this.datas = datas;
        return this;
    }
    public java.util.List<GetBimTransModelListResponseBodyDatas> getDatas() {
        return this.datas;
    }

    public GetBimTransModelListResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimTransModelListResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimTransModelListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimTransModelListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimTransModelListResponseBodyDatas extends TeaModel {
        // 单位（B,MB）
        @NameInMap("Commpany")
        public String commpany;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("FileId")
        public Long fileId;

        // 转换模型id
        @NameInMap("Id")
        public Long id;

        // 模型名称
        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("Path")
        public String path;

        // 大小
        @NameInMap("Size")
        public Long size;

        @NameInMap("Status")
        public Long status;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("Type")
        public String type;

        public static GetBimTransModelListResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimTransModelListResponseBodyDatas self = new GetBimTransModelListResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimTransModelListResponseBodyDatas setCommpany(String commpany) {
            this.commpany = commpany;
            return this;
        }
        public String getCommpany() {
            return this.commpany;
        }

        public GetBimTransModelListResponseBodyDatas setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetBimTransModelListResponseBodyDatas setFileId(Long fileId) {
            this.fileId = fileId;
            return this;
        }
        public Long getFileId() {
            return this.fileId;
        }

        public GetBimTransModelListResponseBodyDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBimTransModelListResponseBodyDatas setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetBimTransModelListResponseBodyDatas setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetBimTransModelListResponseBodyDatas setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetBimTransModelListResponseBodyDatas setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetBimTransModelListResponseBodyDatas setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetBimTransModelListResponseBodyDatas setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
