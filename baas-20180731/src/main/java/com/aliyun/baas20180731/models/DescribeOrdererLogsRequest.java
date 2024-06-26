// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrdererLogsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    @NameInMap("Lines")
    public String lines;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrdererName")
    public String ordererName;

    public static DescribeOrdererLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrdererLogsRequest self = new DescribeOrdererLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOrdererLogsRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DescribeOrdererLogsRequest setLines(String lines) {
        this.lines = lines;
        return this;
    }
    public String getLines() {
        return this.lines;
    }

    public DescribeOrdererLogsRequest setOrdererName(String ordererName) {
        this.ordererName = ordererName;
        return this;
    }
    public String getOrdererName() {
        return this.ordererName;
    }

}
