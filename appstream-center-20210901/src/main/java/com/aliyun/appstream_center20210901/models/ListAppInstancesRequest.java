// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAppInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the delivery group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-4p5f8tj16yb8b****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The ID of the application instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ai-azn3kmwruh1vl****</p>
     */
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    /**
     * <p>The IDs of the application instances. Up to 100 IDs can be specified.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("AppInstanceIdList")
    public java.util.List<String> appInstanceIdList;

    /**
     * <p>Specifies whether to query the information about deleted app instances. If you set this parameter to true, you must configure AppInstanceIdList. Otherwise, a parameter error is reported.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeDeleted")
    public Boolean includeDeleted;

    /**
     * <p>The page number. Default value: <code>1</code>. We recommend that you specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. The value cannot be greater than <code>100</code>. Default value: <code>20</code>. We recommend that you specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The status of the application instances.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Status")
    public java.util.List<String> status;

    /**
     * <p>The user IDs. You can specify up to 100 IDs.</p>
     */
    @NameInMap("UserIdList")
    public java.util.List<String> userIdList;

    public static ListAppInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppInstancesRequest self = new ListAppInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListAppInstancesRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public ListAppInstancesRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public ListAppInstancesRequest setAppInstanceIdList(java.util.List<String> appInstanceIdList) {
        this.appInstanceIdList = appInstanceIdList;
        return this;
    }
    public java.util.List<String> getAppInstanceIdList() {
        return this.appInstanceIdList;
    }

    public ListAppInstancesRequest setIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
        return this;
    }
    public Boolean getIncludeDeleted() {
        return this.includeDeleted;
    }

    public ListAppInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppInstancesRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public ListAppInstancesRequest setUserIdList(java.util.List<String> userIdList) {
        this.userIdList = userIdList;
        return this;
    }
    public java.util.List<String> getUserIdList() {
        return this.userIdList;
    }

}
