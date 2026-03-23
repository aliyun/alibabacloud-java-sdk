// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetPageVisitDataRequest extends TeaModel {
    /**
     * <p>appCode</p>
     * 
     * <strong>example:</strong>
     * <p>3c0837d5-e65b-11ec-9985-02420bb080c6</p>
     */
    @NameInMap("AppCode")
    public String appCode;

    /**
     * <p>appName</p>
     * 
     * <strong>example:</strong>
     * <p>CLOUD_NETWORK</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>endTime</p>
     * 
     * <strong>example:</strong>
     * <p>2023-07-11</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>pId</p>
     * 
     * <strong>example:</strong>
     * <p>19048</p>
     */
    @NameInMap("PId")
    public String PId;

    /**
     * <p>startTime</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11-22</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetPageVisitDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPageVisitDataRequest self = new GetPageVisitDataRequest();
        return TeaModel.build(map, self);
    }

    public GetPageVisitDataRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetPageVisitDataRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetPageVisitDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetPageVisitDataRequest setPId(String PId) {
        this.PId = PId;
        return this;
    }
    public String getPId() {
        return this.PId;
    }

    public GetPageVisitDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
