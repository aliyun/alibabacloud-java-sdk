// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateAutoDisposeConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("AutoDecisionStatus")
    public String autoDecisionStatus;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_sas</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static UpdateAutoDisposeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoDisposeConfigRequest self = new UpdateAutoDisposeConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAutoDisposeConfigRequest setAutoDecisionStatus(String autoDecisionStatus) {
        this.autoDecisionStatus = autoDecisionStatus;
        return this;
    }
    public String getAutoDecisionStatus() {
        return this.autoDecisionStatus;
    }

    public UpdateAutoDisposeConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateAutoDisposeConfigRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
