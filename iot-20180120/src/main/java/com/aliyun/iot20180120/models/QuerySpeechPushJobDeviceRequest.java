// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechPushJobDeviceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <strong>example:</strong>
     * <p>iot-060*****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tBUm***********************QPGT</p>
     */
    @NameInMap("JobCode")
    public String jobCode;

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
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
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
