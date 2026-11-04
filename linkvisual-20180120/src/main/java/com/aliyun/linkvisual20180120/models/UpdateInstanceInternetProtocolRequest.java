// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateInstanceInternetProtocolRequest extends TeaModel {
    /**
     * <p>The instance ID. You can view the <strong>ID</strong> of the current instance on the <strong>Instance overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <ul>
     * <li>If an ID value is available, you must specify it. Otherwise, the call fails.</li>
     * <li>If the &lt;props=&quot;intl&quot;&gt;<ph><strong>Instance overview</strong> page or </ph>ID value is not available, you do not need to specify it.</li>
     * </ul>
     * <p>For more information about instances, see <a href="https://help.aliyun.com/document_detail/356505.html">Instance overview</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-cn-n6w1y59****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The IP protocol version. Valid values:</p>
     * <ul>
     * <li>IPv4 (default)</li>
     * <li>IPv6</li>
     * </ul>
     * <blockquote>
     * <p>If the IP protocol version is set to IPv6, streaming media-related addresses are changed to IPv4/IPv6 dual-stack addresses. Make sure that your devices and applications are configured for IPv6. Otherwise, exceptions such as playback screen loading failures may occur.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    public static UpdateInstanceInternetProtocolRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceInternetProtocolRequest self = new UpdateInstanceInternetProtocolRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceInternetProtocolRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateInstanceInternetProtocolRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

}
