// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CreateBimProjectResponseBody extends TeaModel {
    @NameInMap("Datas")
    public CreateBimProjectResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateBimProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBimProjectResponseBody self = new CreateBimProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBimProjectResponseBody setDatas(CreateBimProjectResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public CreateBimProjectResponseBodyDatas getDatas() {
        return this.datas;
    }

    public CreateBimProjectResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public CreateBimProjectResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public CreateBimProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBimProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateBimProjectResponseBodyDatas extends TeaModel {
        // 模型构件
        @NameInMap("Component")
        public java.util.List<java.util.Map<String, ?>> component;

        // 任务id(项目id)
        @NameInMap("Id")
        public java.util.Map<String, ?> id;

        @NameInMap("ModelingStatus")
        public Long modelingStatus;

        @NameInMap("Name")
        public String name;

        // 阶段
        @NameInMap("Phase")
        public String phase;

        @NameInMap("Remarks")
        public String remarks;

        @NameInMap("Type")
        public String type;

        public static CreateBimProjectResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            CreateBimProjectResponseBodyDatas self = new CreateBimProjectResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public CreateBimProjectResponseBodyDatas setComponent(java.util.List<java.util.Map<String, ?>> component) {
            this.component = component;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getComponent() {
            return this.component;
        }

        public CreateBimProjectResponseBodyDatas setId(java.util.Map<String, ?> id) {
            this.id = id;
            return this;
        }
        public java.util.Map<String, ?> getId() {
            return this.id;
        }

        public CreateBimProjectResponseBodyDatas setModelingStatus(Long modelingStatus) {
            this.modelingStatus = modelingStatus;
            return this;
        }
        public Long getModelingStatus() {
            return this.modelingStatus;
        }

        public CreateBimProjectResponseBodyDatas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateBimProjectResponseBodyDatas setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public CreateBimProjectResponseBodyDatas setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public CreateBimProjectResponseBodyDatas setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
