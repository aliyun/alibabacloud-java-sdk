// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnConditionIPBInfoRequest extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    public static DescribeCdnConditionIPBInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnConditionIPBInfoRequest self = new DescribeCdnConditionIPBInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnConditionIPBInfoRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
