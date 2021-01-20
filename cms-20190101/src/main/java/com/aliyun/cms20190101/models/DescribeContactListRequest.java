// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactListRequest extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("ChanelType")
    public String chanelType;

    @NameInMap("ChanelValue")
    public String chanelValue;

    public static DescribeContactListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactListRequest self = new DescribeContactListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContactListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeContactListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeContactListRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
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

}
