// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateLivePackageOriginEndpointRequest extends TeaModel {
    /**
     * <p>回源授权码，与IpWhitelist必选其一</p>
     * 
     * <strong>example:</strong>
     * <p>AbcDef123</p>
     */
    @NameInMap("AuthorizationCode")
    public String authorizationCode;

    /**
     * <p>频道名称。
     * 1 ~ 200个字符。
     * 正则匹配输入：[A-Za-z0-9_-]+</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>channel-1</p>
     */
    @NameInMap("ChannelName")
    public String channelName;

    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>端点描述，最大1000个字符</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>端点名称，要求在单个频道中唯一。
     * 1 ~ 200个字符。
     * 正则匹配输入：[A-Za-z0-9_-]+</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>endpoint-1</p>
     */
    @NameInMap("EndpointName")
    public String endpointName;

    /**
     * <p>频道组名称。
     * 1 ~ 200个字符。
     * 正则匹配输入：[A-Za-z0-9_-]+</p>
     * <p>This parameter is required.</p>
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
     * <p>播放列表名，缺省为manifest。
     * 1 ~ 100个字符。
     * 正则匹配输入：[A-Za-z0-9_]+</p>
     * 
     * <strong>example:</strong>
     * <p>manifest</p>
     */
    @NameInMap("ManifestName")
    public String manifestName;

    /**
     * <p>端点分发协议，暂只支持HLS</p>
     * <p>This parameter is required.</p>
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

    public static CreateLivePackageOriginEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePackageOriginEndpointRequest self = new CreateLivePackageOriginEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateLivePackageOriginEndpointRequest setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
        return this;
    }
    public String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public CreateLivePackageOriginEndpointRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

    public CreateLivePackageOriginEndpointRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateLivePackageOriginEndpointRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLivePackageOriginEndpointRequest setEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }
    public String getEndpointName() {
        return this.endpointName;
    }

    public CreateLivePackageOriginEndpointRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateLivePackageOriginEndpointRequest setIpBlacklist(String ipBlacklist) {
        this.ipBlacklist = ipBlacklist;
        return this;
    }
    public String getIpBlacklist() {
        return this.ipBlacklist;
    }

    public CreateLivePackageOriginEndpointRequest setIpWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }
    public String getIpWhitelist() {
        return this.ipWhitelist;
    }

    public CreateLivePackageOriginEndpointRequest setManifestName(String manifestName) {
        this.manifestName = manifestName;
        return this;
    }
    public String getManifestName() {
        return this.manifestName;
    }

    public CreateLivePackageOriginEndpointRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateLivePackageOriginEndpointRequest setTimeshiftVision(Integer timeshiftVision) {
        this.timeshiftVision = timeshiftVision;
        return this;
    }
    public Integer getTimeshiftVision() {
        return this.timeshiftVision;
    }

}
