// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateCustomHostnameResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>custom.site.com</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("HostnameId")
    public Long hostnameId;

    /**
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCustomHostnameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomHostnameResponseBody self = new CreateCustomHostnameResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomHostnameResponseBody setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public CreateCustomHostnameResponseBody setHostnameId(Long hostnameId) {
        this.hostnameId = hostnameId;
        return this;
    }
    public Long getHostnameId() {
        return this.hostnameId;
    }

    public CreateCustomHostnameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
