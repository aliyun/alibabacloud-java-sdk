// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetRoomResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        @NameInMap("PluginId")
        public String pluginId;

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
        @NameInMap("AdminIdList")
        public java.util.List<String> adminIdList;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        @NameInMap("Notice")
        public String notice;

        @NameInMap("OnlineCount")
        public Long onlineCount;

        @NameInMap("PluginInstanceInfoList")
        public java.util.List<GetRoomResponseBodyResultRoomInfoPluginInstanceInfoList> pluginInstanceInfoList;

        @NameInMap("Pv")
        public Long pv;

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
