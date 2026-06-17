// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class SetAutoProtectNewAssetsRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic traffic redirection. Valid values:</p>
     * <p><strong>true****false</strong></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoProtect")
    public Boolean autoProtect;

    /**
     * <p>The language. Valid values are zh (Chinese) and <strong>en</strong> (English). The default value is <strong>zh</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the visitor.</p>
     * 
     * <strong>example:</strong>
     * <p>60.182.79.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

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

    public SetAutoProtectNewAssetsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
