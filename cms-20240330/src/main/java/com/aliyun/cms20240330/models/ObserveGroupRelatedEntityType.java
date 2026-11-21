// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ObserveGroupRelatedEntityType extends TeaModel {
    /**
     * <p>The Chinese name of the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>RocketMQ Topic</p>
     */
    @NameInMap("cnName")
    public String cnName;

    /**
     * <p>The association direction, which is currently fixed as outgoing, indicating that associated entities are searched along the direct outgoing edges of the primary entity.</p>
     * 
     * <strong>example:</strong>
     * <p>outgoing</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <p>The entity domain.</p>
     * 
     * <strong>example:</strong>
     * <p>acs</p>
     */
    @NameInMap("domain")
    public String domain;

    /**
     * <p>The English name of the entity.</p>
     * 
     * <strong>example:</strong>
     * <p>RocketMQ Topic</p>
     */
    @NameInMap("enName")
    public String enName;

    /**
     * <p>The CommonSchema group to which the entity belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>acs-rocketmq</p>
     */
    @NameInMap("entityGroup")
    public String entityGroup;

    /**
     * <p>The direct outgoing edge relationship, such as use, run_on, calls, or contains.</p>
     * 
     * <strong>example:</strong>
     * <p>contains</p>
     */
    @NameInMap("relation")
    public String relation;

    /**
     * <p>The associated entity type.</p>
     * 
     * <strong>example:</strong>
     * <p>acs.rocketmq.topic</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The effective CommonSchema version.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1.14</p>
     */
    @NameInMap("version")
    public String version;

    public static ObserveGroupRelatedEntityType build(java.util.Map<String, ?> map) throws Exception {
        ObserveGroupRelatedEntityType self = new ObserveGroupRelatedEntityType();
        return TeaModel.build(map, self);
    }

    public ObserveGroupRelatedEntityType setCnName(String cnName) {
        this.cnName = cnName;
        return this;
    }
    public String getCnName() {
        return this.cnName;
    }

    public ObserveGroupRelatedEntityType setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ObserveGroupRelatedEntityType setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ObserveGroupRelatedEntityType setEnName(String enName) {
        this.enName = enName;
        return this;
    }
    public String getEnName() {
        return this.enName;
    }

    public ObserveGroupRelatedEntityType setEntityGroup(String entityGroup) {
        this.entityGroup = entityGroup;
        return this;
    }
    public String getEntityGroup() {
        return this.entityGroup;
    }

    public ObserveGroupRelatedEntityType setRelation(String relation) {
        this.relation = relation;
        return this;
    }
    public String getRelation() {
        return this.relation;
    }

    public ObserveGroupRelatedEntityType setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ObserveGroupRelatedEntityType setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
