// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveStreamTranscodeRequest extends TeaModel {
    /**
     * <p>The AppName of the live stream. This parameter cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The streaming domain. This parameter cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The encryption settings, formatted as a JSON string.</p>
     * <ul>
     * <li><p><strong>EncryptType</strong>: The encryption type. Set the value to aliyun.</p>
     * </li>
     * <li><p><strong>KmsKeyID</strong>: The ID of the customer master key (CMK) in Key Management Service (KMS).</p>
     * </li>
     * <li><p><strong>KmsKeyExpireInterval</strong>: The key rotation period. Unit: seconds. Valid values: <strong>60 to 3600.</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When you use Digital Rights Management (DRM) encryption, you cannot modify <strong>KmsKeyID</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;EncryptType&quot;: &quot;aliyun&quot;, &quot;KmsKeyID&quot;:&quot;afce5722-81d2-43c3-9930-7601da11****&quot;,&quot;KmsKeyExpireInterval&quot;:&quot;3600&quot;}</p>
     */
    @NameInMap("EncryptParameters")
    public String encryptParameters;

    /**
     * <p>Specifies whether to enable on-demand transcoding. Valid values:</p>
     * <ul>
     * <li><p><strong>yes</strong>: Transcoding only starts when the first viewer requests this transcoded stream.</p>
     * </li>
     * <li><p><strong>no</strong>: Transcoding starts immediately after the stream is published.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
    @NameInMap("Lazy")
    public String lazy;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The transcoding template name. This parameter cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsd</p>
     */
    @NameInMap("Template")
    public String template;

    public static UpdateLiveStreamTranscodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveStreamTranscodeRequest self = new UpdateLiveStreamTranscodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveStreamTranscodeRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public UpdateLiveStreamTranscodeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateLiveStreamTranscodeRequest setEncryptParameters(String encryptParameters) {
        this.encryptParameters = encryptParameters;
        return this;
    }
    public String getEncryptParameters() {
        return this.encryptParameters;
    }

    public UpdateLiveStreamTranscodeRequest setLazy(String lazy) {
        this.lazy = lazy;
        return this;
    }
    public String getLazy() {
        return this.lazy;
    }

    public UpdateLiveStreamTranscodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLiveStreamTranscodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateLiveStreamTranscodeRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
