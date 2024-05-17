// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class StartK8sApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can query the application ID by calling the ListApplication operation. For more information, see [ListApplication](https://help.aliyun.com/document_detail/149390.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The number of instances on which you want to start the application.</p>
     */
    @NameInMap("Replicas")
    public Integer replicas;

    /**
     * <p>The timeout period of the change process. Valid values: 1 to 1800. Default value: 600. Unit: seconds.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static StartK8sApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        StartK8sApplicationRequest self = new StartK8sApplicationRequest();
        return TeaModel.build(map, self);
    }

    public StartK8sApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartK8sApplicationRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public StartK8sApplicationRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
