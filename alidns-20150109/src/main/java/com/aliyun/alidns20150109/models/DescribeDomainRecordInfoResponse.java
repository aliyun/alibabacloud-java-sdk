// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainRecordInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainId")
    @Validation(required = true)
    public String domainId;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("PunyCode")
    @Validation(required = true)
    public String punyCode;

    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("GroupName")
    @Validation(required = true)
    public String groupName;

    @NameInMap("RecordId")
    @Validation(required = true)
    public String recordId;

    @NameInMap("RR")
    @Validation(required = true)
    public String RR;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("Value")
    @Validation(required = true)
    public String value;

    @NameInMap("TTL")
    @Validation(required = true)
    public Long TTL;

    @NameInMap("Priority")
    @Validation(required = true)
    public Long priority;

    @NameInMap("Line")
    @Validation(required = true)
    public String line;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("Locked")
    @Validation(required = true)
    public Boolean locked;

    public static DescribeDomainRecordInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRecordInfoResponse self = new DescribeDomainRecordInfoResponse();
        return TeaModel.build(map, self);
    }

}
