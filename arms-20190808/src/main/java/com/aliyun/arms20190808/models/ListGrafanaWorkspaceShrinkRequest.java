// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListGrafanaWorkspaceShrinkRequest extends TeaModel {
    @NameInMap("AliyunLang")
    public String aliyunLang;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public String tagsShrink;

    public static ListGrafanaWorkspaceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGrafanaWorkspaceShrinkRequest self = new ListGrafanaWorkspaceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListGrafanaWorkspaceShrinkRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public ListGrafanaWorkspaceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListGrafanaWorkspaceShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListGrafanaWorkspaceShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
