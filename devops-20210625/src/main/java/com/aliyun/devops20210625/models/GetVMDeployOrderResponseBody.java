// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetVMDeployOrderResponseBody extends TeaModel {
    // 部署单
    @NameInMap("deployOrder")
    public GetVMDeployOrderResponseBodyDeployOrder deployOrder;

    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // true 接口调用成功，false 接口调用失败
    @NameInMap("success")
    public Boolean success;

    public static GetVMDeployOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVMDeployOrderResponseBody self = new GetVMDeployOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVMDeployOrderResponseBody setDeployOrder(GetVMDeployOrderResponseBodyDeployOrder deployOrder) {
        this.deployOrder = deployOrder;
        return this;
    }
    public GetVMDeployOrderResponseBodyDeployOrder getDeployOrder() {
        return this.deployOrder;
    }

    public GetVMDeployOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetVMDeployOrderResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetVMDeployOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVMDeployOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetVMDeployOrderResponseBodyDeployOrderActions extends TeaModel {
        // 是否可用
        @NameInMap("disable")
        public Boolean disable;

        // 参数
        @NameInMap("params")
        public java.util.Map<String, ?> params;

        // Action
        @NameInMap("type")
        public String type;

        public static GetVMDeployOrderResponseBodyDeployOrderActions build(java.util.Map<String, ?> map) throws Exception {
            GetVMDeployOrderResponseBodyDeployOrderActions self = new GetVMDeployOrderResponseBodyDeployOrderActions();
            return TeaModel.build(map, self);
        }

        public GetVMDeployOrderResponseBodyDeployOrderActions setDisable(Boolean disable) {
            this.disable = disable;
            return this;
        }
        public Boolean getDisable() {
            return this.disable;
        }

        public GetVMDeployOrderResponseBodyDeployOrderActions setParams(java.util.Map<String, ?> params) {
            this.params = params;
            return this;
        }
        public java.util.Map<String, ?> getParams() {
            return this.params;
        }

        public GetVMDeployOrderResponseBodyDeployOrderActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachinesActions extends TeaModel {
        // 是否可用
        @NameInMap("disable")
        public Boolean disable;

        // 参数
        @NameInMap("params")
        public java.util.Map<String, ?> params;

        // Action
        @NameInMap("type")
        public String type;

        public static GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachinesActions build(java.util.Map<String, ?> map) throws Exception {
            GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachinesActions self = new GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachinesActions();
            return TeaModel.build(map, self);
        }

        public GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachinesActions setDisable(Boolean disable) {
            this.disable = disable;
            return this;
        }
        public Boolean getDisable() {
            return this.disable;
        }

        public GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachinesActions setParams(java.util.Map<String, ?> params) {
            this.params = params;
            return this;
        }
        public java.util.Map<String, ?> getParams() {
            return this.params;
        }

        public GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachinesActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachines extends TeaModel {
        // 后续action
        @NameInMap("actions")
        public java.util.List<GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachinesActions> actions;

        // 部署批次
        @NameInMap("batchNum")
        public Integer batchNum;

        // 机器状态
        @NameInMap("clientStatus")
        public String clientStatus;

        // 开始时间
        @NameInMap("createTime")
        public Long createTime;

        // 机器IP
        @NameInMap("ip")
        public String ip;

        // 机器sn
        @NameInMap("machineSn")
        public String machineSn;

        // 部署状态
        @NameInMap("status")
        public String status;

        // 修改时间
        @NameInMap("updateTime")
        public Long updateTime;

        public static GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachines build(java.util.Map<String, ?> map) throws Exception {
            GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachines self = new GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachines();
            return TeaModel.build(map, self);
        }

        public GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachines setActions(java.util.List<GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachinesActions> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachinesActions> getActions() {
            return this.actions;
        }

        public GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachines setBatchNum(Integer batchNum) {
            this.batchNum = batchNum;
            return this;
        }
        public Integer getBatchNum() {
            return this.batchNum;
        }

        public GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachines setClientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }
        public String getClientStatus() {
            return this.clientStatus;
        }

        public GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachines setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachines setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachines setMachineSn(String machineSn) {
            this.machineSn = machineSn;
            return this;
        }
        public String getMachineSn() {
            return this.machineSn;
        }

        public GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachines setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachines setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfo extends TeaModel {
        // 发布批次
        @NameInMap("batchNum")
        public Integer batchNum;

        // 部署机器列表
        @NameInMap("deployMachines")
        public java.util.List<GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachines> deployMachines;

        // 主机组ID
        @NameInMap("hostGroupId")
        public Long hostGroupId;

        public static GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfo self = new GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfo();
            return TeaModel.build(map, self);
        }

        public GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfo setBatchNum(Integer batchNum) {
            this.batchNum = batchNum;
            return this;
        }
        public Integer getBatchNum() {
            return this.batchNum;
        }

        public GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfo setDeployMachines(java.util.List<GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachines> deployMachines) {
            this.deployMachines = deployMachines;
            return this;
        }
        public java.util.List<GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachines> getDeployMachines() {
            return this.deployMachines;
        }

        public GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfo setHostGroupId(Long hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public Long getHostGroupId() {
            return this.hostGroupId;
        }

    }

    public static class GetVMDeployOrderResponseBodyDeployOrder extends TeaModel {
        // 后续action
        @NameInMap("actions")
        public java.util.List<GetVMDeployOrderResponseBodyDeployOrderActions> actions;

        // 创建时时间
        @NameInMap("createTime")
        public Long createTime;

        // 创建人
        @NameInMap("creator")
        public String creator;

        // 当前发布批次
        @NameInMap("currentBatch")
        public Integer currentBatch;

        // 部署机器信息
        @NameInMap("deployMachineInfo")
        public GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfo deployMachineInfo;

        // 部署单ID
        @NameInMap("deployOrderId")
        public String deployOrderId;

        // 错误码
        @NameInMap("exceptionCode")
        public String exceptionCode;

        // 发布状态
        @NameInMap("status")
        public String status;

        // 总发布批次
        @NameInMap("totalBatch")
        public Integer totalBatch;

        // 修改时间
        @NameInMap("updateTime")
        public Long updateTime;

        public static GetVMDeployOrderResponseBodyDeployOrder build(java.util.Map<String, ?> map) throws Exception {
            GetVMDeployOrderResponseBodyDeployOrder self = new GetVMDeployOrderResponseBodyDeployOrder();
            return TeaModel.build(map, self);
        }

        public GetVMDeployOrderResponseBodyDeployOrder setActions(java.util.List<GetVMDeployOrderResponseBodyDeployOrderActions> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<GetVMDeployOrderResponseBodyDeployOrderActions> getActions() {
            return this.actions;
        }

        public GetVMDeployOrderResponseBodyDeployOrder setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetVMDeployOrderResponseBodyDeployOrder setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetVMDeployOrderResponseBodyDeployOrder setCurrentBatch(Integer currentBatch) {
            this.currentBatch = currentBatch;
            return this;
        }
        public Integer getCurrentBatch() {
            return this.currentBatch;
        }

        public GetVMDeployOrderResponseBodyDeployOrder setDeployMachineInfo(GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfo deployMachineInfo) {
            this.deployMachineInfo = deployMachineInfo;
            return this;
        }
        public GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfo getDeployMachineInfo() {
            return this.deployMachineInfo;
        }

        public GetVMDeployOrderResponseBodyDeployOrder setDeployOrderId(String deployOrderId) {
            this.deployOrderId = deployOrderId;
            return this;
        }
        public String getDeployOrderId() {
            return this.deployOrderId;
        }

        public GetVMDeployOrderResponseBodyDeployOrder setExceptionCode(String exceptionCode) {
            this.exceptionCode = exceptionCode;
            return this;
        }
        public String getExceptionCode() {
            return this.exceptionCode;
        }

        public GetVMDeployOrderResponseBodyDeployOrder setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVMDeployOrderResponseBodyDeployOrder setTotalBatch(Integer totalBatch) {
            this.totalBatch = totalBatch;
            return this;
        }
        public Integer getTotalBatch() {
            return this.totalBatch;
        }

        public GetVMDeployOrderResponseBodyDeployOrder setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
