// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListK8sIngressRulesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5b2b4ab4-efbc-4a81-9c45-xxxxxxxxxxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The filter conditions. Set the value to a JSON string in the format of {&quot;field&quot;:&quot;Name&quot;, &quot;pattern&quot;:&quot;my-&quot;}, where:</p>
     * <ul>
     * <li>field: the parameter to be matched. Valid values: Name and ClusterName.</li>
     * <li>pattern: the content to be matched.</li>
     * </ul>
     * <p>For example, a value of {&quot;field&quot;:&quot;Name&quot;, &quot;pattern&quot;:&quot;my-&quot;} indicates that the specified filter conditions match the routing rules whose names start with my-.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;field&quot;:&quot;Name&quot;, &quot;pattern&quot;:&quot;my-&quot;}</p>
     */
    @NameInMap("Condition")
    public String condition;

    /**
     * <p>The namespace of the Kubernetes cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The ID of the region where the cluster resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
