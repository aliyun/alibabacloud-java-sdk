// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetIntegratedServiceStatusRequest extends TeaModel {
    /**
     * <p>The identity of the cloud service that is integrated with Cloud Config. Valid values:</p>
     * <ul>
     * <li>eventbridge: EventBridge</li>
     * <li>cms: CloudMonitor</li>
     * <li>bpstudio: Cloud Architect Design Tools (CADT)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cadt</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    public static GetIntegratedServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIntegratedServiceStatusRequest self = new GetIntegratedServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetIntegratedServiceStatusRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
