// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DescribeEdgeStatInfoRequest extends TeaModel {
    @NameInMap("EdgeDn")
    public String edgeDn;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EdgePk")
    public String edgePk;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeEdgeStatInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeStatInfoRequest self = new DescribeEdgeStatInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeStatInfoRequest setEdgeDn(String edgeDn) {
        this.edgeDn = edgeDn;
        return this;
    }
    public String getEdgeDn() {
        return this.edgeDn;
    }

    public DescribeEdgeStatInfoRequest setEdgePk(String edgePk) {
        this.edgePk = edgePk;
        return this;
    }
    public String getEdgePk() {
        return this.edgePk;
    }

    public DescribeEdgeStatInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
