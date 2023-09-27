// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribeRaceWorkForInnerResponseBody extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Keywords")
    public String keywords;

    @NameInMap("LogoUrl")
    public String logoUrl;

    @NameInMap("ModifiedTime")
    public String modifiedTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShortDescription")
    public String shortDescription;

    @NameInMap("WorkName")
    public String workName;

    public static DescribeRaceWorkForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRaceWorkForInnerResponseBody self = new DescribeRaceWorkForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRaceWorkForInnerResponseBody setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DescribeRaceWorkForInnerResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeRaceWorkForInnerResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeRaceWorkForInnerResponseBody setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public DescribeRaceWorkForInnerResponseBody setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }
    public String getLogoUrl() {
        return this.logoUrl;
    }

    public DescribeRaceWorkForInnerResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public DescribeRaceWorkForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRaceWorkForInnerResponseBody setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }
    public String getShortDescription() {
        return this.shortDescription;
    }

    public DescribeRaceWorkForInnerResponseBody setWorkName(String workName) {
        this.workName = workName;
        return this;
    }
    public String getWorkName() {
        return this.workName;
    }

}
