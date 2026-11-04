// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryLiveStreamingRequest extends TeaModel {
    /**
     * <p>The duration of video cached data. Valid values: 0 to 10000. Unit: milliseconds. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CacheDuration")
    public Integer cacheDuration;

    /**
     * <p>The DeviceName of the IPC device. You can view the <strong>DeviceName</strong> on the <strong>Devices</strong> page in the IoT Platform console.</p>
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
     * <p>The encryption type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong> (default): Keyframe encryption.</li>
     * <li><strong>0</strong>: No encryption.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EncryptType")
    public Integer encryptType;

    /**
     * <p>Specifies whether to send a force I-frame command to the device. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Sent.</li>
     * <li><strong>false</strong> (default): Not sent.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ForceIFrame")
    public Boolean forceIFrame;

    /**
     * <p>The IotId of the IPC device. The IotId is the globally unique identifier that is issued by IoT Platform to the device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the IotId.</p>
     * <blockquote>
     * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> is the globally unique identifier of the device and corresponds to the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
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
     * <li>If an ID value is displayed, you must specify this parameter. Otherwise, the call fails.</li>
     * <li>If the &lt;props=&quot;intl&quot;&gt;<ph><strong>Instance Overview</strong> page or </ph>ID value is not displayed, you do not need to specify this parameter.</li>
     * </ul>
     * <p>For more information about instances, see <a href="https://help.aliyun.com/document_detail/356505.html">Instance overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-n6w1y59****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>Specifies whether the playback URL can be used for an unlimited number of times within the validity period. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Allowed.</li>
     * <li><strong>false</strong> (default): Not allowed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PlayUnLimited")
    public Boolean playUnLimited;

    /**
     * <p>The ProductKey of the product to which the IPC device belongs. You can view the ProductKey on the <strong>Products</strong> page in the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to query the information about all products under the current account.</p>
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
     * <p>The playback protocol type. Valid values:</p>
     * <ul>
     * <li><strong>rtmp</strong> (default): RTMP.</li>
     * <li><strong>hls</strong>: HLS.</li>
     * <li><strong>flv</strong>: HTTP-FLV.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rtmp</p>
     */
    @NameInMap("Scheme")
    public String scheme;

    /**
     * <p>Specifies whether to encrypt the stream. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Encrypted.</li>
     * <li><strong>false</strong> (default): Not encrypted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShouldEncrypt")
    public Boolean shouldEncrypt;

    /**
     * <p>The stream type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong> (default): Main stream.</li>
     * <li><strong>1</strong>: Sub stream.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StreamType")
    public Integer streamType;

    /**
     * <p>The validity period of the URL. Valid values: 10 to 14400. Unit: seconds. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("UrlValidDuration")
    public Integer urlValidDuration;

    public static QueryLiveStreamingRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveStreamingRequest self = new QueryLiveStreamingRequest();
        return TeaModel.build(map, self);
    }

    public QueryLiveStreamingRequest setCacheDuration(Integer cacheDuration) {
        this.cacheDuration = cacheDuration;
        return this;
    }
    public Integer getCacheDuration() {
        return this.cacheDuration;
    }

    public QueryLiveStreamingRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public QueryLiveStreamingRequest setEnableStun(Boolean enableStun) {
        this.enableStun = enableStun;
        return this;
    }
    public Boolean getEnableStun() {
        return this.enableStun;
    }

    public QueryLiveStreamingRequest setEncryptType(Integer encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public Integer getEncryptType() {
        return this.encryptType;
    }

    public QueryLiveStreamingRequest setForceIFrame(Boolean forceIFrame) {
        this.forceIFrame = forceIFrame;
        return this;
    }
    public Boolean getForceIFrame() {
        return this.forceIFrame;
    }

    public QueryLiveStreamingRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryLiveStreamingRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryLiveStreamingRequest setPlayUnLimited(Boolean playUnLimited) {
        this.playUnLimited = playUnLimited;
        return this;
    }
    public Boolean getPlayUnLimited() {
        return this.playUnLimited;
    }

    public QueryLiveStreamingRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public QueryLiveStreamingRequest setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }
    public String getScheme() {
        return this.scheme;
    }

    public QueryLiveStreamingRequest setShouldEncrypt(Boolean shouldEncrypt) {
        this.shouldEncrypt = shouldEncrypt;
        return this;
    }
    public Boolean getShouldEncrypt() {
        return this.shouldEncrypt;
    }

    public QueryLiveStreamingRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

    public QueryLiveStreamingRequest setUrlValidDuration(Integer urlValidDuration) {
        this.urlValidDuration = urlValidDuration;
        return this;
    }
    public Integer getUrlValidDuration() {
        return this.urlValidDuration;
    }

}
