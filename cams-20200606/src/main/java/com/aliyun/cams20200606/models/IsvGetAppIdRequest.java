// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class IsvGetAppIdRequest extends TeaModel {
    /**
     * <p>The permission.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>whatsapp_business_messaging: sending permission on WhatsApp messages</li>
     * <li>ads_management: management permission on advertisements</li>
     * <li>catalog_management: management permission on catalogs</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>catalog_management</p>
     */
    @NameInMap("Permissions")
    public String permissions;

    /**
     * <p>The type of the app. Valid value: WHATSAPP.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WHATSAPP</p>
     */
    @NameInMap("Type")
    public String type;

    public static IsvGetAppIdRequest build(java.util.Map<String, ?> map) throws Exception {
        IsvGetAppIdRequest self = new IsvGetAppIdRequest();
        return TeaModel.build(map, self);
    }

    public IsvGetAppIdRequest setPermissions(String permissions) {
        this.permissions = permissions;
        return this;
    }
    public String getPermissions() {
        return this.permissions;
    }

    public IsvGetAppIdRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
