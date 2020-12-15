// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListCityMapImageDetailsRequest extends TeaModel {
    @NameInMap("DataSourceId")
    @Validation(required = true)
    public String dataSourceId;

    @NameInMap("RecordNumber")
    @Validation(required = true)
    public Long recordNumber;

    @NameInMap("TimeInterval")
    @Validation(required = true)
    public String timeInterval;

    public static ListCityMapImageDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCityMapImageDetailsRequest self = new ListCityMapImageDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListCityMapImageDetailsRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ListCityMapImageDetailsRequest setRecordNumber(Long recordNumber) {
        this.recordNumber = recordNumber;
        return this;
    }
    public Long getRecordNumber() {
        return this.recordNumber;
    }

    public ListCityMapImageDetailsRequest setTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }
    public String getTimeInterval() {
        return this.timeInterval;
    }

}
