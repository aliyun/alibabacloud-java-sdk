// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class OverViewOfAppsWithRelationshipRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static OverViewOfAppsWithRelationshipRequest build(java.util.Map<String, ?> map) throws Exception {
        OverViewOfAppsWithRelationshipRequest self = new OverViewOfAppsWithRelationshipRequest();
        return TeaModel.build(map, self);
    }

    public OverViewOfAppsWithRelationshipRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public OverViewOfAppsWithRelationshipRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public OverViewOfAppsWithRelationshipRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
