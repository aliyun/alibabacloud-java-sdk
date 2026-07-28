// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class DescribeFileModerationResultRequest extends TeaModel {
    /**
     * <p>The service supported by the enhanced file moderation feature.</p>
     * 
     * <strong>example:</strong>
     * <p>document_detection</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The parameter set required by the moderation service, in JSON character string format.</p>
     * <ul>
     * <li>taskId: Required. The URL of the object to be moderated. Make sure that the URL is accessible over the public network access.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;taskId\&quot;:\&quot;vi_f_hPgx9PFIQISdlfA888hOFG-1yJq8v\&quot;}</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static DescribeFileModerationResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileModerationResultRequest self = new DescribeFileModerationResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFileModerationResultRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public DescribeFileModerationResultRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
