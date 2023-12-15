// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyDatasetItemRequest extends TeaModel {
    /**
     * <p>The ID of the dataset.</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <p>The ID of the data entry.</p>
     */
    @NameInMap("DatasetItemId")
    public String datasetItemId;

    /**
     * <p>The description of the data entry. The description cannot exceed 180 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The time in UTC when the data entry expires. The time is in the **yyyy-MM-ddTHH:mm:ssZ** format.</p>
     */
    @NameInMap("ExpiredTime")
    public String expiredTime;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ModifyDatasetItemRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatasetItemRequest self = new ModifyDatasetItemRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDatasetItemRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public ModifyDatasetItemRequest setDatasetItemId(String datasetItemId) {
        this.datasetItemId = datasetItemId;
        return this;
    }
    public String getDatasetItemId() {
        return this.datasetItemId;
    }

    public ModifyDatasetItemRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDatasetItemRequest setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public String getExpiredTime() {
        return this.expiredTime;
    }

    public ModifyDatasetItemRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
