// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetMseFeatureSwitchRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    public static GetMseFeatureSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMseFeatureSwitchRequest self = new GetMseFeatureSwitchRequest();
        return TeaModel.build(map, self);
    }

    public GetMseFeatureSwitchRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

}
