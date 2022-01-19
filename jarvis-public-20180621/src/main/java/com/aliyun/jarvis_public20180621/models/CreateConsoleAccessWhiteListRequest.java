// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class CreateConsoleAccessWhiteListRequest extends TeaModel {
    @NameInMap("DstPort")
    public Integer dstPort;

    @NameInMap("InstanceIdList")
    public String instanceIdList;

    @NameInMap("InstanceInfoList")
    public String instanceInfoList;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("LiveTime")
    public Integer liveTime;

    @NameInMap("Note")
    public String note;

    @NameInMap("ProductName")
    public String productName;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SourceCode")
    public String sourceCode;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("SrcIP")
    public String srcIP;

    @NameInMap("WhiteListType")
    public Integer whiteListType;

    public static CreateConsoleAccessWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConsoleAccessWhiteListRequest self = new CreateConsoleAccessWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public CreateConsoleAccessWhiteListRequest setDstPort(Integer dstPort) {
        this.dstPort = dstPort;
        return this;
    }
    public Integer getDstPort() {
        return this.dstPort;
    }

    public CreateConsoleAccessWhiteListRequest setInstanceIdList(String instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public String getInstanceIdList() {
        return this.instanceIdList;
    }

    public CreateConsoleAccessWhiteListRequest setInstanceInfoList(String instanceInfoList) {
        this.instanceInfoList = instanceInfoList;
        return this;
    }
    public String getInstanceInfoList() {
        return this.instanceInfoList;
    }

    public CreateConsoleAccessWhiteListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateConsoleAccessWhiteListRequest setLiveTime(Integer liveTime) {
        this.liveTime = liveTime;
        return this;
    }
    public Integer getLiveTime() {
        return this.liveTime;
    }

    public CreateConsoleAccessWhiteListRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

    public CreateConsoleAccessWhiteListRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public CreateConsoleAccessWhiteListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateConsoleAccessWhiteListRequest setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }
    public String getSourceCode() {
        return this.sourceCode;
    }

    public CreateConsoleAccessWhiteListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateConsoleAccessWhiteListRequest setSrcIP(String srcIP) {
        this.srcIP = srcIP;
        return this;
    }
    public String getSrcIP() {
        return this.srcIP;
    }

    public CreateConsoleAccessWhiteListRequest setWhiteListType(Integer whiteListType) {
        this.whiteListType = whiteListType;
        return this;
    }
    public Integer getWhiteListType() {
        return this.whiteListType;
    }

}
