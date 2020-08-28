// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeRecordLogsRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("endDate")
    public String endDate;

    public static DescribeRecordLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecordLogsRequest self = new DescribeRecordLogsRequest();
        return TeaModel.build(map, self);
    }

}
