// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListEmrMainVersionRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("EmrVersion")
    public String emrVersion;

    @NameInMap("StackName")
    public String stackName;

    @NameInMap("StackVersion")
    public String stackVersion;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListEmrMainVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEmrMainVersionRequest self = new ListEmrMainVersionRequest();
        return TeaModel.build(map, self);
    }

    public ListEmrMainVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListEmrMainVersionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListEmrMainVersionRequest setEmrVersion(String emrVersion) {
        this.emrVersion = emrVersion;
        return this;
    }
    public String getEmrVersion() {
        return this.emrVersion;
    }

    public ListEmrMainVersionRequest setStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }
    public String getStackName() {
        return this.stackName;
    }

    public ListEmrMainVersionRequest setStackVersion(String stackVersion) {
        this.stackVersion = stackVersion;
        return this;
    }
    public String getStackVersion() {
        return this.stackVersion;
    }

    public ListEmrMainVersionRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListEmrMainVersionRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
