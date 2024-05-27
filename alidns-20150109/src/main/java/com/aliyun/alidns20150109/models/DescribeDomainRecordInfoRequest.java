// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainRecordInfoRequest extends TeaModel {
    /**
     * <p>The language.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the DNS record.</p>
     * <br>
     * <p>This parameter is returned when you add a DNS record or when you query a list of DNS records.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
     * <p>The IP address of the client.</p>
     */
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
