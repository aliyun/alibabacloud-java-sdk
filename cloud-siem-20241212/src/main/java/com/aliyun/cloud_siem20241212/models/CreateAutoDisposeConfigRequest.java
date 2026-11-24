// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateAutoDisposeConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether the user has enabled automatic analysis. Valid values:</p>
     * <ul>
     * <li>enabled: Enabled.</li>
     * <li>disabled: Disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("AutoDecisionStatus")
    public String autoDecisionStatus;

    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The code of the cloud service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_sas</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    public static CreateAutoDisposeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoDisposeConfigRequest self = new CreateAutoDisposeConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoDisposeConfigRequest setAutoDecisionStatus(String autoDecisionStatus) {
        this.autoDecisionStatus = autoDecisionStatus;
        return this;
    }
    public String getAutoDecisionStatus() {
        return this.autoDecisionStatus;
    }

    public CreateAutoDisposeConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateAutoDisposeConfigRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
