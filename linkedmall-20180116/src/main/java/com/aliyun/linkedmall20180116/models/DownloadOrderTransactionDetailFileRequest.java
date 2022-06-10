// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class DownloadOrderTransactionDetailFileRequest extends TeaModel {
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

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("LmUserId")
    public Long lmUserId;

    @NameInMap("ProxyOriginalSourceIp")
    public String proxyOriginalSourceIp;

    @NameInMap("RecordId")
    public String recordId;

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

    public static DownloadOrderTransactionDetailFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadOrderTransactionDetailFileRequest self = new DownloadOrderTransactionDetailFileRequest();
        return TeaModel.build(map, self);
    }

    public DownloadOrderTransactionDetailFileRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public DownloadOrderTransactionDetailFileRequest setAliyunBid(Long aliyunBid) {
        this.aliyunBid = aliyunBid;
        return this;
    }
    public Long getAliyunBid() {
        return this.aliyunBid;
    }

    public DownloadOrderTransactionDetailFileRequest setAliyunCallerType(String aliyunCallerType) {
        this.aliyunCallerType = aliyunCallerType;
        return this;
    }
    public String getAliyunCallerType() {
        return this.aliyunCallerType;
    }

    public DownloadOrderTransactionDetailFileRequest setAliyunPid(Long aliyunPid) {
        this.aliyunPid = aliyunPid;
        return this;
    }
    public Long getAliyunPid() {
        return this.aliyunPid;
    }

    public DownloadOrderTransactionDetailFileRequest setAliyunUid(Long aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public Long getAliyunUid() {
        return this.aliyunUid;
    }

    public DownloadOrderTransactionDetailFileRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DownloadOrderTransactionDetailFileRequest setLmUserId(Long lmUserId) {
        this.lmUserId = lmUserId;
        return this;
    }
    public Long getLmUserId() {
        return this.lmUserId;
    }

    public DownloadOrderTransactionDetailFileRequest setProxyOriginalSourceIp(String proxyOriginalSourceIp) {
        this.proxyOriginalSourceIp = proxyOriginalSourceIp;
        return this;
    }
    public String getProxyOriginalSourceIp() {
        return this.proxyOriginalSourceIp;
    }

    public DownloadOrderTransactionDetailFileRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public DownloadOrderTransactionDetailFileRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadOrderTransactionDetailFileRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DownloadOrderTransactionDetailFileRequest setTbNick(String tbNick) {
        this.tbNick = tbNick;
        return this;
    }
    public String getTbNick() {
        return this.tbNick;
    }

    public DownloadOrderTransactionDetailFileRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public DownloadOrderTransactionDetailFileRequest setUscTbId(String uscTbId) {
        this.uscTbId = uscTbId;
        return this;
    }
    public String getUscTbId() {
        return this.uscTbId;
    }

    public DownloadOrderTransactionDetailFileRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

}
