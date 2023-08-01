// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListK8sConfigMapsRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The filter conditions. Set this parameter to a JSON string in the format of {"field":"Name", "pattern":"configmap-"}.</p>
     */
    @NameInMap("Condition")
    public java.util.Map<String, ?> condition;

    /**
     * <p>The namespace of the Kubernetes cluster.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The number of the page to return. Pages start from Page 0.</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to return a list of applications that use a ConfigMap. Valid values: true and false.</p>
     */
    @NameInMap("ShowRelatedApps")
    public Boolean showRelatedApps;

    public static ListK8sConfigMapsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListK8sConfigMapsRequest self = new ListK8sConfigMapsRequest();
        return TeaModel.build(map, self);
    }

    public ListK8sConfigMapsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListK8sConfigMapsRequest setCondition(java.util.Map<String, ?> condition) {
        this.condition = condition;
        return this;
    }
    public java.util.Map<String, ?> getCondition() {
        return this.condition;
    }

    public ListK8sConfigMapsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListK8sConfigMapsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListK8sConfigMapsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListK8sConfigMapsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListK8sConfigMapsRequest setShowRelatedApps(Boolean showRelatedApps) {
        this.showRelatedApps = showRelatedApps;
        return this;
    }
    public Boolean getShowRelatedApps() {
        return this.showRelatedApps;
    }

}
