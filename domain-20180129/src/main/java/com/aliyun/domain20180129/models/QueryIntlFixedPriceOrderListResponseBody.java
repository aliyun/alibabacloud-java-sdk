// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryIntlFixedPriceOrderListResponseBody extends TeaModel {
    @NameInMap("Module")
    public QueryIntlFixedPriceOrderListResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>D6CB3623-4726-4947-AC2B-2C6E673B447C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryIntlFixedPriceOrderListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIntlFixedPriceOrderListResponseBody self = new QueryIntlFixedPriceOrderListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIntlFixedPriceOrderListResponseBody setModule(QueryIntlFixedPriceOrderListResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryIntlFixedPriceOrderListResponseBodyModule getModule() {
        return this.module;
    }

    public QueryIntlFixedPriceOrderListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryIntlFixedPriceOrderListResponseBodyModuleData extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("OrderType")
        public Integer orderType;

        @NameInMap("Price")
        public Long price;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("UserId")
        public String userId;

        public static QueryIntlFixedPriceOrderListResponseBodyModuleData build(java.util.Map<String, ?> map) throws Exception {
            QueryIntlFixedPriceOrderListResponseBodyModuleData self = new QueryIntlFixedPriceOrderListResponseBodyModuleData();
            return TeaModel.build(map, self);
        }

        public QueryIntlFixedPriceOrderListResponseBodyModuleData setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryIntlFixedPriceOrderListResponseBodyModuleData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryIntlFixedPriceOrderListResponseBodyModuleData setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryIntlFixedPriceOrderListResponseBodyModuleData setOrderType(Integer orderType) {
            this.orderType = orderType;
            return this;
        }
        public Integer getOrderType() {
            return this.orderType;
        }

        public QueryIntlFixedPriceOrderListResponseBodyModuleData setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public QueryIntlFixedPriceOrderListResponseBodyModuleData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryIntlFixedPriceOrderListResponseBodyModuleData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public QueryIntlFixedPriceOrderListResponseBodyModuleData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryIntlFixedPriceOrderListResponseBodyModule extends TeaModel {
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        @NameInMap("Data")
        public java.util.List<QueryIntlFixedPriceOrderListResponseBodyModuleData> data;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalItemNum")
        public Integer totalItemNum;

        @NameInMap("TotalPageNum")
        public Integer totalPageNum;

        public static QueryIntlFixedPriceOrderListResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryIntlFixedPriceOrderListResponseBodyModule self = new QueryIntlFixedPriceOrderListResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryIntlFixedPriceOrderListResponseBodyModule setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public QueryIntlFixedPriceOrderListResponseBodyModule setData(java.util.List<QueryIntlFixedPriceOrderListResponseBodyModuleData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryIntlFixedPriceOrderListResponseBodyModuleData> getData() {
            return this.data;
        }

        public QueryIntlFixedPriceOrderListResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryIntlFixedPriceOrderListResponseBodyModule setTotalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        public QueryIntlFixedPriceOrderListResponseBodyModule setTotalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

    }

}
