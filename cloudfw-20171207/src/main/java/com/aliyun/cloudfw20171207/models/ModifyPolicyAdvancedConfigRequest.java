// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyPolicyAdvancedConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the strict mode for the access control policy. Valid values:</p>
     * <br>
     * <p>*   **on**: enables the strict mode.</p>
     * <p>*   **off**: disables the strict mode.</p>
     */
    @NameInMap("InternetSwitch")
    public String internetSwitch;

    /**
     * <p>The natural language of the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    public static ModifyPolicyAdvancedConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyAdvancedConfigRequest self = new ModifyPolicyAdvancedConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyAdvancedConfigRequest setInternetSwitch(String internetSwitch) {
        this.internetSwitch = internetSwitch;
        return this;
    }
    public String getInternetSwitch() {
        return this.internetSwitch;
    }

    public ModifyPolicyAdvancedConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyPolicyAdvancedConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
