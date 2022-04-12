// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class TotalQueryResourcePackageRequest extends TeaModel {
    // 请求操作人Id
    @NameInMap("OperatorId")
    public String operatorId;

    // 请求操作人类型
    @NameInMap("OperatorType")
    public String operatorType;

    // 资源包类型,PackageType[CU(cu),code,cssResourceType,desc]
    @NameInMap("PackageType")
    public String packageType;

    public static TotalQueryResourcePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        TotalQueryResourcePackageRequest self = new TotalQueryResourcePackageRequest();
        return TeaModel.build(map, self);
    }

    public TotalQueryResourcePackageRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public TotalQueryResourcePackageRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public TotalQueryResourcePackageRequest setPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }
    public String getPackageType() {
        return this.packageType;
    }

}
