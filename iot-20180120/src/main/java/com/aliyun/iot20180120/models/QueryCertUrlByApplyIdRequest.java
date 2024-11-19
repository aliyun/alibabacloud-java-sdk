// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryCertUrlByApplyIdRequest extends TeaModel {
    /**
     * <p>The application ID. You can view the application ID in the result that is returned by the <a href="https://help.aliyun.com/document_detail/69514.html">BatchRegisterDeviceWithApplyId</a> or <a href="https://help.aliyun.com/document_detail/69473.html">BatchRegisterDevice</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("ApplyId")
    public Long applyId;

    /**
     * <p>The instance ID.</p>
     * <p>You can obtain the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console. If your instance has an ID, you must specify this parameter. Otherwise, the request fails.</p>
     * <blockquote>
     * <p>The ID of a public instance may not be displayed on the Overview page. For information about how to obtain the instance ID, see <a href="https://help.aliyun.com/document_detail/267533.html">How do I obtain an instance ID?</a></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>iot_instc_pu****_c*-v64********</p>
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
