// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class UpdateEdgeDevicesRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("CoprId")
    public String coprId;

    @NameInMap("IconPath")
    public String iconPath;

    @NameInMap("Name")
    public String name;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("DetailJson")
    public String detailJson;

    @NameInMap("IsDel")
    public String isDel;

    public static UpdateEdgeDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeDevicesRequest self = new UpdateEdgeDevicesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeDevicesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateEdgeDevicesRequest setCoprId(String coprId) {
        this.coprId = coprId;
        return this;
    }
    public String getCoprId() {
        return this.coprId;
    }

    public UpdateEdgeDevicesRequest setIconPath(String iconPath) {
        this.iconPath = iconPath;
        return this;
    }
    public String getIconPath() {
        return this.iconPath;
    }

    public UpdateEdgeDevicesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateEdgeDevicesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public UpdateEdgeDevicesRequest setDetailJson(String detailJson) {
        this.detailJson = detailJson;
        return this;
    }
    public String getDetailJson() {
        return this.detailJson;
    }

    public UpdateEdgeDevicesRequest setIsDel(String isDel) {
        this.isDel = isDel;
        return this;
    }
    public String getIsDel() {
        return this.isDel;
    }

}
