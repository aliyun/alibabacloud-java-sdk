// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveGroupEntitySummary extends TeaModel {
    /**
     * <p>The entity category.</p>
     * 
     * <strong>example:</strong>
     * <p>acs</p>
     */
    @NameInMap("entityCategory")
    public String entityCategory;

    /**
     * <p>The total count of entities of this type.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("entityCount")
    public Integer entityCount;

    /**
     * <p>The entity domain.</p>
     * 
     * <strong>example:</strong>
     * <p>acs</p>
     */
    @NameInMap("entityDomain")
    public String entityDomain;

    /**
     * <p>The entity type.</p>
     * 
     * <strong>example:</strong>
     * <p>acs.rocketmq.topic</p>
     */
    @NameInMap("entityType")
    public String entityType;

    /**
     * <p>The count of primary entities of this type.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("mainCount")
    public Long mainCount;

    /**
     * <p>The count of associated child entities of this type.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("relatedCount")
    public Long relatedCount;

    public static ObserveGroupEntitySummary build(java.util.Map<String, ?> map) throws Exception {
        ObserveGroupEntitySummary self = new ObserveGroupEntitySummary();
        return TeaModel.build(map, self);
    }

    public ObserveGroupEntitySummary setEntityCategory(String entityCategory) {
        this.entityCategory = entityCategory;
        return this;
    }
    public String getEntityCategory() {
        return this.entityCategory;
    }

    public ObserveGroupEntitySummary setEntityCount(Integer entityCount) {
        this.entityCount = entityCount;
        return this;
    }
    public Integer getEntityCount() {
        return this.entityCount;
    }

    public ObserveGroupEntitySummary setEntityDomain(String entityDomain) {
        this.entityDomain = entityDomain;
        return this;
    }
    public String getEntityDomain() {
        return this.entityDomain;
    }

    public ObserveGroupEntitySummary setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ObserveGroupEntitySummary setMainCount(Long mainCount) {
        this.mainCount = mainCount;
        return this;
    }
    public Long getMainCount() {
        return this.mainCount;
    }

    public ObserveGroupEntitySummary setRelatedCount(Long relatedCount) {
        this.relatedCount = relatedCount;
        return this;
    }
    public Long getRelatedCount() {
        return this.relatedCount;
    }

}
