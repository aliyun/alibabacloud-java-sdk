// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrdererLogsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>consortium-test-iyuso3g773ki</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Lines")
    public String lines;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>orderer1</p>
     */
    @NameInMap("OrdererName")
    public String ordererName;

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

    public DescribeFabricOrdererLogsRequest setLines(String lines) {
        this.lines = lines;
        return this;
    }
    public String getLines() {
        return this.lines;
    }

    public DescribeFabricOrdererLogsRequest setOrdererName(String ordererName) {
        this.ordererName = ordererName;
        return this;
    }
    public String getOrdererName() {
        return this.ordererName;
    }

}
