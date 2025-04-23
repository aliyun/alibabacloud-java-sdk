// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetVersionLabelsRequest extends TeaModel {
    /**
     * <p>The tag keys. Multiple tags are separated by commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>key1,key2</p>
     */
    @NameInMap("Keys")
    public String keys;

    public static DeleteDatasetVersionLabelsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetVersionLabelsRequest self = new DeleteDatasetVersionLabelsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetVersionLabelsRequest setKeys(String keys) {
        this.keys = keys;
        return this;
    }
    public String getKeys() {
        return this.keys;
    }

}
