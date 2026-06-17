// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifySensitiveSwitchRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The type of sensitive data.</p>
     * 
     * <strong>example:</strong>
     * <p>id_card</p>
     */
    @NameInMap("SensitiveCategory")
    public String sensitiveCategory;

    /**
     * <p>The status of the switch. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: on.</p>
     * </li>
     * <li><p><strong>0</strong>: off.</p>
     * </li>
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
