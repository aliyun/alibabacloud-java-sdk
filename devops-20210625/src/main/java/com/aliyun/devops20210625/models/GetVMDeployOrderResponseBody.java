// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetVMDeployOrderResponseBody extends TeaModel {
    @NameInMap("deployOrder")
    public GetVMDeployOrderResponseBodyDeployOrder deployOrder;

    /**
     * <strong>example:</strong>
     * <p>”“</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>”“</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true 接口调用成功，false 接口调用失败</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("disable")
        public Boolean disable;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("params")
        public Object params;

        /**
         * <strong>example:</strong>
         * <p>StopVMDeployOrder</p>
         */
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

        public GetVMDeployOrderResponseBodyDeployOrderActions setParams(Object params) {
            this.params = params;
            return this;
        }
        public Object getParams() {
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
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("disable")
        public Boolean disable;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("params")
        public Object params;

        /**
         * <strong>example:</strong>
         * <p>RetryVMDeployMachine</p>
         */
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

        public GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachinesActions setParams(Object params) {
            this.params = params;
            return this;
        }
        public Object getParams() {
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
        @NameInMap("actions")
        public java.util.List<GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachinesActions> actions;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("batchNum")
        public Integer batchNum;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("clientStatus")
        public String clientStatus;

        /**
         * <strong>example:</strong>
         * <p>1111111111</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>sasssasa</p>
         */
        @NameInMap("machineSn")
        public String machineSn;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>11111111</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("batchNum")
        public Integer batchNum;

        @NameInMap("deployMachines")
        public java.util.List<GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfoDeployMachines> deployMachines;

        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
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
        @NameInMap("actions")
        public java.util.List<GetVMDeployOrderResponseBodyDeployOrderActions> actions;

        /**
         * <strong>example:</strong>
         * <p>111111111111</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>ssaassa</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("currentBatch")
        public Integer currentBatch;

        @NameInMap("deployMachineInfo")
        public GetVMDeployOrderResponseBodyDeployOrderDeployMachineInfo deployMachineInfo;

        /**
         * <strong>example:</strong>
         * <p>11111</p>
         */
        @NameInMap("deployOrderId")
        public String deployOrderId;

        @NameInMap("exceptionCode")
        public String exceptionCode;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("totalBatch")
        public Integer totalBatch;

        /**
         * <strong>example:</strong>
         * <p>11111111111</p>
         */
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
