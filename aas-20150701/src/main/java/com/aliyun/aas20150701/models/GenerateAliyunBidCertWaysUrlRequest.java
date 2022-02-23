// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class GenerateAliyunBidCertWaysUrlRequest extends TeaModel {
    // aliyunPk
    @NameInMap("AliyunPk")
    public String aliyunPk;

    // bidType
    @NameInMap("BidType")
    public String bidType;

    // isMobile
    @NameInMap("IsMobile")
    public Boolean isMobile;

    // isOpenApp
    @NameInMap("IsOpenApp")
    public Boolean isOpenApp;

    // platform
    @NameInMap("Platform")
    public String platform;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // source
    @NameInMap("Source")
    public String source;

    // subjectType
    @NameInMap("SubjectType")
    public String subjectType;

    public static GenerateAliyunBidCertWaysUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAliyunBidCertWaysUrlRequest self = new GenerateAliyunBidCertWaysUrlRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAliyunBidCertWaysUrlRequest setAliyunPk(String aliyunPk) {
        this.aliyunPk = aliyunPk;
        return this;
    }
    public String getAliyunPk() {
        return this.aliyunPk;
    }

    public GenerateAliyunBidCertWaysUrlRequest setBidType(String bidType) {
        this.bidType = bidType;
        return this;
    }
    public String getBidType() {
        return this.bidType;
    }

    public GenerateAliyunBidCertWaysUrlRequest setIsMobile(Boolean isMobile) {
        this.isMobile = isMobile;
        return this;
    }
    public Boolean getIsMobile() {
        return this.isMobile;
    }

    public GenerateAliyunBidCertWaysUrlRequest setIsOpenApp(Boolean isOpenApp) {
        this.isOpenApp = isOpenApp;
        return this;
    }
    public Boolean getIsOpenApp() {
        return this.isOpenApp;
    }

    public GenerateAliyunBidCertWaysUrlRequest setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public GenerateAliyunBidCertWaysUrlRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateAliyunBidCertWaysUrlRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GenerateAliyunBidCertWaysUrlRequest setSubjectType(String subjectType) {
        this.subjectType = subjectType;
        return this;
    }
    public String getSubjectType() {
        return this.subjectType;
    }

}
