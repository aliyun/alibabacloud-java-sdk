// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeCouponItemListShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>59104570</p>
     */
    @NameInMap("CouponId")
    public Long couponId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EcIdAccountIds")
    public String ecIdAccountIdsShrink;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeCouponItemListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCouponItemListShrinkRequest self = new DescribeCouponItemListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCouponItemListShrinkRequest setCouponId(Long couponId) {
        this.couponId = couponId;
        return this;
    }
    public Long getCouponId() {
        return this.couponId;
    }

    public DescribeCouponItemListShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCouponItemListShrinkRequest setEcIdAccountIdsShrink(String ecIdAccountIdsShrink) {
        this.ecIdAccountIdsShrink = ecIdAccountIdsShrink;
        return this;
    }
    public String getEcIdAccountIdsShrink() {
        return this.ecIdAccountIdsShrink;
    }

    public DescribeCouponItemListShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCouponItemListShrinkRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public DescribeCouponItemListShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
