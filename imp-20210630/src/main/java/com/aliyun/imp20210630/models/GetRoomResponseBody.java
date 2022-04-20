// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetRoomResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 查询房间信息返回结果。
    @NameInMap("Result")
    public GetRoomResponseBodyResult result;

    public static GetRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoomResponseBody self = new GetRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRoomResponseBody setResult(GetRoomResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetRoomResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetRoomResponseBodyResultRoomInfoPluginInstanceInfoList extends TeaModel {
        // 插件实例创建时间戳，单位：毫秒。
        @NameInMap("CreateTime")
        public Long createTime;

        // 插件拓展字段。
        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        // 插件实例唯一标识。
        @NameInMap("PluginId")
        public String pluginId;

        // 插件唯一标识，取值：live-直播，wb-白板，chat-聊天，rtc。
        @NameInMap("PluginType")
        public String pluginType;

        public static GetRoomResponseBodyResultRoomInfoPluginInstanceInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetRoomResponseBodyResultRoomInfoPluginInstanceInfoList self = new GetRoomResponseBodyResultRoomInfoPluginInstanceInfoList();
            return TeaModel.build(map, self);
        }

        public GetRoomResponseBodyResultRoomInfoPluginInstanceInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetRoomResponseBodyResultRoomInfoPluginInstanceInfoList setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        public GetRoomResponseBodyResultRoomInfoPluginInstanceInfoList setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public GetRoomResponseBodyResultRoomInfoPluginInstanceInfoList setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

    }

    public static class GetRoomResponseBodyResultRoomInfo extends TeaModel {
        // 管理员ID列表。
        @NameInMap("AdminIdList")
        public java.util.List<String> adminIdList;

        // 应用唯一标识，由6位小写字母、数字组成。
        @NameInMap("AppId")
        public String appId;

        // 房间创建时间戳，单位：毫秒。
        @NameInMap("CreateTime")
        public Long createTime;

        // 房间拓展字段。
        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        // 房间公告。
        @NameInMap("Notice")
        public String notice;

        // 在线用户数。
        @NameInMap("OnlineCount")
        public Long onlineCount;

        // 活跃插件列表。
        @NameInMap("PluginInstanceInfoList")
        public java.util.List<GetRoomResponseBodyResultRoomInfoPluginInstanceInfoList> pluginInstanceInfoList;

        // 访问用户人次。
        @NameInMap("Pv")
        public Long pv;

        // 房间唯一标识。
        @NameInMap("RoomId")
        public String roomId;

        // 房主用户id。
        @NameInMap("RoomOwnerId")
        public String roomOwnerId;

        // 创建房间使用的模板id。
        @NameInMap("TemplateId")
        public String templateId;

        // 房间标题。
        @NameInMap("Title")
        public String title;

        // 访问用户数。
        @NameInMap("Uv")
        public Long uv;

        public static GetRoomResponseBodyResultRoomInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRoomResponseBodyResultRoomInfo self = new GetRoomResponseBodyResultRoomInfo();
            return TeaModel.build(map, self);
        }

        public GetRoomResponseBodyResultRoomInfo setAdminIdList(java.util.List<String> adminIdList) {
            this.adminIdList = adminIdList;
            return this;
        }
        public java.util.List<String> getAdminIdList() {
            return this.adminIdList;
        }

        public GetRoomResponseBodyResultRoomInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetRoomResponseBodyResultRoomInfo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetRoomResponseBodyResultRoomInfo setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

        public GetRoomResponseBodyResultRoomInfo setNotice(String notice) {
            this.notice = notice;
            return this;
        }
        public String getNotice() {
            return this.notice;
        }

        public GetRoomResponseBodyResultRoomInfo setOnlineCount(Long onlineCount) {
            this.onlineCount = onlineCount;
            return this;
        }
        public Long getOnlineCount() {
            return this.onlineCount;
        }

        public GetRoomResponseBodyResultRoomInfo setPluginInstanceInfoList(java.util.List<GetRoomResponseBodyResultRoomInfoPluginInstanceInfoList> pluginInstanceInfoList) {
            this.pluginInstanceInfoList = pluginInstanceInfoList;
            return this;
        }
        public java.util.List<GetRoomResponseBodyResultRoomInfoPluginInstanceInfoList> getPluginInstanceInfoList() {
            return this.pluginInstanceInfoList;
        }

        public GetRoomResponseBodyResultRoomInfo setPv(Long pv) {
            this.pv = pv;
            return this;
        }
        public Long getPv() {
            return this.pv;
        }

        public GetRoomResponseBodyResultRoomInfo setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public GetRoomResponseBodyResultRoomInfo setRoomOwnerId(String roomOwnerId) {
            this.roomOwnerId = roomOwnerId;
            return this;
        }
        public String getRoomOwnerId() {
            return this.roomOwnerId;
        }

        public GetRoomResponseBodyResultRoomInfo setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetRoomResponseBodyResultRoomInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetRoomResponseBodyResultRoomInfo setUv(Long uv) {
            this.uv = uv;
            return this;
        }
        public Long getUv() {
            return this.uv;
        }

    }

    public static class GetRoomResponseBodyResult extends TeaModel {
        // 房间信息。
        @NameInMap("RoomInfo")
        public GetRoomResponseBodyResultRoomInfo roomInfo;

        public static GetRoomResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetRoomResponseBodyResult self = new GetRoomResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetRoomResponseBodyResult setRoomInfo(GetRoomResponseBodyResultRoomInfo roomInfo) {
            this.roomInfo = roomInfo;
            return this;
        }
        public GetRoomResponseBodyResultRoomInfo getRoomInfo() {
            return this.roomInfo;
        }

    }

}
