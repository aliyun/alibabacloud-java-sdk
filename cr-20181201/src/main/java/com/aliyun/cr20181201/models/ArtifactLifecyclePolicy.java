// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ArtifactLifecyclePolicy extends TeaModel {
    @NameInMap("Condition")
    public ArtifactLifecyclePolicyCondition condition;

    @NameInMap("Filter")
    public ArtifactLifecyclePolicyFilter filter;

    @NameInMap("Type")
    public String type;

    public static ArtifactLifecyclePolicy build(java.util.Map<String, ?> map) throws Exception {
        ArtifactLifecyclePolicy self = new ArtifactLifecyclePolicy();
        return TeaModel.build(map, self);
    }

    public ArtifactLifecyclePolicy setCondition(ArtifactLifecyclePolicyCondition condition) {
        this.condition = condition;
        return this;
    }
    public ArtifactLifecyclePolicyCondition getCondition() {
        return this.condition;
    }

    public ArtifactLifecyclePolicy setFilter(ArtifactLifecyclePolicyFilter filter) {
        this.filter = filter;
        return this;
    }
    public ArtifactLifecyclePolicyFilter getFilter() {
        return this.filter;
    }

    public ArtifactLifecyclePolicy setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ArtifactLifecyclePolicyCondition extends TeaModel {
        @NameInMap("LastPullOlderThanDays")
        public Integer lastPullOlderThanDays;

        @NameInMap("LastPushOlderThanDays")
        public Integer lastPushOlderThanDays;

        @NameInMap("LatestTagCount")
        public Integer latestTagCount;

        public static ArtifactLifecyclePolicyCondition build(java.util.Map<String, ?> map) throws Exception {
            ArtifactLifecyclePolicyCondition self = new ArtifactLifecyclePolicyCondition();
            return TeaModel.build(map, self);
        }

        public ArtifactLifecyclePolicyCondition setLastPullOlderThanDays(Integer lastPullOlderThanDays) {
            this.lastPullOlderThanDays = lastPullOlderThanDays;
            return this;
        }
        public Integer getLastPullOlderThanDays() {
            return this.lastPullOlderThanDays;
        }

        public ArtifactLifecyclePolicyCondition setLastPushOlderThanDays(Integer lastPushOlderThanDays) {
            this.lastPushOlderThanDays = lastPushOlderThanDays;
            return this;
        }
        public Integer getLastPushOlderThanDays() {
            return this.lastPushOlderThanDays;
        }

        public ArtifactLifecyclePolicyCondition setLatestTagCount(Integer latestTagCount) {
            this.latestTagCount = latestTagCount;
            return this;
        }
        public Integer getLatestTagCount() {
            return this.latestTagCount;
        }

    }

    public static class ArtifactLifecyclePolicyFilter extends TeaModel {
        @NameInMap("TagWildcard")
        public String tagWildcard;

        public static ArtifactLifecyclePolicyFilter build(java.util.Map<String, ?> map) throws Exception {
            ArtifactLifecyclePolicyFilter self = new ArtifactLifecyclePolicyFilter();
            return TeaModel.build(map, self);
        }

        public ArtifactLifecyclePolicyFilter setTagWildcard(String tagWildcard) {
            this.tagWildcard = tagWildcard;
            return this;
        }
        public String getTagWildcard() {
            return this.tagWildcard;
        }

    }

}
