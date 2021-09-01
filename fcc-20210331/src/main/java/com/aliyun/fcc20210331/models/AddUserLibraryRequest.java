// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class AddUserLibraryRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("Name")
    public String name;

    @NameInMap("IdentityCard")
    public String identityCard;

    @NameInMap("Profession")
    public String profession;

    @NameInMap("Photo")
    public String photo;

    public static AddUserLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserLibraryRequest self = new AddUserLibraryRequest();
        return TeaModel.build(map, self);
    }

    public AddUserLibraryRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public AddUserLibraryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddUserLibraryRequest setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
        return this;
    }
    public String getIdentityCard() {
        return this.identityCard;
    }

    public AddUserLibraryRequest setProfession(String profession) {
        this.profession = profession;
        return this;
    }
    public String getProfession() {
        return this.profession;
    }

    public AddUserLibraryRequest setPhoto(String photo) {
        this.photo = photo;
        return this;
    }
    public String getPhoto() {
        return this.photo;
    }

}
