// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLaunchTemplateVersionsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("LaunchTemplateId")
    public String launchTemplateId;

    @NameInMap("LaunchTemplateName")
    public String launchTemplateName;

    @NameInMap("LaunchTemplateVersion")
    public java.util.List<Long> launchTemplateVersion;

    @NameInMap("MinVersion")
    public Long minVersion;

    @NameInMap("MaxVersion")
    public Long maxVersion;

    @NameInMap("DefaultVersion")
    public Boolean defaultVersion;

    @NameInMap("DetailFlag")
    public Boolean detailFlag;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeLaunchTemplateVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLaunchTemplateVersionsRequest self = new DescribeLaunchTemplateVersionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLaunchTemplateVersionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeLaunchTemplateVersionsRequest setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }
    public String getLaunchTemplateId() {
        return this.launchTemplateId;
    }

    public DescribeLaunchTemplateVersionsRequest setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }
    public String getLaunchTemplateName() {
        return this.launchTemplateName;
    }

    public DescribeLaunchTemplateVersionsRequest setLaunchTemplateVersion(java.util.List<Long> launchTemplateVersion) {
        this.launchTemplateVersion = launchTemplateVersion;
        return this;
    }
    public java.util.List<Long> getLaunchTemplateVersion() {
        return this.launchTemplateVersion;
    }

    public DescribeLaunchTemplateVersionsRequest setMinVersion(Long minVersion) {
        this.minVersion = minVersion;
        return this;
    }
    public Long getMinVersion() {
        return this.minVersion;
    }

    public DescribeLaunchTemplateVersionsRequest setMaxVersion(Long maxVersion) {
        this.maxVersion = maxVersion;
        return this;
    }
    public Long getMaxVersion() {
        return this.maxVersion;
    }

    public DescribeLaunchTemplateVersionsRequest setDefaultVersion(Boolean defaultVersion) {
        this.defaultVersion = defaultVersion;
        return this;
    }
    public Boolean getDefaultVersion() {
        return this.defaultVersion;
    }

    public DescribeLaunchTemplateVersionsRequest setDetailFlag(Boolean detailFlag) {
        this.detailFlag = detailFlag;
        return this;
    }
    public Boolean getDetailFlag() {
        return this.detailFlag;
    }

    public DescribeLaunchTemplateVersionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLaunchTemplateVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
