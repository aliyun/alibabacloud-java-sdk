// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RestartK8sApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>93fdd228-********ed2ae98de18d</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The timeout period of the change process. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static RestartK8sApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartK8sApplicationRequest self = new RestartK8sApplicationRequest();
        return TeaModel.build(map, self);
    }

    public RestartK8sApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RestartK8sApplicationRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
