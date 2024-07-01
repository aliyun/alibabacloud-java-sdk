// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CheckBindRamUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2FB9DCA3-DA56-5B43-A9A0-68E3D0E6AA84</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result of the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: the database account is associated with a RAM user.</li>
     * <li><strong>false</strong>: the database account is not associated with a RAM user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static CheckBindRamUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckBindRamUserResponseBody self = new CheckBindRamUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckBindRamUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckBindRamUserResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
