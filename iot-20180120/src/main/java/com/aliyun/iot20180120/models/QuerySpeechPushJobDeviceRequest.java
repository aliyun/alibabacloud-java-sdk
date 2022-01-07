// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechPushJobDeviceRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("JobCode")
    public String jobCode;

    @NameInMap("PageId")
    public Integer pageId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public String status;

    public static QuerySpeechPushJobDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechPushJobDeviceRequest self = new QuerySpeechPushJobDeviceRequest();
        return TeaModel.build(map, self);
    }

    public QuerySpeechPushJobDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QuerySpeechPushJobDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QuerySpeechPushJobDeviceRequest setJobCode(String jobCode) {
        this.jobCode = jobCode;
        return this;
    }
    public String getJobCode() {
        return this.jobCode;
    }

    public QuerySpeechPushJobDeviceRequest setPageId(Integer pageId) {
        this.pageId = pageId;
        return this;
    }
    public Integer getPageId() {
        return this.pageId;
    }

    public QuerySpeechPushJobDeviceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySpeechPushJobDeviceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
