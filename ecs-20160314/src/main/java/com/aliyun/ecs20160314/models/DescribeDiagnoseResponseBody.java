// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeDiagnoseResponseBody extends TeaModel {
    @NameInMap("DiagnoseInstances")
    public DiagnoseInstances diagnoseInstances;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDiagnoseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnoseResponseBody self = new DescribeDiagnoseResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnoseResponseBody setDiagnoseInstances(DiagnoseInstances diagnoseInstances) {
        this.diagnoseInstances = diagnoseInstances;
        return this;
    }
    public DiagnoseInstances getDiagnoseInstances() {
        return this.diagnoseInstances;
    }

    public DescribeDiagnoseResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDiagnoseResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDiagnoseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiagnoseResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DiagnoseInstance extends TeaModel {
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DiagnoseAction")
        public String diagnoseAction;

        @NameInMap("DiagnoseId")
        public String diagnoseId;

        @NameInMap("DiagnoseRequestId")
        public String diagnoseRequestId;

        @NameInMap("DiskCategory")
        public String diskCategory;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceTypeName")
        public String instanceTypeName;

        @NameInMap("IzNo")
        public String izNo;

        @NameInMap("Mark")
        public String mark;

        @NameInMap("ModificationTime")
        public String modificationTime;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("PeriodUnit")
        public String periodUnit;

        @NameInMap("Product")
        public String product;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Solutions")
        public String solutions;

        @NameInMap("Star")
        public Integer star;

        @NameInMap("Status")
        public String status;

        public static DiagnoseInstance build(java.util.Map<String, ?> map) throws Exception {
            DiagnoseInstance self = new DiagnoseInstance();
            return TeaModel.build(map, self);
        }

        public DiagnoseInstance setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public DiagnoseInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DiagnoseInstance setDiagnoseAction(String diagnoseAction) {
            this.diagnoseAction = diagnoseAction;
            return this;
        }
        public String getDiagnoseAction() {
            return this.diagnoseAction;
        }

        public DiagnoseInstance setDiagnoseId(String diagnoseId) {
            this.diagnoseId = diagnoseId;
            return this;
        }
        public String getDiagnoseId() {
            return this.diagnoseId;
        }

        public DiagnoseInstance setDiagnoseRequestId(String diagnoseRequestId) {
            this.diagnoseRequestId = diagnoseRequestId;
            return this;
        }
        public String getDiagnoseRequestId() {
            return this.diagnoseRequestId;
        }

        public DiagnoseInstance setDiskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }
        public String getDiskCategory() {
            return this.diskCategory;
        }

        public DiagnoseInstance setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DiagnoseInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DiagnoseInstance setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DiagnoseInstance setInstanceTypeName(String instanceTypeName) {
            this.instanceTypeName = instanceTypeName;
            return this;
        }
        public String getInstanceTypeName() {
            return this.instanceTypeName;
        }

        public DiagnoseInstance setIzNo(String izNo) {
            this.izNo = izNo;
            return this;
        }
        public String getIzNo() {
            return this.izNo;
        }

        public DiagnoseInstance setMark(String mark) {
            this.mark = mark;
            return this;
        }
        public String getMark() {
            return this.mark;
        }

        public DiagnoseInstance setModificationTime(String modificationTime) {
            this.modificationTime = modificationTime;
            return this;
        }
        public String getModificationTime() {
            return this.modificationTime;
        }

        public DiagnoseInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DiagnoseInstance setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public DiagnoseInstance setPeriodUnit(String periodUnit) {
            this.periodUnit = periodUnit;
            return this;
        }
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        public DiagnoseInstance setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DiagnoseInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DiagnoseInstance setSolutions(String solutions) {
            this.solutions = solutions;
            return this;
        }
        public String getSolutions() {
            return this.solutions;
        }

        public DiagnoseInstance setStar(Integer star) {
            this.star = star;
            return this;
        }
        public Integer getStar() {
            return this.star;
        }

        public DiagnoseInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DiagnoseInstances extends TeaModel {
        @NameInMap("DiagnoseInstance")
        public java.util.List<DiagnoseInstance> diagnoseInstance;

        public static DiagnoseInstances build(java.util.Map<String, ?> map) throws Exception {
            DiagnoseInstances self = new DiagnoseInstances();
            return TeaModel.build(map, self);
        }

        public DiagnoseInstances setDiagnoseInstance(java.util.List<DiagnoseInstance> diagnoseInstance) {
            this.diagnoseInstance = diagnoseInstance;
            return this;
        }
        public java.util.List<DiagnoseInstance> getDiagnoseInstance() {
            return this.diagnoseInstance;
        }

    }

}
