// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListRoomLivesRequest extends TeaModel {
    // 应用唯一标识，可以包含小写字母、数字，长度为6个字符。
    @NameInMap("AppId")
    public String appId;

    // 拉取在这个时间戳之前创建的直播，单位毫秒，不传则默认拉取最新创建的。
    @NameInMap("QueryTimestamp")
    public Long queryTimestamp;

    @NameInMap("RegionId")
    public String regionId;

    // 房间ID，最大长度36个字符。
    @NameInMap("RoomId")
    public String roomId;

    // 房间ID列表，可指定多个房间id，过滤优先级高于RoomId。
    @NameInMap("RoomIdList")
    public java.util.List<String> roomIdList;

    // 拉取直播数量。
    @NameInMap("Size")
    public Integer size;

    // 直播状态筛选条件，0-直播 1-下播，不传则返回全部状态
    @NameInMap("Status")
    public Integer status;

    public static ListRoomLivesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRoomLivesRequest self = new ListRoomLivesRequest();
        return TeaModel.build(map, self);
    }

    public ListRoomLivesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListRoomLivesRequest setQueryTimestamp(Long queryTimestamp) {
        this.queryTimestamp = queryTimestamp;
        return this;
    }
    public Long getQueryTimestamp() {
        return this.queryTimestamp;
    }

    public ListRoomLivesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListRoomLivesRequest setRoomId(String roomId) {
        this.roomId = roomId;
        return this;
    }
    public String getRoomId() {
        return this.roomId;
    }

    public ListRoomLivesRequest setRoomIdList(java.util.List<String> roomIdList) {
        this.roomIdList = roomIdList;
        return this;
    }
    public java.util.List<String> getRoomIdList() {
        return this.roomIdList;
    }

    public ListRoomLivesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListRoomLivesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
