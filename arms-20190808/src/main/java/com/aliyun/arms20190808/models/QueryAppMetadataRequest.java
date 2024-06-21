// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryAppMetadataRequest extends TeaModel {
    /**
     * <p>The list of metadata IDs. Separate multiple IDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4c9dd447,3c76c565</p>
     */
    @NameInMap("MetaIds")
    public String metaIds;

    /**
     * <p>The metadata type. Valid values: sql: obtains an SQL statement based on sqlId exception: obtains the exception stack based on exceptionId</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sql</p>
     */
    @NameInMap("MetaType")
    public String metaType;

    /**
     * <p>The process identifier (PID) of the application. For more information about how to obtain the PID, see &quot;Obtain the PID of an application.&quot;</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ggxw4lnjuz@54364d85b97dc56</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The region ID. Default value: cn-hangzhou.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
