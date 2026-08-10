// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateLivePackageOriginEndpointRequest extends TeaModel {
    /**
     * <p>The authorization code. You must specify at least one of AuthorizationCode and IpWhitelist. Maximum length: 200 characters. Format: [A-Za-z0-9-_.]+</p>
     * 
     * <strong>example:</strong>
     * <p>Abc123Def456</p>
     */
    @NameInMap("AuthorizationCode")
    public String authorizationCode;

    /**
     * <p>The name of an existing channel.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>channel-1</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <p>The description of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>This is an origin endpoint.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the origin endpoint. The name can contain uppercase and lowercase letters, digits, hyphens (-), and underscores (<em>). The name must be 1 to 200 characters in length. Format: [A-Za-z0-9</em>-]+</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>endpoint-1</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The name of an existing channel group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>channel-group-1</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The IP blacklist. Subnet masks are supported. Separate multiple IP addresses with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>103.0.0.0/8</p>
     */
    @NameInMap("IpBlacklist")
    public String ipBlacklist;

    /**
     * <p>The IP whitelist. Subnet masks are supported. The value 0.0.0.0/0 is not allowed. Separate multiple IP addresses with commas (,). You must specify at least one of IpWhitelist and AuthorizationCode. Maximum length: 1000 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.0/24,10.0.0.1</p>
     */
    @NameInMap("IpWhitelist")
    public String ipWhitelist;

    /**
     * <p>The live packaging configuration.</p>
     */
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
     * <p>The protocol. Currently, only HLS is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HLS</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The number of time-shifting days. Maximum value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TimeshiftVision")
    public Integer timeshiftVision;

    public static UpdateLivePackageOriginEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePackageOriginEndpointRequest self = new UpdateLivePackageOriginEndpointRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLivePackageOriginEndpointRequest setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
        return this;
    }
    public String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public UpdateLivePackageOriginEndpointRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public UpdateLivePackageOriginEndpointRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLivePackageOriginEndpointRequest setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public UpdateLivePackageOriginEndpointRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateLivePackageOriginEndpointRequest setIpBlacklist(String ipBlacklist) {
        this.ipBlacklist = ipBlacklist;
        return this;
    }
    public String getIpBlacklist() {
        return this.ipBlacklist;
    }

    public UpdateLivePackageOriginEndpointRequest setIpWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }
    public String getIpWhitelist() {
        return this.ipWhitelist;
    }

    public UpdateLivePackageOriginEndpointRequest setLivePackagingConfig(LivePackagingConfig livePackagingConfig) {
        this.livePackagingConfig = livePackagingConfig;
        return this;
    }
    public LivePackagingConfig getLivePackagingConfig() {
        return this.livePackagingConfig;
    }

    public UpdateLivePackageOriginEndpointRequest setManifestName(String manifestName) {
        this.manifestName = manifestName;
        return this;
    }
    public String getManifestName() {
        return this.manifestName;
    }

    public UpdateLivePackageOriginEndpointRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdateLivePackageOriginEndpointRequest setTimeshiftVision(Integer timeshiftVision) {
        this.timeshiftVision = timeshiftVision;
        return this;
    }
    public Integer getTimeshiftVision() {
        return this.timeshiftVision;
    }

}
