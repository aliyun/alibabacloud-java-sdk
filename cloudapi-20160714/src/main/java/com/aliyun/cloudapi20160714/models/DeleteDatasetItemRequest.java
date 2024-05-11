// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteDatasetItemRequest extends TeaModel {
    /**
     * <p>The ID of the dataset.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <p>The ID of the data entry.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetItemId")
    public String datasetItemId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteDatasetItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetItemRequest self = new DeleteDatasetItemRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetItemRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public DeleteDatasetItemRequest setDatasetItemId(String datasetItemId) {
        this.datasetItemId = datasetItemId;
        return this;
    }
    public String getDatasetItemId() {
        return this.datasetItemId;
    }

    public DeleteDatasetItemRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
