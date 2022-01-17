// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("InstanceItems")
    public DescribeInstancesResponseBodyInstanceItems instanceItems;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ApiJson")
        public String apiJson;

        @NameInMap("AppJson")
        public String appJson;

        @NameInMap("BeganOn")
        public Long beganOn;

        @NameInMap("CreatedOn")
        public Long createdOn;

        @NameInMap("EndOn")
        public Long endOn;

        @NameInMap("ExtendJson")
        public String extendJson;

        @NameInMap("HostJson")
        public String hostJson;

        @NameInMap("IdaasJson")
        public String idaasJson;

        @NameInMap("ImageJson")
        public String imageJson;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ProductSkuCode")
        public String productSkuCode;

        @NameInMap("ProductType")
        public String productType;

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
