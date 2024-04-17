// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAutomateResponseConfigPlayBooksRequest extends TeaModel {
    /**
     * <p>The type of the automated response rule. Valid values:</p>
     * <br>
     * <p>*   event</p>
     * <p>*   alert</p>
     */
    @NameInMap("AutoResponseType")
    public String autoResponseType;

    /**
     * <p>The entity type of the playbook. Valid values:</p>
     * <br>
     * <p>*   ip</p>
     * <p>*   process</p>
     * <p>*   file</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:</p>
     * <br>
     * <p>*   cn-hangzhou: Your assets reside in regions in China.</p>
     * <p>*   ap-southeast-1: Your assets reside in regions outside China.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    @NameInMap("RoleType")
    public Integer roleType;

    public static DescribeAutomateResponseConfigPlayBooksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutomateResponseConfigPlayBooksRequest self = new DescribeAutomateResponseConfigPlayBooksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutomateResponseConfigPlayBooksRequest setAutoResponseType(String autoResponseType) {
        this.autoResponseType = autoResponseType;
        return this;
    }
    public String getAutoResponseType() {
        return this.autoResponseType;
    }

    public DescribeAutomateResponseConfigPlayBooksRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public DescribeAutomateResponseConfigPlayBooksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAutomateResponseConfigPlayBooksRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public DescribeAutomateResponseConfigPlayBooksRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

}
