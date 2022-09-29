// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddBodyTraceShrinkRequest extends TeaModel {
    @NameInMap("DbId")
    public Long dbId;

    @NameInMap("ExtraData")
    public String extraData;

    @NameInMap("Images")
    public String imagesShrink;

    @NameInMap("PersonId")
    public Long personId;

    public static AddBodyTraceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBodyTraceShrinkRequest self = new AddBodyTraceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddBodyTraceShrinkRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public AddBodyTraceShrinkRequest setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

    public AddBodyTraceShrinkRequest setImagesShrink(String imagesShrink) {
        this.imagesShrink = imagesShrink;
        return this;
    }
    public String getImagesShrink() {
        return this.imagesShrink;
    }

    public AddBodyTraceShrinkRequest setPersonId(Long personId) {
        this.personId = personId;
        return this;
    }
    public Long getPersonId() {
        return this.personId;
    }

}
