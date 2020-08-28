// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmLogsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    public static DescribeGtmLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmLogsRequest self = new DescribeGtmLogsRequest();
        return TeaModel.build(map, self);
    }

}
