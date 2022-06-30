// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class ListSurveyResourcesDetailRequest extends TeaModel {
    // ip
    @NameInMap("ip")
    public String ip;

    // 调研任务Id
    @NameInMap("jobId")
    public Long jobId;

    @NameInMap("projectId")
    public Long projectId;

    // 类型
    @NameInMap("resourceType")
    public String resourceType;

    @NameInMap("subProjectId")
    public Long subProjectId;

    @NameInMap("regionId")
    public String regionId;

    public static ListSurveyResourcesDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSurveyResourcesDetailRequest self = new ListSurveyResourcesDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListSurveyResourcesDetailRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ListSurveyResourcesDetailRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ListSurveyResourcesDetailRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListSurveyResourcesDetailRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListSurveyResourcesDetailRequest setSubProjectId(Long subProjectId) {
        this.subProjectId = subProjectId;
        return this;
    }
    public Long getSubProjectId() {
        return this.subProjectId;
    }

    public ListSurveyResourcesDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
