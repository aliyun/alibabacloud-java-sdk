// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveLazyPullStreamInfoConfigRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * <blockquote>
     * <p> If you want to configure triggered stream pulling for all applications, set the value to <strong>ali_all_app</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ali_all_app</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The name of the application for back-to-origin stream pulling.</p>
     * <blockquote>
     * <p> If you want to use the application specified in the streaming URL, leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>livePullApp****</p>
     */
    @NameInMap("PullAppName")
    public String pullAppName;

    /**
     * <p>The origin server address of the live stream. Separate multiple addresses with semicolons (;).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>guide.aliyundoc.com</p>
     */
    @NameInMap("PullDomainName")
    public String pullDomainName;

    /**
     * <p>The protocol for back-to-origin stream pulling. Valid values:</p>
     * <ul>
     * <li><strong>rtmp</strong></li>
     * <li><strong>httpflv</strong></li>
     * <li><strong>hls</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtmp</p>
     */
    @NameInMap("PullProtocol")
    public String pullProtocol;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to trigger stream pulling when the transcoded stream is played. The default value is <strong>no</strong>. Valid values:</p>
     * <ul>
     * <li><strong>yes</strong></li>
     * <li><strong>no</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>no</p>
     */
    @NameInMap("TranscodeLazy")
    public String transcodeLazy;

    public static SetLiveLazyPullStreamInfoConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLiveLazyPullStreamInfoConfigRequest self = new SetLiveLazyPullStreamInfoConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetLiveLazyPullStreamInfoConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SetLiveLazyPullStreamInfoConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetLiveLazyPullStreamInfoConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetLiveLazyPullStreamInfoConfigRequest setPullAppName(String pullAppName) {
        this.pullAppName = pullAppName;
        return this;
    }
    public String getPullAppName() {
        return this.pullAppName;
    }

    public SetLiveLazyPullStreamInfoConfigRequest setPullDomainName(String pullDomainName) {
        this.pullDomainName = pullDomainName;
        return this;
    }
    public String getPullDomainName() {
        return this.pullDomainName;
    }

    public SetLiveLazyPullStreamInfoConfigRequest setPullProtocol(String pullProtocol) {
        this.pullProtocol = pullProtocol;
        return this;
    }
    public String getPullProtocol() {
        return this.pullProtocol;
    }

    public SetLiveLazyPullStreamInfoConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetLiveLazyPullStreamInfoConfigRequest setTranscodeLazy(String transcodeLazy) {
        this.transcodeLazy = transcodeLazy;
        return this;
    }
    public String getTranscodeLazy() {
        return this.transcodeLazy;
    }

}
