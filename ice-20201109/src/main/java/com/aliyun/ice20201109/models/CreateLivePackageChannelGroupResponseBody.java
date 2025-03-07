// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLivePackageChannelGroupResponseBody extends TeaModel {
    /**
     * <p>The information about the channel group.</p>
     */
    @NameInMap("LivePackageChannelGroup")
    public CreateLivePackageChannelGroupResponseBodyLivePackageChannelGroup livePackageChannelGroup;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426614174000</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateLivePackageChannelGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePackageChannelGroupResponseBody self = new CreateLivePackageChannelGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLivePackageChannelGroupResponseBody setLivePackageChannelGroup(CreateLivePackageChannelGroupResponseBodyLivePackageChannelGroup livePackageChannelGroup) {
        this.livePackageChannelGroup = livePackageChannelGroup;
        return this;
    }
    public CreateLivePackageChannelGroupResponseBodyLivePackageChannelGroup getLivePackageChannelGroup() {
        return this.livePackageChannelGroup;
    }

    public CreateLivePackageChannelGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateLivePackageChannelGroupResponseBodyLivePackageChannelGroup extends TeaModel {
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
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The channel group name.</p>
         * 
         * <strong>example:</strong>
         * <p>example-group</p>
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
         * <p>example.com</p>
         */
        @NameInMap("OriginDomain")
        public String originDomain;

        public static CreateLivePackageChannelGroupResponseBodyLivePackageChannelGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateLivePackageChannelGroupResponseBodyLivePackageChannelGroup self = new CreateLivePackageChannelGroupResponseBodyLivePackageChannelGroup();
            return TeaModel.build(map, self);
        }

        public CreateLivePackageChannelGroupResponseBodyLivePackageChannelGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateLivePackageChannelGroupResponseBodyLivePackageChannelGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLivePackageChannelGroupResponseBodyLivePackageChannelGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateLivePackageChannelGroupResponseBodyLivePackageChannelGroup setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public CreateLivePackageChannelGroupResponseBodyLivePackageChannelGroup setOriginDomain(String originDomain) {
            this.originDomain = originDomain;
            return this;
        }
        public String getOriginDomain() {
            return this.originDomain;
        }

    }

}
