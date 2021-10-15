// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DiagnoseInstanceRequest extends TeaModel {
    @NameInMap("lang")
    public String lang;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DiagnoseInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DiagnoseInstanceRequest self = new DiagnoseInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DiagnoseInstanceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DiagnoseInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
