// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleListRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to DescribeEventRuleList.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("IsEnable")
    public Boolean isEnable;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("NamePrefix")
    public String namePrefix;

    /**
     * <p>The description of the event-triggered alert rule.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The status of the event-triggered alert rule. Valid values:</p>
     * <br>
     * <p>*   ENABLED: enabled</p>
     * <p>*   DISABLED: disabled</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeEventRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventRuleListRequest self = new DescribeEventRuleListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventRuleListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeEventRuleListRequest setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
        return this;
    }
    public Boolean getIsEnable() {
        return this.isEnable;
    }

    public DescribeEventRuleListRequest setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }
    public String getNamePrefix() {
        return this.namePrefix;
    }

    public DescribeEventRuleListRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEventRuleListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeEventRuleListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
