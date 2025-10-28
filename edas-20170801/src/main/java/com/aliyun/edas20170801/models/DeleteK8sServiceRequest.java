// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteK8sServiceRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5a166fbd***a286-781659d9f54c</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-http</p>
     */
    @NameInMap("Name")
    public String name;

    public static DeleteK8sServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteK8sServiceRequest self = new DeleteK8sServiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteK8sServiceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteK8sServiceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
