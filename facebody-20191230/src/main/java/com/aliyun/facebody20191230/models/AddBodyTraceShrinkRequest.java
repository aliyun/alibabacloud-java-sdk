// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddBodyTraceShrinkRequest extends TeaModel {
    // 数据库ID
    @NameInMap("DbId")
    public Long dbId;

    // 自定义信息。支持字母、数字、标点符号和汉字。不超过4096个字符。
    @NameInMap("ExtraData")
    public String extraData;

    // Trace图片信息列表
    @NameInMap("Images")
    public String imagesShrink;

    // 实体ID，可以包含数字、字母和下划线，相同db下不可以重复，长度1-64。
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
