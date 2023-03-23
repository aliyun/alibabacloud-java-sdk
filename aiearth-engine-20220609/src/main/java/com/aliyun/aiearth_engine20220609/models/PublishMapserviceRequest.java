// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class PublishMapserviceRequest extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProjectionType")
    public String projectionType;

    @NameInMap("ZoomLevelMax")
    public Integer zoomLevelMax;

    @NameInMap("ZoomLevelMin")
    public Integer zoomLevelMin;

    public static PublishMapserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishMapserviceRequest self = new PublishMapserviceRequest();
        return TeaModel.build(map, self);
    }

    public PublishMapserviceRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public PublishMapserviceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PublishMapserviceRequest setProjectionType(String projectionType) {
        this.projectionType = projectionType;
        return this;
    }
    public String getProjectionType() {
        return this.projectionType;
    }

    public PublishMapserviceRequest setZoomLevelMax(Integer zoomLevelMax) {
        this.zoomLevelMax = zoomLevelMax;
        return this;
    }
    public Integer getZoomLevelMax() {
        return this.zoomLevelMax;
    }

    public PublishMapserviceRequest setZoomLevelMin(Integer zoomLevelMin) {
        this.zoomLevelMin = zoomLevelMin;
        return this;
    }
    public Integer getZoomLevelMin() {
        return this.zoomLevelMin;
    }

}
