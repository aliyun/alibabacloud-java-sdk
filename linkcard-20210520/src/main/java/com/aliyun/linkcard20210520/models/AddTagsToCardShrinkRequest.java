// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class AddTagsToCardShrinkRequest extends TeaModel {
    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("TagNameList")
    public String tagNameListShrink;

    public static AddTagsToCardShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTagsToCardShrinkRequest self = new AddTagsToCardShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddTagsToCardShrinkRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public AddTagsToCardShrinkRequest setTagNameListShrink(String tagNameListShrink) {
        this.tagNameListShrink = tagNameListShrink;
        return this;
    }
    public String getTagNameListShrink() {
        return this.tagNameListShrink;
    }

}
