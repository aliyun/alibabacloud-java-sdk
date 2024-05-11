// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetInfoRequest extends TeaModel {
    /**
     * <p>The ID of the dataset.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeDatasetInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatasetInfoRequest self = new DescribeDatasetInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDatasetInfoRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public DescribeDatasetInfoRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
