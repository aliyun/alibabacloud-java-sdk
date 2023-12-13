// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactListRequest extends TeaModel {
    /**
     * <p>The alert notification method. Valid values:</p>
     * <br>
     * <p>*   Mail: emails</p>
     * <p>*   DingWebHook: DingTalk chatbots</p>
     */
    @NameInMap("ChanelType")
    public String chanelType;

    /**
     * <p>The value specified for the alert notification method.</p>
     * <br>
     * <p>>  This parameter is required only if you set the `ChanelType` parameter to `Mail`.</p>
     */
    @NameInMap("ChanelValue")
    public String chanelValue;

    /**
     * <p>The name of the alert contact.</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Default value: 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeContactListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactListRequest self = new DescribeContactListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContactListRequest setChanelType(String chanelType) {
        this.chanelType = chanelType;
        return this;
    }
    public String getChanelType() {
        return this.chanelType;
    }

    public DescribeContactListRequest setChanelValue(String chanelValue) {
        this.chanelValue = chanelValue;
        return this;
    }
    public String getChanelValue() {
        return this.chanelValue;
    }

    public DescribeContactListRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public DescribeContactListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeContactListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeContactListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
