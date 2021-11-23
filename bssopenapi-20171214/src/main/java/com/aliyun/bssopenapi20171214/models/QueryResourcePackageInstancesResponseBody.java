// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryResourcePackageInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryResourcePackageInstancesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static QueryResourcePackageInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryResourcePackageInstancesResponseBody self = new QueryResourcePackageInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryResourcePackageInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryResourcePackageInstancesResponseBody setData(QueryResourcePackageInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryResourcePackageInstancesResponseBodyData getData() {
        return this.data;
    }

    public QueryResourcePackageInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryResourcePackageInstancesResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryResourcePackageInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryResourcePackageInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryResourcePackageInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryResourcePackageInstancesResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryResourcePackageInstancesResponseBodyDataInstancesInstanceApplicableProducts extends TeaModel {
        @NameInMap("Product")
        public java.util.List<String> product;

        public static QueryResourcePackageInstancesResponseBodyDataInstancesInstanceApplicableProducts build(java.util.Map<String, ?> map) throws Exception {
            QueryResourcePackageInstancesResponseBodyDataInstancesInstanceApplicableProducts self = new QueryResourcePackageInstancesResponseBodyDataInstancesInstanceApplicableProducts();
            return TeaModel.build(map, self);
        }

        public QueryResourcePackageInstancesResponseBodyDataInstancesInstanceApplicableProducts setProduct(java.util.List<String> product) {
            this.product = product;
            return this;
        }
        public java.util.List<String> getProduct() {
            return this.product;
        }

    }

    public static class QueryResourcePackageInstancesResponseBodyDataInstancesInstance extends TeaModel {
        @NameInMap("ApplicableProducts")
        public QueryResourcePackageInstancesResponseBodyDataInstancesInstanceApplicableProducts applicableProducts;

        @NameInMap("DeductType")
        public String deductType;

        @NameInMap("EffectiveTime")
        public String effectiveTime;

        @NameInMap("ExpiryTime")
        public String expiryTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PackageType")
        public String packageType;

        @NameInMap("Region")
        public String region;

        @NameInMap("RemainingAmount")
        public String remainingAmount;

        @NameInMap("RemainingAmountUnit")
        public String remainingAmountUnit;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalAmount")
        public String totalAmount;

        @NameInMap("TotalAmountUnit")
        public String totalAmountUnit;

        public static QueryResourcePackageInstancesResponseBodyDataInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            QueryResourcePackageInstancesResponseBodyDataInstancesInstance self = new QueryResourcePackageInstancesResponseBodyDataInstancesInstance();
            return TeaModel.build(map, self);
        }

        public QueryResourcePackageInstancesResponseBodyDataInstancesInstance setApplicableProducts(QueryResourcePackageInstancesResponseBodyDataInstancesInstanceApplicableProducts applicableProducts) {
            this.applicableProducts = applicableProducts;
            return this;
        }
        public QueryResourcePackageInstancesResponseBodyDataInstancesInstanceApplicableProducts getApplicableProducts() {
            return this.applicableProducts;
        }

        public QueryResourcePackageInstancesResponseBodyDataInstancesInstance setDeductType(String deductType) {
            this.deductType = deductType;
            return this;
        }
        public String getDeductType() {
            return this.deductType;
        }

        public QueryResourcePackageInstancesResponseBodyDataInstancesInstance setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public QueryResourcePackageInstancesResponseBodyDataInstancesInstance setExpiryTime(String expiryTime) {
            this.expiryTime = expiryTime;
            return this;
        }
        public String getExpiryTime() {
            return this.expiryTime;
        }

        public QueryResourcePackageInstancesResponseBodyDataInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryResourcePackageInstancesResponseBodyDataInstancesInstance setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

        public QueryResourcePackageInstancesResponseBodyDataInstancesInstance setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryResourcePackageInstancesResponseBodyDataInstancesInstance setRemainingAmount(String remainingAmount) {
            this.remainingAmount = remainingAmount;
            return this;
        }
        public String getRemainingAmount() {
            return this.remainingAmount;
        }

        public QueryResourcePackageInstancesResponseBodyDataInstancesInstance setRemainingAmountUnit(String remainingAmountUnit) {
            this.remainingAmountUnit = remainingAmountUnit;
            return this;
        }
        public String getRemainingAmountUnit() {
            return this.remainingAmountUnit;
        }

        public QueryResourcePackageInstancesResponseBodyDataInstancesInstance setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryResourcePackageInstancesResponseBodyDataInstancesInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryResourcePackageInstancesResponseBodyDataInstancesInstance setTotalAmount(String totalAmount) {
            this.totalAmount = totalAmount;
            return this;
        }
        public String getTotalAmount() {
            return this.totalAmount;
        }

        public QueryResourcePackageInstancesResponseBodyDataInstancesInstance setTotalAmountUnit(String totalAmountUnit) {
            this.totalAmountUnit = totalAmountUnit;
            return this;
        }
        public String getTotalAmountUnit() {
            return this.totalAmountUnit;
        }

    }

    public static class QueryResourcePackageInstancesResponseBodyDataInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<QueryResourcePackageInstancesResponseBodyDataInstancesInstance> instance;

        public static QueryResourcePackageInstancesResponseBodyDataInstances build(java.util.Map<String, ?> map) throws Exception {
            QueryResourcePackageInstancesResponseBodyDataInstances self = new QueryResourcePackageInstancesResponseBodyDataInstances();
            return TeaModel.build(map, self);
        }

        public QueryResourcePackageInstancesResponseBodyDataInstances setInstance(java.util.List<QueryResourcePackageInstancesResponseBodyDataInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<QueryResourcePackageInstancesResponseBodyDataInstancesInstance> getInstance() {
            return this.instance;
        }

    }

    public static class QueryResourcePackageInstancesResponseBodyData extends TeaModel {
        @NameInMap("HostId")
        public String hostId;

        @NameInMap("Instances")
        public QueryResourcePackageInstancesResponseBodyDataInstances instances;

        @NameInMap("PageNum")
        public String pageNum;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("TotalCount")
        public String totalCount;

        public static QueryResourcePackageInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryResourcePackageInstancesResponseBodyData self = new QueryResourcePackageInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryResourcePackageInstancesResponseBodyData setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public QueryResourcePackageInstancesResponseBodyData setInstances(QueryResourcePackageInstancesResponseBodyDataInstances instances) {
            this.instances = instances;
            return this;
        }
        public QueryResourcePackageInstancesResponseBodyDataInstances getInstances() {
            return this.instances;
        }

        public QueryResourcePackageInstancesResponseBodyData setPageNum(String pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public String getPageNum() {
            return this.pageNum;
        }

        public QueryResourcePackageInstancesResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public QueryResourcePackageInstancesResponseBodyData setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
