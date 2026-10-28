// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ListCountriesResponseBody extends TeaModel {
    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>200: OK.</li>
     * <li>1109: System error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of region codes.</p>
     */
    @NameInMap("Data")
    public java.util.List<String> data;

    /**
     * <p>The message information.</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. Alibaba Cloud uses this ID for error tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>A747A00F-E096-5244-88B3-3E474BAE3AE4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the current API call itself is successful. Valid values: True and False. This does not indicate the success of subsequent business operations.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCountriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCountriesResponseBody self = new ListCountriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCountriesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCountriesResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public ListCountriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCountriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCountriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
