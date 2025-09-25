// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifySqlTemplatePositionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-uf6wjk5xxxxxxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TargetTemplateGroupId")
    public Long targetTemplateGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>210208</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static ModifySqlTemplatePositionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySqlTemplatePositionRequest self = new ModifySqlTemplatePositionRequest();
        return TeaModel.build(map, self);
    }

    public ModifySqlTemplatePositionRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifySqlTemplatePositionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySqlTemplatePositionRequest setTargetTemplateGroupId(Long targetTemplateGroupId) {
        this.targetTemplateGroupId = targetTemplateGroupId;
        return this;
    }
    public Long getTargetTemplateGroupId() {
        return this.targetTemplateGroupId;
    }

    public ModifySqlTemplatePositionRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
