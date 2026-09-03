// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adbai20250812.models;

import com.aliyun.tea.*;

public class DeleteMultiModalKnowledgeBaseRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("MmkbName")
    public String mmkbName;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the DescribeRegions operation to query the region ID of a specified Data Lakehouse Edition cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteMultiModalKnowledgeBaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultiModalKnowledgeBaseRequest self = new DeleteMultiModalKnowledgeBaseRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMultiModalKnowledgeBaseRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteMultiModalKnowledgeBaseRequest setMmkbName(String mmkbName) {
        this.mmkbName = mmkbName;
        return this;
    }
    public String getMmkbName() {
        return this.mmkbName;
    }

    public DeleteMultiModalKnowledgeBaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
