// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class AppliedConsumStatRequest extends TeaModel {
    @NameInMap("AppliedId")
    public java.util.List<String> appliedId;

    // 请求操作人Id
    @NameInMap("OperatorId")
    public String operatorId;

    // 请求操作人类型
    @NameInMap("OperatorType")
    public String operatorType;

    // 资源类型,PackageType[CU(cu),code,cssResourceType,desc]
    @NameInMap("PackageType")
    public String packageType;

    // 查询结束时间
    @NameInMap("QueryEndDate")
    public String queryEndDate;

    // 查询开始时间
    @NameInMap("QueryStartDate")
    public String queryStartDate;

    public static AppliedConsumStatRequest build(java.util.Map<String, ?> map) throws Exception {
        AppliedConsumStatRequest self = new AppliedConsumStatRequest();
        return TeaModel.build(map, self);
    }

    public AppliedConsumStatRequest setAppliedId(java.util.List<String> appliedId) {
        this.appliedId = appliedId;
        return this;
    }
    public java.util.List<String> getAppliedId() {
        return this.appliedId;
    }

    public AppliedConsumStatRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public AppliedConsumStatRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public AppliedConsumStatRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public AppliedConsumStatRequest setQueryEndDate(String queryEndDate) {
        this.queryEndDate = queryEndDate;
        return this;
    }
    public String getQueryEndDate() {
        return this.queryEndDate;
    }

    public AppliedConsumStatRequest setQueryStartDate(String queryStartDate) {
        this.queryStartDate = queryStartDate;
        return this;
    }
    public String getQueryStartDate() {
        return this.queryStartDate;
    }

}
