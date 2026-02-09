// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetTraceConfigRequest extends TeaModel {
    /**
     * <p>The language in which you want results to be returned. Valid values: zh: Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("acceptLanguage")
    public String acceptLanguage;

    public static GetTraceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTraceConfigRequest self = new GetTraceConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetTraceConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

}
