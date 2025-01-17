// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListBindInfoRequest extends TeaModel {
    @NameInMap("AppIdList")
    public java.util.List<String> appIdList;

    @NameInMap("AppInstanceGroupIdList")
    public java.util.List<String> appInstanceGroupIdList;

    @NameInMap("AppInstanceIdList")
    public java.util.List<String> appInstanceIdList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("UserIdList")
    public java.util.List<String> userIdList;

    @NameInMap("WyIdList")
    public java.util.List<String> wyIdList;

    public static ListBindInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBindInfoRequest self = new ListBindInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListBindInfoRequest setAppIdList(java.util.List<String> appIdList) {
        this.appIdList = appIdList;
        return this;
    }
    public java.util.List<String> getAppIdList() {
        return this.appIdList;
    }

    public ListBindInfoRequest setAppInstanceGroupIdList(java.util.List<String> appInstanceGroupIdList) {
        this.appInstanceGroupIdList = appInstanceGroupIdList;
        return this;
    }
    public java.util.List<String> getAppInstanceGroupIdList() {
        return this.appInstanceGroupIdList;
    }

    public ListBindInfoRequest setAppInstanceIdList(java.util.List<String> appInstanceIdList) {
        this.appInstanceIdList = appInstanceIdList;
        return this;
    }
    public java.util.List<String> getAppInstanceIdList() {
        return this.appInstanceIdList;
    }

    public ListBindInfoRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBindInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBindInfoRequest setUserIdList(java.util.List<String> userIdList) {
        this.userIdList = userIdList;
        return this;
    }
    public java.util.List<String> getUserIdList() {
        return this.userIdList;
    }

    public ListBindInfoRequest setWyIdList(java.util.List<String> wyIdList) {
        this.wyIdList = wyIdList;
        return this;
    }
    public java.util.List<String> getWyIdList() {
        return this.wyIdList;
    }

}
