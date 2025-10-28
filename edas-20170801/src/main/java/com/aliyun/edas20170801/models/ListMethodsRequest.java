// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListMethodsRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>be213a4a-c7e4-473b-ab0****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Method</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    public static ListMethodsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMethodsRequest self = new ListMethodsRequest();
        return TeaModel.build(map, self);
    }

    public ListMethodsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListMethodsRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
