// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteClientIdsRequest extends TeaModel {
    /**
     * <p>The ID of the device.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BXPV9Ks3bxwM9fD****0000101</p>
     */
    @NameInMap("IotId")
    public String iotId;

    /**
     * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
     * <blockquote>
     * <ul>
     * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
     * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-12****78</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static DeleteClientIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientIdsRequest self = new DeleteClientIdsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClientIdsRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public DeleteClientIdsRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
