// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveStreamTranscodeRequest extends TeaModel {
    /**
     * <p>The name of the application to which the stream belongs, and it cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>Streamer domain name, not modifiable.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The encryption configuration. The value is a JSON string. The following fields are included in the syntax:</p>
     * <ul>
     * <li>EncryptType: the type of the encryption. Set the value to <strong>aliyun</strong>.</li>
     * <li>KmsKeyID: the ID of the CMK in KMS.</li>
     * <li>KmsKeyExpireInterval: the validity period of the CMK. Valid values: <strong>60 to 3600</strong>. Unit: seconds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;EncryptType&quot;: &quot;aliyun&quot;, &quot;KmsKeyID&quot;:&quot;afce5722-81d2-43c3-9930-7601da11****&quot;,&quot;KmsKeyExpireInterval&quot;:&quot;3600&quot;}</p>
     */
    @NameInMap("EncryptParameters")
    public String encryptParameters;

    /**
     * <p>Specifies whether to enable triggered transcoding. Valid values:</p>
     * <ul>
     * <li><strong>yes</strong>: enables triggered transcoding.</li>
     * <li><strong>no</strong>: disables triggered transcoding.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
    @NameInMap("Lazy")
    public String lazy;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Transcoding template, not modifiable.</p>
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
