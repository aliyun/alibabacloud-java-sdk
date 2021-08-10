// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class SaveOrUpdateUserSearchCompanyRequest extends TeaModel {
    @NameInMap("EnterpriseName")
    public String enterpriseName;

    @NameInMap("Type")
    public Integer type;

    public static SaveOrUpdateUserSearchCompanyRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveOrUpdateUserSearchCompanyRequest self = new SaveOrUpdateUserSearchCompanyRequest();
        return TeaModel.build(map, self);
    }

    public SaveOrUpdateUserSearchCompanyRequest setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public SaveOrUpdateUserSearchCompanyRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
