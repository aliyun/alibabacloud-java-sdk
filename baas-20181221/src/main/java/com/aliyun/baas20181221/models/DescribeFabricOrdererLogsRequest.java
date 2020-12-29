// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrdererLogsRequest extends TeaModel {
    @NameInMap("ConsortiumId")
    public String consortiumId;

    @NameInMap("OrdererName")
    public String ordererName;

    @NameInMap("Lines")
    public String lines;

    public static DescribeFabricOrdererLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrdererLogsRequest self = new DescribeFabricOrdererLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrdererLogsRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DescribeFabricOrdererLogsRequest setOrdererName(String ordererName) {
        this.ordererName = ordererName;
        return this;
    }
    public String getOrdererName() {
        return this.ordererName;
    }

    public DescribeFabricOrdererLogsRequest setLines(String lines) {
        this.lines = lines;
        return this;
    }
    public String getLines() {
        return this.lines;
    }

}
