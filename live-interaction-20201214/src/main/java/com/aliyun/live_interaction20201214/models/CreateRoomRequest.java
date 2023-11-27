// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

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
        @NameInMap("domain")
        public String domain;

        @NameInMap("ownerId")
        public String ownerId;

        @NameInMap("ownerNick")
        public String ownerNick;

        @NameInMap("title")
        public String title;

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

        public CreateRoomRequestRequest setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public CreateRoomRequestRequest setOwnerNick(String ownerNick) {
            this.ownerNick = ownerNick;
            return this;
        }
        public String getOwnerNick() {
            return this.ownerNick;
        }

        public CreateRoomRequestRequest setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
