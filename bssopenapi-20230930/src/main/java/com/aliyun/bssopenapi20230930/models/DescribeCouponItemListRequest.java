// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeCouponItemListRequest extends TeaModel {
    /**
     * <p>The coupon ID.</p>
     * 
     * <strong>example:</strong>
     * <p>59104570</p>
     */
    @NameInMap("CouponId")
    public Long couponId;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of enterprise entities and accounts. If this parameter is left empty, the current account is queried.</p>
     */
    @NameInMap("EcIdAccountIds")
    public java.util.List<DescribeCouponItemListRequestEcIdAccountIds> ecIdAccountIds;

    /**
     * <p>The product name. Fuzzy matching is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>云服务器ECS</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The level-1 sales channel ID. If this parameter is left empty, the channel ID of the current user is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeCouponItemListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCouponItemListRequest self = new DescribeCouponItemListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCouponItemListRequest setCouponId(Long couponId) {
        this.couponId = couponId;
        return this;
    }
    public Long getCouponId() {
        return this.couponId;
    }

    public DescribeCouponItemListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCouponItemListRequest setEcIdAccountIds(java.util.List<DescribeCouponItemListRequestEcIdAccountIds> ecIdAccountIds) {
        this.ecIdAccountIds = ecIdAccountIds;
        return this;
    }
    public java.util.List<DescribeCouponItemListRequestEcIdAccountIds> getEcIdAccountIds() {
        return this.ecIdAccountIds;
    }

    public DescribeCouponItemListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCouponItemListRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public DescribeCouponItemListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static class DescribeCouponItemListRequestEcIdAccountIds extends TeaModel {
        /**
         * <p>The list of accounts to access. If this parameter is left empty, all accounts under the current entity ID are selected.</p>
         */
        @NameInMap("AccountIds")
        public java.util.List<Long> accountIds;

        /**
         * <p>The enterprise entity ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1004064243473974</p>
         */
        @NameInMap("EcId")
        public String ecId;

        public static DescribeCouponItemListRequestEcIdAccountIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCouponItemListRequestEcIdAccountIds self = new DescribeCouponItemListRequestEcIdAccountIds();
            return TeaModel.build(map, self);
        }

        public DescribeCouponItemListRequestEcIdAccountIds setAccountIds(java.util.List<Long> accountIds) {
            this.accountIds = accountIds;
            return this;
        }
        public java.util.List<Long> getAccountIds() {
            return this.accountIds;
        }

        public DescribeCouponItemListRequestEcIdAccountIds setEcId(String ecId) {
            this.ecId = ecId;
            return this;
        }
        public String getEcId() {
            return this.ecId;
        }

    }

}
