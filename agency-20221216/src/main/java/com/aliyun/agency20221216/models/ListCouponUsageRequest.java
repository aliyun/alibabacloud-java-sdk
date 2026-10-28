// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ListCouponUsageRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud customer account.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:oqevfbveuadcrduzmf@ttirv.net">oqevfbveuadcrduzmf@ttirv.net</a></p>
     */
    @NameInMap("Account")
    public String account;

    /**
     * <p>The ID of the coupon template.</p>
     * 
     * <strong>example:</strong>
     * <p>5075915</p>
     */
    @NameInMap("CouponTemplateId")
    public Long couponTemplateId;

    /**
     * <p>The page number.</br> 
     * Default value: 1. Minimum value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries per page.</br>
     * Default value: 20. Maximum value: 50. Minimum value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The coupon status. Valid values:</br>
     * AVAILABLE: Normal.</br>
     * EXHAUSTED: Used up.</br>
     * EXPIRED: Expired.</br>
     * ABANDONED: Voided.</br></p>
     * 
     * <strong>example:</strong>
     * <p>AVAILABLE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The UID of the T2 partner. Example: 123456789.</p>
     * 
     * <strong>example:</strong>
     * <p>123456768</p>
     */
    @NameInMap("T2PartnerUid")
    public Long t2PartnerUid;

    /**
     * <p>The UID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>1133166938931507</p>
     */
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

    public ListCouponUsageRequest setT2PartnerUid(Long t2PartnerUid) {
        this.t2PartnerUid = t2PartnerUid;
        return this;
    }
    public Long getT2PartnerUid() {
        return this.t2PartnerUid;
    }

    public ListCouponUsageRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
