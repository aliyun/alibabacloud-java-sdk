// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainRecordRemarkRequest extends TeaModel {
    /**
     * <p>The language of the request and the response. The default value is <strong>zh</strong>. Valid values:</p>
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
     * <p>The ID of the DNS record.&lt;props=&quot;china&quot;&gt; Call the <a href="https://help.aliyun.com/zh/dns/api-alidns-2015-01-09-describedomainrecords?spm=a2c4g.11186623.help-menu-search-29697.d_0">DescribeDomainRecords</a> operation to obtain the record ID.&lt;props=&quot;intl&quot;&gt; Call the <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomainrecords?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomainRecords</a> operation to obtain the record ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12*****</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
     * <p>The remarks for the DNS record. The default value is empty. If this parameter is left empty, the original remarks are deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>我的第一个解析记录</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The client IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.2.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static UpdateDomainRecordRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRecordRemarkRequest self = new UpdateDomainRecordRemarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDomainRecordRemarkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDomainRecordRemarkRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public UpdateDomainRecordRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateDomainRecordRemarkRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
