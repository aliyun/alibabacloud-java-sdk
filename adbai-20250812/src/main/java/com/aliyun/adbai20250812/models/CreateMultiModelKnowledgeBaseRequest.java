// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class CreateMultiModelKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>The instance cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the DescribeRegions operation to query the region ID of a specified Data Lakehouse Edition cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateMultiModelKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMultiModelKnowledgeBaseRequest self = new CreateMultiModelKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateMultiModelKnowledgeBaseRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateMultiModelKnowledgeBaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
