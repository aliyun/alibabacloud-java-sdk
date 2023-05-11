// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeTagValueListRequest extends TeaModel {
    /**
     * <p>The key of the tag whose values you want to query.</p>
     * <br>
     * <p>For more information about how to obtain a tag key, see [DescribeTagKeyList](~~145558~~).</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The value 200 indicates that the call was successful.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("TagKey")
    public String tagKey;

    public static DescribeTagValueListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagValueListRequest self = new DescribeTagValueListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTagValueListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTagValueListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTagValueListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeTagValueListRequest setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public String getTagKey() {
        return this.tagKey;
    }

}
