// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLivePackageChannelGroupResponseBody extends TeaModel {
    @NameInMap("LivePackageChannelGroup")
    public CreateLivePackageChannelGroupResponseBodyLivePackageChannelGroup livePackageChannelGroup;

    /**
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
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-01T12:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>频道组名称</p>
         * 
         * <strong>example:</strong>
         * <p>example-group</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>修改时间</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-01T12:00:00Z</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        /**
         * <p>源站域名</p>
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
