// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainRecordRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

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
    public Long TTL;

    @NameInMap("Priority")
    public Long priority;

    @NameInMap("Line")
    public String line;

    public static UpdateDomainRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRecordRequest self = new UpdateDomainRecordRequest();
        return TeaModel.build(map, self);
    }

}
