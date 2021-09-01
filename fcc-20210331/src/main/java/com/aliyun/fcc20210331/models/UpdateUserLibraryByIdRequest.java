// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class UpdateUserLibraryByIdRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("Name")
    public String name;

    @NameInMap("IdentityCard")
    public String identityCard;

    @NameInMap("Profession")
    public String profession;

    @NameInMap("Photo")
    public java.util.Map<String, ?> photo;

    @NameInMap("Id")
    public String id;

    public static UpdateUserLibraryByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserLibraryByIdRequest self = new UpdateUserLibraryByIdRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserLibraryByIdRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public UpdateUserLibraryByIdRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateUserLibraryByIdRequest setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
        return this;
    }
    public String getIdentityCard() {
        return this.identityCard;
    }

    public UpdateUserLibraryByIdRequest setProfession(String profession) {
        this.profession = profession;
        return this;
    }
    public String getProfession() {
        return this.profession;
    }

    public UpdateUserLibraryByIdRequest setPhoto(java.util.Map<String, ?> photo) {
        this.photo = photo;
        return this;
    }
    public java.util.Map<String, ?> getPhoto() {
        return this.photo;
    }

    public UpdateUserLibraryByIdRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
