// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ListCouponUsageRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("CouponTemplateId")
    public Long couponTemplateId;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public String status;

    @NameInMap("Uid")
    public Long uid;

    public static ListCouponUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCouponUsageRequest self = new ListCouponUsageRequest();
        return TeaModel.build(map, self);
    }

    public ListCouponUsageRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public ListCouponUsageRequest setCouponTemplateId(Long couponTemplateId) {
        this.couponTemplateId = couponTemplateId;
        return this;
    }
    public Long getCouponTemplateId() {
        return this.couponTemplateId;
    }

    public ListCouponUsageRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListCouponUsageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCouponUsageRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListCouponUsageRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
