// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListUsersRequest extends TeaModel {
    // 人员名称
    @NameInMap("username")
    public String username;

    // 人员手机号
    @NameInMap("phone")
    public String phone;

    // ramID
    @NameInMap("ramId")
    public String ramId;

    // USER_LIST列表 ALL_USERS下拉
    @NameInMap("scene")
    public Long scene;

    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    // 分页参数
    @NameInMap("pageNumber")
    public Long pageNumber;

    // 分页参数
    @NameInMap("pageSize")
    public Long pageSize;

    public static ListUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUsersRequest self = new ListUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListUsersRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public ListUsersRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ListUsersRequest setRamId(String ramId) {
        this.ramId = ramId;
        return this;
    }
    public String getRamId() {
        return this.ramId;
    }

    public ListUsersRequest setScene(Long scene) {
        this.scene = scene;
        return this;
    }
    public Long getScene() {
        return this.scene;
    }

    public ListUsersRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListUsersRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListUsersRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
