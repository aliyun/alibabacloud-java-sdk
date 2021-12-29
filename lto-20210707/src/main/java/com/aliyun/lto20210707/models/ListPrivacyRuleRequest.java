// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListPrivacyRuleRequest extends TeaModel {
    @NameInMap("Num")
    public Integer num;

    @NameInMap("Size")
    public Integer size;

    public static ListPrivacyRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrivacyRuleRequest self = new ListPrivacyRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListPrivacyRuleRequest setNum(Integer num) {
        this.num = num;
        return this;
    }
    public Integer getNum() {
        return this.num;
    }

    public ListPrivacyRuleRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
