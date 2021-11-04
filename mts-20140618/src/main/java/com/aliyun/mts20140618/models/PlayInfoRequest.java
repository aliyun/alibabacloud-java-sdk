// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class PlayInfoRequest extends TeaModel {
    @NameInMap("AuthInfo")
    public String authInfo;

    @NameInMap("AuthTimeout")
    public Long authTimeout;

    @NameInMap("Formats")
    public String formats;

    @NameInMap("HlsUriToken")
    public String hlsUriToken;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("PlayDomain")
    public String playDomain;

    @NameInMap("Rand")
    public String rand;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

    @NameInMap("Terminal")
    public String terminal;

    public static PlayInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        PlayInfoRequest self = new PlayInfoRequest();
        return TeaModel.build(map, self);
    }

    public PlayInfoRequest setAuthInfo(String authInfo) {
        this.authInfo = authInfo;
        return this;
    }
    public String getAuthInfo() {
        return this.authInfo;
    }

    public PlayInfoRequest setAuthTimeout(Long authTimeout) {
        this.authTimeout = authTimeout;
        return this;
    }
    public Long getAuthTimeout() {
        return this.authTimeout;
    }

    public PlayInfoRequest setFormats(String formats) {
        this.formats = formats;
        return this;
    }
    public String getFormats() {
        return this.formats;
    }

    public PlayInfoRequest setHlsUriToken(String hlsUriToken) {
        this.hlsUriToken = hlsUriToken;
        return this;
    }
    public String getHlsUriToken() {
        return this.hlsUriToken;
    }

    public PlayInfoRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public PlayInfoRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public PlayInfoRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public PlayInfoRequest setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }
    public String getPlayDomain() {
        return this.playDomain;
    }

    public PlayInfoRequest setRand(String rand) {
        this.rand = rand;
        return this;
    }
    public String getRand() {
        return this.rand;
    }

    public PlayInfoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public PlayInfoRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public PlayInfoRequest setTerminal(String terminal) {
        this.terminal = terminal;
        return this;
    }
    public String getTerminal() {
        return this.terminal;
    }

}
