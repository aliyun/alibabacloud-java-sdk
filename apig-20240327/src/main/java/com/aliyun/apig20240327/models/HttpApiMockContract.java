// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiMockContract extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("responseCode")
    public Integer responseCode;

    @NameInMap("responseContent")
    public String responseContent;

    public static HttpApiMockContract build(java.util.Map<String, ?> map) throws Exception {
        HttpApiMockContract self = new HttpApiMockContract();
        return TeaModel.build(map, self);
    }

    public HttpApiMockContract setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public HttpApiMockContract setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public Integer getResponseCode() {
        return this.responseCode;
    }

    public HttpApiMockContract setResponseContent(String responseContent) {
        this.responseContent = responseContent;
        return this;
    }
    public String getResponseContent() {
        return this.responseContent;
    }

}
