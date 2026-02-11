// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ListCouponUsageResponseBody extends TeaModel {
    /**
     * <p>接口状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>返回数据</p>
     */
    @NameInMap("Data")
    public java.util.List<ListCouponUsageResponseBodyData> data;

    /**
     * <p>接口返回提示信息</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>分页信息</p>
     */
    @NameInMap("PageInfo")
    public ListCouponUsageResponseBodyPageInfo pageInfo;

    /**
     * <p>接口请求id返回问题提供查询使用</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCouponUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCouponUsageResponseBody self = new ListCouponUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCouponUsageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCouponUsageResponseBody setData(java.util.List<ListCouponUsageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCouponUsageResponseBodyData> getData() {
        return this.data;
    }

    public ListCouponUsageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCouponUsageResponseBody setPageInfo(ListCouponUsageResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListCouponUsageResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListCouponUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCouponUsageResponseBodyData extends TeaModel {
        /**
         * <p>阿里云账号</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:oqevfbveuadcrduzmf@ttirv.net">oqevfbveuadcrduzmf@ttirv.net</a></p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>优惠券面额</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Amount")
        public Double amount;

        /**
         * <p>余额</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("Balance")
        public Double balance;

        /**
         * <p>优惠券id</p>
         * 
         * <strong>example:</strong>
         * <p>59226280</p>
         */
        @NameInMap("CouponId")
        public String couponId;

        /**
         * <p>优惠券模版id</p>
         * 
         * <strong>example:</strong>
         * <p>503802</p>
         */
        @NameInMap("CouponTemplateId")
        public Long couponTemplateId;

        /**
         * <p>优惠券有效期</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-06 00:00:00 ~ 2023-04-07 00:00:00</p>
         */
        @NameInMap("EffDate")
        public String effDate;

        /**
         * <p>优惠券发放时间</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-06 19:32:10</p>
         */
        @NameInMap("PublishDate")
        public String publishDate;

        /**
         * <p>优惠券状态 </br>
         * AVAILABLE 正常 </br>
         * EXHAUSTED 已用完 </br>
         * EXPIRED 已过期 </br>
         * ABANDONED 已作废 </br></p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>二级分销商Uid</p>
         * 
         * <strong>example:</strong>
         * <p>5248516956402795</p>
         */
        @NameInMap("T2PartnerUid")
        public String t2PartnerUid;

        /**
         * <p>阿里云uid</p>
         * 
         * <strong>example:</strong>
         * <p>1647668856741998</p>
         */
        @NameInMap("Uid")
        public Long uid;

        public static ListCouponUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCouponUsageResponseBodyData self = new ListCouponUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCouponUsageResponseBodyData setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ListCouponUsageResponseBodyData setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }

        public ListCouponUsageResponseBodyData setBalance(Double balance) {
            this.balance = balance;
            return this;
        }
        public Double getBalance() {
            return this.balance;
        }

        public ListCouponUsageResponseBodyData setCouponId(String couponId) {
            this.couponId = couponId;
            return this;
        }
        public String getCouponId() {
            return this.couponId;
        }

        public ListCouponUsageResponseBodyData setCouponTemplateId(Long couponTemplateId) {
            this.couponTemplateId = couponTemplateId;
            return this;
        }
        public Long getCouponTemplateId() {
            return this.couponTemplateId;
        }

        public ListCouponUsageResponseBodyData setEffDate(String effDate) {
            this.effDate = effDate;
            return this;
        }
        public String getEffDate() {
            return this.effDate;
        }

        public ListCouponUsageResponseBodyData setPublishDate(String publishDate) {
            this.publishDate = publishDate;
            return this;
        }
        public String getPublishDate() {
            return this.publishDate;
        }

        public ListCouponUsageResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCouponUsageResponseBodyData setT2PartnerUid(String t2PartnerUid) {
            this.t2PartnerUid = t2PartnerUid;
            return this;
        }
        public String getT2PartnerUid() {
            return this.t2PartnerUid;
        }

        public ListCouponUsageResponseBodyData setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

    public static class ListCouponUsageResponseBodyPageInfo extends TeaModel {
        /**
         * <p>分页，当前页</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>分页，每页数量</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>分页，总量</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListCouponUsageResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCouponUsageResponseBodyPageInfo self = new ListCouponUsageResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListCouponUsageResponseBodyPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListCouponUsageResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCouponUsageResponseBodyPageInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
