// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UnbindK8sSlbRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](https://help.aliyun.com/document_detail/149390.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the cluster. You can call the GetK8sCluster operation to query the cluster ID. For more information, see [GetK8sCluster](https://help.aliyun.com/document_detail/181437.html).</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the SLB instance.</p>
     */
    @NameInMap("SlbName")
    public String slbName;

    /**
     * <p>The type of the SLB instance. Valid values:</p>
     * <br>
     * <p>*   **internet**: Internet-facing SLB instance</p>
     * <p>*   **intranet**: internal-facing SLB instance</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static UnbindK8sSlbRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindK8sSlbRequest self = new UnbindK8sSlbRequest();
        return TeaModel.build(map, self);
    }

    public UnbindK8sSlbRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UnbindK8sSlbRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UnbindK8sSlbRequest setSlbName(String slbName) {
        this.slbName = slbName;
        return this;
    }
    public String getSlbName() {
        return this.slbName;
    }

    public UnbindK8sSlbRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
