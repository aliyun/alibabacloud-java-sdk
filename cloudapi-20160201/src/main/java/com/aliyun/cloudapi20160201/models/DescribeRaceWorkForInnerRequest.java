// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeRaceWorkForInnerRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    public static DescribeRaceWorkForInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRaceWorkForInnerRequest self = new DescribeRaceWorkForInnerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRaceWorkForInnerRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
