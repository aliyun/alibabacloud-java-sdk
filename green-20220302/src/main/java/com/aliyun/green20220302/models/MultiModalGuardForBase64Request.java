// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalGuardForBase64Request extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{base64}</p>
     */
    @NameInMap("ImageBase64Str")
    public String imageBase64Str;

    /**
     * <p>Service</p>
     * 
     * <strong>example:</strong>
     * <p>query_security_check</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <strong>example:</strong>
     * <p>{&quot;content&quot;:&quot;test&quot;}</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static MultiModalGuardForBase64Request build(java.util.Map<String, ?> map) throws Exception {
        MultiModalGuardForBase64Request self = new MultiModalGuardForBase64Request();
        return TeaModel.build(map, self);
    }

    public MultiModalGuardForBase64Request setImageBase64Str(String imageBase64Str) {
        this.imageBase64Str = imageBase64Str;
        return this;
    }
    public String getImageBase64Str() {
        return this.imageBase64Str;
    }

    public MultiModalGuardForBase64Request setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public MultiModalGuardForBase64Request setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
