// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ShareSpeechByCombinationRequest extends TeaModel {
    /**
     * <p>The audio format. Valid values: <strong>wav</strong>, <strong>mp3</strong>, and <strong>amr</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>wav</p>
     */
    @NameInMap("AudioFormat")
    public String audioFormat;

    /**
     * <p>The combined content that you want to broadcast. The following types of content can be broadcasted:</p>
     * <ul>
     * <li><p>The speeches that are pushed to the device. You must specify the identifiers of the speeches.</p>
     * </li>
     * <li><p>The custom content that you specify based on the supported format of the device.</p>
     * <p>For example, you can create a custom speech about the amount of money in the format of <code>{$xxx}</code>. xxx is the specific amount. If you specify <code>{$1000}</code>, the device broadcasts <strong>CNY 1000</strong>.</p>
     * </li>
     * </ul>
     * <p>The device broadcasts the audio files in the sequence of the values that you specify in CombinationList.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZFBDZ</p>
     */
    @NameInMap("CombinationList")
    public java.util.List<String> combinationList;

    /**
     * <p>The <strong>DeviceName</strong> of the device. If you specify this parameter, you must also specify the <strong>ProductKey</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>The ID of the device. You can call the <a href="https://help.aliyun.com/document_detail/280408.html">QuerySpeechDevice</a> operation to obtain the ID.</p>
     * <blockquote>
     * <p>If you specify this parameter, you do not need to specify the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. <strong>IotId</strong> specifies a globally unique identifier (GUID) of the device, which corresponds to a combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify the <strong>IotId</strong>, <strong>ProductKey</strong>, and <strong>DeviceName</strong> parameters, the value of the <strong>IotId</strong> parameter takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Q7uOhVRdZRRlDnTLv****00100</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
     * </blockquote>
     * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> topic of IoT instances.</p>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The <strong>ProductKey</strong> of the product to which the device belongs. If you specify this parameter, you must also specify the <strong>DeviceName</strong> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The unique ID of the combined speech that you want to broadcast. This ID is issued by IoT Platform to the device.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, IoT Platform automatically generates an ID. If you need to retry broadcasting the speech, you must specify the ID to prevent repeated broadcasting.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>42000011392021112380********</p>
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
