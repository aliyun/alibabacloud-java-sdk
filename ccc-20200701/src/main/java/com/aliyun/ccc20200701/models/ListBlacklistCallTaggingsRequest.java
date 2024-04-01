// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListBlacklistCallTaggingsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NumberList")
    public String numberList;

    public static ListBlacklistCallTaggingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBlacklistCallTaggingsRequest self = new ListBlacklistCallTaggingsRequest();
        return TeaModel.build(map, self);
    }

    public ListBlacklistCallTaggingsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListBlacklistCallTaggingsRequest setNumberList(String numberList) {
        this.numberList = numberList;
        return this;
    }
    public String getNumberList() {
        return this.numberList;
    }

}
