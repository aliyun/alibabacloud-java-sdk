// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ManagePrivateRdsResponseBody extends TeaModel {
    /**
     * <p>The parameter result set returned for the operation that is called for the custom ApsaraDB RDS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;requestId&quot;:&quot;E63C810A-4A13-47B6-BA67-C0E23A******&quot;}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0237BCD2-2C7A-4F86-A766-657AF6******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ManagePrivateRdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ManagePrivateRdsResponseBody self = new ManagePrivateRdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ManagePrivateRdsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ManagePrivateRdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ManagePrivateRdsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
