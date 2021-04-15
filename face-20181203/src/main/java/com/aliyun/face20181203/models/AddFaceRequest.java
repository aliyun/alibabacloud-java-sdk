// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.face20181203.models;

import com.aliyun.tea.*;

public class AddFaceRequest extends TeaModel {
    @NameInMap("Group")
    public String group;

    @NameInMap("Person")
    public String person;

    @NameInMap("Image")
    public String image;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("Content")
    public String content;

    public static AddFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceRequest self = new AddFaceRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public AddFaceRequest setPerson(String person) {
        this.person = person;
        return this;
    }
    public String getPerson() {
        return this.person;
    }

    public AddFaceRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public AddFaceRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public AddFaceRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
