// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class GetCAInstanceStatusRequest extends TeaModel {
    /**
     * <p>The ID of the private CA instance.</p>
     * <br>
     * <p>>  After you purchase a private CA instance by using the [Certificate Management Service console](https://yundun.console.aliyun.com/?p=cas#/pca/rootlist), you can click **Details** for the private CA instance on the **Private Certificates** page to obtain the ID of the private CA instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetCAInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCAInstanceStatusRequest self = new GetCAInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetCAInstanceStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
