// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp_room20210515.models;

import com.aliyun.tea.*;

public class GetRoomDetailResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetRoomDetailResponseBodyResult result;

    @NameInMap("ResponseSuccess")
    public Boolean responseSuccess;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("ErrorMsg")
    public String errorMsg;

    public static GetRoomDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoomDetailResponseBody self = new GetRoomDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoomDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRoomDetailResponseBody setResult(GetRoomDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetRoomDetailResponseBodyResult getResult() {
        return this.result;
    }

    public GetRoomDetailResponseBody setResponseSuccess(Boolean responseSuccess) {
        this.responseSuccess = responseSuccess;
        return this;
    }
    public Boolean getResponseSuccess() {
        return this.responseSuccess;
    }

    public GetRoomDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetRoomDetailResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public static class GetRoomDetailResponseBodyResultPluginInstanceInfoList extends TeaModel {
        // 插件id
        @NameInMap("PluginId")
        public String pluginId;

        // 对应实例id
        @NameInMap("InstanceId")
        public String instanceId;

        // 创建时间戳
        @NameInMap("CreateTime")
        public Long createTime;

        // 拓展字段
        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        public static GetRoomDetailResponseBodyResultPluginInstanceInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetRoomDetailResponseBodyResultPluginInstanceInfoList self = new GetRoomDetailResponseBodyResultPluginInstanceInfoList();
            return TeaModel.build(map, self);
        }

        public GetRoomDetailResponseBodyResultPluginInstanceInfoList setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public GetRoomDetailResponseBodyResultPluginInstanceInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetRoomDetailResponseBodyResultPluginInstanceInfoList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetRoomDetailResponseBodyResultPluginInstanceInfoList setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

    }

    public static class GetRoomDetailResponseBodyResult extends TeaModel {
        // 房间id
        @NameInMap("RoomId")
        public String roomId;

        // 房间标题
        @NameInMap("Title")
        public String title;

        // 房间公告
        @NameInMap("Notice")
        public String notice;

        // 房主id
        @NameInMap("OwnerId")
        public String ownerId;

        // uv
        @NameInMap("Uv")
        public Long uv;

        // 在线数
        @NameInMap("OnlineCount")
        public Long onlineCount;

        // 活跃插件列表
        @NameInMap("PluginInstanceInfoList")
        public java.util.List<GetRoomDetailResponseBodyResultPluginInstanceInfoList> pluginInstanceInfoList;

        public static GetRoomDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetRoomDetailResponseBodyResult self = new GetRoomDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetRoomDetailResponseBodyResult setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public GetRoomDetailResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetRoomDetailResponseBodyResult setNotice(String notice) {
            this.notice = notice;
            return this;
        }
        public String getNotice() {
            return this.notice;
        }

        public GetRoomDetailResponseBodyResult setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetRoomDetailResponseBodyResult setUv(Long uv) {
            this.uv = uv;
            return this;
        }
        public Long getUv() {
            return this.uv;
        }

        public GetRoomDetailResponseBodyResult setOnlineCount(Long onlineCount) {
            this.onlineCount = onlineCount;
            return this;
        }
        public Long getOnlineCount() {
            return this.onlineCount;
        }

        public GetRoomDetailResponseBodyResult setPluginInstanceInfoList(java.util.List<GetRoomDetailResponseBodyResultPluginInstanceInfoList> pluginInstanceInfoList) {
            this.pluginInstanceInfoList = pluginInstanceInfoList;
            return this;
        }
        public java.util.List<GetRoomDetailResponseBodyResultPluginInstanceInfoList> getPluginInstanceInfoList() {
            return this.pluginInstanceInfoList;
        }

    }

}
