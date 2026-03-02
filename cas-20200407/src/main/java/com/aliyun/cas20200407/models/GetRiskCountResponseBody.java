// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetRiskCountResponseBody extends TeaModel {
    @NameInMap("AliyunAssetCertificateExpiredCount")
    public Integer aliyunAssetCertificateExpiredCount;

    @NameInMap("AliyunAssetCertificateWillExpiredCount")
    public Integer aliyunAssetCertificateWillExpiredCount;

    @NameInMap("BuyCertificateExpireCount")
    public Integer buyCertificateExpireCount;

    @NameInMap("BuyCertificateNotDeploymentCount")
    public Integer buyCertificateNotDeploymentCount;

    @NameInMap("BuyCertificateNotTrusteeCount")
    public Integer buyCertificateNotTrusteeCount;

    @NameInMap("BuyCertificateWillExpiredCount")
    public Integer buyCertificateWillExpiredCount;

    @NameInMap("BuyCheckedFailCount")
    public Integer buyCheckedFailCount;

    @NameInMap("DomainAssetNotMonitorCount")
    public Integer domainAssetNotMonitorCount;

    @NameInMap("FreeCertificateExpireCount")
    public Integer freeCertificateExpireCount;

    @NameInMap("FreeCertificateNotDeploymentCount")
    public Integer freeCertificateNotDeploymentCount;

    @NameInMap("FreeCertificateWillExpiredCount")
    public Integer freeCertificateWillExpiredCount;

    @NameInMap("FreeCheckedFailCount")
    public Integer freeCheckedFailCount;

    @NameInMap("MultiCloudAssetCertificateExpiredCount")
    public Integer multiCloudAssetCertificateExpiredCount;

    @NameInMap("MultiCloudAssetCertificateWillExpiredCount")
    public Integer multiCloudAssetCertificateWillExpiredCount;

    /**
     * <strong>example:</strong>
     * <p>5BCD2F6C-7A9D-47C1-8588-2CC6A4E0BE5E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UploadCertificateExpireCount")
    public Integer uploadCertificateExpireCount;

    @NameInMap("UploadCertificateNotDeploymentCount")
    public Integer uploadCertificateNotDeploymentCount;

    @NameInMap("UploadCertificateNotNoticeCount")
    public Integer uploadCertificateNotNoticeCount;

    @NameInMap("UploadCertificateWillExpiredCount")
    public Integer uploadCertificateWillExpiredCount;

    public static GetRiskCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRiskCountResponseBody self = new GetRiskCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRiskCountResponseBody setAliyunAssetCertificateExpiredCount(Integer aliyunAssetCertificateExpiredCount) {
        this.aliyunAssetCertificateExpiredCount = aliyunAssetCertificateExpiredCount;
        return this;
    }
    public Integer getAliyunAssetCertificateExpiredCount() {
        return this.aliyunAssetCertificateExpiredCount;
    }

    public GetRiskCountResponseBody setAliyunAssetCertificateWillExpiredCount(Integer aliyunAssetCertificateWillExpiredCount) {
        this.aliyunAssetCertificateWillExpiredCount = aliyunAssetCertificateWillExpiredCount;
        return this;
    }
    public Integer getAliyunAssetCertificateWillExpiredCount() {
        return this.aliyunAssetCertificateWillExpiredCount;
    }

    public GetRiskCountResponseBody setBuyCertificateExpireCount(Integer buyCertificateExpireCount) {
        this.buyCertificateExpireCount = buyCertificateExpireCount;
        return this;
    }
    public Integer getBuyCertificateExpireCount() {
        return this.buyCertificateExpireCount;
    }

    public GetRiskCountResponseBody setBuyCertificateNotDeploymentCount(Integer buyCertificateNotDeploymentCount) {
        this.buyCertificateNotDeploymentCount = buyCertificateNotDeploymentCount;
        return this;
    }
    public Integer getBuyCertificateNotDeploymentCount() {
        return this.buyCertificateNotDeploymentCount;
    }

    public GetRiskCountResponseBody setBuyCertificateNotTrusteeCount(Integer buyCertificateNotTrusteeCount) {
        this.buyCertificateNotTrusteeCount = buyCertificateNotTrusteeCount;
        return this;
    }
    public Integer getBuyCertificateNotTrusteeCount() {
        return this.buyCertificateNotTrusteeCount;
    }

    public GetRiskCountResponseBody setBuyCertificateWillExpiredCount(Integer buyCertificateWillExpiredCount) {
        this.buyCertificateWillExpiredCount = buyCertificateWillExpiredCount;
        return this;
    }
    public Integer getBuyCertificateWillExpiredCount() {
        return this.buyCertificateWillExpiredCount;
    }

    public GetRiskCountResponseBody setBuyCheckedFailCount(Integer buyCheckedFailCount) {
        this.buyCheckedFailCount = buyCheckedFailCount;
        return this;
    }
    public Integer getBuyCheckedFailCount() {
        return this.buyCheckedFailCount;
    }

    public GetRiskCountResponseBody setDomainAssetNotMonitorCount(Integer domainAssetNotMonitorCount) {
        this.domainAssetNotMonitorCount = domainAssetNotMonitorCount;
        return this;
    }
    public Integer getDomainAssetNotMonitorCount() {
        return this.domainAssetNotMonitorCount;
    }

    public GetRiskCountResponseBody setFreeCertificateExpireCount(Integer freeCertificateExpireCount) {
        this.freeCertificateExpireCount = freeCertificateExpireCount;
        return this;
    }
    public Integer getFreeCertificateExpireCount() {
        return this.freeCertificateExpireCount;
    }

    public GetRiskCountResponseBody setFreeCertificateNotDeploymentCount(Integer freeCertificateNotDeploymentCount) {
        this.freeCertificateNotDeploymentCount = freeCertificateNotDeploymentCount;
        return this;
    }
    public Integer getFreeCertificateNotDeploymentCount() {
        return this.freeCertificateNotDeploymentCount;
    }

    public GetRiskCountResponseBody setFreeCertificateWillExpiredCount(Integer freeCertificateWillExpiredCount) {
        this.freeCertificateWillExpiredCount = freeCertificateWillExpiredCount;
        return this;
    }
    public Integer getFreeCertificateWillExpiredCount() {
        return this.freeCertificateWillExpiredCount;
    }

    public GetRiskCountResponseBody setFreeCheckedFailCount(Integer freeCheckedFailCount) {
        this.freeCheckedFailCount = freeCheckedFailCount;
        return this;
    }
    public Integer getFreeCheckedFailCount() {
        return this.freeCheckedFailCount;
    }

    public GetRiskCountResponseBody setMultiCloudAssetCertificateExpiredCount(Integer multiCloudAssetCertificateExpiredCount) {
        this.multiCloudAssetCertificateExpiredCount = multiCloudAssetCertificateExpiredCount;
        return this;
    }
    public Integer getMultiCloudAssetCertificateExpiredCount() {
        return this.multiCloudAssetCertificateExpiredCount;
    }

    public GetRiskCountResponseBody setMultiCloudAssetCertificateWillExpiredCount(Integer multiCloudAssetCertificateWillExpiredCount) {
        this.multiCloudAssetCertificateWillExpiredCount = multiCloudAssetCertificateWillExpiredCount;
        return this;
    }
    public Integer getMultiCloudAssetCertificateWillExpiredCount() {
        return this.multiCloudAssetCertificateWillExpiredCount;
    }

    public GetRiskCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRiskCountResponseBody setUploadCertificateExpireCount(Integer uploadCertificateExpireCount) {
        this.uploadCertificateExpireCount = uploadCertificateExpireCount;
        return this;
    }
    public Integer getUploadCertificateExpireCount() {
        return this.uploadCertificateExpireCount;
    }

    public GetRiskCountResponseBody setUploadCertificateNotDeploymentCount(Integer uploadCertificateNotDeploymentCount) {
        this.uploadCertificateNotDeploymentCount = uploadCertificateNotDeploymentCount;
        return this;
    }
    public Integer getUploadCertificateNotDeploymentCount() {
        return this.uploadCertificateNotDeploymentCount;
    }

    public GetRiskCountResponseBody setUploadCertificateNotNoticeCount(Integer uploadCertificateNotNoticeCount) {
        this.uploadCertificateNotNoticeCount = uploadCertificateNotNoticeCount;
        return this;
    }
    public Integer getUploadCertificateNotNoticeCount() {
        return this.uploadCertificateNotNoticeCount;
    }

    public GetRiskCountResponseBody setUploadCertificateWillExpiredCount(Integer uploadCertificateWillExpiredCount) {
        this.uploadCertificateWillExpiredCount = uploadCertificateWillExpiredCount;
        return this;
    }
    public Integer getUploadCertificateWillExpiredCount() {
        return this.uploadCertificateWillExpiredCount;
    }

}
