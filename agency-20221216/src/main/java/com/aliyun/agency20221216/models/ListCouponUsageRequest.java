// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ListCouponUsageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="mailto:oqevfbveuadcrduzmf@ttirv.net">oqevfbveuadcrduzmf@ttirv.net</a></p>
     */
    @NameInMap("Account")
    public String account;

    /**
     * <strong>example:</strong>
     * <p>5075915</p>
     */
    @NameInMap("CouponTemplateId")
    public Long couponTemplateId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>AVAILABLE</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>123456768</p>
     */
    @NameInMap("T2PartnerUid")
    public Long t2PartnerUid;

    /**
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
