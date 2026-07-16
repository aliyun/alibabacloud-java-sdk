// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalGuardAsyncResultRequest extends TeaModel {
    /**
     * <p>The moderation service type.</p>
     * 
     * <strong>example:</strong>
     * <p>audio_security_check</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The parameters required by the moderation service. The value is a JSON string.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;taskId&quot;: &quot;au_f_xxxxx&quot;
     * }</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static MultiModalGuardAsyncResultRequest build(java.util.Map<String, ?> map) throws Exception {
        MultiModalGuardAsyncResultRequest self = new MultiModalGuardAsyncResultRequest();
        return TeaModel.build(map, self);
    }

    public MultiModalGuardAsyncResultRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public MultiModalGuardAsyncResultRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
