// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedProductsResponseBody extends TeaModel {
    /**
     * <p>The list of returned Alibaba Cloud services.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Products")
    public java.util.List<GetAccessKeyLastUsedProductsResponseBodyProducts> products;

    /**
     * <p>The request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>145318BE-DEE1-4C57-AA7C-5BE7D34A6AE0</p>
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
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;eventId&quot;: &quot;239EB588-CD24-522E-B0B5-174A1A58****&quot;,
         *   &quot;eventVersion&quot;: 1,
         *   &quot;eventSource&quot;: &quot;ecs.cn-hangzhou.aliyuncs.com&quot;,
         *   &quot;sourceIpAddress&quot;: &quot;<code>10.10.**.**</code>&quot;,
         *   &quot;eventType&quot;: &quot;ApiCall&quot;,
         *   &quot;userIdentity&quot;: {
         *     &quot;accountId&quot;: &quot;104758519118****&quot;,
         *     &quot;principalId&quot;: &quot;24549429003625****&quot;,
         *     &quot;type&quot;: &quot;ram-user&quot;,
         *     &quot;userName&quot;: &quot;alice&quot;
         *   },
         *   &quot;serviceName&quot;: &quot;Ecs&quot;,
         *   &quot;apiVersion&quot;: &quot;2016-01-20&quot;,
         *   &quot;requestId&quot;: &quot;239EB588-CD24-522E-B0B5-174A1A588BE0&quot;,
         *   &quot;eventTime&quot;: &quot;2021-08-05T09:21:32Z&quot;,
         *   &quot;isGlobal&quot;: false,
         *   &quot;acsRegion&quot;: &quot;cn-hangzhou&quot;,
         *   &quot;eventName&quot;: &quot;DescribeInstances&quot;
         * }</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The Chinese name of the Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>Elastic Compute Service (ECS)</p>
         */
        @NameInMap("ServiceNameCn")
        public String serviceNameCn;

        /**
         * <p>The English name of the Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>Elastic Compute Service</p>
         */
        @NameInMap("ServiceNameEn")
        public String serviceNameEn;

        /**
         * <p>The event source.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Internal</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>other events</p>
         * <!-- -->
         * </li>
         * <li><p>ManagementEvent</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>management events</p>
         * <!-- -->
         * </li>
         * <li><p>DataEvent</p>
         * <!-- -->
         * 
         * <p>:</p>
         * <!-- -->
         * 
         * <p>data events</p>
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ManagementEvent</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Unit: millisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>1657247532000</p>
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
