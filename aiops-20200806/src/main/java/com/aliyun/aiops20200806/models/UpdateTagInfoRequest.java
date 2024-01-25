// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateTagInfoRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("TagId")
    public Long tagId;

    @NameInMap("TagName")
    public String tagName;

    public static UpdateTagInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTagInfoRequest self = new UpdateTagInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTagInfoRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public UpdateTagInfoRequest setTagId(Long tagId) {
        this.tagId = tagId;
        return this;
    }
    public Long getTagId() {
        return this.tagId;
    }

    public UpdateTagInfoRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
