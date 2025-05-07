// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class RecordClickLinkActionRequest extends TeaModel {
    @NameInMap("Tag")
    public String tag;

    public static RecordClickLinkActionRequest build(java.util.Map<String, ?> map) throws Exception {
        RecordClickLinkActionRequest self = new RecordClickLinkActionRequest();
        return TeaModel.build(map, self);
    }

    public RecordClickLinkActionRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

}
