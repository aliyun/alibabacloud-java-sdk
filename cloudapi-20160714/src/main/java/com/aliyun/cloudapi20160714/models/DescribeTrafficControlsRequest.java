// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeTrafficControlsRequest extends TeaModel {
    /**
     * <p>The specified API ID. This parameter must be specified together with GroupId and StageName.</p>
     * 
     * <strong>example:</strong>
     * <p>3b81fd160f5645e097cc8855d75a1cf6</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The specified group ID. This parameter must be specified together with ApiId and StageName.</p>
     * 
     * <strong>example:</strong>
     * <p>0009db9c828549768a200320714b8930</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
     * 
     * <strong>example:</strong>
     * <p>436fa39b-b3b9-40c5-ae5d-ce3e000e38c5</p>
     */
    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The environment name. This parameter must be specified together with GroupId and ApiId. Valid values:********</p>
     * <ul>
     * <li><strong>RELEASE</strong></li>
     * <li><strong>TEST</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RELEASE</p>
     */
    @NameInMap("StageName")
    public String stageName;

    /**
     * <p>The ID of the throttling policy.</p>
     * 
     * <strong>example:</strong>
     * <p>tf123456</p>
     */
    @NameInMap("TrafficControlId")
    public String trafficControlId;

    /**
     * <p>The name of the throttling policy.</p>
     * 
     * <strong>example:</strong>
     * <p>ThrottlingTest</p>
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
