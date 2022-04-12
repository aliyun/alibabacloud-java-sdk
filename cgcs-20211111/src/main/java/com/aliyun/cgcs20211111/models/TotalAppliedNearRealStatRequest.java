// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class TotalAppliedNearRealStatRequest extends TeaModel {
    // 请求操作人Id
    @NameInMap("OperatorId")
    public String operatorId;

    // 请求操作人类型
    @NameInMap("OperatorType")
    public String operatorType;

    // 排序类型。默认：AppliedConcurrency_Desc,AppliedNearRealOrderConditionType[AppliedConcurrency_Desc(AppliedConcurrency_Desc,根据实时并发路数降序排列),AppliedConcurrency_Asc(AppliedConcurrency_Asc,根据实时并发路数升序排列),AppliedConsumptionCu_Desc(AppliedConsumptionCu_Desc,根据实时CU消耗降序排列),AppliedConsumptionCu_Asc(AppliedConsumptionCu_Asc,根据实时CU消耗升序排列),orderByType,desc]
    @NameInMap("OrderBy")
    public String orderBy;

    // 资源类型,PackageType[CU(cu),code,cssResourceType,desc]
    @NameInMap("PackageType")
    public String packageType;

    // 当前页码，默认1
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页项数，默认20,最大100
    @NameInMap("PageSize")
    public Integer pageSize;

    public static TotalAppliedNearRealStatRequest build(java.util.Map<String, ?> map) throws Exception {
        TotalAppliedNearRealStatRequest self = new TotalAppliedNearRealStatRequest();
        return TeaModel.build(map, self);
    }

    public TotalAppliedNearRealStatRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public TotalAppliedNearRealStatRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public TotalAppliedNearRealStatRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public TotalAppliedNearRealStatRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public TotalAppliedNearRealStatRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public TotalAppliedNearRealStatRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
