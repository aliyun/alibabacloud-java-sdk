// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgRunSensIdentifyShrinkRequest extends TeaModel {
    /**
     * <p>The parameters that you need to configure to scan specified metadata.</p>
     */
    @NameInMap("EsMetaParams")
    public String esMetaParamsShrink;

    /**
     * <p>The tenant ID. To obtain the tenant ID, perform the following steps: Log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a>. Find your workspace and go to the DataStudio page. On the DataStudio page, click the logon username in the upper-right corner and click User Info in the Menu section.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10241024</p>
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
