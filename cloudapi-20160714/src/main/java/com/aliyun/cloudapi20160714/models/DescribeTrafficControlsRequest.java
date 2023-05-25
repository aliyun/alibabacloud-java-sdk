// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeTrafficControlsRequest extends TeaModel {
    /**
     * <p>The name of the throttling policy.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The environment name. This parameter must be specified together with GroupId and ApiId. Valid values:********</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **TEST**</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>ThrottlingTest</p>
     */
    @NameInMap("StageName")
    public String stageName;

    /**
     * <p>The specified API ID. This parameter must be specified together with GroupId and StageName.</p>
     */
    @NameInMap("TrafficControlId")
    public String trafficControlId;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("TrafficControlName")
    public String trafficControlName;

    public static DescribeTrafficControlsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrafficControlsRequest self = new DescribeTrafficControlsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTrafficControlsRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeTrafficControlsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeTrafficControlsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTrafficControlsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTrafficControlsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeTrafficControlsRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public DescribeTrafficControlsRequest setTrafficControlId(String trafficControlId) {
        this.trafficControlId = trafficControlId;
        return this;
    }
    public String getTrafficControlId() {
        return this.trafficControlId;
    }

    public DescribeTrafficControlsRequest setTrafficControlName(String trafficControlName) {
        this.trafficControlName = trafficControlName;
        return this;
    }
    public String getTrafficControlName() {
        return this.trafficControlName;
    }

}
