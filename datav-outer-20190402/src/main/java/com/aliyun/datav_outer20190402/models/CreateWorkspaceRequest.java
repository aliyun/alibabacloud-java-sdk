// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class CreateWorkspaceRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Name")
    public String name;

    @NameInMap("Screen")
    public Integer screen;

    @NameInMap("Favorite")
    public Integer favorite;

    @NameInMap("Members")
    public java.util.List<CreateWorkspaceRequestMembers> members;

    public static CreateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceRequest self = new CreateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public CreateWorkspaceRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateWorkspaceRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public CreateWorkspaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateWorkspaceRequest setScreen(Integer screen) {
        this.screen = screen;
        return this;
    }
    public Integer getScreen() {
        return this.screen;
    }

    public CreateWorkspaceRequest setFavorite(Integer favorite) {
        this.favorite = favorite;
        return this;
    }
    public Integer getFavorite() {
        return this.favorite;
    }

    public CreateWorkspaceRequest setMembers(java.util.List<CreateWorkspaceRequestMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<CreateWorkspaceRequestMembers> getMembers() {
        return this.members;
    }

    public static class CreateWorkspaceRequestMembers extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("ExpiredAt")
        public Long expiredAt;

        public static CreateWorkspaceRequestMembers build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceRequestMembers self = new CreateWorkspaceRequestMembers();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceRequestMembers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateWorkspaceRequestMembers setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public CreateWorkspaceRequestMembers setExpiredAt(Long expiredAt) {
            this.expiredAt = expiredAt;
            return this;
        }
        public Long getExpiredAt() {
            return this.expiredAt;
        }

    }

}
