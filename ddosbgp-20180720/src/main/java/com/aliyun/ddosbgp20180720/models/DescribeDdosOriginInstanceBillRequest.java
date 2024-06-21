// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeDdosOriginInstanceBillRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1711382399410</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsShowList")
    public Boolean isShowList;

    /**
     * <strong>example:</strong>
     * <p>1711209600410</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>function</p>
     */
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
