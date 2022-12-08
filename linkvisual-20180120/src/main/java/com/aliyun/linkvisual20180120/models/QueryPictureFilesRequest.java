// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureFilesRequest extends TeaModel {
    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PictureSource")
    public Integer pictureSource;

    @NameInMap("PictureType")
    public Integer pictureType;

    @NameInMap("ProductKey")
    public String productKey;

    public static QueryPictureFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureFilesRequest self = new QueryPictureFilesRequest();
        return TeaModel.build(map, self);
    }

    public QueryPictureFilesRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public QueryPictureFilesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryPictureFilesRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryPictureFilesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryPictureFilesRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryPictureFilesRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryPictureFilesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryPictureFilesRequest setPictureSource(Integer pictureSource) {
        this.pictureSource = pictureSource;
        return this;
    }
    public Integer getPictureSource() {
        return this.pictureSource;
    }

    public QueryPictureFilesRequest setPictureType(Integer pictureType) {
        this.pictureType = pictureType;
        return this;
    }
    public Integer getPictureType() {
        return this.pictureType;
    }

    public QueryPictureFilesRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
