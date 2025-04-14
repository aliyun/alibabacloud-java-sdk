// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DescribeCouponItemListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public java.util.List<DescribeCouponItemListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>EAE08A27-386C-579E-966D-8853EC3C5D0E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCouponItemListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCouponItemListResponseBody self = new DescribeCouponItemListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCouponItemListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCouponItemListResponseBody setData(java.util.List<DescribeCouponItemListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeCouponItemListResponseBodyData> getData() {
        return this.data;
    }

    public DescribeCouponItemListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCouponItemListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCouponItemListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCouponItemListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>vm</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("Name")
        public String name;

        public static DescribeCouponItemListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCouponItemListResponseBodyData self = new DescribeCouponItemListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCouponItemListResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeCouponItemListResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
