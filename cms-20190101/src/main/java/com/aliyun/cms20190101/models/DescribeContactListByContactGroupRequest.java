// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactListByContactGroupRequest extends TeaModel {
    @NameInMap("ContactGroupName")
    @Validation(required = true)
    public String contactGroupName;

    public static DescribeContactListByContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactListByContactGroupRequest self = new DescribeContactListByContactGroupRequest();
        return TeaModel.build(map, self);
    }

}
