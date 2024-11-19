// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySpeechDeviceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("AvailableSpace")
    public String availableSpace;

    /**
     * <strong>example:</strong>
     * <p>smaller</p>
     */
    @NameInMap("AvailableSpaceScope")
    public String availableSpaceScope;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

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

    public static QuerySpeechDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySpeechDeviceRequest self = new QuerySpeechDeviceRequest();
        return TeaModel.build(map, self);
    }

    public QuerySpeechDeviceRequest setAvailableSpace(String availableSpace) {
        this.availableSpace = availableSpace;
        return this;
    }
    public String getAvailableSpace() {
        return this.availableSpace;
    }

    public QuerySpeechDeviceRequest setAvailableSpaceScope(String availableSpaceScope) {
        this.availableSpaceScope = availableSpaceScope;
        return this;
    }
    public String getAvailableSpaceScope() {
        return this.availableSpaceScope;
    }

    public QuerySpeechDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QuerySpeechDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QuerySpeechDeviceRequest setPageId(Integer pageId) {
        this.pageId = pageId;
        return this;
    }
    public Integer getPageId() {
        return this.pageId;
    }

    public QuerySpeechDeviceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySpeechDeviceRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

}
