// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowJobsRequest extends TeaModel {
    // 是否为临时查询。用于过滤作业。
    @NameInMap("Adhoc")
    public Boolean adhoc;

    @NameInMap("ExactName")
    public String exactName;

    // 作业ID。您可以调用ListFlowJob查看作业ID。
    @NameInMap("Id")
    public String id;

    // 作业名称。
    @NameInMap("Name")
    public String name;

    // 当前页数。
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页的作业数量。
    @NameInMap("PageSize")
    public Integer pageSize;

    // 项目ID。您可以调用ListFlowProject查看项目的ID。
    @NameInMap("ProjectId")
    public String projectId;

    // 地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
    @NameInMap("RegionId")
    public String regionId;

    // 作业类型。用于过滤作业，支持的类型有：SPARK，SPARK_STREAMING，ZEPPELIN。
    @NameInMap("Type")
    public String type;

    public static ListFlowJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowJobsRequest self = new ListFlowJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowJobsRequest setAdhoc(Boolean adhoc) {
        this.adhoc = adhoc;
        return this;
    }
    public Boolean getAdhoc() {
        return this.adhoc;
    }

    public ListFlowJobsRequest setExactName(String exactName) {
        this.exactName = exactName;
        return this;
    }
    public String getExactName() {
        return this.exactName;
    }

    public ListFlowJobsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListFlowJobsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListFlowJobsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowJobsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListFlowJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListFlowJobsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
