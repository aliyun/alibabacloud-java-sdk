// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class CreateCdnDeliverTaskResponseBody extends TeaModel {
    /**
     * <p>**Fields of the ReDatas parameter**</p>
     * <br>
     * <p>| Parameter | Type | Required | Description |</p>
     * <p>| --------- | ---- | -------- | ----------- |</p>
     * <p>| reportId | String | Yes | The ID of the operations report. |</p>
     * <p>| conditions | ConDatas[] | No | The filter conditions for the operations report. |</p>
     * <br>
     * <p>**Fields of the ConDatas parameter**</p>
     * <br>
     * <p>| Parameter | Type | Required | Description |</p>
     * <p>| --------- | ---- | -------- | ----------- |</p>
     * <p>| field | String | No | The filter field. |</p>
     * <p>| op | String | No | The filter operation. |</p>
     * <p>| value | String[] | No | The array of field values. |</p>
     * <br>
     * <p>**Fields of the email parameter**</p>
     * <br>
     * <p>| Parameter | Type | Required | Description |</p>
     * <p>| --------- | ---- | -------- | ----------- |</p>
     * <p>| subject | String | Yes | The email subject. |</p>
     * <p>| to | String[] | Yes | The email addresses to which operations reports are sent. |</p>
     * <br>
     * <p>**Fields of the Deliver parameter**</p>
     * <br>
     * <p>| Parameter | Type | Required | Description |</p>
     * <p>| --------- | ---- | -------- | ----------- |</p>
     * <p>| subject | String | No | The email subject. |</p>
     * <p>| to | String[] | Yes | The email addresses to which operations reports are sent. |</p>
     * <br>
     * <p>**Fields of the Schedule parameter**</p>
     * <br>
     * <p>| Parameter | Type | Required | Description |</p>
     * <p>| --------- | ---- | -------- | ----------- |</p>
     * <p>| schedName | String | No | The name of the tracking task. |</p>
     * <p>| description | String | No | The description of the tracking task. |</p>
     * <p>| crontab | String | Yes | The period during which the operations reports are tracked. |</p>
     * <p>| frequency | String | Yes | The interval at which the reports are sent. Valid values:<br/>**h**: every hour <br/>**d**: every day <br/>**w**: every week |</p>
     * <p>| status | String | No | The status of the tracking task. Valid values:<br/>**enable**: enabled<br/>**disable**: disabled |</p>
     * <p>| effectiveFrom | String | No | The start time of the tracking task. |</p>
     * <p>| effectiveEnd | String | No | The end time of the tracking task. |</p>
     */
    @NameInMap("DeliverId")
    public String deliverId;

    /**
     * <p>Creates a tracking task that generates operations reports. The tracking task sends operations reports to a specified email address based on a specified schedule.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCdnDeliverTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCdnDeliverTaskResponseBody self = new CreateCdnDeliverTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCdnDeliverTaskResponseBody setDeliverId(String deliverId) {
        this.deliverId = deliverId;
        return this;
    }
    public String getDeliverId() {
        return this.deliverId;
    }

    public CreateCdnDeliverTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
