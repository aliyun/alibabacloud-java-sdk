// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDomainRecordInfoRequest extends TeaModel {
    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the DNS record. &lt;props=&quot;china&quot;&gt;To obtain the ID, call the <a href="https://help.aliyun.com/zh/dns/api-alidns-2015-01-09-describedomainrecords?spm=a2c4g.11186623.help-menu-search-29697.d_0">DescribeDomainRecords</a> operation.
     * &lt;props=&quot;intl&quot;&gt;To obtain the ID, call the <a href="https://www.alibabacloud.com/help/en/dns/api-alidns-2015-01-09-describedomainrecords?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomainRecords</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9*********</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
     * <p>The client IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.2.1</p>
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
