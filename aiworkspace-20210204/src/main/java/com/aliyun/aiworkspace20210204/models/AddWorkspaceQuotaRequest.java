// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class AddWorkspaceQuotaRequest extends TeaModel {
    // 模式  isolate 预付费  share 后付费  develop 开发模式
    @NameInMap("Mode")
    public String mode;

    // 产品代码
    @NameInMap("ProductCode")
    public String productCode;

    // 产品类型，  支持PAI，MaxCompute，
    @NameInMap("QuotaType")
    public String quotaType;

    public static AddWorkspaceQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceQuotaRequest self = new AddWorkspaceQuotaRequest();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceQuotaRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public AddWorkspaceQuotaRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public AddWorkspaceQuotaRequest setQuotaType(String quotaType) {
        this.quotaType = quotaType;
        return this;
    }
    public String getQuotaType() {
        return this.quotaType;
    }

}
