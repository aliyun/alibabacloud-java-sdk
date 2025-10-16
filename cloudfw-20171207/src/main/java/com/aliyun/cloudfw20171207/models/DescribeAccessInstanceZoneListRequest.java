// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAccessInstanceZoneListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AckClusterConnector</p>
     */
    @NameInMap("AccessInstanceType")
    public String accessInstanceType;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    public static DescribeAccessInstanceZoneListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessInstanceZoneListRequest self = new DescribeAccessInstanceZoneListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccessInstanceZoneListRequest setAccessInstanceType(String accessInstanceType) {
        this.accessInstanceType = accessInstanceType;
        return this;
    }
    public String getAccessInstanceType() {
        return this.accessInstanceType;
    }

    public DescribeAccessInstanceZoneListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAccessInstanceZoneListRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

}
