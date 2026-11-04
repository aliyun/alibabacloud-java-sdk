// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceVodUrlByTimeRequest extends TeaModel {
    /**
     * <p>The recording start time. The value must be a 10-digit UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1508200012</p>
     */
    @NameInMap("BeginTime")
    public Integer beginTime;

    /**
     * <p>The DeviceName of the IPC device.
     * You can view the <strong>DeviceName</strong> on the <strong>Devices</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you must also specify <strong>ProductKey</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>camera1</p>
     */
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("EnableStun")
    public Boolean enableStun;

    /**
     * <p>The encryption type. Only I-frame encryption is supported. Set the value to 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EncryptType")
    public Integer encryptType;

    /**
     * <p>The recording end time. The value must be a 10-digit UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1582420940</p>
     */
    @NameInMap("EndTime")
    public Integer endTime;

    /**
     * <p>The ID of the IPC device. The ID is issued by IoT Platform and uniquely identifies the device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the ID.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> uniquely identifies the device and has a one-to-one mapping with the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>C47T6xwp6ms4bNlkHRWCg4****</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The instance ID. You can view the <strong>ID</strong> of the current instance on the <strong>Instance Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <ul>
     * <li>If the instance has an ID, you must specify this ID. Otherwise, the call fails.</li>
     * <li>If the instance does not have an &lt;props=&quot;intl&quot;&gt;<ph><strong>Instance Overview</strong> page or </ph>ID, you do not need to specify this parameter.</li>
     * </ul>
     * <p>For more information about instances, see <a href="https://help.aliyun.com/document_detail/356505.html">Instance overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-n6w1y****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>Specifies whether the playback URL can be used an unlimited number of times. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The URL can be used an unlimited number of times within 10 seconds.</li>
     * <li><strong>false</strong>: The URL can be used only once. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PlayUnLimited")
    public Boolean playUnLimited;

    /**
     * <p>The ProductKey of the product to which the IPC device belongs.
     * You can view the ProductKey on the <strong>Products</strong> page in the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to query the information about all products under the current account.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you must also specify <strong>DeviceName</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>a1BwAGV****</p>
     */
    @NameInMap("ProductKey")
    public String productKey;

    /**
     * <p>The protocol type. Valid values:</p>
     * <ul>
     * <li><strong>rtmp</strong>: RTMP.</li>
     * <li><strong>flv</strong>: HTTP-FLV.</li>
     * <li><strong>hls</strong>: HLS.<blockquote>
     * <p>For more information about the limits of HLS, see <a href="https://help.aliyun.com/document_detail/208584.html">Cloud development</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rtmp</p>
     */
    @NameInMap("Scheme")
    public String scheme;

    /**
     * <p>The offset relative to the recording start time specified by <strong>BeginTime</strong>. Unit: seconds. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SeekTime")
    public Integer seekTime;

    /**
     * <p>Specifies whether to encrypt the stream. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Encrypts the stream.</li>
     * <li><strong>false</strong>: Does not encrypt the stream. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ShouldEncrypt")
    public Boolean shouldEncrypt;

    /**
     * <p>The validity period of the URL. Valid values: 10 to 14400. Unit: seconds. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("UrlValidDuration")
    public Integer urlValidDuration;

    public static QueryDeviceVodUrlByTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceVodUrlByTimeRequest self = new QueryDeviceVodUrlByTimeRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceVodUrlByTimeRequest setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Integer getBeginTime() {
        return this.beginTime;
    }

    public QueryDeviceVodUrlByTimeRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryDeviceVodUrlByTimeRequest setEnableStun(Boolean enableStun) {
        this.enableStun = enableStun;
        return this;
    }
    public Boolean getEnableStun() {
        return this.enableStun;
    }

    public QueryDeviceVodUrlByTimeRequest setEncryptType(Integer encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public Integer getEncryptType() {
        return this.encryptType;
    }

    public QueryDeviceVodUrlByTimeRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public QueryDeviceVodUrlByTimeRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDeviceVodUrlByTimeRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryDeviceVodUrlByTimeRequest setPlayUnLimited(Boolean playUnLimited) {
        this.playUnLimited = playUnLimited;
        return this;
    }
    public Boolean getPlayUnLimited() {
        return this.playUnLimited;
    }

    public QueryDeviceVodUrlByTimeRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryDeviceVodUrlByTimeRequest setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }
    public String getScheme() {
        return this.scheme;
    }

    public QueryDeviceVodUrlByTimeRequest setSeekTime(Integer seekTime) {
        this.seekTime = seekTime;
        return this;
    }
    public Integer getSeekTime() {
        return this.seekTime;
    }

    public QueryDeviceVodUrlByTimeRequest setShouldEncrypt(Boolean shouldEncrypt) {
        this.shouldEncrypt = shouldEncrypt;
        return this;
    }
    public Boolean getShouldEncrypt() {
        return this.shouldEncrypt;
    }

    public QueryDeviceVodUrlByTimeRequest setUrlValidDuration(Integer urlValidDuration) {
        this.urlValidDuration = urlValidDuration;
        return this;
    }
    public Integer getUrlValidDuration() {
        return this.urlValidDuration;
    }

}
