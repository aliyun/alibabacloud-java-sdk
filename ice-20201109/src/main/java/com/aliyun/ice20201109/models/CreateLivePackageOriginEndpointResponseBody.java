// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLivePackageOriginEndpointResponseBody extends TeaModel {
    @NameInMap("LivePackageOriginEndpoint")
    public CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint livePackageOriginEndpoint;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateLivePackageOriginEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePackageOriginEndpointResponseBody self = new CreateLivePackageOriginEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLivePackageOriginEndpointResponseBody setLivePackageOriginEndpoint(CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint livePackageOriginEndpoint) {
        this.livePackageOriginEndpoint = livePackageOriginEndpoint;
        return this;
    }
    public CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint getLivePackageOriginEndpoint() {
        return this.livePackageOriginEndpoint;
    }

    public CreateLivePackageOriginEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint extends TeaModel {
        /**
         * <p>回源授权码，与IpWhitelist必选其一</p>
         * 
         * <strong>example:</strong>
         * <p>Abcded123</p>
         */
        @NameInMap("AuthorizationCode")
        public String authorizationCode;

        /**
         * <p>频道名称</p>
         * 
         * <strong>example:</strong>
         * <p>channel-1</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-01T12:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>端点描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>端点名称</p>
         * 
         * <strong>example:</strong>
         * <p>endpoint-1</p>
         */
        @NameInMap("EndpointName")
        public String endpointName;

        /**
         * <p>源站端点回源播放地址</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.packagepull-abcxxx.ap-southeast-1.aliyuncsiceintl.com/v1/group01/1/ch01/manifest">https://xxx.packagepull-abcxxx.ap-southeast-1.aliyuncsiceintl.com/v1/group01/1/ch01/manifest</a></p>
         */
        @NameInMap("EndpointUrl")
        public String endpointUrl;

        /**
         * <p>频道组名称</p>
         * 
         * <strong>example:</strong>
         * <p>channel-group-1</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>IP黑名单，支持无类别域间路由（CIDR），逗号分隔</p>
         * 
         * <strong>example:</strong>
         * <p>103.21.222.1/32,192.168.100.0/24</p>
         */
        @NameInMap("IpBlacklist")
        public String ipBlacklist;

        /**
         * <p>IP白名单，支持无类别域间路由（CIDR），逗号分隔，与AuthorizationCode必选其一</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24,10.0.0.1/24</p>
         */
        @NameInMap("IpWhitelist")
        public String ipWhitelist;

        /**
         * <p>最后修改时间</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-01T12:00:00Z</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        /**
         * <p>播放列表名</p>
         * 
         * <strong>example:</strong>
         * <p>manifest</p>
         */
        @NameInMap("ManifestName")
        public String manifestName;

        /**
         * <p>端点分发协议，暂只支持HLS</p>
         * 
         * <strong>example:</strong>
         * <p>HLS</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>时移天数，最大30天，0表示不支持时移</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TimeshiftVision")
        public Integer timeshiftVision;

        public static CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint build(java.util.Map<String, ?> map) throws Exception {
            CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint self = new CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint();
            return TeaModel.build(map, self);
        }

        public CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setAuthorizationCode(String authorizationCode) {
            this.authorizationCode = authorizationCode;
            return this;
        }
        public String getAuthorizationCode() {
            return this.authorizationCode;
        }

        public CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setEndpointUrl(String endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }
        public String getEndpointUrl() {
            return this.endpointUrl;
        }

        public CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setIpBlacklist(String ipBlacklist) {
            this.ipBlacklist = ipBlacklist;
            return this;
        }
        public String getIpBlacklist() {
            return this.ipBlacklist;
        }

        public CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setIpWhitelist(String ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }
        public String getIpWhitelist() {
            return this.ipWhitelist;
        }

        public CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setManifestName(String manifestName) {
            this.manifestName = manifestName;
            return this;
        }
        public String getManifestName() {
            return this.manifestName;
        }

        public CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setTimeshiftVision(Integer timeshiftVision) {
            this.timeshiftVision = timeshiftVision;
            return this;
        }
        public Integer getTimeshiftVision() {
            return this.timeshiftVision;
        }

    }

}
