// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class ListDataStreamsRequest extends TeaModel {
    @NameInMap("dataStreamName")
    public String dataStreamName;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("regionId")
    public String regionId;

    public static ListDataStreamsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataStreamsRequest self = new ListDataStreamsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataStreamsRequest setDataStreamName(String dataStreamName) {
        this.dataStreamName = dataStreamName;
        return this;
    }
    public String getDataStreamName() {
        return this.dataStreamName;
    }

    public ListDataStreamsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataStreamsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataStreamsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
