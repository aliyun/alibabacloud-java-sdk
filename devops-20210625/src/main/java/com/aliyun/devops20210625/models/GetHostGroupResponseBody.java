// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetHostGroupResponseBody extends TeaModel {
    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // true 接口调用成功，false 接口调用失败
    @NameInMap("success")
    public Boolean success;

    @NameInMap("hostGroup")
    public GetHostGroupResponseBodyHostGroup hostGroup;

    public static GetHostGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHostGroupResponseBody self = new GetHostGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHostGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHostGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetHostGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetHostGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetHostGroupResponseBody setHostGroup(GetHostGroupResponseBodyHostGroup hostGroup) {
        this.hostGroup = hostGroup;
        return this;
    }
    public GetHostGroupResponseBodyHostGroup getHostGroup() {
        return this.hostGroup;
    }

    public static class GetHostGroupResponseBodyHostGroupHostInfos extends TeaModel {
        @NameInMap("updateTime")
        public Long updateTime;

        @NameInMap("creatorAccountId")
        public String creatorAccountId;

        @NameInMap("instanceName")
        public String instanceName;

        @NameInMap("modifierAccountId")
        public String modifierAccountId;

        @NameInMap("ip")
        public String ip;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("objectType")
        public String objectType;

        @NameInMap("aliyunRegionId")
        public String aliyunRegionId;

        @NameInMap("machineSn")
        public String machineSn;

        public static GetHostGroupResponseBodyHostGroupHostInfos build(java.util.Map<String, ?> map) throws Exception {
            GetHostGroupResponseBodyHostGroupHostInfos self = new GetHostGroupResponseBodyHostGroupHostInfos();
            return TeaModel.build(map, self);
        }

        public GetHostGroupResponseBodyHostGroupHostInfos setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
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

        public GetHostGroupResponseBodyHostGroupHostInfos setModifierAccountId(String modifierAccountId) {
            this.modifierAccountId = modifierAccountId;
            return this;
        }
        public String getModifierAccountId() {
            return this.modifierAccountId;
        }

        public GetHostGroupResponseBodyHostGroupHostInfos setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetHostGroupResponseBodyHostGroupHostInfos setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetHostGroupResponseBodyHostGroupHostInfos setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public GetHostGroupResponseBodyHostGroupHostInfos setAliyunRegionId(String aliyunRegionId) {
            this.aliyunRegionId = aliyunRegionId;
            return this;
        }
        public String getAliyunRegionId() {
            return this.aliyunRegionId;
        }

        public GetHostGroupResponseBodyHostGroupHostInfos setMachineSn(String machineSn) {
            this.machineSn = machineSn;
            return this;
        }
        public String getMachineSn() {
            return this.machineSn;
        }

    }

    public static class GetHostGroupResponseBodyHostGroup extends TeaModel {
        @NameInMap("creatorAccountId")
        public String creatorAccountId;

        @NameInMap("upateTIme")
        public Long upateTIme;

        @NameInMap("hostNum")
        public Long hostNum;

        @NameInMap("modifierAccountId")
        public String modifierAccountId;

        @NameInMap("description")
        public String description;

        @NameInMap("type")
        public String type;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("ecsType")
        public String ecsType;

        @NameInMap("aliyunRegion")
        public String aliyunRegion;

        @NameInMap("ecsLabelKey")
        public String ecsLabelKey;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("serviceConnectionId")
        public Long serviceConnectionId;

        @NameInMap("hostInfos")
        public java.util.List<GetHostGroupResponseBodyHostGroupHostInfos> hostInfos;

        @NameInMap("ecsLabelValue")
        public String ecsLabelValue;

        public static GetHostGroupResponseBodyHostGroup build(java.util.Map<String, ?> map) throws Exception {
            GetHostGroupResponseBodyHostGroup self = new GetHostGroupResponseBodyHostGroup();
            return TeaModel.build(map, self);
        }

        public GetHostGroupResponseBodyHostGroup setCreatorAccountId(String creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        public GetHostGroupResponseBodyHostGroup setUpateTIme(Long upateTIme) {
            this.upateTIme = upateTIme;
            return this;
        }
        public Long getUpateTIme() {
            return this.upateTIme;
        }

        public GetHostGroupResponseBodyHostGroup setHostNum(Long hostNum) {
            this.hostNum = hostNum;
            return this;
        }
        public Long getHostNum() {
            return this.hostNum;
        }

        public GetHostGroupResponseBodyHostGroup setModifierAccountId(String modifierAccountId) {
            this.modifierAccountId = modifierAccountId;
            return this;
        }
        public String getModifierAccountId() {
            return this.modifierAccountId;
        }

        public GetHostGroupResponseBodyHostGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetHostGroupResponseBodyHostGroup setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetHostGroupResponseBodyHostGroup setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetHostGroupResponseBodyHostGroup setEcsType(String ecsType) {
            this.ecsType = ecsType;
            return this;
        }
        public String getEcsType() {
            return this.ecsType;
        }

        public GetHostGroupResponseBodyHostGroup setAliyunRegion(String aliyunRegion) {
            this.aliyunRegion = aliyunRegion;
            return this;
        }
        public String getAliyunRegion() {
            return this.aliyunRegion;
        }

        public GetHostGroupResponseBodyHostGroup setEcsLabelKey(String ecsLabelKey) {
            this.ecsLabelKey = ecsLabelKey;
            return this;
        }
        public String getEcsLabelKey() {
            return this.ecsLabelKey;
        }

        public GetHostGroupResponseBodyHostGroup setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
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

        public GetHostGroupResponseBodyHostGroup setHostInfos(java.util.List<GetHostGroupResponseBodyHostGroupHostInfos> hostInfos) {
            this.hostInfos = hostInfos;
            return this;
        }
        public java.util.List<GetHostGroupResponseBodyHostGroupHostInfos> getHostInfos() {
            return this.hostInfos;
        }

        public GetHostGroupResponseBodyHostGroup setEcsLabelValue(String ecsLabelValue) {
            this.ecsLabelValue = ecsLabelValue;
            return this;
        }
        public String getEcsLabelValue() {
            return this.ecsLabelValue;
        }

    }

}
