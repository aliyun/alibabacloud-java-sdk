// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateDatasetItemRequest extends TeaModel {
    /**
     * <p>The ID of the dataset.</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <p>The description of the data entry. The description cannot be more than 180 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time in UTC when the data entry expires. The time is in the **yyyy-MM-ddTHH:mm:ssZ** format. If this parameter is empty, the data entry does not expire.</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The value of the data entry. The value corresponds to the dataset type.</p>
     */
    @NameInMap("Value")
    public String value;

    public static CreateDatasetItemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetItemRequest self = new CreateDatasetItemRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetItemRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public CreateDatasetItemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDatasetItemRequest setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public CreateDatasetItemRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateDatasetItemRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
