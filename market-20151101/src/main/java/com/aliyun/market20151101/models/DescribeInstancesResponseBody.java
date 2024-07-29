// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("InstanceItems")
    public DescribeInstancesResponseBodyInstanceItems instanceItems;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>54C22FB9-0CB1-5629-97A8-653FC7990F00</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>55</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setInstanceItems(DescribeInstancesResponseBodyInstanceItems instanceItems) {
        this.instanceItems = instanceItems;
        return this;
    }
    public DescribeInstancesResponseBodyInstanceItems getInstanceItems() {
        return this.instanceItems;
    }

    public DescribeInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstancesResponseBodyInstanceItemsInstanceItem extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ApiJson")
        public String apiJson;

        /**
         * <strong>example:</strong>
         * <p>{&quot;frontEndUrl&quot;:&quot;https://<em><strong>.aliyun.com&quot;,&quot;password&quot;:&quot;Sjtv</strong></em>&quot;,&quot;adminUrl&quot;:&quot;https://<em><strong>.aiiyun.com&quot;,&quot;username&quot;:&quot;aliyun</strong></em>&quot;}</p>
         */
        @NameInMap("AppJson")
        public String appJson;

        /**
         * <strong>example:</strong>
         * <p>1570634021000</p>
         */
        @NameInMap("BeganOn")
        public Long beganOn;

        /**
         * <strong>example:</strong>
         * <p>1570634021000</p>
         */
        @NameInMap("CreatedOn")
        public Long createdOn;

        /**
         * <strong>example:</strong>
         * <p>1570644021000</p>
         */
        @NameInMap("EndOn")
        public Long endOn;

        @NameInMap("ExtendJson")
        public String extendJson;

        /**
         * <strong>example:</strong>
         * <p>{&quot;password&quot;:&quot;<em><strong>&quot;,&quot;ip&quot;:&quot;118.31.</strong></em>.41&quot;,&quot;innerIp&quot;:&quot;118.31.<em><strong>.41&quot;,&quot;region&quot;:&quot;&quot;,&quot;username&quot;:&quot;</strong></em>&quot;,&quot;beianInfo&quot;:&quot;&quot;}</p>
         */
        @NameInMap("HostJson")
        public String hostJson;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("IdaasJson")
        public String idaasJson;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ImageJson")
        public String imageJson;

        /**
         * <strong>example:</strong>
         * <p>1551111111</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <strong>example:</strong>
         * <p>204211111111111</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <strong>example:</strong>
         * <p>cmgj00**11</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductName")
        public String productName;

        /**
         * <strong>example:</strong>
         * <p>cmgj00**11-prepay</p>
         */
        @NameInMap("ProductSkuCode")
        public String productSkuCode;

        /**
         * <strong>example:</strong>
         * <p>APP</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <strong>example:</strong>
         * <p>OPENED</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("SupplierName")
        public String supplierName;

        public static DescribeInstancesResponseBodyInstanceItemsInstanceItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstanceItemsInstanceItem self = new DescribeInstancesResponseBodyInstanceItemsInstanceItem();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstanceItemsInstanceItem setApiJson(String apiJson) {
            this.apiJson = apiJson;
            return this;
        }
        public String getApiJson() {
            return this.apiJson;
        }

        public DescribeInstancesResponseBodyInstanceItemsInstanceItem setAppJson(String appJson) {
            this.appJson = appJson;
            return this;
        }
        public String getAppJson() {
            return this.appJson;
        }

        public DescribeInstancesResponseBodyInstanceItemsInstanceItem setBeganOn(Long beganOn) {
            this.beganOn = beganOn;
            return this;
        }
        public Long getBeganOn() {
            return this.beganOn;
        }

        public DescribeInstancesResponseBodyInstanceItemsInstanceItem setCreatedOn(Long createdOn) {
            this.createdOn = createdOn;
            return this;
        }
        public Long getCreatedOn() {
            return this.createdOn;
        }

        public DescribeInstancesResponseBodyInstanceItemsInstanceItem setEndOn(Long endOn) {
            this.endOn = endOn;
            return this;
        }
        public Long getEndOn() {
            return this.endOn;
        }

        public DescribeInstancesResponseBodyInstanceItemsInstanceItem setExtendJson(String extendJson) {
            this.extendJson = extendJson;
            return this;
        }
        public String getExtendJson() {
            return this.extendJson;
        }

        public DescribeInstancesResponseBodyInstanceItemsInstanceItem setHostJson(String hostJson) {
            this.hostJson = hostJson;
            return this;
        }
        public String getHostJson() {
            return this.hostJson;
        }

        public DescribeInstancesResponseBodyInstanceItemsInstanceItem setIdaasJson(String idaasJson) {
            this.idaasJson = idaasJson;
            return this;
        }
        public String getIdaasJson() {
            return this.idaasJson;
        }

        public DescribeInstancesResponseBodyInstanceItemsInstanceItem setImageJson(String imageJson) {
            this.imageJson = imageJson;
            return this;
        }
        public String getImageJson() {
            return this.imageJson;
        }

        public DescribeInstancesResponseBodyInstanceItemsInstanceItem setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseBodyInstanceItemsInstanceItem setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public DescribeInstancesResponseBodyInstanceItemsInstanceItem setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeInstancesResponseBodyInstanceItemsInstanceItem setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeInstancesResponseBodyInstanceItemsInstanceItem setProductSkuCode(String productSkuCode) {
            this.productSkuCode = productSkuCode;
            return this;
        }
        public String getProductSkuCode() {
            return this.productSkuCode;
        }

        public DescribeInstancesResponseBodyInstanceItemsInstanceItem setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public DescribeInstancesResponseBodyInstanceItemsInstanceItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstancesResponseBodyInstanceItemsInstanceItem setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

    }

    public static class DescribeInstancesResponseBodyInstanceItems extends TeaModel {
        @NameInMap("InstanceItem")
        public java.util.List<DescribeInstancesResponseBodyInstanceItemsInstanceItem> instanceItem;

        public static DescribeInstancesResponseBodyInstanceItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstanceItems self = new DescribeInstancesResponseBodyInstanceItems();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstanceItems setInstanceItem(java.util.List<DescribeInstancesResponseBodyInstanceItemsInstanceItem> instanceItem) {
            this.instanceItem = instanceItem;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstanceItemsInstanceItem> getInstanceItem() {
            return this.instanceItem;
        }

    }

}
