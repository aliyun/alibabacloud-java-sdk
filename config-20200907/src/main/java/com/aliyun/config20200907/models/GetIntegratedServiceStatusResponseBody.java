// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetIntegratedServiceStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the product has been integrated. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The types of the integrated events. Separate multiple event types with commas (,). Valid values:</p>
     * <br>
     * <p>*   ConfigurationItemChangeNotification: resource change event</p>
     * <p>*   NonCompliantNotification: non-compliance event</p>
     */
    @NameInMap("IntegratedTypes")
    public String integratedTypes;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetIntegratedServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIntegratedServiceStatusResponseBody self = new GetIntegratedServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIntegratedServiceStatusResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public GetIntegratedServiceStatusResponseBody setIntegratedTypes(String integratedTypes) {
        this.integratedTypes = integratedTypes;
        return this;
    }
    public String getIntegratedTypes() {
        return this.integratedTypes;
    }

    public GetIntegratedServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
