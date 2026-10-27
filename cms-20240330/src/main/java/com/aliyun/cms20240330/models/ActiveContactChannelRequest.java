// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ActiveContactChannelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0b9377d9c56b5c2ea8a41a2b3c4d5e6f</p>
     */
    @NameInMap("code")
    public String code;

    /**
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
