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

    public static class QueryResourcePackageInstancesResponseDataInstancesInstanceApplicableProducts extends TeaModel {
        @NameInMap("Product")
        @Validation(required = true)
        public java.util.List<String> product;

        public static QueryResourcePackageInstancesResponseDataInstancesInstanceApplicableProducts build(java.util.Map<String, ?> map) throws Exception {
            QueryResourcePackageInstancesResponseDataInstancesInstanceApplicableProducts self = new QueryResourcePackageInstancesResponseDataInstancesInstanceApplicableProducts();
            return TeaModel.build(map, self);
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

    }

    public static class QueryResourcePackageInstancesResponseDataInstances extends TeaModel {
        @NameInMap("Instance")
        @Validation(required = true)
        public java.util.List<QueryResourcePackageInstancesResponseDataInstancesInstance> instance;

        public static QueryResourcePackageInstancesResponseDataInstances build(java.util.Map<String, ?> map) throws Exception {
            QueryResourcePackageInstancesResponseDataInstances self = new QueryResourcePackageInstancesResponseDataInstances();
            return TeaModel.build(map, self);
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

    }

}
