// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class CreateSitePairResponseBody extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("Code")
    public String code;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PrimarySiteId")
    public String primarySiteId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecondarySiteId")
    public String secondarySiteId;

    @NameInMap("SitePairId")
    public String sitePairId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Uid")
    public Long uid;

    public static CreateSitePairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSitePairResponseBody self = new CreateSitePairResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSitePairResponseBody setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public CreateSitePairResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSitePairResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public CreateSitePairResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSitePairResponseBody setPrimarySiteId(String primarySiteId) {
        this.primarySiteId = primarySiteId;
        return this;
    }
    public String getPrimarySiteId() {
        return this.primarySiteId;
    }

    public CreateSitePairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSitePairResponseBody setSecondarySiteId(String secondarySiteId) {
        this.secondarySiteId = secondarySiteId;
        return this;
    }
    public String getSecondarySiteId() {
        return this.secondarySiteId;
    }

    public CreateSitePairResponseBody setSitePairId(String sitePairId) {
        this.sitePairId = sitePairId;
        return this;
    }
    public String getSitePairId() {
        return this.sitePairId;
    }

    public CreateSitePairResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateSitePairResponseBody setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

}
