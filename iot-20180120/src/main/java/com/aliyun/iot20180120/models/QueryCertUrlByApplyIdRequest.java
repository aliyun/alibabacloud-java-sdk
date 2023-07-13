// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryCertUrlByApplyIdRequest extends TeaModel {
    /**
     * <p>The application ID. You can view the application ID in the result that is returned by the [BatchRegisterDeviceWithApplyId](~~69514~~) or [BatchRegisterDevice](~~69473~~) operation.</p>
     */
    @NameInMap("ApplyId")
    public Long applyId;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>You can obtain the **ID** of the instance on the **Overview** page in the IoT Platform console. If your instance has an ID, you must specify this parameter. Otherwise, the request fails.</p>
     * <br>
     * <p>> The ID of a public instance may not be displayed on the Overview page. For information about how to obtain the instance ID, see [How do I obtain an instance ID?](~~267533~~)</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QueryCertUrlByApplyIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCertUrlByApplyIdRequest self = new QueryCertUrlByApplyIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryCertUrlByApplyIdRequest setApplyId(Long applyId) {
        this.applyId = applyId;
        return this;
    }
    public Long getApplyId() {
        return this.applyId;
    }

    public QueryCertUrlByApplyIdRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
