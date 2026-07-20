// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetAssetCountResponseBody extends TeaModel {
    /**
     * <p>The total number of Alibaba Cloud resources.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AliyunAssetCount")
    public Integer aliyunAssetCount;

    /**
     * <p>The total number of Amazon Web Services (AWS) resources.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AwsAssetCount")
    public Integer awsAssetCount;

    /**
     * <p>The number of paid certificates.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("BuyCertificateCount")
    public Integer buyCertificateCount;

    /**
     * <p>The total number of domain name resources.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DomainAssetCount")
    public Integer domainAssetCount;

    /**
     * <p>The number of free certificates.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FreeCertificateCount")
    public Integer freeCertificateCount;

    /**
     * <p>The total number of Huawei Cloud resources.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("HuaweiAssetCount")
    public Integer huaweiAssetCount;

    /**
     * <p>The previous health score.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("LastPoint")
    public Integer lastPoint;

    /**
     * <p>The generated perspective.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Point")
    public Integer point;

    /**
     * <p>The health score ratio.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PointRatio")
    public Integer pointRatio;

    /**
     * <p>The time when the health score was updated (in timestamp format, accurate to seconds).</p>
     * 
     * <strong>example:</strong>
     * <p>1767681210879</p>
     */
    @NameInMap("PointTime")
    public Long pointTime;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique identifier for each API request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>EECA10D5-BD0F-4EF1-B3EA-B4578E5C6F8E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of Tencent Cloud resources.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TencentAssetCount")
    public Integer tencentAssetCount;

    /**
     * <p>The number of uploaded certificates.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
