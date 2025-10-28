// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class MigrateEcuResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The additional information that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04B0ABAF-95F2-42B6-A7B1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MigrateEcuResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MigrateEcuResponseBody self = new MigrateEcuResponseBody();
        return TeaModel.build(map, self);
    }

    public MigrateEcuResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public MigrateEcuResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public MigrateEcuResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MigrateEcuResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
