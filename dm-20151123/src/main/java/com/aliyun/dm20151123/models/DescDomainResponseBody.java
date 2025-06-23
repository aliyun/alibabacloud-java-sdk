// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DescDomainResponseBody extends TeaModel {
    /**
     * <p>CNAME verification flag, 0 for success, 1 for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CnameAuthStatus")
    public String cnameAuthStatus;

    /**
     * <p>Indicates whether the CNAME host record has been modified, 1 for modified (reverting to the original value also counts as modification), 0 for not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CnameConfirmStatus")
    public String cnameConfirmStatus;

    /**
     * <p>Custom part of the CNAME host record</p>
     * 
     * <strong>example:</strong>
     * <p>dmtrace</p>
     */
    @NameInMap("CnameRecord")
    public String cnameRecord;

    /**
     * <p>Creation time</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-19T12:49Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Whether it is the default domain,</p>
     * <p>Value: 0 No (this field is deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DefaultDomain")
    public String defaultDomain;

    /**
     * <p>DKIM verification flag, indicating whether the DKIM record set by the user in DNS has passed validation, 0: Passed, 1: Not passed</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DkimAuthStatus")
    public String dkimAuthStatus;

    /**
     * <p>DKIM public key value, the value that users need to set for the DKIM record in DNS</p>
     * 
     * <strong>example:</strong>
     * <p>v=DKIM1; k=rsa; p=MIGfMA0GCSqGSI...</p>
     */
    @NameInMap("DkimPublicKey")
    public String dkimPublicKey;

    /**
     * <p>DKIM host record, the key that the user needs to set in the DNS for the DKIM record</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-cn-hangzhou._domainkey.hangzhou26</p>
     */
    @NameInMap("DkimRR")
    public String dkimRR;

    @NameInMap("DkimRsaLength")
    public Integer dkimRsaLength;

    /**
     * <p>DMARC verification flag, indicating whether the DMARC record set by the user in DNS has passed validation, 0: Passed, 1: Not passed</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DmarcAuthStatus")
    public Integer dmarcAuthStatus;

    /**
     * <p>DMARC host record value</p>
     * 
     * <strong>example:</strong>
     * <p>_dmarc.xxx</p>
     */
    @NameInMap("DmarcHostRecord")
    public String dmarcHostRecord;

    /**
     * <p>DMARC record value</p>
     * 
     * <strong>example:</strong>
     * <p>v=DMARC1;p=none;rua=mailto:<a href="mailto:dmarc_report@service.aliyun.com">dmarc_report@service.aliyun.com</a></p>
     */
    @NameInMap("DmarcRecord")
    public String dmarcRecord;

    /**
     * <p>DMARC record value resolved through the public domain name</p>
     * 
     * <strong>example:</strong>
     * <p>v=DMARC1;p=none;rua=mailto:<a href="mailto:dmarc_report@service.aliyun.com">dmarc_report@service.aliyun.com</a></p>
     */
    @NameInMap("DnsDmarc")
    public String dnsDmarc;

    /**
     * <p>MX record value resolved from the public network domain</p>
     * 
     * <strong>example:</strong>
     * <p>mx01.dm.aliyun.com</p>
     */
    @NameInMap("DnsMx")
    public String dnsMx;

    /**
     * <p>SPF record value resolved from the public network domain</p>
     * 
     * <strong>example:</strong>
     * <p>v=xxxx</p>
     */
    @NameInMap("DnsSpf")
    public String dnsSpf;

    /**
     * <p>Ownership record value resolved from the public network domain</p>
     * 
     * <strong>example:</strong>
     * <p>0c40d5f125af4e42892a</p>
     */
    @NameInMap("DnsTxt")
    public String dnsTxt;

    /**
     * <p>Domain ID</p>
     * 
     * <strong>example:</strong>
     * <p>158910</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <p>Domain name</p>
     * 
     * <strong>example:</strong>
     * <p>test.example.net</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Domain status. Indicates whether the verification was successful, with values:</p>
     * <ul>
     * <li><strong>0</strong>: Available, verified successfully</li>
     * <li><strong>1</strong>: Unavailable, verification failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DomainStatus")
    public String domainStatus;

    /**
     * <p>Ownership record provided by the email push console</p>
     * 
     * <strong>example:</strong>
     * <p>0c40d5f125af4e42892a</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>Host record</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("HostRecord")
    public String hostRecord;

    /**
     * <p>Filing status. <strong>1</strong> indicates filed, <strong>0</strong> indicates not filed.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IcpStatus")
    public String icpStatus;

    /**
     * <p>MX verification flag, 0 for success, 1 for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MxAuthStatus")
    public String mxAuthStatus;

    /**
     * <p>MX record value provided by the email push console</p>
     * 
     * <strong>example:</strong>
     * <p>mx01.dm.aliyun.com</p>
     */
    @NameInMap("MxRecord")
    public String mxRecord;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>51B74264-46B4-43C8-A9A0-6B8E8BC04F34</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>SPF verification flag, 0 for success, 1 for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpfAuthStatus")
    public String spfAuthStatus;

    /**
     * <p>SPF record value provided by the email push console</p>
     * 
     * <strong>example:</strong>
     * <p>include:spf1.dm.aliyun.com</p>
     */
    @NameInMap("SpfRecord")
    public String spfRecord;

    /**
     * <p>SPF record. Previously, the SPF display content needed to be calculated by the calling end based on the spfRecord in the response. The new field spfRecordV2 replaces spfRecord, and the calling end can directly display this field after obtaining it;</p>
     * 
     * <strong>example:</strong>
     * <p>v=spf1 include:spf1.dm.aliyun.com -all</p>
     */
    @NameInMap("SpfRecordV2")
    public String spfRecordV2;

    /**
     * <p>Primary domain</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("TlDomainName")
    public String tlDomainName;

    /**
     * <p>CNAME record value provided by the email push console</p>
     * 
     * <strong>example:</strong>
     * <p>tracedm.aliyuncs.com</p>
     */
    @NameInMap("TracefRecord")
    public String tracefRecord;

    public static DescDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescDomainResponseBody self = new DescDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescDomainResponseBody setCnameAuthStatus(String cnameAuthStatus) {
        this.cnameAuthStatus = cnameAuthStatus;
        return this;
    }
    public String getCnameAuthStatus() {
        return this.cnameAuthStatus;
    }

    public DescDomainResponseBody setCnameConfirmStatus(String cnameConfirmStatus) {
        this.cnameConfirmStatus = cnameConfirmStatus;
        return this;
    }
    public String getCnameConfirmStatus() {
        return this.cnameConfirmStatus;
    }

    public DescDomainResponseBody setCnameRecord(String cnameRecord) {
        this.cnameRecord = cnameRecord;
        return this;
    }
    public String getCnameRecord() {
        return this.cnameRecord;
    }

    public DescDomainResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescDomainResponseBody setDefaultDomain(String defaultDomain) {
        this.defaultDomain = defaultDomain;
        return this;
    }
    public String getDefaultDomain() {
        return this.defaultDomain;
    }

    public DescDomainResponseBody setDkimAuthStatus(String dkimAuthStatus) {
        this.dkimAuthStatus = dkimAuthStatus;
        return this;
    }
    public String getDkimAuthStatus() {
        return this.dkimAuthStatus;
    }

    public DescDomainResponseBody setDkimPublicKey(String dkimPublicKey) {
        this.dkimPublicKey = dkimPublicKey;
        return this;
    }
    public String getDkimPublicKey() {
        return this.dkimPublicKey;
    }

    public DescDomainResponseBody setDkimRR(String dkimRR) {
        this.dkimRR = dkimRR;
        return this;
    }
    public String getDkimRR() {
        return this.dkimRR;
    }

    public DescDomainResponseBody setDkimRsaLength(Integer dkimRsaLength) {
        this.dkimRsaLength = dkimRsaLength;
        return this;
    }
    public Integer getDkimRsaLength() {
        return this.dkimRsaLength;
    }

    public DescDomainResponseBody setDmarcAuthStatus(Integer dmarcAuthStatus) {
        this.dmarcAuthStatus = dmarcAuthStatus;
        return this;
    }
    public Integer getDmarcAuthStatus() {
        return this.dmarcAuthStatus;
    }

    public DescDomainResponseBody setDmarcHostRecord(String dmarcHostRecord) {
        this.dmarcHostRecord = dmarcHostRecord;
        return this;
    }
    public String getDmarcHostRecord() {
        return this.dmarcHostRecord;
    }

    public DescDomainResponseBody setDmarcRecord(String dmarcRecord) {
        this.dmarcRecord = dmarcRecord;
        return this;
    }
    public String getDmarcRecord() {
        return this.dmarcRecord;
    }

    public DescDomainResponseBody setDnsDmarc(String dnsDmarc) {
        this.dnsDmarc = dnsDmarc;
        return this;
    }
    public String getDnsDmarc() {
        return this.dnsDmarc;
    }

    public DescDomainResponseBody setDnsMx(String dnsMx) {
        this.dnsMx = dnsMx;
        return this;
    }
    public String getDnsMx() {
        return this.dnsMx;
    }

    public DescDomainResponseBody setDnsSpf(String dnsSpf) {
        this.dnsSpf = dnsSpf;
        return this;
    }
    public String getDnsSpf() {
        return this.dnsSpf;
    }

    public DescDomainResponseBody setDnsTxt(String dnsTxt) {
        this.dnsTxt = dnsTxt;
        return this;
    }
    public String getDnsTxt() {
        return this.dnsTxt;
    }

    public DescDomainResponseBody setDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }
    public String getDomainId() {
        return this.domainId;
    }

    public DescDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescDomainResponseBody setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }
    public String getDomainStatus() {
        return this.domainStatus;
    }

    public DescDomainResponseBody setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public DescDomainResponseBody setHostRecord(String hostRecord) {
        this.hostRecord = hostRecord;
        return this;
    }
    public String getHostRecord() {
        return this.hostRecord;
    }

    public DescDomainResponseBody setIcpStatus(String icpStatus) {
        this.icpStatus = icpStatus;
        return this;
    }
    public String getIcpStatus() {
        return this.icpStatus;
    }

    public DescDomainResponseBody setMxAuthStatus(String mxAuthStatus) {
        this.mxAuthStatus = mxAuthStatus;
        return this;
    }
    public String getMxAuthStatus() {
        return this.mxAuthStatus;
    }

    public DescDomainResponseBody setMxRecord(String mxRecord) {
        this.mxRecord = mxRecord;
        return this;
    }
    public String getMxRecord() {
        return this.mxRecord;
    }

    public DescDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescDomainResponseBody setSpfAuthStatus(String spfAuthStatus) {
        this.spfAuthStatus = spfAuthStatus;
        return this;
    }
    public String getSpfAuthStatus() {
        return this.spfAuthStatus;
    }

    public DescDomainResponseBody setSpfRecord(String spfRecord) {
        this.spfRecord = spfRecord;
        return this;
    }
    public String getSpfRecord() {
        return this.spfRecord;
    }

    public DescDomainResponseBody setSpfRecordV2(String spfRecordV2) {
        this.spfRecordV2 = spfRecordV2;
        return this;
    }
    public String getSpfRecordV2() {
        return this.spfRecordV2;
    }

    public DescDomainResponseBody setTlDomainName(String tlDomainName) {
        this.tlDomainName = tlDomainName;
        return this;
    }
    public String getTlDomainName() {
        return this.tlDomainName;
    }

    public DescDomainResponseBody setTracefRecord(String tracefRecord) {
        this.tracefRecord = tracefRecord;
        return this;
    }
    public String getTracefRecord() {
        return this.tracefRecord;
    }

}
