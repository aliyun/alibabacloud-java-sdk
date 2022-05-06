// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySoundCodeLabelBatchListRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageId")
    public Integer pageId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ScheduleCode")
    public String scheduleCode;

    public static QuerySoundCodeLabelBatchListRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySoundCodeLabelBatchListRequest self = new QuerySoundCodeLabelBatchListRequest();
        return TeaModel.build(map, self);
    }

    public QuerySoundCodeLabelBatchListRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QuerySoundCodeLabelBatchListRequest setPageId(Integer pageId) {
        this.pageId = pageId;
        return this;
    }
    public Integer getPageId() {
        return this.pageId;
    }

    public QuerySoundCodeLabelBatchListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySoundCodeLabelBatchListRequest setScheduleCode(String scheduleCode) {
        this.scheduleCode = scheduleCode;
        return this;
    }
    public String getScheduleCode() {
        return this.scheduleCode;
    }

}
