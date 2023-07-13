// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ShareSpeechByCombinationRequest extends TeaModel {
    /**
     * <p>The audio format. Valid values: **wav**, **mp3**, and **amr**.</p>
     */
    @NameInMap("AudioFormat")
    public String audioFormat;

    /**
     * <p>The combined content that you want to broadcast. The following types of content can be broadcasted:</p>
     * <br>
     * <p>*   The speeches that are pushed to the device. You must specify the identifiers of the speeches.</p>
     * <br>
     * <p>*   The custom content that you specify based on the supported format of the device.</p>
     * <br>
     * <p>    For example, you can create a custom speech about the amount of money in the format of `{$xxx}`. xxx is the specific amount. If you specify `{$1000}`, the device broadcasts **CNY 1000**.</p>
     * <br>
     * <p>The device broadcasts the audio files in the sequence of the values that you specify in CombinationList.</p>
     */
    @NameInMap("CombinationList")
    public java.util.List<String> combinationList;

    /**
     * <p>The **DeviceName** of the device. If you specify this parameter, you must also specify the **ProductKey** parameter.</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the device. You can call the [QuerySpeechDevice](~~280408~~) operation to obtain the ID.</p>
     * <br>
     * <p>> If you specify this parameter, you do not need to specify the **ProductKey** and **DeviceName** parameters. **IotId** specifies a globally unique identifier (GUID) of the device, which corresponds to a combination of **ProductKey** and **DeviceName**. If you specify the **IotId**, **ProductKey**, and **DeviceName** parameters, the value of the **IotId** parameter takes precedence.</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The instance ID. You can view the **ID** of the instance on the **Overview** page in the IoT Platform console.</p>
     * <br>
     * <p>>  If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
     * <br>
     * <p>For more information, see the [Overview](~~356505~~) topic of IoT instances.</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The **ProductKey** of the product to which the device belongs. If you specify this parameter, you must also specify the **DeviceName** parameter.</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The unique ID of the combined speech that you want to broadcast. This ID is issued by IoT Platform to the device.</p>
     * <br>
     * <p>>  If you do not specify this parameter, IoT Platform automatically generates an ID. If you need to retry broadcasting the speech, you must specify the ID to prevent repeated broadcasting.</p>
     */
    @NameInMap("SpeechId")
    public String speechId;

    public static ShareSpeechByCombinationRequest build(java.util.Map<String, ?> map) throws Exception {
        ShareSpeechByCombinationRequest self = new ShareSpeechByCombinationRequest();
        return TeaModel.build(map, self);
    }

    public ShareSpeechByCombinationRequest setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }
    public String getAudioFormat() {
        return this.audioFormat;
    }

    public ShareSpeechByCombinationRequest setCombinationList(java.util.List<String> combinationList) {
        this.combinationList = combinationList;
        return this;
    }
    public java.util.List<String> getCombinationList() {
        return this.combinationList;
    }

    public ShareSpeechByCombinationRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public ShareSpeechByCombinationRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public ShareSpeechByCombinationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ShareSpeechByCombinationRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public ShareSpeechByCombinationRequest setSpeechId(String speechId) {
        this.speechId = speechId;
        return this;
    }
    public String getSpeechId() {
        return this.speechId;
    }

}
