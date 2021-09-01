// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class AddEdgeDevicesRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("IconPath")
    public String iconPath;

    @NameInMap("Name")
    public String name;

    @NameInMap("DetailJson")
    public String detailJson;

    public static AddEdgeDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEdgeDevicesRequest self = new AddEdgeDevicesRequest();
        return TeaModel.build(map, self);
    }

    public AddEdgeDevicesRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public AddEdgeDevicesRequest setIconPath(String iconPath) {
        this.iconPath = iconPath;
        return this;
    }
    public String getIconPath() {
        return this.iconPath;
    }

    public AddEdgeDevicesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddEdgeDevicesRequest setDetailJson(String detailJson) {
        this.detailJson = detailJson;
        return this;
    }
    public String getDetailJson() {
        return this.detailJson;
    }

}
