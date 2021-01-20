// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeContactListByContactGroupRequest extends TeaModel {
    @NameInMap("ContactGroupName")
    public String contactGroupName;

    public static DescribeContactListByContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactListByContactGroupRequest self = new DescribeContactListByContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContactListByContactGroupRequest setContactGroupName(String contactGroupName) {
        this.contactGroupName = contactGroupName;
        return this;
    }
    public String getContactGroupName() {
        return this.contactGroupName;
    }

}
