// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteTagInfoRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("TagId")
    public Long tagId;

    public static DeleteTagInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagInfoRequest self = new DeleteTagInfoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTagInfoRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public DeleteTagInfoRequest setTagId(Long tagId) {
        this.tagId = tagId;
        return this;
    }
    public Long getTagId() {
        return this.tagId;
    }

}
