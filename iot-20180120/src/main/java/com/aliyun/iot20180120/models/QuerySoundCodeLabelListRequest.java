// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySoundCodeLabelListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageId")
    public Integer pageId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Md3ZiTL888K9llXDy7890***********</p>
     */
    @NameInMap("ScheduleCode")
    public String scheduleCode;

    public static QuerySoundCodeLabelListRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySoundCodeLabelListRequest self = new QuerySoundCodeLabelListRequest();
        return TeaModel.build(map, self);
    }

    public QuerySoundCodeLabelListRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QuerySoundCodeLabelListRequest setPageId(Integer pageId) {
        this.pageId = pageId;
        return this;
    }
    public Integer getPageId() {
        return this.pageId;
    }

    public QuerySoundCodeLabelListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySoundCodeLabelListRequest setScheduleCode(String scheduleCode) {
        this.scheduleCode = scheduleCode;
        return this;
    }
    public String getScheduleCode() {
        return this.scheduleCode;
    }

}
