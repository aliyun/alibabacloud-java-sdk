// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactListRequest extends TeaModel {
    /**
     * <p>The alert notification method. Valid values:</p>
     * <ul>
     * <li>Mail: emails</li>
     * <li>DingWebHook: DingTalk chatbots</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Mail</p>
     */
    @NameInMap("ChanelType")
    public String chanelType;

    /**
     * <p>The value specified for the alert notification method.</p>
     * <blockquote>
     * <p> This parameter is required only if you set the <code>ChanelType</code> parameter to <code>Mail</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:Alice@example.com">Alice@example.com</a></p>
     */
    @NameInMap("ChanelValue")
    public String chanelValue;

    /**
     * <p>The name of the alert contact.</p>
     * 
     * <strong>example:</strong>
     * <p>Alice</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The page number.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
