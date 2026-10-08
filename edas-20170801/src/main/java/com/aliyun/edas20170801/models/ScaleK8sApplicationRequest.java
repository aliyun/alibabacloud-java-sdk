// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ScaleK8sApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application. Call the <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a> operation to obtain the application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23bf94d9-<strong><strong>-4994-</strong></strong>-616a827aa777</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The target number of application instances. The minimum value is 0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Replicas")
    public Integer replicas;

    /**
     * <p>The timeout period for the change process, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
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
