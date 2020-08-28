// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeDynamicTagRuleListRequest extends TeaModel {
    @NameInMap("TagKey")
    public String tagKey;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    public static DescribeDynamicTagRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDynamicTagRuleListRequest self = new DescribeDynamicTagRuleListRequest();
        return TeaModel.build(map, self);
    }

}
