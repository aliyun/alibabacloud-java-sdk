// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveStreamTranscodeRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * <ul>
     * <li>The transcoding template takes effect only if the value of this parameter is the same as the application name that is specified in the ingest URL. The name can be up to 256 characters in length and can contain digits, letters, hyphens (-), and underscores (_).</li>
     * <li>You can also set this parameter to an asterisk (\<em>). Asterisks (\</em>) can match any string, including an empty string.</li>
     * </ul>
     * <blockquote>
     * <p> If you configure a transcoding template for which App is set to an asterisk (\*), the transcoding template is used only if no transcoding template for which App is set to the same value as AppName in the ingest URL exists.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The name of the main streaming domain.</p>
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
     * <p>Specifies whether to use the load-on-demand mechanism for transcoding. Default value: <strong>yes</strong>.</p>
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
     * <p>The transcoding template. Valid values:</p>
     * <ul>
     * <li><p>Standard transcoding template:</p>
     * <ul>
     * <li><strong>lld</strong>: low definition</li>
     * <li><strong>lsd</strong>: standard definition</li>
     * <li><strong>lhd</strong>: high definition</li>
     * <li><strong>lud</strong>: ultra-high definition</li>
     * </ul>
     * </li>
     * <li><p>Narrowband HD™ transcoding template:</p>
     * <ul>
     * <li><strong>ld</strong>: low definition</li>
     * <li><strong>sd</strong>: standard definition</li>
     * <li><strong>hd</strong>: high definition</li>
     * <li><strong>ud</strong>: ultra-high definition</li>
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
