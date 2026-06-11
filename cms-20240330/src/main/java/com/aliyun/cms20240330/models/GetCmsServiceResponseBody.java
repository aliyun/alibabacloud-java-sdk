// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetCmsServiceResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the service or product is activated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>PROM_NOT_OPEN: Prometheus is not activated.SLS_NOT_OPEN: Simple Log Service (SLS), a dependency of Prometheus, is not activated.CMS_SLR_NOT_EXIST: The service-linked role (SLR) for CloudMonitor does not exist.SLS_SLR_NOT_EXIST: The SLR for SLS does not exist.</p>
     * 
     * <strong>example:</strong>
     * <p>PROM_NOT_OPEN</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetCmsServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCmsServiceResponseBody self = new GetCmsServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCmsServiceResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetCmsServiceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetCmsServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
