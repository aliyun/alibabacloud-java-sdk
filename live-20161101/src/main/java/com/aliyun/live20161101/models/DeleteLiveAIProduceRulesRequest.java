// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAIProduceRulesRequest extends TeaModel {
    /**
     * <p>The name of the live stream application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AppName</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The primary streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

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
     * <p>The subtitle rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d -8f29-4bec2eb9****</p>
     */
    @NameInMap("RulesId")
    public String rulesId;

    /**
     * <p>The subtitle suffix. This parameter is required. Otherwise, the InvalidParameter error is returned.</p>
     * <blockquote>
     * <p>Set this parameter to the value of SubtitleName that is specified in the subtitle template.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>et</p>
     */
    @NameInMap("SuffixName")
    public String suffixName;

    public static DeleteLiveAIProduceRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAIProduceRulesRequest self = new DeleteLiveAIProduceRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAIProduceRulesRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DeleteLiveAIProduceRulesRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DeleteLiveAIProduceRulesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteLiveAIProduceRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteLiveAIProduceRulesRequest setRulesId(String rulesId) {
        this.rulesId = rulesId;
        return this;
    }
    public String getRulesId() {
        return this.rulesId;
    }

    public DeleteLiveAIProduceRulesRequest setSuffixName(String suffixName) {
        this.suffixName = suffixName;
        return this;
    }
    public String getSuffixName() {
        return this.suffixName;
    }

}
