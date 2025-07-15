// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamTranscodeRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The transcoding template ID. Valid values:</p>
     * <ul>
     * <li><p>Standard transcoding:</p>
     * <ul>
     * <li>lld: low definition</li>
     * <li>lsd: standard definition</li>
     * <li>lhd: high definition</li>
     * <li>lud : ultra-high definition</li>
     * </ul>
     * </li>
     * <li><p>Narrowband HD™ transcoding:</p>
     * <ul>
     * <li>ld: low definition</li>
     * <li>sd: standard definition</li>
     * <li>hd: high definition</li>
     * <li>ud: ultra-high definition</li>
     * </ul>
     * </li>
     * <li><p>Custom transcoding: a custom ID</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lld</p>
     */
    @NameInMap("Template")
    public String template;

    public static DeleteLiveStreamTranscodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamTranscodeRequest self = new DeleteLiveStreamTranscodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamTranscodeRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DeleteLiveStreamTranscodeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DeleteLiveStreamTranscodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteLiveStreamTranscodeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteLiveStreamTranscodeRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
