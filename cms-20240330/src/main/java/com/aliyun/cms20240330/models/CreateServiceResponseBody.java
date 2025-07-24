// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cwzxvuc6uo@d60088ad4797d26</p>
     */
    @NameInMap("pid")
    public String pid;

    /**
     * <strong>example:</strong>
     * <p>3A2FA9E9-9CF1-5CB1-A808-52828F14310D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>cwzxvuc6uo@4bc6b15ad81f166174ffb</p>
     */
    @NameInMap("serviceId")
    public String serviceId;

    public static CreateServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceResponseBody self = new CreateServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceResponseBody setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public CreateServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceResponseBody setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
