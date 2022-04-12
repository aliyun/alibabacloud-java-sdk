// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class TotalAppliedConsumStatRequest extends TeaModel {
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

    public static TotalAppliedConsumStatRequest build(java.util.Map<String, ?> map) throws Exception {
        TotalAppliedConsumStatRequest self = new TotalAppliedConsumStatRequest();
        return TeaModel.build(map, self);
    }

    public TotalAppliedConsumStatRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public TotalAppliedConsumStatRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public TotalAppliedConsumStatRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

    public TotalAppliedConsumStatRequest setQueryEndDate(String queryEndDate) {
        this.queryEndDate = queryEndDate;
        return this;
    }
    public String getQueryEndDate() {
        return this.queryEndDate;
    }

    public TotalAppliedConsumStatRequest setQueryStartDate(String queryStartDate) {
        this.queryStartDate = queryStartDate;
        return this;
    }
    public String getQueryStartDate() {
        return this.queryStartDate;
    }

}
