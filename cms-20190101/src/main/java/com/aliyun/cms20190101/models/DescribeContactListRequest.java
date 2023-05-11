// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactListRequest extends TeaModel {
    /**
     * <p>The status of the TradeManager ID.</p>
     * <br>
     * <p>Valid value: OK. The value OK indicates that the TradeManager ID is valid and can receive alert notifications.</p>
     * <br>
     * <p>>  This parameter can be returned only on the China site (aliyun.com).</p>
     */
    @NameInMap("ChanelType")
    public String chanelType;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("ChanelValue")
    public String chanelValue;

    /**
     * <p>The value specified for the alert notification method.</p>
     * <br>
     * <p>>  This parameter is required only if you set the `ChanelType` parameter to `Mail`.</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The operation that you want to perform. Set the value to **DescribeContactList**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
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
