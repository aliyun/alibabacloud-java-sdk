// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryResourcePackageInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Page")
    @Validation(required = true)
    public Integer page;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryResourcePackageInstancesResponseData data;

    public static QueryResourcePackageInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryResourcePackageInstancesResponse self = new QueryResourcePackageInstancesResponse();
        return TeaModel.build(map, self);
    }

    public QueryResourcePackageInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryResourcePackageInstancesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryResourcePackageInstancesResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryResourcePackageInstancesResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryResourcePackageInstancesResponse setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryResourcePackageInstancesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryResourcePackageInstancesResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public QueryResourcePackageInstancesResponse setData(QueryResourcePackageInstancesResponseData data) {
        this.data = data;
        return this;
    }
    public QueryResourcePackageInstancesResponseData getData() {
        return this.data;
    }

    public static class QueryResourcePackageInstancesResponseDataInstancesInstanceApplicableProducts extends TeaModel {
        // Product
        @NameInMap("Product")
        @Validation(required = true)
        public java.util.List<String> product;

        public static QueryResourcePackageInstancesResponseDataInstancesInstanceApplicableProducts build(java.util.Map<String, ?> map) throws Exception {
            QueryResourcePackageInstancesResponseDataInstancesInstanceApplicableProducts self = new QueryResourcePackageInstancesResponseDataInstancesInstanceApplicableProducts();
            return TeaModel.build(map, self);
        }

        public QueryResourcePackageInstancesResponseDataInstancesInstanceApplicableProducts setProduct(java.util.List<String> product) {
            this.product = product;
            return this;
        }
        public java.util.List<String> getProduct() {
            return this.product;
        }

    }

    public static class QueryResourcePackageInstancesResponseDataInstancesInstance extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("TotalAmount")
        @Validation(required = true)
        public String totalAmount;

        @NameInMap("TotalAmountUnit")
        @Validation(required = true)
        public String totalAmountUnit;

        @NameInMap("RemainingAmount")
        @Validation(required = true)
        public String remainingAmount;

        @NameInMap("RemainingAmountUnit")
        @Validation(required = true)
        public String remainingAmountUnit;

        @NameInMap("EffectiveTime")
        @Validation(required = true)
        public String effectiveTime;

        @NameInMap("ExpiryTime")
        @Validation(required = true)
        public String expiryTime;

        @NameInMap("Remark")
        @Validation(required = true)
        public String remark;

        @NameInMap("PackageType")
        @Validation(required = true)
        public String packageType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("DeductType")
        @Validation(required = true)
        public String deductType;

        @NameInMap("ApplicableProducts")
        @Validation(required = true)
        public QueryResourcePackageInstancesResponseDataInstancesInstanceApplicableProducts applicableProducts;

        public static QueryResourcePackageInstancesResponseDataInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            QueryResourcePackageInstancesResponseDataInstancesInstance self = new QueryResourcePackageInstancesResponseDataInstancesInstance();
            return TeaModel.build(map, self);
        }

        public QueryResourcePackageInstancesResponseDataInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryResourcePackageInstancesResponseDataInstancesInstance setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryResourcePackageInstancesResponseDataInstancesInstance setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public String getTotalAmount() {
            return this.totalAmount;
        }

        public QueryResourcePackageInstancesResponseDataInstancesInstance setTotalAmountUnit(String totalAmountUnit) {
            this.totalAmountUnit = totalAmountUnit;
            return this;
        }
        public String getTotalAmountUnit() {
            return this.totalAmountUnit;
        }

        public QueryResourcePackageInstancesResponseDataInstancesInstance setRemainingAmount(String remainingAmount) {
            this.remainingAmount = remainingAmount;
            return this;
        }
        public String getRemainingAmount() {
            return this.remainingAmount;
        }

        public QueryResourcePackageInstancesResponseDataInstancesInstance setRemainingAmountUnit(String remainingAmountUnit) {
            this.remainingAmountUnit = remainingAmountUnit;
            return this;
        }
        public String getRemainingAmountUnit() {
            return this.remainingAmountUnit;
        }

        public QueryResourcePackageInstancesResponseDataInstancesInstance setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public QueryResourcePackageInstancesResponseDataInstancesInstance setExpiryTime(String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        public String getExpiryTime() {
            return this.expiryTime;
        }

        public QueryResourcePackageInstancesResponseDataInstancesInstance setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryResourcePackageInstancesResponseDataInstancesInstance setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public QueryResourcePackageInstancesResponseDataInstancesInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryResourcePackageInstancesResponseDataInstancesInstance setDeductType(String deductType) {
            this.deductType = deductType;
            return this;
        }
        public String getDeductType() {
            return this.deductType;
        }

        public QueryResourcePackageInstancesResponseDataInstancesInstance setApplicableProducts(QueryResourcePackageInstancesResponseDataInstancesInstanceApplicableProducts applicableProducts) {
            this.applicableProducts = applicableProducts;
            return this;
        }
        public QueryResourcePackageInstancesResponseDataInstancesInstanceApplicableProducts getApplicableProducts() {
            return this.applicableProducts;
        }

    }

    public static class QueryResourcePackageInstancesResponseDataInstances extends TeaModel {
        @NameInMap("Instance")
        @Validation(required = true)
        public java.util.List<QueryResourcePackageInstancesResponseDataInstancesInstance> instance;

        public static QueryResourcePackageInstancesResponseDataInstances build(java.util.Map<String, ?> map) throws Exception {
            QueryResourcePackageInstancesResponseDataInstances self = new QueryResourcePackageInstancesResponseDataInstances();
            return TeaModel.build(map, self);
        }

        public QueryResourcePackageInstancesResponseDataInstances setInstance(java.util.List<QueryResourcePackageInstancesResponseDataInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<QueryResourcePackageInstancesResponseDataInstancesInstance> getInstance() {
            return this.instance;
        }

    }

    public static class QueryResourcePackageInstancesResponseData extends TeaModel {
        @NameInMap("HostId")
        @Validation(required = true)
        public String hostId;

        @NameInMap("PageNum")
        @Validation(required = true)
        public String pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public String pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public String totalCount;

        @NameInMap("Instances")
        @Validation(required = true)
        public QueryResourcePackageInstancesResponseDataInstances instances;

        public static QueryResourcePackageInstancesResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryResourcePackageInstancesResponseData self = new QueryResourcePackageInstancesResponseData();
            return TeaModel.build(map, self);
        }

        public QueryResourcePackageInstancesResponseData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public QueryResourcePackageInstancesResponseData setPageNum(String pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public String getPageNum() {
            return this.pageNum;
        }

        public QueryResourcePackageInstancesResponseData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public QueryResourcePackageInstancesResponseData setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

        public QueryResourcePackageInstancesResponseData setInstances(QueryResourcePackageInstancesResponseDataInstances instances) {
            this.instances = instances;
            return this;
        }
        public QueryResourcePackageInstancesResponseDataInstances getInstances() {
            return this.instances;
        }

    }

}
