// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateSentinelManualDegradeRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("FallbackId")
    public Long fallbackId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Lang")
    public String lang;

    public static UpdateSentinelManualDegradeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSentinelManualDegradeRuleRequest self = new UpdateSentinelManualDegradeRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSentinelManualDegradeRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public UpdateSentinelManualDegradeRuleRequest setFallbackId(Long fallbackId) {
        this.fallbackId = fallbackId;
        return this;
    }
    public Long getFallbackId() {
        return this.fallbackId;
    }

    public UpdateSentinelManualDegradeRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSentinelManualDegradeRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
