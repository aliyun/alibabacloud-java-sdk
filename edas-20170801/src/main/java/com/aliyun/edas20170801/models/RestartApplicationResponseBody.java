// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class RestartApplicationResponseBody extends TeaModel {
    /**
     * <p>The ID of the change process.</p>
     * <p>You can call the GetChangeOrderInfo operation to query the progress of this restart. For more information, see <a href="https://help.aliyun.com/document_detail/62072.html">GetChangeOrderInfo</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>a9557bac-ddd7-*********************</p>
     */
    @NameInMap("ChangeOrderId")
    public String changeOrderId;

    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

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
     * <p>D16979DC-4D42-****************</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RestartApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartApplicationResponseBody self = new RestartApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartApplicationResponseBody setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    public RestartApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public RestartApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RestartApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
