// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeUserStatusResponseBody extends TeaModel {
    @NameInMap("AgreeChannel")
    public Integer agreeChannel;

    @NameInMap("Buyed")
    public Boolean buyed;

    @NameInMap("InDept")
    public Boolean inDept;

    @NameInMap("OpenApiBeginTime")
    public String openApiBeginTime;

    @NameInMap("OpenApiUsed")
    public Boolean openApiUsed;

    @NameInMap("OssCheckStatus")
    public String ossCheckStatus;

    @NameInMap("OssVideoSizeLimit")
    public Integer ossVideoSizeLimit;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Uid")
    public String uid;

    public static DescribeUserStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserStatusResponseBody self = new DescribeUserStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserStatusResponseBody setAgreeChannel(Integer agreeChannel) {
        this.agreeChannel = agreeChannel;
        return this;
    }
    public Integer getAgreeChannel() {
        return this.agreeChannel;
    }

    public DescribeUserStatusResponseBody setBuyed(Boolean buyed) {
        this.buyed = buyed;
        return this;
    }
    public Boolean getBuyed() {
        return this.buyed;
    }

    public DescribeUserStatusResponseBody setInDept(Boolean inDept) {
        this.inDept = inDept;
        return this;
    }
    public Boolean getInDept() {
        return this.inDept;
    }

    public DescribeUserStatusResponseBody setOpenApiBeginTime(String openApiBeginTime) {
        this.openApiBeginTime = openApiBeginTime;
        return this;
    }
    public String getOpenApiBeginTime() {
        return this.openApiBeginTime;
    }

    public DescribeUserStatusResponseBody setOpenApiUsed(Boolean openApiUsed) {
        this.openApiUsed = openApiUsed;
        return this;
    }
    public Boolean getOpenApiUsed() {
        return this.openApiUsed;
    }

    public DescribeUserStatusResponseBody setOssCheckStatus(String ossCheckStatus) {
        this.ossCheckStatus = ossCheckStatus;
        return this;
    }
    public String getOssCheckStatus() {
        return this.ossCheckStatus;
    }

    public DescribeUserStatusResponseBody setOssVideoSizeLimit(Integer ossVideoSizeLimit) {
        this.ossVideoSizeLimit = ossVideoSizeLimit;
        return this;
    }
    public Integer getOssVideoSizeLimit() {
        return this.ossVideoSizeLimit;
    }

    public DescribeUserStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserStatusResponseBody setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
