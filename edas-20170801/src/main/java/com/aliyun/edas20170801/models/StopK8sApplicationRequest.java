// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class StopK8sApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can query the application ID by calling the ListApplication operation. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>93fdd228-d237-*******8de18d</p>
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

    public static StopK8sApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        StopK8sApplicationRequest self = new StopK8sApplicationRequest();
        return TeaModel.build(map, self);
    }

    public StopK8sApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StopK8sApplicationRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
