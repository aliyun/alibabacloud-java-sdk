// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveAIProduceRulesRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AppName</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The description of the subtitle rule. The description can be up to 128 characters in length and can contain letters, digits, and special characters.</p>
     * 
     * <strong>example:</strong>
     * <p>live AI subtitle template</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>Specifies whether to generate live subtitles when stream pulling starts. Valid values:</p>
     * <ul>
     * <li>true: generates live subtitles when stream pulling starts and stops generating live subtitles when no streams are pulled for 5 minutes. When stream pulling restarts, live subtitles are generated again.</li>
     * <li>false: generates live subtitles when stream ingest starts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsLazy")
    public Boolean isLazy;

    /**
     * <p>The specification of the output subtitles. Valid values:</p>
     * <ul>
     * <li><code>lp_ld</code>: 360p (640 × 360)</li>
     * <li><code>lp_ld_v</code>: 360p (360 × 640)</li>
     * <li><code>lp_sd</code>: 480p (854 × 480)</li>
     * <li><code>lp_sd_v</code>: 480p (480 × 854)</li>
     * <li><code>lp_hd</code>: 720p (1280 × 720)</li>
     * <li><code>lp_hd_v</code>: 720p (720 × 1280)</li>
     * <li><code>lp_ud</code>: 1080p (1920 × 1080)</li>
     * <li><code>lp_ud_v</code>: 1080p (1080 × 1920)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lp_ld</p>
     */
    @NameInMap("LiveTemplate")
    public String liveTemplate;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the subtitle rule.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d -8f29-4bec2eb9****</p>
     */
    @NameInMap("RulesId")
    public String rulesId;

    /**
     * <p>The name of the virtual background template.</p>
     * 
     * <strong>example:</strong>
     * <p>sub02</p>
     */
    @NameInMap("StudioName")
    public String studioName;

    /**
     * <p>The ID of the subtitle template.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("SubtitleId")
    public String subtitleId;

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

    public static UpdateLiveAIProduceRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveAIProduceRulesRequest self = new UpdateLiveAIProduceRulesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveAIProduceRulesRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public UpdateLiveAIProduceRulesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateLiveAIProduceRulesRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateLiveAIProduceRulesRequest setIsLazy(Boolean isLazy) {
        this.isLazy = isLazy;
        return this;
    }
    public Boolean getIsLazy() {
        return this.isLazy;
    }

    public UpdateLiveAIProduceRulesRequest setLiveTemplate(String liveTemplate) {
        this.liveTemplate = liveTemplate;
        return this;
    }
    public String getLiveTemplate() {
        return this.liveTemplate;
    }

    public UpdateLiveAIProduceRulesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLiveAIProduceRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateLiveAIProduceRulesRequest setRulesId(String rulesId) {
        this.rulesId = rulesId;
        return this;
    }
    public String getRulesId() {
        return this.rulesId;
    }

    public UpdateLiveAIProduceRulesRequest setStudioName(String studioName) {
        this.studioName = studioName;
        return this;
    }
    public String getStudioName() {
        return this.studioName;
    }

    public UpdateLiveAIProduceRulesRequest setSubtitleId(String subtitleId) {
        this.subtitleId = subtitleId;
        return this;
    }
    public String getSubtitleId() {
        return this.subtitleId;
    }

    public UpdateLiveAIProduceRulesRequest setSubtitleName(String subtitleName) {
        this.subtitleName = subtitleName;
        return this;
    }
    public String getSubtitleName() {
        return this.subtitleName;
    }

    public UpdateLiveAIProduceRulesRequest setSuffix(String suffix) {
        this.suffix = suffix;
        return this;
    }
    public String getSuffix() {
        return this.suffix;
    }

}
