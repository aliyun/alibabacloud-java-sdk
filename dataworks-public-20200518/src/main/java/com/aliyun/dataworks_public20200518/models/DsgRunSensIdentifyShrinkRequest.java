// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgRunSensIdentifyShrinkRequest extends TeaModel {
    @NameInMap("EsMetaParams")
    public String esMetaParamsShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DsgRunSensIdentifyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgRunSensIdentifyShrinkRequest self = new DsgRunSensIdentifyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DsgRunSensIdentifyShrinkRequest setEsMetaParamsShrink(String esMetaParamsShrink) {
        this.esMetaParamsShrink = esMetaParamsShrink;
        return this;
    }
    public String getEsMetaParamsShrink() {
        return this.esMetaParamsShrink;
    }

    public DsgRunSensIdentifyShrinkRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
