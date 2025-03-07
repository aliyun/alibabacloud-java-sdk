// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLivePackageChannelGroupResponseBody extends TeaModel {
    /**
     * <p>The information about the channel group.</p>
     */
    @NameInMap("LivePackageChannelGroup")
    public UpdateLivePackageChannelGroupResponseBodyLivePackageChannelGroup livePackageChannelGroup;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLivePackageChannelGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePackageChannelGroupResponseBody self = new UpdateLivePackageChannelGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLivePackageChannelGroupResponseBody setLivePackageChannelGroup(UpdateLivePackageChannelGroupResponseBodyLivePackageChannelGroup livePackageChannelGroup) {
        this.livePackageChannelGroup = livePackageChannelGroup;
        return this;
    }
    public UpdateLivePackageChannelGroupResponseBodyLivePackageChannelGroup getLivePackageChannelGroup() {
        return this.livePackageChannelGroup;
    }

    public UpdateLivePackageChannelGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateLivePackageChannelGroupResponseBodyLivePackageChannelGroup extends TeaModel {
        /**
         * <p>The time when the channel group was created. It is in the yyyy-MM-ddTHH:mm:ssZ format and displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-01T12:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The channel group description.</p>
         * 
         * <strong>example:</strong>
         * <p>Updated description of the channel group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The channel group name.</p>
         * 
         * <strong>example:</strong>
         * <p>example-group-name</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The time when the channel group was last modified. It is in the yyyy-MM-ddTHH:mm:ssZ format and displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-01T12:00:00Z</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        /**
         * <p>The origin domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example-origin.com</p>
         */
        @NameInMap("OriginDomain")
        public String originDomain;

        public static UpdateLivePackageChannelGroupResponseBodyLivePackageChannelGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateLivePackageChannelGroupResponseBodyLivePackageChannelGroup self = new UpdateLivePackageChannelGroupResponseBodyLivePackageChannelGroup();
            return TeaModel.build(map, self);
        }

        public UpdateLivePackageChannelGroupResponseBodyLivePackageChannelGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateLivePackageChannelGroupResponseBodyLivePackageChannelGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateLivePackageChannelGroupResponseBodyLivePackageChannelGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateLivePackageChannelGroupResponseBodyLivePackageChannelGroup setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public UpdateLivePackageChannelGroupResponseBodyLivePackageChannelGroup setOriginDomain(String originDomain) {
            this.originDomain = originDomain;
            return this;
        }
        public String getOriginDomain() {
            return this.originDomain;
        }

    }

}
