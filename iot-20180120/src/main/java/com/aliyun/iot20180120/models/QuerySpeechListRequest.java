// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>wav</p>
     */
    @NameInMap("AudioFormat")
    public String audioFormat;

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
     * <p>4de2c367**<strong>8c585e5992</strong></p>
     */
    @NameInMap("ProjectCode")
    public String projectCode;

    public static QuerySpeechListRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechListRequest self = new QuerySpeechListRequest();
        return TeaModel.build(map, self);
    }

    public QuerySpeechListRequest setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }
    public String getAudioFormat() {
        return this.audioFormat;
    }

    public QuerySpeechListRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QuerySpeechListRequest setPageId(Integer pageId) {
        this.pageId = pageId;
        return this;
    }
    public Integer getPageId() {
        return this.pageId;
    }

    public QuerySpeechListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySpeechListRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

}
