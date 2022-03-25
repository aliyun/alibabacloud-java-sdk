// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimProjectDetailResponseBody extends TeaModel {
    @NameInMap("Datas")
    public GetBimProjectDetailResponseBodyDatas datas;

    @NameInMap("ErrCode")
    public Long errCode;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBimProjectDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBimProjectDetailResponseBody self = new GetBimProjectDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBimProjectDetailResponseBody setDatas(GetBimProjectDetailResponseBodyDatas datas) {
        this.datas = datas;
        return this;
    }
    public GetBimProjectDetailResponseBodyDatas getDatas() {
        return this.datas;
    }

    public GetBimProjectDetailResponseBody setErrCode(Long errCode) {
        this.errCode = errCode;
        return this;
    }
    public Long getErrCode() {
        return this.errCode;
    }

    public GetBimProjectDetailResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetBimProjectDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBimProjectDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBimProjectDetailResponseBodyDatas extends TeaModel {
        // 模型构件
        @NameInMap("Component")
        public java.util.List<String> component;

        @NameInMap("CreateTime")
        public String createTime;

        // 任务id（项目id）
        @NameInMap("Id")
        public Long id;

        @NameInMap("ModelingStatus")
        public Long modelingStatus;

        // 项目名称
        @NameInMap("Name")
        public String name;

        // 阶段
        @NameInMap("Phase")
        public String phase;

        // 备注
        @NameInMap("Remarks")
        public String remarks;

        @NameInMap("Renderable")
        public Long renderable;

        @NameInMap("Status")
        public String status;

        // 租户id
        @NameInMap("TenantId")
        public Long tenantId;

        // 图纸转换状态
        @NameInMap("TransStatus")
        public Long transStatus;

        // 类型
        @NameInMap("Type")
        public String type;

        public static GetBimProjectDetailResponseBodyDatas build(java.util.Map<String, ?> map) throws Exception {
            GetBimProjectDetailResponseBodyDatas self = new GetBimProjectDetailResponseBodyDatas();
            return TeaModel.build(map, self);
        }

        public GetBimProjectDetailResponseBodyDatas setComponent(java.util.List<String> component) {
            this.component = component;
            return this;
        }
        public java.util.List<String> getComponent() {
            return this.component;
        }

        public GetBimProjectDetailResponseBodyDatas setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetBimProjectDetailResponseBodyDatas setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBimProjectDetailResponseBodyDatas setModelingStatus(Long modelingStatus) {
            this.modelingStatus = modelingStatus;
            return this;
        }
        public Long getModelingStatus() {
            return this.modelingStatus;
        }

        public GetBimProjectDetailResponseBodyDatas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBimProjectDetailResponseBodyDatas setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public GetBimProjectDetailResponseBodyDatas setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public GetBimProjectDetailResponseBodyDatas setRenderable(Long renderable) {
            this.renderable = renderable;
            return this;
        }
        public Long getRenderable() {
            return this.renderable;
        }

        public GetBimProjectDetailResponseBodyDatas setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBimProjectDetailResponseBodyDatas setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetBimProjectDetailResponseBodyDatas setTransStatus(Long transStatus) {
            this.transStatus = transStatus;
            return this;
        }
        public Long getTransStatus() {
            return this.transStatus;
        }

        public GetBimProjectDetailResponseBodyDatas setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
