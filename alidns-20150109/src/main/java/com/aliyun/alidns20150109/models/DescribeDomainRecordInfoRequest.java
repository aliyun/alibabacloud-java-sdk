// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainRecordInfoRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RecordId")
    public String recordId;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static DescribeDomainRecordInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRecordInfoRequest self = new DescribeDomainRecordInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRecordInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDomainRecordInfoRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public DescribeDomainRecordInfoRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
