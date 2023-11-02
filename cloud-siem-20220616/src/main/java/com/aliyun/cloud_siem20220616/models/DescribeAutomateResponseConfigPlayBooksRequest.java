// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAutomateResponseConfigPlayBooksRequest extends TeaModel {
    @NameInMap("AutoResponseType")
    public String autoResponseType;

    @NameInMap("EntityType")
    public String entityType;

    @NameInMap("RegionId")
    public String regionId;

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

}
