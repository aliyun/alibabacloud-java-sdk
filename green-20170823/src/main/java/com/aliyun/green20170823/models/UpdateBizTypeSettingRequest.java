// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateBizTypeSettingRequest extends TeaModel {
    @NameInMap("Ad")
    public String ad;

    @NameInMap("Antispam")
    public String antispam;

    @NameInMap("BizTypeName")
    public String bizTypeName;

    @NameInMap("Live")
    public String live;

    @NameInMap("Porn")
    public String porn;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Terrorism")
    public String terrorism;

    public static UpdateBizTypeSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizTypeSettingRequest self = new UpdateBizTypeSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBizTypeSettingRequest setAd(String ad) {
        this.ad = ad;
        return this;
    }
    public String getAd() {
        return this.ad;
    }

    public UpdateBizTypeSettingRequest setAntispam(String antispam) {
        this.antispam = antispam;
        return this;
    }
    public String getAntispam() {
        return this.antispam;
    }

    public UpdateBizTypeSettingRequest setBizTypeName(String bizTypeName) {
        this.bizTypeName = bizTypeName;
        return this;
    }
    public String getBizTypeName() {
        return this.bizTypeName;
    }

    public UpdateBizTypeSettingRequest setLive(String live) {
        this.live = live;
        return this;
    }
    public String getLive() {
        return this.live;
    }

    public UpdateBizTypeSettingRequest setPorn(String porn) {
        this.porn = porn;
        return this;
    }
    public String getPorn() {
        return this.porn;
    }

    public UpdateBizTypeSettingRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UpdateBizTypeSettingRequest setTerrorism(String terrorism) {
        this.terrorism = terrorism;
        return this;
    }
    public String getTerrorism() {
        return this.terrorism;
    }

}
