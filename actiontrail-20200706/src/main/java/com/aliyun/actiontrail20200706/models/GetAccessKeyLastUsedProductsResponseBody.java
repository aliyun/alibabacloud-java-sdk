// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedProductsResponseBody extends TeaModel {
    /**
     * <p>The list of returned Alibaba Cloud services.</p>
     */
    @NameInMap("Products")
    public java.util.List<GetAccessKeyLastUsedProductsResponseBodyProducts> products;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAccessKeyLastUsedProductsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedProductsResponseBody self = new GetAccessKeyLastUsedProductsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedProductsResponseBody setProducts(java.util.List<GetAccessKeyLastUsedProductsResponseBodyProducts> products) {
        this.products = products;
        return this;
    }
    public java.util.List<GetAccessKeyLastUsedProductsResponseBodyProducts> getProducts() {
        return this.products;
    }

    public GetAccessKeyLastUsedProductsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAccessKeyLastUsedProductsResponseBodyProducts extends TeaModel {
        /**
         * <p>The event details.</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The Alibaba Cloud service.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The Chinese name of the Alibaba Cloud service.</p>
         */
        @NameInMap("ServiceNameCn")
        public String serviceNameCn;

        /**
         * <p>The English name of the Alibaba Cloud service.</p>
         */
        @NameInMap("ServiceNameEn")
        public String serviceNameEn;

        /**
         * <p>The event source.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Internal</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    other events</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   ManagementEvent</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    management events</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   DataEvent</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    data events</p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Unit: millisecond.</p>
         */
        @NameInMap("UsedTimestamp")
        public Long usedTimestamp;

        public static GetAccessKeyLastUsedProductsResponseBodyProducts build(java.util.Map<String, ?> map) throws Exception {
            GetAccessKeyLastUsedProductsResponseBodyProducts self = new GetAccessKeyLastUsedProductsResponseBodyProducts();
            return TeaModel.build(map, self);
        }

        public GetAccessKeyLastUsedProductsResponseBodyProducts setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetAccessKeyLastUsedProductsResponseBodyProducts setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetAccessKeyLastUsedProductsResponseBodyProducts setServiceNameCn(String serviceNameCn) {
            this.serviceNameCn = serviceNameCn;
            return this;
        }
        public String getServiceNameCn() {
            return this.serviceNameCn;
        }

        public GetAccessKeyLastUsedProductsResponseBodyProducts setServiceNameEn(String serviceNameEn) {
            this.serviceNameEn = serviceNameEn;
            return this;
        }
        public String getServiceNameEn() {
            return this.serviceNameEn;
        }

        public GetAccessKeyLastUsedProductsResponseBodyProducts setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetAccessKeyLastUsedProductsResponseBodyProducts setUsedTimestamp(Long usedTimestamp) {
            this.usedTimestamp = usedTimestamp;
            return this;
        }
        public Long getUsedTimestamp() {
            return this.usedTimestamp;
        }

    }

}
