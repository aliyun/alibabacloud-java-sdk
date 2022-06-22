// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateCommercialSwitchRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Suspend")
    public Integer suspend;

    public static UpdateCommercialSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCommercialSwitchRequest self = new UpdateCommercialSwitchRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCommercialSwitchRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public UpdateCommercialSwitchRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateCommercialSwitchRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateCommercialSwitchRequest setSuspend(Integer suspend) {
        this.suspend = suspend;
        return this;
    }
    public Integer getSuspend() {
        return this.suspend;
    }

}
