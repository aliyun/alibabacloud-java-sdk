// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("StreamType")
    public Integer streamType;

    @NameInMap("BeginTime")
    public Integer beginTime;

    @NameInMap("EndTime")
    public Integer endTime;

    @NameInMap("RecordType")
    public Integer recordType;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("NeedSnapshot")
    public Boolean needSnapshot;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QueryRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordRequest self = new QueryRecordRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecordRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public QueryRecordRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public QueryRecordRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryRecordRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

    public QueryRecordRequest setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Integer getBeginTime() {
        return this.beginTime;
    }

    public QueryRecordRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public QueryRecordRequest setRecordType(Integer recordType) {
        this.recordType = recordType;
        return this;
    }
    public Integer getRecordType() {
        return this.recordType;
    }

    public QueryRecordRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryRecordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRecordRequest setNeedSnapshot(Boolean needSnapshot) {
        this.needSnapshot = needSnapshot;
        return this;
    }
    public Boolean getNeedSnapshot() {
        return this.needSnapshot;
    }

    public QueryRecordRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
