// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListRoomUsersRequest extends TeaModel {
    // 应用唯一标识，由6位小写字母、数字组成。
    @NameInMap("AppId")
    public String appId;

    // 查询页码，从1开始，传空默认查询第1页。
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页显示个数，最大支持50，参数为空默认显示个数为10。
    @NameInMap("PageSize")
    public Integer pageSize;

    // 房间ID，最大长度36个字符。
    @NameInMap("RoomId")
    public String roomId;

    public static ListRoomUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRoomUsersRequest self = new ListRoomUsersRequest();
        return TeaModel.build(map, self);
    }

    public ListRoomUsersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListRoomUsersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRoomUsersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRoomUsersRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

}
