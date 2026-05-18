// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DetachVscFromMountPointsRequest extends TeaModel {
    @NameInMap("DetachInfos")
    public java.util.List<DetachVscFromMountPointsRequestDetachInfos> detachInfos;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    @NameInMap("UseAssumeRoleChkServerPerm")
    public Boolean useAssumeRoleChkServerPerm;

    public static DetachVscFromMountPointsRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachVscFromMountPointsRequest self = new DetachVscFromMountPointsRequest();
        return TeaModel.build(map, self);
    }

    public DetachVscFromMountPointsRequest setDetachInfos(java.util.List<DetachVscFromMountPointsRequestDetachInfos> detachInfos) {
        this.detachInfos = detachInfos;
        return this;
    }
    public java.util.List<DetachVscFromMountPointsRequestDetachInfos> getDetachInfos() {
        return this.detachInfos;
    }

    public DetachVscFromMountPointsRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public DetachVscFromMountPointsRequest setUseAssumeRoleChkServerPerm(Boolean useAssumeRoleChkServerPerm) {
        this.useAssumeRoleChkServerPerm = useAssumeRoleChkServerPerm;
        return this;
    }
    public Boolean getUseAssumeRoleChkServerPerm() {
        return this.useAssumeRoleChkServerPerm;
    }

    public static class DetachVscFromMountPointsRequestDetachInfos extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MountPointId")
        public String mountPointId;

        @NameInMap("VscId")
        public String vscId;

        @NameInMap("VscName")
        public String vscName;

        @NameInMap("VscType")
        public String vscType;

        public static DetachVscFromMountPointsRequestDetachInfos build(java.util.Map<String, ?> map) throws Exception {
            DetachVscFromMountPointsRequestDetachInfos self = new DetachVscFromMountPointsRequestDetachInfos();
            return TeaModel.build(map, self);
        }

        public DetachVscFromMountPointsRequestDetachInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DetachVscFromMountPointsRequestDetachInfos setMountPointId(String mountPointId) {
            this.mountPointId = mountPointId;
            return this;
        }
        public String getMountPointId() {
            return this.mountPointId;
        }

        public DetachVscFromMountPointsRequestDetachInfos setVscId(String vscId) {
            this.vscId = vscId;
            return this;
        }
        public String getVscId() {
            return this.vscId;
        }

        public DetachVscFromMountPointsRequestDetachInfos setVscName(String vscName) {
            this.vscName = vscName;
            return this;
        }
        public String getVscName() {
            return this.vscName;
        }

        public DetachVscFromMountPointsRequestDetachInfos setVscType(String vscType) {
            this.vscType = vscType;
            return this;
        }
        public String getVscType() {
            return this.vscType;
        }

    }

}
