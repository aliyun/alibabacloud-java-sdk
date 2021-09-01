// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class UpdateUserLibraryByIdShrinkRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("Name")
    public String name;

    @NameInMap("IdentityCard")
    public String identityCard;

    @NameInMap("Profession")
    public String profession;

    @NameInMap("Photo")
    public String photoShrink;

    @NameInMap("Id")
    public String id;

    public static UpdateUserLibraryByIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserLibraryByIdShrinkRequest self = new UpdateUserLibraryByIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserLibraryByIdShrinkRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public UpdateUserLibraryByIdShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateUserLibraryByIdShrinkRequest setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
        return this;
    }
    public String getIdentityCard() {
        return this.identityCard;
    }

    public UpdateUserLibraryByIdShrinkRequest setProfession(String profession) {
        this.profession = profession;
        return this;
    }
    public String getProfession() {
        return this.profession;
    }

    public UpdateUserLibraryByIdShrinkRequest setPhotoShrink(String photoShrink) {
        this.photoShrink = photoShrink;
        return this;
    }
    public String getPhotoShrink() {
        return this.photoShrink;
    }

    public UpdateUserLibraryByIdShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
