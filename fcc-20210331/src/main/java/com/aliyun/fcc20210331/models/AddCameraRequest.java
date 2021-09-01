// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class AddCameraRequest extends TeaModel {
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

    public static AddCameraRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCameraRequest self = new AddCameraRequest();
        return TeaModel.build(map, self);
    }

    public AddCameraRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public AddCameraRequest setStreamUrl(String streamUrl) {
        this.streamUrl = streamUrl;
        return this;
    }
    public String getStreamUrl() {
        return this.streamUrl;
    }

    public AddCameraRequest setEdgeDeviceId(String edgeDeviceId) {
        this.edgeDeviceId = edgeDeviceId;
        return this;
    }
    public String getEdgeDeviceId() {
        return this.edgeDeviceId;
    }

    public AddCameraRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddCameraRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AddCameraRequest setDetailJson(String detailJson) {
        this.detailJson = detailJson;
        return this;
    }
    public String getDetailJson() {
        return this.detailJson;
    }

}
