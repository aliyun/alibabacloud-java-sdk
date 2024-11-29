// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDeadLockHistoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;total&quot;: 2,
     *     &quot;list&quot;: [
     *         {
     *             &quot;accountId&quot;: &quot;108************&quot;,
     *             &quot;textId&quot;: &quot;35303d12d52d29ba73bb85fa2d5b****&quot;,
     *             &quot;gmtModified&quot;: 1732712680000,
     *             &quot;lockTime&quot;: 1732687047000,
     *             &quot;gmtCreate&quot;: 1732712680000,
     *             &quot;nodeId&quot;: &quot;pi-8****************&quot;,
     *             &quot;uuid&quot;: &quot;pc-8v**************&quot;
     *         },
     *         {
     *             &quot;accountId&quot;: &quot;108************&quot;,
     *             &quot;textId&quot;: &quot;50a24bdcc5fe7e03f92a55ae7574****&quot;,
     *             &quot;gmtModified&quot;: 1732626448000,
     *             &quot;lockTime&quot;: 1722500305000,
     *             &quot;gmtCreate&quot;: 1732626448000,
     *             &quot;nodeId&quot;: &quot;pi-8****************&quot;,
     *             &quot;uuid&quot;: &quot;pc-8v**************&quot;
     *         }
     *     ]
     * }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Synchro")
    public String synchro;

    public static GetDeadLockHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeadLockHistoryResponseBody self = new GetDeadLockHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeadLockHistoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDeadLockHistoryResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetDeadLockHistoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDeadLockHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDeadLockHistoryResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetDeadLockHistoryResponseBody setSynchro(String synchro) {
        this.synchro = synchro;
        return this;
    }
    public String getSynchro() {
        return this.synchro;
    }

}
