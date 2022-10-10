// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListCouponTemplateRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryCouponTemplateListDTO")
    public ListCouponTemplateRequestQueryCouponTemplateListDTO queryCouponTemplateListDTO;

    public static ListCouponTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCouponTemplateRequest self = new ListCouponTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListCouponTemplateRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListCouponTemplateRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCouponTemplateRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCouponTemplateRequest setQueryCouponTemplateListDTO(ListCouponTemplateRequestQueryCouponTemplateListDTO queryCouponTemplateListDTO) {
        this.queryCouponTemplateListDTO = queryCouponTemplateListDTO;
        return this;
    }
    public ListCouponTemplateRequestQueryCouponTemplateListDTO getQueryCouponTemplateListDTO() {
        return this.queryCouponTemplateListDTO;
    }

    public static class ListCouponTemplateRequestQueryCouponTemplateListDTO extends TeaModel {
        @NameInMap("AlipayQuery")
        public Boolean alipayQuery;

        @NameInMap("CouponTitle")
        public String couponTitle;

        @NameInMap("CouponType")
        public Integer couponType;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        public static ListCouponTemplateRequestQueryCouponTemplateListDTO build(java.util.Map<String, ?> map) throws Exception {
            ListCouponTemplateRequestQueryCouponTemplateListDTO self = new ListCouponTemplateRequestQueryCouponTemplateListDTO();
            return TeaModel.build(map, self);
        }

        public ListCouponTemplateRequestQueryCouponTemplateListDTO setAlipayQuery(Boolean alipayQuery) {
            this.alipayQuery = alipayQuery;
            return this;
        }
        public Boolean getAlipayQuery() {
            return this.alipayQuery;
        }

        public ListCouponTemplateRequestQueryCouponTemplateListDTO setCouponTitle(String couponTitle) {
            this.couponTitle = couponTitle;
            return this;
        }
        public String getCouponTitle() {
            return this.couponTitle;
        }

        public ListCouponTemplateRequestQueryCouponTemplateListDTO setCouponType(Integer couponType) {
            this.couponType = couponType;
            return this;
        }
        public Integer getCouponType() {
            return this.couponType;
        }

        public ListCouponTemplateRequestQueryCouponTemplateListDTO setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListCouponTemplateRequestQueryCouponTemplateListDTO setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListCouponTemplateRequestQueryCouponTemplateListDTO setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
