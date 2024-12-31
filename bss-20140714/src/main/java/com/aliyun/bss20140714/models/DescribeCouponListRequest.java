// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class DescribeCouponListRequest extends TeaModel {
    @NameInMap("EndDeliveryTime")
    public String endDeliveryTime;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartDeliveryTime")
    public String startDeliveryTime;

    @NameInMap("Status")
    public String status;

    public static DescribeCouponListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCouponListRequest self = new DescribeCouponListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCouponListRequest setEndDeliveryTime(String endDeliveryTime) {
        this.endDeliveryTime = endDeliveryTime;
        return this;
    }
    public String getEndDeliveryTime() {
        return this.endDeliveryTime;
    }

    public DescribeCouponListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeCouponListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCouponListRequest setStartDeliveryTime(String startDeliveryTime) {
        this.startDeliveryTime = startDeliveryTime;
        return this;
    }
    public String getStartDeliveryTime() {
        return this.startDeliveryTime;
    }

    public DescribeCouponListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
