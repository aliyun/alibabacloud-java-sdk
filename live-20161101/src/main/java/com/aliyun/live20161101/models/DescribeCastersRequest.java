// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCastersRequest extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("CasterName")
    public String casterName;

    @NameInMap("ChargeType")
    public Integer chargeType;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("NormType")
    public String normType;

    @NameInMap("OrderByModifyAsc")
    public String orderByModifyAsc;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public Integer status;

    public static DescribeCastersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCastersRequest self = new DescribeCastersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCastersRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCastersRequest setCasterName(String casterName) {
        this.casterName = casterName;
        return this;
    }
    public String getCasterName() {
        return this.casterName;
    }

    public DescribeCastersRequest setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public Integer getChargeType() {
        return this.chargeType;
    }

    public DescribeCastersRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeCastersRequest setNormType(String normType) {
        this.normType = normType;
        return this;
    }
    public String getNormType() {
        return this.normType;
    }

    public DescribeCastersRequest setOrderByModifyAsc(String orderByModifyAsc) {
        this.orderByModifyAsc = orderByModifyAsc;
        return this;
    }
    public String getOrderByModifyAsc() {
        return this.orderByModifyAsc;
    }

    public DescribeCastersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCastersRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeCastersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCastersRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeCastersRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
