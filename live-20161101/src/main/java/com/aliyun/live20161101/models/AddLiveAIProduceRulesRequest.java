// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAIProduceRulesRequest extends TeaModel {
    /**
     * <p>The name of the live streaming application. The name can be up to 256 characters long and can contain digits, uppercase and lowercase letters, hyphens (-), and underscores (_). The AppName must match the AppName in the ingest URL for the template to take effect.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AppName</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The description of the subtitle rule. The description can contain Chinese and English characters, digits, and special characters. It can be up to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>live AI subtitle template</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>Specifies whether the rule is triggered by stream pulling. Valid values:</p>
     * <ul>
     * <li><p>true: Subtitles are generated when stream pulling starts. If no stream is pulled for 5 minutes, subtitle generation stops. Subtitle generation resumes when stream pulling starts again.</p>
     * </li>
     * <li><p>false: Subtitles are generated when stream ingest starts, regardless of whether a stream is being pulled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsLazy")
    public Boolean isLazy;

    /**
     * <p>The specifications of the output subtitles. Valid values:</p>
     * <ul>
     * <li><p>Landscape low definition 360p (640 × 360): <code>lp_ld</code></p>
     * </li>
     * <li><p>Portrait low definition 360p (360 × 640): <code>lp_ld_v</code></p>
     * </li>
     * <li><p>Landscape standard definition 480p (854 × 480): <code>lp_sd</code></p>
     * </li>
     * <li><p>Portrait standard definition 480p (480 × 854): <code>lp_sd_v</code></p>
     * </li>
     * <li><p>Landscape high definition 720p (1280 × 720): <code>lp_hd</code></p>
     * </li>
     * <li><p>Portrait high definition 720p (720 × 1280): <code>lp_hd_v</code></p>
     * </li>
     * <li><p>Landscape ultra high definition 1080p (1920 × 1080): <code>lp_ud</code></p>
     * </li>
     * <li><p>Portrait ultra high definition 1080p (1080 × 1920): <code>lp_ud_v</code></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lp_ld</p>
     */
    @NameInMap("LiveTemplate")
    public String liveTemplate;

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
     * <p>The name of the virtual background template.</p>
     * 
     * <strong>example:</strong>
     * <p>sub02</p>
     */
    @NameInMap("StudioName")
    public String studioName;

    /**
     * <p>The name of the subtitle template.</p>
     * 
     * <strong>example:</strong>
     * <p>sub01</p>
     */
    @NameInMap("SubtitleName")
    public String subtitleName;

    /**
     * <p>The suffix to match.</p>
     * 
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("Suffix")
    public String suffix;

    public static AddLiveAIProduceRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAIProduceRulesRequest self = new AddLiveAIProduceRulesRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveAIProduceRulesRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public AddLiveAIProduceRulesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddLiveAIProduceRulesRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AddLiveAIProduceRulesRequest setIsLazy(Boolean isLazy) {
        this.isLazy = isLazy;
        return this;
    }
    public Boolean getIsLazy() {
        return this.isLazy;
    }

    public AddLiveAIProduceRulesRequest setLiveTemplate(String liveTemplate) {
        this.liveTemplate = liveTemplate;
        return this;
    }
    public String getLiveTemplate() {
        return this.liveTemplate;
    }

    public AddLiveAIProduceRulesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveAIProduceRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddLiveAIProduceRulesRequest setStudioName(String studioName) {
        this.studioName = studioName;
        return this;
    }
    public String getStudioName() {
        return this.studioName;
    }

    public AddLiveAIProduceRulesRequest setSubtitleName(String subtitleName) {
        this.subtitleName = subtitleName;
        return this;
    }
    public String getSubtitleName() {
        return this.subtitleName;
    }

    public AddLiveAIProduceRulesRequest setSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }
    public String getSuffix() {
        return this.suffix;
    }

}
