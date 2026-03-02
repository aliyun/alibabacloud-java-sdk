// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetAssetCountResponseBody extends TeaModel {
    @NameInMap("AliyunAssetCount")
    public Integer aliyunAssetCount;

    @NameInMap("AwsAssetCount")
    public Integer awsAssetCount;

    @NameInMap("BuyCertificateCount")
    public Integer buyCertificateCount;

    @NameInMap("DomainAssetCount")
    public Integer domainAssetCount;

    @NameInMap("FreeCertificateCount")
    public Integer freeCertificateCount;

    @NameInMap("HuaweiAssetCount")
    public Integer huaweiAssetCount;

    @NameInMap("LastPoint")
    public Integer lastPoint;

    @NameInMap("Point")
    public Integer point;

    @NameInMap("PointRatio")
    public Integer pointRatio;

    @NameInMap("PointTime")
    public Long pointTime;

    /**
     * <strong>example:</strong>
     * <p>EECA10D5-BD0F-4EF1-B3EA-B4578E5C6F8E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TencentAssetCount")
    public Integer tencentAssetCount;

    @NameInMap("UploadCertificateCount")
    public Integer uploadCertificateCount;

    public static GetAssetCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAssetCountResponseBody self = new GetAssetCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAssetCountResponseBody setAliyunAssetCount(Integer aliyunAssetCount) {
        this.aliyunAssetCount = aliyunAssetCount;
        return this;
    }
    public Integer getAliyunAssetCount() {
        return this.aliyunAssetCount;
    }

    public GetAssetCountResponseBody setAwsAssetCount(Integer awsAssetCount) {
        this.awsAssetCount = awsAssetCount;
        return this;
    }
    public Integer getAwsAssetCount() {
        return this.awsAssetCount;
    }

    public GetAssetCountResponseBody setBuyCertificateCount(Integer buyCertificateCount) {
        this.buyCertificateCount = buyCertificateCount;
        return this;
    }
    public Integer getBuyCertificateCount() {
        return this.buyCertificateCount;
    }

    public GetAssetCountResponseBody setDomainAssetCount(Integer domainAssetCount) {
        this.domainAssetCount = domainAssetCount;
        return this;
    }
    public Integer getDomainAssetCount() {
        return this.domainAssetCount;
    }

    public GetAssetCountResponseBody setFreeCertificateCount(Integer freeCertificateCount) {
        this.freeCertificateCount = freeCertificateCount;
        return this;
    }
    public Integer getFreeCertificateCount() {
        return this.freeCertificateCount;
    }

    public GetAssetCountResponseBody setHuaweiAssetCount(Integer huaweiAssetCount) {
        this.huaweiAssetCount = huaweiAssetCount;
        return this;
    }
    public Integer getHuaweiAssetCount() {
        return this.huaweiAssetCount;
    }

    public GetAssetCountResponseBody setLastPoint(Integer lastPoint) {
        this.lastPoint = lastPoint;
        return this;
    }
    public Integer getLastPoint() {
        return this.lastPoint;
    }

    public GetAssetCountResponseBody setPoint(Integer point) {
        this.point = point;
        return this;
    }
    public Integer getPoint() {
        return this.point;
    }

    public GetAssetCountResponseBody setPointRatio(Integer pointRatio) {
        this.pointRatio = pointRatio;
        return this;
    }
    public Integer getPointRatio() {
        return this.pointRatio;
    }

    public GetAssetCountResponseBody setPointTime(Long pointTime) {
        this.pointTime = pointTime;
        return this;
    }
    public Long getPointTime() {
        return this.pointTime;
    }

    public GetAssetCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAssetCountResponseBody setTencentAssetCount(Integer tencentAssetCount) {
        this.tencentAssetCount = tencentAssetCount;
        return this;
    }
    public Integer getTencentAssetCount() {
        return this.tencentAssetCount;
    }

    public GetAssetCountResponseBody setUploadCertificateCount(Integer uploadCertificateCount) {
        this.uploadCertificateCount = uploadCertificateCount;
        return this;
    }
    public Integer getUploadCertificateCount() {
        return this.uploadCertificateCount;
    }

}
