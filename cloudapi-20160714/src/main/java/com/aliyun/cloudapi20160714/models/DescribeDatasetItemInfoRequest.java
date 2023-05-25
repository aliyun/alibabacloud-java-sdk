// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDatasetItemInfoRequest extends TeaModel {
    @NameInMap("DatasetId")
    public String datasetId;

    @NameInMap("DatasetItemId")
    public String datasetItemId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Value")
    public String value;

    public static DescribeDatasetItemInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatasetItemInfoRequest self = new DescribeDatasetItemInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDatasetItemInfoRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public DescribeDatasetItemInfoRequest setDatasetItemId(String datasetItemId) {
        this.datasetItemId = datasetItemId;
        return this;
    }
    public String getDatasetItemId() {
        return this.datasetItemId;
    }

    public DescribeDatasetItemInfoRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeDatasetItemInfoRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
