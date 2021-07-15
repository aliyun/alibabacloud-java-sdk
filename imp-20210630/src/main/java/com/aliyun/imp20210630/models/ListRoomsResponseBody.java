// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListRoomsResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // API请求的返回结果结构体。
    @NameInMap("Result")
    public ListRoomsResponseBodyResult result;

    public static ListRoomsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRoomsResponseBody self = new ListRoomsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRoomsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRoomsResponseBody setResult(ListRoomsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListRoomsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListRoomsResponseBodyResultRoomInfoListPluginInstanceInfoList extends TeaModel {
        // 插件唯一标识，取值：live-直播，wb-白板，chat-聊天，rtc。
        @NameInMap("PluginType")
        public String pluginType;

        // 插件实例唯一标识。
        @NameInMap("PluginId")
        public String pluginId;

        // 插件实例创建时间戳，单位：毫秒。
        @NameInMap("CreateTime")
        public Long createTime;

        // 插件拓展字段。
        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        public static ListRoomsResponseBodyResultRoomInfoListPluginInstanceInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListRoomsResponseBodyResultRoomInfoListPluginInstanceInfoList self = new ListRoomsResponseBodyResultRoomInfoListPluginInstanceInfoList();
            return TeaModel.build(map, self);
        }

        public ListRoomsResponseBodyResultRoomInfoListPluginInstanceInfoList setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public ListRoomsResponseBodyResultRoomInfoListPluginInstanceInfoList setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public ListRoomsResponseBodyResultRoomInfoListPluginInstanceInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListRoomsResponseBodyResultRoomInfoListPluginInstanceInfoList setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

    }

    public static class ListRoomsResponseBodyResultRoomInfoList extends TeaModel {
        // 房间唯一标识。
        @NameInMap("RoomId")
        public String roomId;

        // 房间标题。
        @NameInMap("Title")
        public String title;

        // 房主用户id。
        @NameInMap("RoomOwnerId")
        public String roomOwnerId;

        // 房间公告。
        @NameInMap("Notice")
        public String notice;

        // 用户访问数。
        @NameInMap("Uv")
        public Long uv;

        // 用户在线数。
        @NameInMap("OnlineCount")
        public Long onlineCount;

        // 活跃插件列表。
        @NameInMap("PluginInstanceInfoList")
        public java.util.List<ListRoomsResponseBodyResultRoomInfoListPluginInstanceInfoList> pluginInstanceInfoList;

        // 房间创建时间戳，单位：毫秒。
        @NameInMap("CreateTime")
        public String createTime;

        // 应用唯一标识，由6位小写字母、数字组成。
        @NameInMap("AppId")
        public String appId;

        // 创建房间使用的模板id。
        @NameInMap("TemplateId")
        public String templateId;

        // 房间拓展字段。
        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        public static ListRoomsResponseBodyResultRoomInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListRoomsResponseBodyResultRoomInfoList self = new ListRoomsResponseBodyResultRoomInfoList();
            return TeaModel.build(map, self);
        }

        public ListRoomsResponseBodyResultRoomInfoList setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public ListRoomsResponseBodyResultRoomInfoList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListRoomsResponseBodyResultRoomInfoList setRoomOwnerId(String roomOwnerId) {
            this.roomOwnerId = roomOwnerId;
            return this;
        }
        public String getRoomOwnerId() {
            return this.roomOwnerId;
        }

        public ListRoomsResponseBodyResultRoomInfoList setNotice(String notice) {
            this.notice = notice;
            return this;
        }
        public String getNotice() {
            return this.notice;
        }

        public ListRoomsResponseBodyResultRoomInfoList setUv(Long uv) {
            this.uv = uv;
            return this;
        }
        public Long getUv() {
            return this.uv;
        }

        public ListRoomsResponseBodyResultRoomInfoList setOnlineCount(Long onlineCount) {
            this.onlineCount = onlineCount;
            return this;
        }
        public Long getOnlineCount() {
            return this.onlineCount;
        }

        public ListRoomsResponseBodyResultRoomInfoList setPluginInstanceInfoList(java.util.List<ListRoomsResponseBodyResultRoomInfoListPluginInstanceInfoList> pluginInstanceInfoList) {
            this.pluginInstanceInfoList = pluginInstanceInfoList;
            return this;
        }
        public java.util.List<ListRoomsResponseBodyResultRoomInfoListPluginInstanceInfoList> getPluginInstanceInfoList() {
            return this.pluginInstanceInfoList;
        }

        public ListRoomsResponseBodyResultRoomInfoList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRoomsResponseBodyResultRoomInfoList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListRoomsResponseBodyResultRoomInfoList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListRoomsResponseBodyResultRoomInfoList setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

    }

    public static class ListRoomsResponseBodyResult extends TeaModel {
        // 该应用的房间总数。
        @NameInMap("TotalCount")
        public Integer totalCount;

        // 该应用的房间总页数。
        @NameInMap("PageTotal")
        public Integer pageTotal;

        // 是否还有下一页房间列表。
        @NameInMap("HasMore")
        public Boolean hasMore;

        // 房间列表信息。
        @NameInMap("RoomInfoList")
        public java.util.List<ListRoomsResponseBodyResultRoomInfoList> roomInfoList;

        public static ListRoomsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRoomsResponseBodyResult self = new ListRoomsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRoomsResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListRoomsResponseBodyResult setPageTotal(Integer pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }
        public Integer getPageTotal() {
            return this.pageTotal;
        }

        public ListRoomsResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListRoomsResponseBodyResult setRoomInfoList(java.util.List<ListRoomsResponseBodyResultRoomInfoList> roomInfoList) {
            this.roomInfoList = roomInfoList;
            return this;
        }
        public java.util.List<ListRoomsResponseBodyResultRoomInfoList> getRoomInfoList() {
            return this.roomInfoList;
        }

    }

}
