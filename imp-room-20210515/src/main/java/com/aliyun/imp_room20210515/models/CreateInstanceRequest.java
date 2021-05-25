// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp_room20210515.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("Request")
    public CreateInstanceRequestRequest request;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setRequest(CreateInstanceRequestRequest request) {
        this.request = request;
        return this;
    }
    public CreateInstanceRequestRequest getRequest() {
        return this.request;
    }

    public static class CreateInstanceRequestRequest extends TeaModel {
        // 租户名
        @NameInMap("Domain")
        public String domain;

        // 房间id
        @NameInMap("RoomId")
        public String roomId;

        // 插件ID
        @NameInMap("PluginId")
        public String pluginId;

        // 拓展字段
        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        public static CreateInstanceRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestRequest self = new CreateInstanceRequestRequest();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestRequest setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateInstanceRequestRequest setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public CreateInstanceRequestRequest setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public CreateInstanceRequestRequest setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

    }

}
