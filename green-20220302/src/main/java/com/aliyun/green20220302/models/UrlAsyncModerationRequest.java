// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class UrlAsyncModerationRequest extends TeaModel {
    @NameInMap("Service")
    public String service;

    /**
     * <strong>example:</strong>
     * <p>{
     *         &quot;url&quot;: &quot;<a href="https://help.aliyun.com/">https://help.aliyun.com/</a>&quot;,
     *         &quot;dataId&quot;: &quot;url123******&quot;
     * }</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static UrlAsyncModerationRequest build(java.util.Map<String, ?> map) throws Exception {
        UrlAsyncModerationRequest self = new UrlAsyncModerationRequest();
        return TeaModel.build(map, self);
    }

    public UrlAsyncModerationRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public UrlAsyncModerationRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
