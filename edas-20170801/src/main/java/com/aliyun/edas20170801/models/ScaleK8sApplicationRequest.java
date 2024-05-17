// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ScaleK8sApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](https://help.aliyun.com/document_detail/149390.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The expected number of application instances after the scale-out or scale-in. The minimum number is 0.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Replicas")
    public Integer replicas;

    /**
     * <p>The timeout period of the change process. Unit: seconds.</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static ScaleK8sApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleK8sApplicationRequest self = new ScaleK8sApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ScaleK8sApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ScaleK8sApplicationRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public ScaleK8sApplicationRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
