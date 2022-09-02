// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class UpdateFileMaterialRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("MaterialId")
    public String materialId;

    @NameInMap("Title")
    public String title;

    public static UpdateFileMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileMaterialRequest self = new UpdateFileMaterialRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileMaterialRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public UpdateFileMaterialRequest setMaterialId(String materialId) {
        this.materialId = materialId;
        return this;
    }
    public String getMaterialId() {
        return this.materialId;
    }

    public UpdateFileMaterialRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
