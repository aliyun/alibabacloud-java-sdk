// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListResellersResponseBody extends TeaModel {
    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAW8kZY+u1sYOaYf5JmgmDQQ=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A361BA9E-xxxx-xxxx-xxxx-C26E5180456E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>distributor informations</p>
     */
    @NameInMap("SupplierInformation")
    public java.util.List<ListResellersResponseBodySupplierInformation> supplierInformation;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListResellersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResellersResponseBody self = new ListResellersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResellersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResellersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResellersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResellersResponseBody setSupplierInformation(java.util.List<ListResellersResponseBodySupplierInformation> supplierInformation) {
        this.supplierInformation = supplierInformation;
        return this;
    }
    public java.util.List<ListResellersResponseBodySupplierInformation> getSupplierInformation() {
        return this.supplierInformation;
    }

    public ListResellersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListResellersResponseBodySupplierInformation extends TeaModel {
        /**
         * <p>The description of distributor.</p>
         * 
         * <strong>example:</strong>
         * <p>It is a XXXX  company</p>
         */
        @NameInMap("SupplierDesc")
        public String supplierDesc;

        /**
         * <p>The Logo of distributor</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://service-info-public.oss-cn-hangzhou.aliyuncs.com/31978070/service-image/d5c3b585-ff6b-4e4e-8885-xxxx.png">https://service-info-public.oss-cn-hangzhou.aliyuncs.com/31978070/service-image/d5c3b585-ff6b-4e4e-8885-xxxx.png</a></p>
         */
        @NameInMap("SupplierLogo")
        public String supplierLogo;

        /**
         * <p>The name of the distributor</p>
         * 
         * <strong>example:</strong>
         * <p>Distributor A</p>
         */
        @NameInMap("SupplierName")
        public String supplierName;

        /**
         * <p>The Alibaba Cloud account ID of the distributor.</p>
         * 
         * <strong>example:</strong>
         * <p>152xxxxxxxxxxx</p>
         */
        @NameInMap("SupplierUid")
        public Long supplierUid;

        /**
         * <p>The URL of the distributor.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
         */
        @NameInMap("SupplierUrl")
        public String supplierUrl;

        public static ListResellersResponseBodySupplierInformation build(java.util.Map<String, ?> map) throws Exception {
            ListResellersResponseBodySupplierInformation self = new ListResellersResponseBodySupplierInformation();
            return TeaModel.build(map, self);
        }

        public ListResellersResponseBodySupplierInformation setSupplierDesc(String supplierDesc) {
            this.supplierDesc = supplierDesc;
            return this;
        }
        public String getSupplierDesc() {
            return this.supplierDesc;
        }

        public ListResellersResponseBodySupplierInformation setSupplierLogo(String supplierLogo) {
            this.supplierLogo = supplierLogo;
            return this;
        }
        public String getSupplierLogo() {
            return this.supplierLogo;
        }

        public ListResellersResponseBodySupplierInformation setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public ListResellersResponseBodySupplierInformation setSupplierUid(Long supplierUid) {
            this.supplierUid = supplierUid;
            return this;
        }
        public Long getSupplierUid() {
            return this.supplierUid;
        }

        public ListResellersResponseBodySupplierInformation setSupplierUrl(String supplierUrl) {
            this.supplierUrl = supplierUrl;
            return this;
        }
        public String getSupplierUrl() {
            return this.supplierUrl;
        }

    }

}
