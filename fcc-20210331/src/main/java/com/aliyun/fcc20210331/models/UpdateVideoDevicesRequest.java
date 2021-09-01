// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class UpdateVideoDevicesRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("StreamUrl")
    public String streamUrl;

    @NameInMap("EdgeDeviceId")
    public String edgeDeviceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Status")
    public String status;

    @NameInMap("DetailJson")
    public String detailJson;

    @NameInMap("IsDel")
    public String isDel;

    @NameInMap("Id")
    public String id;

    public static UpdateVideoDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoDevicesRequest self = new UpdateVideoDevicesRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVideoDevicesRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public UpdateVideoDevicesRequest setStreamUrl(String streamUrl) {
        this.streamUrl = streamUrl;
        return this;
    }
    public String getStreamUrl() {
        return this.streamUrl;
    }

    public UpdateVideoDevicesRequest setEdgeDeviceId(String edgeDeviceId) {
        this.edgeDeviceId = edgeDeviceId;
        return this;
    }
    public String getEdgeDeviceId() {
        return this.edgeDeviceId;
    }

    public UpdateVideoDevicesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateVideoDevicesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateVideoDevicesRequest setDetailJson(String detailJson) {
        this.detailJson = detailJson;
        return this;
    }
    public String getDetailJson() {
        return this.detailJson;
    }

    public UpdateVideoDevicesRequest setIsDel(String isDel) {
        this.isDel = isDel;
        return this;
    }
    public String getIsDel() {
        return this.isDel;
    }

    public UpdateVideoDevicesRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
