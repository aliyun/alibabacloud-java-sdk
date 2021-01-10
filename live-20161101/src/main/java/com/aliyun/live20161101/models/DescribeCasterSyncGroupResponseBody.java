// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterSyncGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("SyncGroups")
    public DescribeCasterSyncGroupResponseBodySyncGroups syncGroups;

    public static DescribeCasterSyncGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterSyncGroupResponseBody self = new DescribeCasterSyncGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCasterSyncGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterSyncGroupResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCasterSyncGroupResponseBody setSyncGroups(DescribeCasterSyncGroupResponseBodySyncGroups syncGroups) {
        this.syncGroups = syncGroups;
        return this;
    }
    public DescribeCasterSyncGroupResponseBodySyncGroups getSyncGroups() {
        return this.syncGroups;
    }

    public static class DescribeCasterSyncGroupResponseBodySyncGroupsSyncGroupResourceIds extends TeaModel {
        @NameInMap("ResourceId")
        public java.util.List<String> resourceId;

        public static DescribeCasterSyncGroupResponseBodySyncGroupsSyncGroupResourceIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterSyncGroupResponseBodySyncGroupsSyncGroupResourceIds self = new DescribeCasterSyncGroupResponseBodySyncGroupsSyncGroupResourceIds();
            return TeaModel.build(map, self);
        }

        public DescribeCasterSyncGroupResponseBodySyncGroupsSyncGroupResourceIds setResourceId(java.util.List<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public java.util.List<String> getResourceId() {
            return this.resourceId;
        }

    }

    public static class DescribeCasterSyncGroupResponseBodySyncGroupsSyncGroup extends TeaModel {
        @NameInMap("Mode")
        public Integer mode;

        @NameInMap("HostResourceId")
        public String hostResourceId;

        @NameInMap("ResourceIds")
        public DescribeCasterSyncGroupResponseBodySyncGroupsSyncGroupResourceIds resourceIds;

        public static DescribeCasterSyncGroupResponseBodySyncGroupsSyncGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterSyncGroupResponseBodySyncGroupsSyncGroup self = new DescribeCasterSyncGroupResponseBodySyncGroupsSyncGroup();
            return TeaModel.build(map, self);
        }

        public DescribeCasterSyncGroupResponseBodySyncGroupsSyncGroup setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public DescribeCasterSyncGroupResponseBodySyncGroupsSyncGroup setHostResourceId(String hostResourceId) {
            this.hostResourceId = hostResourceId;
            return this;
        }
        public String getHostResourceId() {
            return this.hostResourceId;
        }

        public DescribeCasterSyncGroupResponseBodySyncGroupsSyncGroup setResourceIds(DescribeCasterSyncGroupResponseBodySyncGroupsSyncGroupResourceIds resourceIds) {
            this.resourceIds = resourceIds;
            return this;
        }
        public DescribeCasterSyncGroupResponseBodySyncGroupsSyncGroupResourceIds getResourceIds() {
            return this.resourceIds;
        }

    }

    public static class DescribeCasterSyncGroupResponseBodySyncGroups extends TeaModel {
        @NameInMap("SyncGroup")
        public java.util.List<DescribeCasterSyncGroupResponseBodySyncGroupsSyncGroup> syncGroup;

        public static DescribeCasterSyncGroupResponseBodySyncGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterSyncGroupResponseBodySyncGroups self = new DescribeCasterSyncGroupResponseBodySyncGroups();
            return TeaModel.build(map, self);
        }

        public DescribeCasterSyncGroupResponseBodySyncGroups setSyncGroup(java.util.List<DescribeCasterSyncGroupResponseBodySyncGroupsSyncGroup> syncGroup) {
            this.syncGroup = syncGroup;
            return this;
        }
        public java.util.List<DescribeCasterSyncGroupResponseBodySyncGroupsSyncGroup> getSyncGroup() {
            return this.syncGroup;
        }

    }

}
