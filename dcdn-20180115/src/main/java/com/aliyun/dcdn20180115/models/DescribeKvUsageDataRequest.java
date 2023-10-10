// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeKvUsageDataRequest extends TeaModel {
    @NameInMap("AccessType")
    public String accessType;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Field")
    public String field;

    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("ResponseType")
    public String responseType;

    @NameInMap("SplitBy")
    public String splitBy;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeKvUsageDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKvUsageDataRequest self = new DescribeKvUsageDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKvUsageDataRequest setAccessType(String accessType) {
        this.accessType = accessType;
        return this;
    }
    public String getAccessType() {
        return this.accessType;
    }

    public DescribeKvUsageDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeKvUsageDataRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public DescribeKvUsageDataRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public DescribeKvUsageDataRequest setResponseType(String responseType) {
        this.responseType = responseType;
        return this;
    }
    public String getResponseType() {
        return this.responseType;
    }

    public DescribeKvUsageDataRequest setSplitBy(String splitBy) {
        this.splitBy = splitBy;
        return this;
    }
    public String getSplitBy() {
        return this.splitBy;
    }

    public DescribeKvUsageDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
