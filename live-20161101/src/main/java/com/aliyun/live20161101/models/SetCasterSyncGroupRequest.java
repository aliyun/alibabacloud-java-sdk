// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterSyncGroupRequest extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SyncGroup")
    public java.util.List<SetCasterSyncGroupRequestSyncGroup> syncGroup;

    public static SetCasterSyncGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCasterSyncGroupRequest self = new SetCasterSyncGroupRequest();
        return TeaModel.build(map, self);
    }

    public SetCasterSyncGroupRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public SetCasterSyncGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetCasterSyncGroupRequest setSyncGroup(java.util.List<SetCasterSyncGroupRequestSyncGroup> syncGroup) {
        this.syncGroup = syncGroup;
        return this;
    }
    public java.util.List<SetCasterSyncGroupRequestSyncGroup> getSyncGroup() {
        return this.syncGroup;
    }

    public static class SetCasterSyncGroupRequestSyncGroup extends TeaModel {
        @NameInMap("HostResourceId")
        public String hostResourceId;

        @NameInMap("Mode")
        public Integer mode;

        @NameInMap("ResourceIds")
        public java.util.List<String> resourceIds;

        @NameInMap("SyncDelayThreshold")
        public Long syncDelayThreshold;

        @NameInMap("SyncOffsets")
        public java.util.List<Integer> syncOffsets;

        public static SetCasterSyncGroupRequestSyncGroup build(java.util.Map<String, ?> map) throws Exception {
            SetCasterSyncGroupRequestSyncGroup self = new SetCasterSyncGroupRequestSyncGroup();
            return TeaModel.build(map, self);
        }

        public SetCasterSyncGroupRequestSyncGroup setHostResourceId(String hostResourceId) {
            this.hostResourceId = hostResourceId;
            return this;
        }
        public String getHostResourceId() {
            return this.hostResourceId;
        }

        public SetCasterSyncGroupRequestSyncGroup setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public SetCasterSyncGroupRequestSyncGroup setResourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        public SetCasterSyncGroupRequestSyncGroup setSyncDelayThreshold(Long syncDelayThreshold) {
            this.syncDelayThreshold = syncDelayThreshold;
            return this;
        }
        public Long getSyncDelayThreshold() {
            return this.syncDelayThreshold;
        }

        public SetCasterSyncGroupRequestSyncGroup setSyncOffsets(java.util.List<Integer> syncOffsets) {
            this.syncOffsets = syncOffsets;
            return this;
        }
        public java.util.List<Integer> getSyncOffsets() {
            return this.syncOffsets;
        }

    }

}
