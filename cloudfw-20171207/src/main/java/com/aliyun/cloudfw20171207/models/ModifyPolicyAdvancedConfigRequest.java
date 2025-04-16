// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyPolicyAdvancedConfigRequest extends TeaModel {
    @NameInMap("Eips")
    public java.util.List<String> eips;

    /**
     * <p>Specifies whether to enable the strict mode for the access control policy. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enables the strict mode.</li>
     * <li><strong>off</strong>: disables the strict mode.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>off</p>
     */
    @NameInMap("InternetSwitch")
    public String internetSwitch;

    /**
     * <p>The natural language of the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default)</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    public static ModifyPolicyAdvancedConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyAdvancedConfigRequest self = new ModifyPolicyAdvancedConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyAdvancedConfigRequest setEips(java.util.List<String> eips) {
        this.eips = eips;
        return this;
    }
    public java.util.List<String> getEips() {
        return this.eips;
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

    @Deprecated
    public ModifyPolicyAdvancedConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
