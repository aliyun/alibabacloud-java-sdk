// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteCallTagRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TagName")
    public String tagName;

    public static DeleteCallTagRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCallTagRequest self = new DeleteCallTagRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCallTagRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteCallTagRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
