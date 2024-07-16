// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DescDomainResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CnameAuthStatus")
    public String cnameAuthStatus;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CnameConfirmStatus")
    public String cnameConfirmStatus;

    /**
     * <strong>example:</strong>
     * <p>dmtrace</p>
     */
    @NameInMap("CnameRecord")
    public String cnameRecord;

    /**
     * <strong>example:</strong>
     * <p>2019-09-29T12:49Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DefaultDomain")
    public String defaultDomain;

    @NameInMap("DkimAuthStatus")
    public String dkimAuthStatus;

    @NameInMap("DkimPublicKey")
    public String dkimPublicKey;

    @NameInMap("DkimRR")
    public String dkimRR;

    @NameInMap("DmarcAuthStatus")
    public Integer dmarcAuthStatus;

    @NameInMap("DmarcHostRecord")
    public String dmarcHostRecord;

    @NameInMap("DmarcRecord")
    public String dmarcRecord;

    @NameInMap("DnsDmarc")
    public String dnsDmarc;

    /**
     * <strong>example:</strong>
     * <p>abc-com.xxxx.com</p>
     */
    @NameInMap("DnsMx")
    public String dnsMx;

    /**
     * <strong>example:</strong>
     * <p>v=xxxx</p>
     */
    @NameInMap("DnsSpf")
    public String dnsSpf;

    /**
     * <strong>example:</strong>
     * <p>121309ohdsa</p>
     */
    @NameInMap("DnsTxt")
    public String dnsTxt;

    /**
     * <strong>example:</strong>
     * <p>158910</p>
     */
    @NameInMap("DomainId")
    public String domainId;

    /**
     * <strong>example:</strong>
     * <p>abc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DomainStatus")
    public String domainStatus;

    /**
     * <strong>example:</strong>
     * <p>0c40d5f125af4e42892a</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    @NameInMap("HostRecord")
    public String hostRecord;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IcpStatus")
    public String icpStatus;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MxAuthStatus")
    public String mxAuthStatus;

    /**
     * <strong>example:</strong>
     * <p>mx01.dm.aliyun.com</p>
     */
    @NameInMap("MxRecord")
    public String mxRecord;

    /**
     * <strong>example:</strong>
     * <p>51B74264-46B4-43C8-A9A0-6B8E8BC04F34</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SpfAuthStatus")
    public String spfAuthStatus;

    /**
     * <strong>example:</strong>
     * <p>include:spf1.dm.aliyun.com</p>
     */
    @NameInMap("SpfRecord")
    public String spfRecord;

    @NameInMap("SpfRecordV2")
    public String spfRecordV2;

    /**
     * <strong>example:</strong>
     * <p>abc.com</p>
     */
    @NameInMap("TlDomainName")
    public String tlDomainName;

    /**
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
