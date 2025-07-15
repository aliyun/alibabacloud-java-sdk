// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAIProduceRulesRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs. The name can be up to 256 characters in length and can contain digits, letters, hyphens (-), and underscores (_). The name must be the same as the application name in the ingest URL. Otherwise, the rule does not take effect.</p>
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
     * <p>Specifies whether to trigger the subtitle rule when stream pulling starts. Valid values:</p>
     * <ul>
     * <li>true: generates live subtitles when stream pulling starts and stops generating live subtitles when no stream is pulled for 5 minutes. When stream pulling restarts, live subtitles are generated again.</li>
     * <li>false: generates live subtitles when stream ingest starts, regardless of whether stream pulling starts.</li>
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
     * <li><code>lp_ld</code>: landscape low definition 360p (640×360)</li>
     * <li><code>lp_ld_v</code>: portrait low definition 360p (360×640)</li>
     * <li><code>lp_sd</code>: landscape standard definition 480p (854×480)</li>
     * <li><code>lp_sd_v</code>: portrait standard definition 480p (480×854)</li>
     * <li><code>lp_hd</code>: landscape high definition 720p (1280×720)</li>
     * <li><code>lp_hd_v</code>: portrait high definition 720p (720×1280)</li>
     * <li><code>lp_ud</code>: landscape ultra-high definition 1080p (1920×1080)</li>
     * <li><code>lp_ud_v</code>: portrait ultra-high definition 1080p (1080×1920)</li>
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
