// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterSyncGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("SyncGroups")
    @Validation(required = true)
    public DescribeCasterSyncGroupResponseSyncGroups syncGroups;

    public static DescribeCasterSyncGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterSyncGroupResponse self = new DescribeCasterSyncGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterSyncGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterSyncGroupResponse setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCasterSyncGroupResponse setSyncGroups(DescribeCasterSyncGroupResponseSyncGroups syncGroups) {
        this.syncGroups = syncGroups;
        return this;
    }
    public DescribeCasterSyncGroupResponseSyncGroups getSyncGroups() {
        return this.syncGroups;
    }

    public static class DescribeCasterSyncGroupResponseSyncGroupsSyncGroupResourceIds extends TeaModel {
        // ResourceId
        @NameInMap("ResourceId")
        @Validation(required = true)
        public java.util.List<String> resourceId;

        public static DescribeCasterSyncGroupResponseSyncGroupsSyncGroupResourceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterSyncGroupResponseSyncGroupsSyncGroupResourceIds self = new DescribeCasterSyncGroupResponseSyncGroupsSyncGroupResourceIds();
            return TeaModel.build(map, self);
        }

        public DescribeCasterSyncGroupResponseSyncGroupsSyncGroupResourceIds setResourceId(java.util.List<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public java.util.List<String> getResourceId() {
            return this.resourceId;
        }

    }

    public static class DescribeCasterSyncGroupResponseSyncGroupsSyncGroup extends TeaModel {
        @NameInMap("Mode")
        @Validation(required = true)
        public Integer mode;

        @NameInMap("HostResourceId")
        @Validation(required = true)
        public String hostResourceId;

        @NameInMap("ResourceIds")
        @Validation(required = true)
        public DescribeCasterSyncGroupResponseSyncGroupsSyncGroupResourceIds resourceIds;

        public static DescribeCasterSyncGroupResponseSyncGroupsSyncGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterSyncGroupResponseSyncGroupsSyncGroup self = new DescribeCasterSyncGroupResponseSyncGroupsSyncGroup();
            return TeaModel.build(map, self);
        }

        public DescribeCasterSyncGroupResponseSyncGroupsSyncGroup setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public DescribeCasterSyncGroupResponseSyncGroupsSyncGroup setHostResourceId(String hostResourceId) {
            this.hostResourceId = hostResourceId;
            return this;
        }
        public String getHostResourceId() {
            return this.hostResourceId;
        }

        public DescribeCasterSyncGroupResponseSyncGroupsSyncGroup setResourceIds(DescribeCasterSyncGroupResponseSyncGroupsSyncGroupResourceIds resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public DescribeCasterSyncGroupResponseSyncGroupsSyncGroupResourceIds getResourceIds() {
            return this.resourceIds;
        }

    }

    public static class DescribeCasterSyncGroupResponseSyncGroups extends TeaModel {
        @NameInMap("SyncGroup")
        @Validation(required = true)
        public java.util.List<DescribeCasterSyncGroupResponseSyncGroupsSyncGroup> syncGroup;

        public static DescribeCasterSyncGroupResponseSyncGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterSyncGroupResponseSyncGroups self = new DescribeCasterSyncGroupResponseSyncGroups();
            return TeaModel.build(map, self);
        }

        public DescribeCasterSyncGroupResponseSyncGroups setSyncGroup(java.util.List<DescribeCasterSyncGroupResponseSyncGroupsSyncGroup> syncGroup) {
            this.syncGroup = syncGroup;
            return this;
        }
        public java.util.List<DescribeCasterSyncGroupResponseSyncGroupsSyncGroup> getSyncGroup() {
            return this.syncGroup;
        }

    }

}
