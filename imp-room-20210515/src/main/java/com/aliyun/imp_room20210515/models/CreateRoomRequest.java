// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp_room20210515.models;

import com.aliyun.tea.*;

public class CreateRoomRequest extends TeaModel {
    @NameInMap("Request")
    public CreateRoomRequestRequest request;

    public static CreateRoomRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRoomRequest self = new CreateRoomRequest();
        return TeaModel.build(map, self);
    }

    public CreateRoomRequest setRequest(CreateRoomRequestRequest request) {
        this.request = request;
        return this;
    }
    public CreateRoomRequestRequest getRequest() {
        return this.request;
    }

    public static class CreateRoomRequestRequest extends TeaModel {
        // 租户名
        @NameInMap("Domain")
        public String domain;

        // 业务类型
        @NameInMap("BizType")
        public String bizType;

        // 模板id
        @NameInMap("TemplateId")
        public String templateId;

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

        // 拓展字段
        @NameInMap("Extension")
        public java.util.Map<String, String> extension;

        public static CreateRoomRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            CreateRoomRequestRequest self = new CreateRoomRequestRequest();
            return TeaModel.build(map, self);
        }

        public CreateRoomRequestRequest setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateRoomRequestRequest setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public CreateRoomRequestRequest setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public CreateRoomRequestRequest setRoomId(String roomId) {
            this.roomId = roomId;
            return this;
        }
        public String getRoomId() {
            return this.roomId;
        }

        public CreateRoomRequestRequest setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateRoomRequestRequest setNotice(String notice) {
            this.notice = notice;
            return this;
        }
        public String getNotice() {
            return this.notice;
        }

        public CreateRoomRequestRequest setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public CreateRoomRequestRequest setExtension(java.util.Map<String, String> extension) {
            this.extension = extension;
            return this;
        }
        public java.util.Map<String, String> getExtension() {
            return this.extension;
        }

    }

}
