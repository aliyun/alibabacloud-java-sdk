// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetLabelsRequest extends TeaModel {
    @NameInMap("Keys")
    public String keys;

    public static DeleteDatasetLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetLabelsRequest self = new DeleteDatasetLabelsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetLabelsRequest setKeys(String keys) {
        this.keys = keys;
        return this;
    }
    public String getKeys() {
        return this.keys;
    }

}
