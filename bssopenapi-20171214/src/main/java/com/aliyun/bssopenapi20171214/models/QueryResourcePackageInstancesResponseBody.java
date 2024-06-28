// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryResourcePackageInstancesResponseBody extends TeaModel {
    /**
     * <p>The status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public QueryResourcePackageInstancesResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful!</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
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
        /**
         * <p>The services to which the resource plan is applicable.</p>
         */
        @NameInMap("ApplicableProducts")
        public QueryResourcePackageInstancesResponseBodyDataInstancesInstanceApplicableProducts applicableProducts;

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The deduction type. Example: Absolute.</p>
         * 
         * <strong>example:</strong>
         * <p>Absolute</p>
         */
        @NameInMap("DeductType")
        public String deductType;

        /**
         * <p>The time when the resource plan took effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-12T09:51:56Z</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <p>The time when the resource plan expired.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-12T16:00:00Z</p>
         */
        @NameInMap("ExpiryTime")
        public String expiryTime;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>OSSBAG-cn-v0h1s4hma01</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p>FPT_ossbag_absolute_Storage_sh</p>
         */
        @NameInMap("PackageType")
        public String packageType;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The remaining quota.</p>
         * 
         * <strong>example:</strong>
         * <p>40.000</p>
         */
        @NameInMap("RemainingAmount")
        public String remainingAmount;

        /**
         * <p>The unit of the remaining quota.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
        @NameInMap("RemainingAmountUnit")
        public String remainingAmountUnit;

        /**
         * <p>The remarks on the resource plan. The remarks must be made in Chinese.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The status of the resource plan. Valid values:</p>
         * <ul>
         * <li>Available</li>
         * <li>Expired</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total quota of the resource plan.</p>
         * 
         * <strong>example:</strong>
         * <p>40.000</p>
         */
        @NameInMap("TotalAmount")
        public String totalAmount;

        /**
         * <p>The unit of the total quota.</p>
         * 
         * <strong>example:</strong>
         * <p>GB</p>
         */
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

        public QueryResourcePackageInstancesResponseBodyDataInstancesInstance setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
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
        /**
         * <p>The ID of the host.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The details of the instances.</p>
         */
        @NameInMap("Instances")
        public QueryResourcePackageInstancesResponseBodyDataInstances instances;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public String pageNum;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
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
