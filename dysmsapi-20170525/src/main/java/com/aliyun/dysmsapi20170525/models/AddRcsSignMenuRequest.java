// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddRcsSignMenuRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("MenuContent")
    public String menuContent;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("SignName")
    public String signName;

    public static AddRcsSignMenuRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRcsSignMenuRequest self = new AddRcsSignMenuRequest();
        return TeaModel.build(map, self);
    }

    public AddRcsSignMenuRequest setMenuContent(String menuContent) {
        this.menuContent = menuContent;
        return this;
    }
    public String getMenuContent() {
        return this.menuContent;
    }

    public AddRcsSignMenuRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

}
