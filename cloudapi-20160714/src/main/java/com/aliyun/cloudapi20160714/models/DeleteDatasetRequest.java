// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteDatasetRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetRequest self = new DeleteDatasetRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public DeleteDatasetRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
