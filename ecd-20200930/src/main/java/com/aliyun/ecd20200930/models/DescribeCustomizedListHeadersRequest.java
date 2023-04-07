// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCustomizedListHeadersRequest extends TeaModel {
    /**
     * <p>The language in which the exported cloud desktop list is displayed.</p>
     */
    @NameInMap("LangType")
    public String langType;

    /**
     * <p>The type of the list.</p>
     */
    @NameInMap("ListType")
    public String listType;

    /**
     * <p>The ID of the region.</p>
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
