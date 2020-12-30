// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListMetaDataSourceClusterForOuterRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("DataSourceId")
    public java.util.List<String> dataSourceId;

    @NameInMap("ClusterId")
    public java.util.List<String> clusterId;

    public static ListMetaDataSourceClusterForOuterRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMetaDataSourceClusterForOuterRequest self = new ListMetaDataSourceClusterForOuterRequest();
        return TeaModel.build(map, self);
    }

    public ListMetaDataSourceClusterForOuterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListMetaDataSourceClusterForOuterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListMetaDataSourceClusterForOuterRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ListMetaDataSourceClusterForOuterRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMetaDataSourceClusterForOuterRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMetaDataSourceClusterForOuterRequest setDataSourceId(java.util.List<String> dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public java.util.List<String> getDataSourceId() {
        return this.dataSourceId;
    }

    public ListMetaDataSourceClusterForOuterRequest setClusterId(java.util.List<String> clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public java.util.List<String> getClusterId() {
        return this.clusterId;
    }

}
