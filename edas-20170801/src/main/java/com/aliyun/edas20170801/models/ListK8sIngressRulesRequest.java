// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListK8sIngressRulesRequest extends TeaModel {
    /**
     * <p>The ID of the Kubernetes cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The filter conditions. Set the value to a JSON string in the format of {"field":"Name", "pattern":"my-"}, where:</p>
     * <br>
     * <p>*   field: the parameter to be matched. Valid values: Name and ClusterName.</p>
     * <p>*   pattern: the content to be matched.</p>
     * <br>
     * <p>For example, a value of {"field":"Name", "pattern":"my-"} indicates that the specified filter conditions match the routing rules whose names start with my-.</p>
     */
    @NameInMap("Condition")
    public String condition;

    /**
     * <p>The namespace of the Kubernetes cluster.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The ID of the region where the cluster resides.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListK8sIngressRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListK8sIngressRulesRequest self = new ListK8sIngressRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListK8sIngressRulesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListK8sIngressRulesRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public ListK8sIngressRulesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListK8sIngressRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
