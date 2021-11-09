// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyPolicyAdvancedConfigRequest extends TeaModel {
    @NameInMap("InternetSwitch")
    public String internetSwitch;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
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
