// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetHostGroupResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("hostGroup")
    public GetHostGroupResponseBodyHostGroup hostGroup;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // true 接口调用成功，false 接口调用失败
    @NameInMap("success")
    public Boolean success;

    public static GetHostGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHostGroupResponseBody self = new GetHostGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHostGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetHostGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetHostGroupResponseBody setHostGroup(GetHostGroupResponseBodyHostGroup hostGroup) {
        this.hostGroup = hostGroup;
        return this;
    }
    public GetHostGroupResponseBodyHostGroup getHostGroup() {
        return this.hostGroup;
    }

    public GetHostGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHostGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetHostGroupResponseBodyHostGroupHostInfos extends TeaModel {
        @NameInMap("aliyunRegionId")
        public String aliyunRegionId;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("creatorAccountId")
        public String creatorAccountId;

        @NameInMap("instanceName")
        public String instanceName;

        @NameInMap("ip")
        public String ip;

        @NameInMap("machineSn")
        public String machineSn;

        @NameInMap("modifierAccountId")
        public String modifierAccountId;

        @NameInMap("objectType")
        public String objectType;

        @NameInMap("updateTime")
        public Long updateTime;

        public static GetHostGroupResponseBodyHostGroupHostInfos build(java.util.Map<String, ?> map) throws Exception {
            GetHostGroupResponseBodyHostGroupHostInfos self = new GetHostGroupResponseBodyHostGroupHostInfos();
            return TeaModel.build(map, self);
        }

        public GetHostGroupResponseBodyHostGroupHostInfos setAliyunRegionId(String aliyunRegionId) {
            this.aliyunRegionId = aliyunRegionId;
            return this;
        }
        public String getAliyunRegionId() {
            return this.aliyunRegionId;
        }

        public GetHostGroupResponseBodyHostGroupHostInfos setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetHostGroupResponseBodyHostGroupHostInfos setCreatorAccountId(String creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        public GetHostGroupResponseBodyHostGroupHostInfos setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetHostGroupResponseBodyHostGroupHostInfos setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetHostGroupResponseBodyHostGroupHostInfos setMachineSn(String machineSn) {
            this.machineSn = machineSn;
            return this;
        }
        public String getMachineSn() {
            return this.machineSn;
        }

        public GetHostGroupResponseBodyHostGroupHostInfos setModifierAccountId(String modifierAccountId) {
            this.modifierAccountId = modifierAccountId;
            return this;
        }
        public String getModifierAccountId() {
            return this.modifierAccountId;
        }

        public GetHostGroupResponseBodyHostGroupHostInfos setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public GetHostGroupResponseBodyHostGroupHostInfos setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class GetHostGroupResponseBodyHostGroup extends TeaModel {
        @NameInMap("aliyunRegion")
        public String aliyunRegion;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("creatorAccountId")
        public String creatorAccountId;

        @NameInMap("description")
        public String description;

        @NameInMap("ecsLabelKey")
        public String ecsLabelKey;

        @NameInMap("ecsLabelValue")
        public String ecsLabelValue;

        @NameInMap("ecsType")
        public String ecsType;

        @NameInMap("hostInfos")
        public java.util.List<GetHostGroupResponseBodyHostGroupHostInfos> hostInfos;

        @NameInMap("hostNum")
        public Long hostNum;

        @NameInMap("id")
        public Long id;

        @NameInMap("modifierAccountId")
        public String modifierAccountId;

        @NameInMap("name")
        public String name;

        @NameInMap("serviceConnectionId")
        public Long serviceConnectionId;

        @NameInMap("type")
        public String type;

        @NameInMap("upateTIme")
        public Long upateTIme;

        public static GetHostGroupResponseBodyHostGroup build(java.util.Map<String, ?> map) throws Exception {
            GetHostGroupResponseBodyHostGroup self = new GetHostGroupResponseBodyHostGroup();
            return TeaModel.build(map, self);
        }

        public GetHostGroupResponseBodyHostGroup setAliyunRegion(String aliyunRegion) {
            this.aliyunRegion = aliyunRegion;
            return this;
        }
        public String getAliyunRegion() {
            return this.aliyunRegion;
        }

        public GetHostGroupResponseBodyHostGroup setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetHostGroupResponseBodyHostGroup setCreatorAccountId(String creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        public GetHostGroupResponseBodyHostGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetHostGroupResponseBodyHostGroup setEcsLabelKey(String ecsLabelKey) {
            this.ecsLabelKey = ecsLabelKey;
            return this;
        }
        public String getEcsLabelKey() {
            return this.ecsLabelKey;
        }

        public GetHostGroupResponseBodyHostGroup setEcsLabelValue(String ecsLabelValue) {
            this.ecsLabelValue = ecsLabelValue;
            return this;
        }
        public String getEcsLabelValue() {
            return this.ecsLabelValue;
        }

        public GetHostGroupResponseBodyHostGroup setEcsType(String ecsType) {
            this.ecsType = ecsType;
            return this;
        }
        public String getEcsType() {
            return this.ecsType;
        }

        public GetHostGroupResponseBodyHostGroup setHostInfos(java.util.List<GetHostGroupResponseBodyHostGroupHostInfos> hostInfos) {
            this.hostInfos = hostInfos;
            return this;
        }
        public java.util.List<GetHostGroupResponseBodyHostGroupHostInfos> getHostInfos() {
            return this.hostInfos;
        }

        public GetHostGroupResponseBodyHostGroup setHostNum(Long hostNum) {
            this.hostNum = hostNum;
            return this;
        }
        public Long getHostNum() {
            return this.hostNum;
        }

        public GetHostGroupResponseBodyHostGroup setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetHostGroupResponseBodyHostGroup setModifierAccountId(String modifierAccountId) {
            this.modifierAccountId = modifierAccountId;
            return this;
        }
        public String getModifierAccountId() {
            return this.modifierAccountId;
        }

        public GetHostGroupResponseBodyHostGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetHostGroupResponseBodyHostGroup setServiceConnectionId(Long serviceConnectionId) {
            this.serviceConnectionId = serviceConnectionId;
            return this;
        }
        public Long getServiceConnectionId() {
            return this.serviceConnectionId;
        }

        public GetHostGroupResponseBodyHostGroup setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHostGroupResponseBodyHostGroup setUpateTIme(Long upateTIme) {
            this.upateTIme = upateTIme;
            return this;
        }
        public Long getUpateTIme() {
            return this.upateTIme;
        }

    }

}
