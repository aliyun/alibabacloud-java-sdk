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

}
