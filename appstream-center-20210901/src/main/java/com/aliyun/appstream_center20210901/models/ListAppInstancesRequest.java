// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListAppInstancesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-4p5f8tj16yb8b****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <strong>example:</strong>
     * <p>ai-azn3kmwruh1vl****</p>
     */
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    /**
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("AppInstanceIdList")
    public java.util.List<String> appInstanceIdList;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeDeleted")
    public Boolean includeDeleted;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Status")
    public java.util.List<String> status;

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

}
