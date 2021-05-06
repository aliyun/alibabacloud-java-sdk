// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenAttachedChildInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("ChildInstanceType")
    public String childInstanceType;

    @NameInMap("ChildInstanceRegionId")
    public String childInstanceRegionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ChildInstanceOwnerId")
    public Long childInstanceOwnerId;

    @NameInMap("ChildInstanceId")
    public String childInstanceId;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("ChildInstanceName")
    public String childInstanceName;

    @NameInMap("ChildInstanceAttachTime")
    public String childInstanceAttachTime;

    public static DescribeCenAttachedChildInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenAttachedChildInstanceAttributeResponseBody self = new DescribeCenAttachedChildInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setChildInstanceType(String childInstanceType) {
        this.childInstanceType = childInstanceType;
        return this;
    }
    public String getChildInstanceType() {
        return this.childInstanceType;
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setChildInstanceRegionId(String childInstanceRegionId) {
        this.childInstanceRegionId = childInstanceRegionId;
        return this;
    }
    public String getChildInstanceRegionId() {
        return this.childInstanceRegionId;
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setChildInstanceOwnerId(Long childInstanceOwnerId) {
        this.childInstanceOwnerId = childInstanceOwnerId;
        return this;
    }
    public Long getChildInstanceOwnerId() {
        return this.childInstanceOwnerId;
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setChildInstanceId(String childInstanceId) {
        this.childInstanceId = childInstanceId;
        return this;
    }
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setChildInstanceName(String childInstanceName) {
        this.childInstanceName = childInstanceName;
        return this;
    }
    public String getChildInstanceName() {
        return this.childInstanceName;
    }

    public DescribeCenAttachedChildInstanceAttributeResponseBody setChildInstanceAttachTime(String childInstanceAttachTime) {
        this.childInstanceAttachTime = childInstanceAttachTime;
        return this;
    }
    public String getChildInstanceAttachTime() {
        return this.childInstanceAttachTime;
    }

}
