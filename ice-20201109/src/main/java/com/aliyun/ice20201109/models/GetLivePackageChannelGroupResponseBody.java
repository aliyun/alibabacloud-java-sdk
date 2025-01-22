// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLivePackageChannelGroupResponseBody extends TeaModel {
    @NameInMap("LivePackageChannelGroup")
    public GetLivePackageChannelGroupResponseBodyLivePackageChannelGroup livePackageChannelGroup;

    /**
     * <strong>example:</strong>
     * <p>req-abcdefg123456</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetLivePackageChannelGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLivePackageChannelGroupResponseBody self = new GetLivePackageChannelGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLivePackageChannelGroupResponseBody setLivePackageChannelGroup(GetLivePackageChannelGroupResponseBodyLivePackageChannelGroup livePackageChannelGroup) {
        this.livePackageChannelGroup = livePackageChannelGroup;
        return this;
    }
    public GetLivePackageChannelGroupResponseBodyLivePackageChannelGroup getLivePackageChannelGroup() {
        return this.livePackageChannelGroup;
    }

    public GetLivePackageChannelGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLivePackageChannelGroupResponseBodyLivePackageChannelGroup extends TeaModel {
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
         * <p>channel-group-1</p>
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

        public static GetLivePackageChannelGroupResponseBodyLivePackageChannelGroup build(java.util.Map<String, ?> map) throws Exception {
            GetLivePackageChannelGroupResponseBodyLivePackageChannelGroup self = new GetLivePackageChannelGroupResponseBodyLivePackageChannelGroup();
            return TeaModel.build(map, self);
        }

        public GetLivePackageChannelGroupResponseBodyLivePackageChannelGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetLivePackageChannelGroupResponseBodyLivePackageChannelGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLivePackageChannelGroupResponseBodyLivePackageChannelGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetLivePackageChannelGroupResponseBodyLivePackageChannelGroup setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public GetLivePackageChannelGroupResponseBodyLivePackageChannelGroup setOriginDomain(String originDomain) {
            this.originDomain = originDomain;
            return this;
        }
        public String getOriginDomain() {
            return this.originDomain;
        }

    }

}
