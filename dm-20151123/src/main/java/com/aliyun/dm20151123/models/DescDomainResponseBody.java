// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DescDomainResponseBody extends TeaModel {
    /**
     * <p>The CNAME verification status. Valid values: <code>0</code> (Success), <code>1</code> (Failure).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CnameAuthStatus")
    public String cnameAuthStatus;

    /**
     * <p>Indicates if the CNAME host record has been modified. A value of <code>1</code> indicates a change, including reverting to the original value. A value of <code>0</code> indicates no change.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CnameConfirmStatus")
    public String cnameConfirmStatus;

    /**
     * <p>The CNAME host record.</p>
     * 
     * <strong>example:</strong>
     * <p>dmtrace</p>
     */
    @NameInMap("CnameRecord")
    public String cnameRecord;

    /**
     * <p>The time the domain name was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-19T12:49Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Indicates if this is the default domain name.</p>
     * <p>This parameter is deprecated and always returns <code>0</code> (No).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DefaultDomain")
    public String defaultDomain;

    /**
     * <p>The DKIM verification status. Valid values: <code>0</code> (Verified), <code>1</code> (Not verified).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DkimAuthStatus")
    public String dkimAuthStatus;

    /**
     * <p>The public key for the DKIM record.</p>
     * 
     * <strong>example:</strong>
     * <p>v=DKIM1; k=rsa; p=MIGfMA0GCSqGSI...</p>
     */
    @NameInMap("DkimPublicKey")
    public String dkimPublicKey;

    /**
     * <p>The DKIM host record.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-cn-hangzhou._domainkey.hangzhou26</p>
     */
    @NameInMap("DkimRR")
    public String dkimRR;

    /**
     * <p>The length of the DKIM RSA key, such as <code>1024</code> or <code>2048</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("DkimRsaLength")
    public Integer dkimRsaLength;

    /**
     * <p>The DMARC verification status. Valid values: <code>0</code> (Verified), <code>1</code> (Not verified).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DmarcAuthStatus")
    public Integer dmarcAuthStatus;

    /**
     * <p>The DMARC host record.</p>
     * 
     * <strong>example:</strong>
     * <p>_dmarc.xxx</p>
     */
    @NameInMap("DmarcHostRecord")
    public String dmarcHostRecord;

    /**
     * <p>The DMARC record value.</p>
     * 
     * <strong>example:</strong>
     * <p>v=DMARC1;p=none;rua=mailto:<a href="mailto:dmarc_report@service.aliyun.com">dmarc_report@service.aliyun.com</a></p>
     */
    @NameInMap("DmarcRecord")
    public String dmarcRecord;

    /**
     * <p>The DMARC record value resolved from public DNS.</p>
     * 
     * <strong>example:</strong>
     * <p>v=DMARC1;p=none;rua=mailto:<a href="mailto:dmarc_report@service.aliyun.com">dmarc_report@service.aliyun.com</a></p>
     */
    @NameInMap("DnsDmarc")
    public String dnsDmarc;

    /**
     * <p>The MX record value resolved from public DNS.</p>
     * 
     * <strong>example:</strong>
     * <p>mx01.dm.aliyun.com</p>
     */
    @NameInMap("DnsMx")
    public String dnsMx;

    /**
     * <p>The SPF record value resolved from public DNS.</p>
     * 
     * <strong>example:</strong>
     * <p>v=xxxx</p>
     */
    @NameInMap("DnsSpf")
    public String dnsSpf;

    /**
     * <p>The ownership record value resolved from public DNS.</p>
     * 
     * <strong>example:</strong>
     * <p>0c40d5f125af4e42892a</p>
     */
    @NameInMap("DnsTxt")
    public String dnsTxt;

    /**
     * <p>The domain ID.</p>
     * 
     * <strong>example:</strong>
     * <p>158910</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>test.example.net</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The verification status of the domain name. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Available. The domain name is verified.</p>
     * </li>
     * <li><p><strong>1</strong>: Unavailable. The domain name failed verification.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DomainStatus")
    public String domainStatus;

    /**
     * <p>The required value for the domain ownership verification record, from the Direct Mail console.</p>
     * 
     * <strong>example:</strong>
     * <p>0c40d5f125af4e42892a</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    @NameInMap("DomainVersion")
    public Integer domainVersion;

    /**
     * <p>The host record for domain ownership verification.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("HostRecord")
    public String hostRecord;

    /**
     * <p>The ICP filing status. <strong>1</strong> indicates the filing is complete. <strong>0</strong> indicates no filing is found.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IcpStatus")
    public String icpStatus;

    /**
     * <p>The MX verification status. Valid values: <code>0</code> (Success), <code>1</code> (Failure).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MxAuthStatus")
    public String mxAuthStatus;

    /**
     * <p>The MX record value from the Direct Mail console.</p>
     * 
     * <strong>example:</strong>
     * <p>mx01.dm.aliyun.com</p>
     */
    @NameInMap("MxRecord")
    public String mxRecord;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51B74264-46B4-43C8-A9A0-6B8E8BC04F34</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The SPF verification status. Valid values: <code>0</code> (Success), <code>1</code> (Failure).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpfAuthStatus")
    public String spfAuthStatus;

    /**
     * <p>The SPF record value from the Direct Mail console.</p>
     * 
     * <strong>example:</strong>
     * <p>include:spf1.dm.aliyun.com</p>
     */
    @NameInMap("SpfRecord")
    public String spfRecord;

    /**
     * <p>The complete SPF record. This parameter replaces <code>SpfRecord</code>. You can directly use the value of <code>SpfRecordV2</code> without constructing it from the value of <code>SpfRecord</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>v=spf1 include:spf1.dm.aliyun.com -all</p>
     */
    @NameInMap("SpfRecordV2")
    public String spfRecordV2;

    /**
     * <p>The root domain.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("TlDomainName")
    public String tlDomainName;

    /**
     * <p>The CNAME record value from the Direct Mail console.</p>
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

    public DescDomainResponseBody setDomainVersion(Integer domainVersion) {
        this.domainVersion = domainVersion;
        return this;
    }
    public Integer getDomainVersion() {
        return this.domainVersion;
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
