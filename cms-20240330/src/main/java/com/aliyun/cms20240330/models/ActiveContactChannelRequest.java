// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ActiveContactChannelRequest extends TeaModel {
    /**
     * <p>The activation verification code. This 32-character string is sent by the system to the mobile phone number or email address of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>0b9377d9c56b5c2ea8a41a2b3c4d5e6f</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The site. Valid values: cn_hangzhou (China site) and ap_southeast_1 (International site). Default value: cn_hangzhou.</p>
     * 
     * <strong>example:</strong>
     * <p>cn_hangzhou</p>
     */
    @NameInMap("site")
    public String site;

    public static ActiveContactChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        ActiveContactChannelRequest self = new ActiveContactChannelRequest();
        return TeaModel.build(map, self);
    }

    public ActiveContactChannelRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ActiveContactChannelRequest setSite(String site) {
        this.site = site;
        return this;
    }
    public String getSite() {
        return this.site;
    }

}
