// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class AttachVscToMountPointsRequest extends TeaModel {
    @NameInMap("AttachInfos")
    public java.util.List<AttachVscToMountPointsRequestAttachInfos> attachInfos;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("InputRegionId")
    public String inputRegionId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseAssumeRoleChkServerPerm")
    public Boolean useAssumeRoleChkServerPerm;

    public static AttachVscToMountPointsRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachVscToMountPointsRequest self = new AttachVscToMountPointsRequest();
        return TeaModel.build(map, self);
    }

    public AttachVscToMountPointsRequest setAttachInfos(java.util.List<AttachVscToMountPointsRequestAttachInfos> attachInfos) {
        this.attachInfos = attachInfos;
        return this;
    }
    public java.util.List<AttachVscToMountPointsRequestAttachInfos> getAttachInfos() {
        return this.attachInfos;
    }

    public AttachVscToMountPointsRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    public AttachVscToMountPointsRequest setUseAssumeRoleChkServerPerm(Boolean useAssumeRoleChkServerPerm) {
        this.useAssumeRoleChkServerPerm = useAssumeRoleChkServerPerm;
        return this;
    }
    public Boolean getUseAssumeRoleChkServerPerm() {
        return this.useAssumeRoleChkServerPerm;
    }

    public static class AttachVscToMountPointsRequestAttachInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i-2zehyz70ednszl6rrfj6</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>f-cfea9ae2ref87.cn-zhangjiakou.dfs.aliyuncs.com</p>
         */
        @NameInMap("MountPointId")
        public String mountPointId;

        /**
         * <strong>example:</strong>
         * <p>vsc-bp19yqmujug2r762cnabal</p>
         */
        @NameInMap("VscId")
        public String vscId;

        /**
         * <strong>example:</strong>
         * <p>xc</p>
         */
        @NameInMap("VscName")
        public String vscName;

        /**
         * <strong>example:</strong>
         * <p>Primary</p>
         */
        @NameInMap("VscType")
        public String vscType;

        public static AttachVscToMountPointsRequestAttachInfos build(java.util.Map<String, ?> map) throws Exception {
            AttachVscToMountPointsRequestAttachInfos self = new AttachVscToMountPointsRequestAttachInfos();
            return TeaModel.build(map, self);
        }

        public AttachVscToMountPointsRequestAttachInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AttachVscToMountPointsRequestAttachInfos setMountPointId(String mountPointId) {
            this.mountPointId = mountPointId;
            return this;
        }
        public String getMountPointId() {
            return this.mountPointId;
        }

        public AttachVscToMountPointsRequestAttachInfos setVscId(String vscId) {
            this.vscId = vscId;
            return this;
        }
        public String getVscId() {
            return this.vscId;
        }

        public AttachVscToMountPointsRequestAttachInfos setVscName(String vscName) {
            this.vscName = vscName;
            return this;
        }
        public String getVscName() {
            return this.vscName;
        }

        public AttachVscToMountPointsRequestAttachInfos setVscType(String vscType) {
            this.vscType = vscType;
            return this;
        }
        public String getVscType() {
            return this.vscType;
        }

    }

}
