// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimUpdateProjectResponseBody extends TeaModel {
    @NameInMap("Datas")
    public BimUpdateProjectResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BimUpdateProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BimUpdateProjectResponseBody self = new BimUpdateProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public BimUpdateProjectResponseBody setDatas(BimUpdateProjectResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public BimUpdateProjectResponseBodyDatas getDatas() {
        return this.datas;
    }

    public BimUpdateProjectResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public BimUpdateProjectResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public BimUpdateProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BimUpdateProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BimUpdateProjectResponseBodyDatas extends TeaModel {
        // 模型构件
        @NameInMap("Component")
        public java.util.List<java.util.Map<String, ?>> component;

        // 任务id(项目id)
        @NameInMap("Id")
        public Long id;

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

        public static BimUpdateProjectResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            BimUpdateProjectResponseBodyDatas self = new BimUpdateProjectResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public BimUpdateProjectResponseBodyDatas setComponent(java.util.List<java.util.Map<String, ?>> component) {
            this.component = component;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getComponent() {
            return this.component;
        }

        public BimUpdateProjectResponseBodyDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public BimUpdateProjectResponseBodyDatas setModelingStatus(Long modelingStatus) {
            this.modelingStatus = modelingStatus;
            return this;
        }
        public Long getModelingStatus() {
            return this.modelingStatus;
        }

        public BimUpdateProjectResponseBodyDatas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BimUpdateProjectResponseBodyDatas setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public BimUpdateProjectResponseBodyDatas setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public BimUpdateProjectResponseBodyDatas setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
