// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CountSpeechBroadcastHourRequest extends TeaModel {
    /**
     * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
     * </blockquote>
     * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> topic of IoT instances.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-2w****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The end time of the hour in which you want to query the number of broadcasted speeches. Example: 2020090919, which indicates 19:00 on September 9, 2020.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020090919</p>
     */
    @NameInMap("QueryDateTimeHour")
    public String queryDateTimeHour;

    /**
     * <p>The code that is used to share the speeches.</p>
     * <p>You can obtain the <strong>code</strong> on the <strong>Shared Corpus Management</strong> page of <strong>Speech Sending Voice Broadcasting Service</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ebed9280_ba25_48df_80c2_****</p>
     */
    @NameInMap("ShareTaskCode")
    public String shareTaskCode;

    public static CountSpeechBroadcastHourRequest build(java.util.Map<String, ?> map) throws Exception {
        CountSpeechBroadcastHourRequest self = new CountSpeechBroadcastHourRequest();
        return TeaModel.build(map, self);
    }

    public CountSpeechBroadcastHourRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CountSpeechBroadcastHourRequest setQueryDateTimeHour(String queryDateTimeHour) {
        this.queryDateTimeHour = queryDateTimeHour;
        return this;
    }
    public String getQueryDateTimeHour() {
        return this.queryDateTimeHour;
    }

    public CountSpeechBroadcastHourRequest setShareTaskCode(String shareTaskCode) {
        this.shareTaskCode = shareTaskCode;
        return this;
    }
    public String getShareTaskCode() {
        return this.shareTaskCode;
    }

}
