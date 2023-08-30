// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryAppMetadataRequest extends TeaModel {
    @NameInMap("MetaIds")
    public String metaIds;

    @NameInMap("MetaType")
    public String metaType;

    @NameInMap("Pid")
    public String pid;

    @NameInMap("RegionId")
    public String regionId;

    public static QueryAppMetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppMetadataRequest self = new QueryAppMetadataRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppMetadataRequest setMetaIds(String metaIds) {
        this.metaIds = metaIds;
        return this;
    }
    public String getMetaIds() {
        return this.metaIds;
    }

    public QueryAppMetadataRequest setMetaType(String metaType) {
        this.metaType = metaType;
        return this;
    }
    public String getMetaType() {
        return this.metaType;
    }

    public QueryAppMetadataRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public QueryAppMetadataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
