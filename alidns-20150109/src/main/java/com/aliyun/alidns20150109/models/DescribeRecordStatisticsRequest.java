// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordStatisticsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("StartDate")
    @Validation(required = true)
    public String startDate;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("Rr")
    @Validation(required = true)
    public String rr;

    public static DescribeRecordStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordStatisticsRequest self = new DescribeRecordStatisticsRequest();
        return TeaModel.build(map, self);
    }

}
