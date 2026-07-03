// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateAutoDisposeConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto decision. Valid values:</p>
     * <ul>
     * <li><p><code>enabled</code>: Enables auto decision.</p>
     * </li>
     * <li><p><code>disabled</code>: Disables auto decision.</p>
     * </li>
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
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The code for the cloud product.</p>
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
