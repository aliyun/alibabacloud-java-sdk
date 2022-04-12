// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListK8sSecretsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Condition")
    public String condition;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ShowRelatedApps")
    public Boolean showRelatedApps;

    public static ListK8sSecretsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListK8sSecretsRequest self = new ListK8sSecretsRequest();
        return TeaModel.build(map, self);
    }

    public ListK8sSecretsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListK8sSecretsRequest setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public ListK8sSecretsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListK8sSecretsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListK8sSecretsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListK8sSecretsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListK8sSecretsRequest setShowRelatedApps(Boolean showRelatedApps) {
        this.showRelatedApps = showRelatedApps;
        return this;
    }
    public Boolean getShowRelatedApps() {
        return this.showRelatedApps;
    }

}
