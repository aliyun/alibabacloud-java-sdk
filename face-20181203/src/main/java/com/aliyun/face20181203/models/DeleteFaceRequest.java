// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.face20181203.models;

import com.aliyun.tea.*;

public class DeleteFaceRequest extends TeaModel {
    @NameInMap("Group")
    public String group;

    @NameInMap("Person")
    public String person;

    @NameInMap("Image")
    public String image;

    public static DeleteFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceRequest self = new DeleteFaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public DeleteFaceRequest setPerson(String person) {
        this.person = person;
        return this;
    }
    public String getPerson() {
        return this.person;
    }

    public DeleteFaceRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

}
