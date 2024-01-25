// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetCloudResourceListRequest extends TeaModel {
    @NameInMap("BusinessGroupId")
    public String businessGroupId;

    @NameInMap("CloudRegionId")
    public String cloudRegionId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Id")
    public String id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("IsOptional")
    public Integer isOptional;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrivateIp")
    public String privateIp;

    @NameInMap("ReleaseStatus")
    public Integer releaseStatus;

    @NameInMap("TagName")
    public String tagName;

    @NameInMap("Uid")
    public String uid;

    public static GetCloudResourceListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCloudResourceListRequest self = new GetCloudResourceListRequest();
        return TeaModel.build(map, self);
    }

    public GetCloudResourceListRequest setBusinessGroupId(String businessGroupId) {
        this.businessGroupId = businessGroupId;
        return this;
    }
    public String getBusinessGroupId() {
        return this.businessGroupId;
    }

    public GetCloudResourceListRequest setCloudRegionId(String cloudRegionId) {
        this.cloudRegionId = cloudRegionId;
        return this;
    }
    public String getCloudRegionId() {
        return this.cloudRegionId;
    }

    public GetCloudResourceListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetCloudResourceListRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetCloudResourceListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetCloudResourceListRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public GetCloudResourceListRequest setIsOptional(Integer isOptional) {
        this.isOptional = isOptional;
        return this;
    }
    public Integer getIsOptional() {
        return this.isOptional;
    }

    public GetCloudResourceListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetCloudResourceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetCloudResourceListRequest setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }
    public String getPrivateIp() {
        return this.privateIp;
    }

    public GetCloudResourceListRequest setReleaseStatus(Integer releaseStatus) {
        this.releaseStatus = releaseStatus;
        return this;
    }
    public Integer getReleaseStatus() {
        return this.releaseStatus;
    }

    public GetCloudResourceListRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public GetCloudResourceListRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
