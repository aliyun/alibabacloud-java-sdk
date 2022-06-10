// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class DownloadItemBillFileRequest extends TeaModel {
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

    public static DownloadItemBillFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadItemBillFileRequest self = new DownloadItemBillFileRequest();
        return TeaModel.build(map, self);
    }

    public DownloadItemBillFileRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public DownloadItemBillFileRequest setAliyunBid(Long aliyunBid) {
        this.aliyunBid = aliyunBid;
        return this;
    }
    public Long getAliyunBid() {
        return this.aliyunBid;
    }

    public DownloadItemBillFileRequest setAliyunCallerType(String aliyunCallerType) {
        this.aliyunCallerType = aliyunCallerType;
        return this;
    }
    public String getAliyunCallerType() {
        return this.aliyunCallerType;
    }

    public DownloadItemBillFileRequest setAliyunPid(Long aliyunPid) {
        this.aliyunPid = aliyunPid;
        return this;
    }
    public Long getAliyunPid() {
        return this.aliyunPid;
    }

    public DownloadItemBillFileRequest setAliyunUid(Long aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public Long getAliyunUid() {
        return this.aliyunUid;
    }

    public DownloadItemBillFileRequest setBillId(String billId) {
        this.billId = billId;
        return this;
    }
    public String getBillId() {
        return this.billId;
    }

    public DownloadItemBillFileRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DownloadItemBillFileRequest setLmUserId(Long lmUserId) {
        this.lmUserId = lmUserId;
        return this;
    }
    public Long getLmUserId() {
        return this.lmUserId;
    }

    public DownloadItemBillFileRequest setProxyOriginalSourceIp(String proxyOriginalSourceIp) {
        this.proxyOriginalSourceIp = proxyOriginalSourceIp;
        return this;
    }
    public String getProxyOriginalSourceIp() {
        return this.proxyOriginalSourceIp;
    }

    public DownloadItemBillFileRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadItemBillFileRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DownloadItemBillFileRequest setTbNick(String tbNick) {
        this.tbNick = tbNick;
        return this;
    }
    public String getTbNick() {
        return this.tbNick;
    }

    public DownloadItemBillFileRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public DownloadItemBillFileRequest setUscTbId(String uscTbId) {
        this.uscTbId = uscTbId;
        return this;
    }
    public String getUscTbId() {
        return this.uscTbId;
    }

    public DownloadItemBillFileRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

}
