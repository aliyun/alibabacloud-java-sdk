// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeDdosAttackTypeChartResponseBody extends TeaModel {
    @NameInMap("AttckCount")
    public Integer attckCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AttckType")
    public String attckType;

    @NameInMap("DropCount")
    public Integer dropCount;

    @NameInMap("DropType")
    public String dropType;

    public static DescribeDdosAttackTypeChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosAttackTypeChartResponseBody self = new DescribeDdosAttackTypeChartResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDdosAttackTypeChartResponseBody setAttckCount(Integer attckCount) {
        this.attckCount = attckCount;
        return this;
    }
    public Integer getAttckCount() {
        return this.attckCount;
    }

    public DescribeDdosAttackTypeChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDdosAttackTypeChartResponseBody setAttckType(String attckType) {
        this.attckType = attckType;
        return this;
    }
    public String getAttckType() {
        return this.attckType;
    }

    public DescribeDdosAttackTypeChartResponseBody setDropCount(Integer dropCount) {
        this.dropCount = dropCount;
        return this;
    }
    public Integer getDropCount() {
        return this.dropCount;
    }

    public DescribeDdosAttackTypeChartResponseBody setDropType(String dropType) {
        this.dropType = dropType;
        return this;
    }
    public String getDropType() {
        return this.dropType;
    }

}
