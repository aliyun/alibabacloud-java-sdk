// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListRoomsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        @NameInMap("PluginId")
        public String pluginId;

        @NameInMap("PluginType")
        public String pluginType;

        public static ListRoomsResponseBodyResultRoomInfoListPluginInstanceInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListRoomsResponseBodyResultRoomInfoListPluginInstanceInfoList self = new ListRoomsResponseBodyResultRoomInfoListPluginInstanceInfoList();
            return TeaModel.build(map, self);
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

        public ListRoomsResponseBodyResultRoomInfoListPluginInstanceInfoList setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public ListRoomsResponseBodyResultRoomInfoListPluginInstanceInfoList setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

    }

    public static class ListRoomsResponseBodyResultRoomInfoList extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        @NameInMap("Notice")
        public String notice;

        @NameInMap("OnlineCount")
        public Long onlineCount;

        @NameInMap("PluginInstanceInfoList")
        public java.util.List<ListRoomsResponseBodyResultRoomInfoListPluginInstanceInfoList> pluginInstanceInfoList;

        @NameInMap("RoomId")
        public String roomId;

        @NameInMap("RoomOwnerId")
        public String roomOwnerId;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("Title")
        public String title;

        @NameInMap("Uv")
        public Long uv;

        public static ListRoomsResponseBodyResultRoomInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListRoomsResponseBodyResultRoomInfoList self = new ListRoomsResponseBodyResultRoomInfoList();
            return TeaModel.build(map, self);
        }

        public ListRoomsResponseBodyResultRoomInfoList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListRoomsResponseBodyResultRoomInfoList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRoomsResponseBodyResultRoomInfoList setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        public ListRoomsResponseBodyResultRoomInfoList setNotice(String notice) {
            this.notice = notice;
            return this;
        }
        public String getNotice() {
            return this.notice;
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

        public ListRoomsResponseBodyResultRoomInfoList setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public ListRoomsResponseBodyResultRoomInfoList setRoomOwnerId(String roomOwnerId) {
            this.roomOwnerId = roomOwnerId;
            return this;
        }
        public String getRoomOwnerId() {
            return this.roomOwnerId;
        }

        public ListRoomsResponseBodyResultRoomInfoList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListRoomsResponseBodyResultRoomInfoList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListRoomsResponseBodyResultRoomInfoList setUv(Long uv) {
            this.uv = uv;
            return this;
        }
        public Long getUv() {
            return this.uv;
        }

    }

    public static class ListRoomsResponseBodyResult extends TeaModel {
        @NameInMap("HasMore")
        public Boolean hasMore;

        @NameInMap("PageTotal")
        public Integer pageTotal;

        @NameInMap("RoomInfoList")
        public java.util.List<ListRoomsResponseBodyResultRoomInfoList> roomInfoList;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListRoomsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRoomsResponseBodyResult self = new ListRoomsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRoomsResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListRoomsResponseBodyResult setPageTotal(Integer pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }
        public Integer getPageTotal() {
            return this.pageTotal;
        }

        public ListRoomsResponseBodyResult setRoomInfoList(java.util.List<ListRoomsResponseBodyResultRoomInfoList> roomInfoList) {
            this.roomInfoList = roomInfoList;
            return this;
        }
        public java.util.List<ListRoomsResponseBodyResultRoomInfoList> getRoomInfoList() {
            return this.roomInfoList;
        }

        public ListRoomsResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
