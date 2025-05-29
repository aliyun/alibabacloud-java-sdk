// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLivePackageOriginEndpointResponseBody extends TeaModel {
    /**
     * <p>The information about the origin endpoint.</p>
     */
    @NameInMap("LivePackageOriginEndpoint")
    public UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint livePackageOriginEndpoint;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b1f8d6c4-a123-4cd5-9e88-d0819e3bfa70</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLivePackageOriginEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePackageOriginEndpointResponseBody self = new UpdateLivePackageOriginEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLivePackageOriginEndpointResponseBody setLivePackageOriginEndpoint(UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint livePackageOriginEndpoint) {
        this.livePackageOriginEndpoint = livePackageOriginEndpoint;
        return this;
    }
    public UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint getLivePackageOriginEndpoint() {
        return this.livePackageOriginEndpoint;
    }

    public UpdateLivePackageOriginEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint extends TeaModel {
        /**
         * <p>The authorization code.</p>
         * 
         * <strong>example:</strong>
         * <p>Abc123Def456</p>
         */
        @NameInMap("AuthorizationCode")
        public String authorizationCode;

        /**
         * <p>The channel name.</p>
         * 
         * <strong>example:</strong>
         * <p>channel-1</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <p>The time when the endpoint was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-01T12:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The endpoint description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The endpoint name.</p>
         * 
         * <strong>example:</strong>
         * <p>endpoint-1</p>
         */
        @NameInMap("EndpointName")
        public String endpointName;

        /**
         * <p>The endpoint URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.packagepull-abcxxx.ap-southeast-1.aliyuncsiceintl.com/v1/group01/1/ch01/manifest">https://xxx.packagepull-abcxxx.ap-southeast-1.aliyuncsiceintl.com/v1/group01/1/ch01/manifest</a></p>
         */
        @NameInMap("EndpointUrl")
        public String endpointUrl;

        /**
         * <p>The channel group name.</p>
         * 
         * <strong>example:</strong>
         * <p>channel-group-1</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The IP address blacklist. It supports subnet masks. Multiple IP addresses are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>10.21.222.1/32,192.168.100.0/24</p>
         */
        @NameInMap("IpBlacklist")
        public String ipBlacklist;

        /**
         * <p>The IP address whitelist. It supports subnet masks. Multiple IP addresses are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24,10.0.0.1/24</p>
         */
        @NameInMap("IpWhitelist")
        public String ipWhitelist;

        /**
         * <p>The time when the endpoint was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-01T12:00:00Z</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        @NameInMap("LivePackagingConfig")
        public LivePackagingConfig livePackagingConfig;

        /**
         * <p>The playlist name. Default value: manifest.</p>
         * 
         * <strong>example:</strong>
         * <p>manifest</p>
         */
        @NameInMap("ManifestName")
        public String manifestName;

        /**
         * <p>The protocol. Only HLS is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>HLS</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The number of days that time-shifted content is available. Maximum value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TimeshiftVision")
        public Integer timeshiftVision;

        public static UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint build(java.util.Map<String, ?> map) throws Exception {
            UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint self = new UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint();
            return TeaModel.build(map, self);
        }

        public UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setAuthorizationCode(String authorizationCode) {
            this.authorizationCode = authorizationCode;
            return this;
        }
        public String getAuthorizationCode() {
            return this.authorizationCode;
        }

        public UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setEndpointName(String endpointName) {
            this.endpointName = endpointName;
            return this;
        }
        public String getEndpointName() {
            return this.endpointName;
        }

        public UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setEndpointUrl(String endpointUrl) {
            this.endpointUrl = endpointUrl;
            return this;
        }
        public String getEndpointUrl() {
            return this.endpointUrl;
        }

        public UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setIpBlacklist(String ipBlacklist) {
            this.ipBlacklist = ipBlacklist;
            return this;
        }
        public String getIpBlacklist() {
            return this.ipBlacklist;
        }

        public UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setIpWhitelist(String ipWhitelist) {
            this.ipWhitelist = ipWhitelist;
            return this;
        }
        public String getIpWhitelist() {
            return this.ipWhitelist;
        }

        public UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setLivePackagingConfig(LivePackagingConfig livePackagingConfig) {
            this.livePackagingConfig = livePackagingConfig;
            return this;
        }
        public LivePackagingConfig getLivePackagingConfig() {
            return this.livePackagingConfig;
        }

        public UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setManifestName(String manifestName) {
            this.manifestName = manifestName;
            return this;
        }
        public String getManifestName() {
            return this.manifestName;
        }

        public UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateLivePackageOriginEndpointResponseBodyLivePackageOriginEndpoint setTimeshiftVision(Integer timeshiftVision) {
            this.timeshiftVision = timeshiftVision;
            return this;
        }
        public Integer getTimeshiftVision() {
            return this.timeshiftVision;
        }

    }

}
