// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class E2BVolume extends TeaModel {
    @NameInMap("agenticFSVolumeConfig")
    public AgenticFSVolumeConfig agenticFSVolumeConfig;

    @NameInMap("createdAt")
    public String createdAt;

    @NameInMap("ossVolumeConfig")
    public OSSVolumeConfig ossVolumeConfig;

    @NameInMap("resourceGroupID")
    public String resourceGroupID;

    @NameInMap("status")
    public String status;

    @NameInMap("statusReason")
    public String statusReason;

    @NameInMap("storageClass")
    public String storageClass;

    @NameInMap("teamID")
    public String teamID;

    @NameInMap("updatedAt")
    public String updatedAt;

    @NameInMap("userID")
    public String userID;

    @NameInMap("volumeID")
    public String volumeID;

    @NameInMap("volumeName")
    public String volumeName;

    public static E2BVolume build(java.util.Map<String, ?> map) throws Exception {
        E2BVolume self = new E2BVolume();
        return TeaModel.build(map, self);
    }

    public E2BVolume setAgenticFSVolumeConfig(AgenticFSVolumeConfig agenticFSVolumeConfig) {
        this.agenticFSVolumeConfig = agenticFSVolumeConfig;
        return this;
    }
    public AgenticFSVolumeConfig getAgenticFSVolumeConfig() {
        return this.agenticFSVolumeConfig;
    }

    public E2BVolume setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public E2BVolume setOssVolumeConfig(OSSVolumeConfig ossVolumeConfig) {
        this.ossVolumeConfig = ossVolumeConfig;
        return this;
    }
    public OSSVolumeConfig getOssVolumeConfig() {
        return this.ossVolumeConfig;
    }

    public E2BVolume setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public E2BVolume setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public E2BVolume setStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }
    public String getStatusReason() {
        return this.statusReason;
    }

    public E2BVolume setStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }
    public String getStorageClass() {
        return this.storageClass;
    }

    public E2BVolume setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public E2BVolume setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public E2BVolume setUserID(String userID) {
        this.userID = userID;
        return this;
    }
    public String getUserID() {
        return this.userID;
    }

    public E2BVolume setVolumeID(String volumeID) {
        this.volumeID = volumeID;
        return this;
    }
    public String getVolumeID() {
        return this.volumeID;
    }

    public E2BVolume setVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }
    public String getVolumeName() {
        return this.volumeName;
    }

}
