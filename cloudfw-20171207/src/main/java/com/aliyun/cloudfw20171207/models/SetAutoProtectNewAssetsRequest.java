// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class SetAutoProtectNewAssetsRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic traffic redirection. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoProtect")
    public Boolean autoProtect;

    /**
     * <p>The language type. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese. Default value.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static SetAutoProtectNewAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAutoProtectNewAssetsRequest self = new SetAutoProtectNewAssetsRequest();
        return TeaModel.build(map, self);
    }

    public SetAutoProtectNewAssetsRequest setAutoProtect(Boolean autoProtect) {
        this.autoProtect = autoProtect;
        return this;
    }
    public Boolean getAutoProtect() {
        return this.autoProtect;
    }

    public SetAutoProtectNewAssetsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
