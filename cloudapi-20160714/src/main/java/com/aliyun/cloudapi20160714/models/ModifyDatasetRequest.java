// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyDatasetRequest extends TeaModel {
    /**
     * <p>The ID of the dataset.</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <p>The name of the dataset.</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatasetRequest self = new ModifyDatasetRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDatasetRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public ModifyDatasetRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public ModifyDatasetRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
