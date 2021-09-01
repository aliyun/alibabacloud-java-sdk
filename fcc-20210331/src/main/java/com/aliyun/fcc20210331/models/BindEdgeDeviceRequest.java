// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class BindEdgeDeviceRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("EdgeDeviceId")
    public String edgeDeviceId;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("Id")
    public String id;

    public static BindEdgeDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindEdgeDeviceRequest self = new BindEdgeDeviceRequest();
        return TeaModel.build(map, self);
    }

    public BindEdgeDeviceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BindEdgeDeviceRequest setEdgeDeviceId(String edgeDeviceId) {
        this.edgeDeviceId = edgeDeviceId;
        return this;
    }
    public String getEdgeDeviceId() {
        return this.edgeDeviceId;
    }

    public BindEdgeDeviceRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public BindEdgeDeviceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
