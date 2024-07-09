// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCustomizedListHeadersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("LangType")
    public String langType;

    /**
     * <strong>example:</strong>
     * <p>desktop</p>
     */
    @NameInMap("ListType")
    public String listType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCustomizedListHeadersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizedListHeadersRequest self = new DescribeCustomizedListHeadersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizedListHeadersRequest setLangType(String langType) {
        this.langType = langType;
        return this;
    }
    public String getLangType() {
        return this.langType;
    }

    public DescribeCustomizedListHeadersRequest setListType(String listType) {
        this.listType = listType;
        return this;
    }
    public String getListType() {
        return this.listType;
    }

    public DescribeCustomizedListHeadersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
