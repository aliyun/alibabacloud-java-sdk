// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class AddTagsToCardRequest extends TeaModel {
    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("TagNameList")
    public java.util.List<String> tagNameList;

    public static AddTagsToCardRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTagsToCardRequest self = new AddTagsToCardRequest();
        return TeaModel.build(map, self);
    }

    public AddTagsToCardRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public AddTagsToCardRequest setTagNameList(java.util.List<String> tagNameList) {
        this.tagNameList = tagNameList;
        return this;
    }
    public java.util.List<String> getTagNameList() {
        return this.tagNameList;
    }

}
