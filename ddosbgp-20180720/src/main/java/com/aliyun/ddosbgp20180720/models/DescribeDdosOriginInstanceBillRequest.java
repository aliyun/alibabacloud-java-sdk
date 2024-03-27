// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeDdosOriginInstanceBillRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("IsShowList")
    public Boolean isShowList;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("Type")
    public String type;

    public static DescribeDdosOriginInstanceBillRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosOriginInstanceBillRequest self = new DescribeDdosOriginInstanceBillRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDdosOriginInstanceBillRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeDdosOriginInstanceBillRequest setIsShowList(Boolean isShowList) {
        this.isShowList = isShowList;
        return this;
    }
    public Boolean getIsShowList() {
        return this.isShowList;
    }

    public DescribeDdosOriginInstanceBillRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeDdosOriginInstanceBillRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
