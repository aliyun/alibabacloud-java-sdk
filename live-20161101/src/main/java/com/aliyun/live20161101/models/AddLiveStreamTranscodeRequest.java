// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveStreamTranscodeRequest extends TeaModel {
    /**
     * <p>The name of the application to which the stream belongs.</p>
     * <ul>
     * <li><p>The value of App must be the same as the AppName in the ingest URL for the transcoding template to take effect. The value can be up to 256 characters in length and can contain digits, letters, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>App also supports a single asterisk (\*) as the value, which matches any string including an empty string.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If a transcoding template with App set to a single asterisk (\<em>) is configured: when a user pulls a transcoded stream, the system first matches the transcoding template whose App value is the same as the AppName in the ingest URL. If no such template exists, the system matches the transcoding template with App set to a single asterisk (\</em>).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The streaming domain of the streamer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The encryption configuration. JSON format. The fields are described as follows:</p>
     * <ul>
     * <li>EncryptType: the encryption type. Set the value to <strong>aliyun</strong>.</li>
     * <li>KmsKeyID: the user KMS master key ID.</li>
     * <li>KmsKeyExpireInterval: the key rotation interval. Valid values: <strong>60 to 3600</strong>. Unit: seconds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;EncryptType&quot;: &quot;aliyun&quot;, &quot;KmsKeyID&quot;:&quot;afce5722-81d2-43c3-9930-7601da11****&quot;,&quot;KmsKeyExpireInterval&quot;:&quot;3600&quot;}</p>
     */
    @NameInMap("EncryptParameters")
    public String encryptParameters;

    /**
     * <p>Specifies whether to enable on-demand transcoding. Valid values:</p>
     * <ul>
     * <li><strong>yes</strong>: enables on-demand transcoding.</li>
     * <li><strong>no</strong>: disables on-demand transcoding.</li>
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
     * <p>The region ID. When using SDK 2.0, set this parameter to the region ID that corresponds to the service registration endpoint. When using SDK 1.0, ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The transcoding template. Valid values:</p>
     * <ul>
     * <li><p>Standard quality templates:</p>
     * <ul>
     * <li><p><strong>lld</strong>: low definition.</p>
     * </li>
     * <li><p><strong>lsd</strong>: standard definition.</p>
     * </li>
     * <li><p><strong>lhd</strong>: high definition.</p>
     * </li>
     * <li><p><strong>lud</strong>: ultra-high definition.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Narrowband HD™ transcoding templates:</p>
     * <ul>
     * <li><p><strong>ld</strong>: low definition.</p>
     * </li>
     * <li><p><strong>sd</strong>: standard definition.</p>
     * </li>
     * <li><p><strong>hd</strong>: high definition.</p>
     * </li>
     * <li><p><strong>ud</strong>: ultra-high definition.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsd</p>
     */
    @NameInMap("Template")
    public String template;

    public static AddLiveStreamTranscodeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveStreamTranscodeRequest self = new AddLiveStreamTranscodeRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveStreamTranscodeRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public AddLiveStreamTranscodeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AddLiveStreamTranscodeRequest setEncryptParameters(String encryptParameters) {
        this.encryptParameters = encryptParameters;
        return this;
    }
    public String getEncryptParameters() {
        return this.encryptParameters;
    }

    public AddLiveStreamTranscodeRequest setLazy(String lazy) {
        this.lazy = lazy;
        return this;
    }
    public String getLazy() {
        return this.lazy;
    }

    public AddLiveStreamTranscodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveStreamTranscodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddLiveStreamTranscodeRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
