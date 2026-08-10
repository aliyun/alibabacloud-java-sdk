// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLivePackageOriginEndpointShrinkRequest extends TeaModel {
    /**
     * <p>The authorization code. You must specify at least one of AuthorizationCode and IpWhitelist. Maximum length: 200 characters. Format: [A-Za-z0-9-_.]+</p>
     * 
     * <strong>example:</strong>
     * <p>AbcDef123</p>
     */
    @NameInMap("AuthorizationCode")
    public String authorizationCode;

    /**
     * <p>The name of the channel.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>channel-1</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>0311a423d11a5f7dee713535</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>This is an origin endpoint.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the origin endpoint. The name must contain only letters, digits, hyphens (-), and underscores (<em>). The name must be 1 to 200 characters in length. Format: [A-Za-z0-9</em>-]+</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>endpoint-1</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>The name of the channel group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>channel-group-1</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The IP blacklist. Subnet masks are supported. The value 0.0.0.0/0 is not allowed. Separate multiple IP addresses with commas (,). Maximum length: 1000 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>103.21.222.1/32,192.168.100.0/24</p>
     */
    @NameInMap("IpBlacklist")
    public String ipBlacklist;

    /**
     * <p>The IP whitelist. Subnet masks are supported. The value 0.0.0.0/0 is not allowed. Separate multiple IP addresses with commas (,). You must specify at least one of IpWhitelist and AuthorizationCode. Maximum length: 1000 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.0/24,10.0.0.1/24</p>
     */
    @NameInMap("IpWhitelist")
    public String ipWhitelist;

    /**
     * <p>The live packaging configuration.</p>
     */
    @NameInMap("LivePackagingConfig")
    public String livePackagingConfigShrink;

    /**
     * <p>The manifest name. Default value: manifest.</p>
     * 
     * <strong>example:</strong>
     * <p>manifest</p>
     */
    @NameInMap("ManifestName")
    public String manifestName;

    /**
     * <p>The distribution protocol.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HLS</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The number of days for time-shifting. Maximum value: 30. Default value: 0, which indicates that time-shifting is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TimeshiftVision")
    public Integer timeshiftVision;

    public static CreateLivePackageOriginEndpointShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePackageOriginEndpointShrinkRequest self = new CreateLivePackageOriginEndpointShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLivePackageOriginEndpointShrinkRequest setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
        return this;
    }
    public String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public CreateLivePackageOriginEndpointShrinkRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public CreateLivePackageOriginEndpointShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateLivePackageOriginEndpointShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLivePackageOriginEndpointShrinkRequest setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public CreateLivePackageOriginEndpointShrinkRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateLivePackageOriginEndpointShrinkRequest setIpBlacklist(String ipBlacklist) {
        this.ipBlacklist = ipBlacklist;
        return this;
    }
    public String getIpBlacklist() {
        return this.ipBlacklist;
    }

    public CreateLivePackageOriginEndpointShrinkRequest setIpWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }
    public String getIpWhitelist() {
        return this.ipWhitelist;
    }

    public CreateLivePackageOriginEndpointShrinkRequest setLivePackagingConfigShrink(String livePackagingConfigShrink) {
        this.livePackagingConfigShrink = livePackagingConfigShrink;
        return this;
    }
    public String getLivePackagingConfigShrink() {
        return this.livePackagingConfigShrink;
    }

    public CreateLivePackageOriginEndpointShrinkRequest setManifestName(String manifestName) {
        this.manifestName = manifestName;
        return this;
    }
    public String getManifestName() {
        return this.manifestName;
    }

    public CreateLivePackageOriginEndpointShrinkRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateLivePackageOriginEndpointShrinkRequest setTimeshiftVision(Integer timeshiftVision) {
        this.timeshiftVision = timeshiftVision;
        return this;
    }
    public Integer getTimeshiftVision() {
        return this.timeshiftVision;
    }

}
