// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateDatasetRequest extends TeaModel {
    /**
     * <p>Dataset Name</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <p>The type of the dataset. Valid values:</p>
     * <br>
     * <p>*   JWT_BLOCKING: a JSON Web Token (JWT) blacklist</p>
     * <p>*   IP_WHITELIST_CIDR : an IP address whitelist</p>
     * <p>*   PARAMETER_ACCESS : parameter-based access control</p>
     */
    @NameInMap("DatasetType")
    public String datasetType;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static CreateDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetRequest self = new CreateDatasetRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetRequest setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public CreateDatasetRequest setDatasetType(String datasetType) {
        this.datasetType = datasetType;
        return this;
    }
    public String getDatasetType() {
        return this.datasetType;
    }

    public CreateDatasetRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
