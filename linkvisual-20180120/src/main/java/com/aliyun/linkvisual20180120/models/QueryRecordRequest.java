// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordRequest extends TeaModel {
    @NameInMap("BeginTime")
    public Integer beginTime;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("EndTime")
    public Integer endTime;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("NeedSnapshot")
    public Boolean needSnapshot;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("RecordType")
    public Integer recordType;

    @NameInMap("StreamType")
    public Integer streamType;

    public static QueryRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordRequest self = new QueryRecordRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecordRequest setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Integer getBeginTime() {
        return this.beginTime;
    }

    public QueryRecordRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryRecordRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryRecordRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public QueryRecordRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryRecordRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryRecordRequest setNeedSnapshot(Boolean needSnapshot) {
        this.needSnapshot = needSnapshot;
        return this;
    }
    public Boolean getNeedSnapshot() {
        return this.needSnapshot;
    }

    public QueryRecordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRecordRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryRecordRequest setRecordType(Integer recordType) {
        this.recordType = recordType;
        return this;
    }
    public Integer getRecordType() {
        return this.recordType;
    }

    public QueryRecordRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

}
