// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UnbindK8sSlbRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5a166fbd-<strong><strong>-</strong></strong>-a286-781659d9f54c</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the cluster. You can call the GetK8sCluster operation to query the cluster ID. For more information, see <a href="https://help.aliyun.com/document_detail/181437.html">GetK8sCluster</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>712082c3-<strong><strong>-</strong></strong>-9217-a947b5cde6ee</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the SLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>a2d4ab12666544a479cdd0711a97****</p>
     */
    @NameInMap("SlbName")
    public String slbName;

    /**
     * <p>The type of the SLB instance. Valid values:</p>
     * <ul>
     * <li><strong>internet</strong>: Internet-facing SLB instance</li>
     * <li><strong>intranet</strong>: internal-facing SLB instance</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
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
