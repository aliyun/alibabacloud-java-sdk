// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifySensitiveSwitchRequest extends TeaModel {
    /**
     * <p>The language type. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type.</p>
     * 
     * <strong>example:</strong>
     * <p>id_card</p>
     */
    @NameInMap("SensitiveCategory")
    public String sensitiveCategory;

    /**
     * <p>The status. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enabled.</li>
     * <li><strong>0</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SwitchStatus")
    public String switchStatus;

    public static ModifySensitiveSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySensitiveSwitchRequest self = new ModifySensitiveSwitchRequest();
        return TeaModel.build(map, self);
    }

    public ModifySensitiveSwitchRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifySensitiveSwitchRequest setSensitiveCategory(String sensitiveCategory) {
        this.sensitiveCategory = sensitiveCategory;
        return this;
    }
    public String getSensitiveCategory() {
        return this.sensitiveCategory;
    }

    public ModifySensitiveSwitchRequest setSwitchStatus(String switchStatus) {
        this.switchStatus = switchStatus;
        return this;
    }
    public String getSwitchStatus() {
        return this.switchStatus;
    }

}
