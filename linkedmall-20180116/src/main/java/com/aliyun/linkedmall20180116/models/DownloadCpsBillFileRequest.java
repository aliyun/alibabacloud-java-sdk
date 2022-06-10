// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class DownloadCpsBillFileRequest extends TeaModel {
    // 下单账号类型：
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("AliyunBid")
    public Long aliyunBid;

    @NameInMap("AliyunCallerType")
    public String aliyunCallerType;

    @NameInMap("AliyunPid")
    public Long aliyunPid;

    @NameInMap("AliyunUid")
    public Long aliyunUid;

    @NameInMap("BillId")
    public String billId;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("LmUserId")
    public Long lmUserId;

    @NameInMap("ProxyOriginalSourceIp")
    public String proxyOriginalSourceIp;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("TbNick")
    public String tbNick;

    // 企业侧用户ID
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("UscTbId")
    public String uscTbId;

    // 是否使用匿名（USC）淘宝ID
    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    public static DownloadCpsBillFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadCpsBillFileRequest self = new DownloadCpsBillFileRequest();
        return TeaModel.build(map, self);
    }

    public DownloadCpsBillFileRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public DownloadCpsBillFileRequest setAliyunBid(Long aliyunBid) {
        this.aliyunBid = aliyunBid;
        return this;
    }
    public Long getAliyunBid() {
        return this.aliyunBid;
    }

    public DownloadCpsBillFileRequest setAliyunCallerType(String aliyunCallerType) {
        this.aliyunCallerType = aliyunCallerType;
        return this;
    }
    public String getAliyunCallerType() {
        return this.aliyunCallerType;
    }

    public DownloadCpsBillFileRequest setAliyunPid(Long aliyunPid) {
        this.aliyunPid = aliyunPid;
        return this;
    }
    public Long getAliyunPid() {
        return this.aliyunPid;
    }

    public DownloadCpsBillFileRequest setAliyunUid(Long aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public Long getAliyunUid() {
        return this.aliyunUid;
    }

    public DownloadCpsBillFileRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public DownloadCpsBillFileRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DownloadCpsBillFileRequest setLmUserId(Long lmUserId) {
        this.lmUserId = lmUserId;
        return this;
    }
    public Long getLmUserId() {
        return this.lmUserId;
    }

    public DownloadCpsBillFileRequest setProxyOriginalSourceIp(String proxyOriginalSourceIp) {
        this.proxyOriginalSourceIp = proxyOriginalSourceIp;
        return this;
    }
    public String getProxyOriginalSourceIp() {
        return this.proxyOriginalSourceIp;
    }

    public DownloadCpsBillFileRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadCpsBillFileRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DownloadCpsBillFileRequest setTbNick(String tbNick) {
        this.tbNick = tbNick;
        return this;
    }
    public String getTbNick() {
        return this.tbNick;
    }

    public DownloadCpsBillFileRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public DownloadCpsBillFileRequest setUscTbId(String uscTbId) {
        this.uscTbId = uscTbId;
        return this;
    }
    public String getUscTbId() {
        return this.uscTbId;
    }

    public DownloadCpsBillFileRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

}
