// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteDomainRecordRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("RecordId")
    @Validation(required = true)
    public String recordId;

    public static DeleteDomainRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainRecordRequest self = new DeleteDomainRecordRequest();
        return TeaModel.build(map, self);
    }

}
