// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateComponentLayoutsRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("UserLayouts")
    public String userLayouts;

    public static UpdateComponentLayoutsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateComponentLayoutsRequest self = new UpdateComponentLayoutsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateComponentLayoutsRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public UpdateComponentLayoutsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateComponentLayoutsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateComponentLayoutsRequest setUserLayouts(String userLayouts) {
        this.userLayouts = userLayouts;
        return this;
    }
    public String getUserLayouts() {
        return this.userLayouts;
    }

}
