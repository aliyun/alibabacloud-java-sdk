// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateWhitelistTemplateRequest extends TeaModel {
    /**
     * <p>RegionId</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.1,10.0.0.1</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>InvoiceTemplate</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static CreateWhitelistTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWhitelistTemplateRequest self = new CreateWhitelistTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateWhitelistTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateWhitelistTemplateRequest setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public CreateWhitelistTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
