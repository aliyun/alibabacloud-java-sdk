// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetK8sApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5a166fbd-<strong><strong>-4f98-a286-781659d9</strong></strong></p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The source from which data is queried.</p>
     * <ul>
     * <li>If you leave this parameter empty, a common query is performed.</li>
     * <li>If you set the value to deploy, you query application information from the deployment page.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>deploy</p>
     */
    @NameInMap("From")
    public String from;

    public static GetK8sApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetK8sApplicationRequest self = new GetK8sApplicationRequest();
        return TeaModel.build(map, self);
    }

    public GetK8sApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetK8sApplicationRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

}
