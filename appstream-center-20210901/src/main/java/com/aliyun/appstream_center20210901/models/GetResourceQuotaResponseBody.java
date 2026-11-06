// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetResourceQuotaResponseBody extends TeaModel {
    /**
     * <p>The error code returned when an error occurs during the call. A normal result is not guaranteed to contain this field. You should not use the return of a specific success code as a prerequisite for obtaining the quota.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidProductType.ValueNotSupported</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The maximum resource count quota applicable to the current query conditions. This is not the usage or remaining quota.</p>
     * <ul>
     * <li><code>ResourceType=AppInstanceGroup</code>: Unit: count.</li>
     * <li><code>ResourceType=AppAuthUser</code>: Unit: users.</li>
     * <li><code>ResourceType=PoolNodeAmount</code>: Unit: count.</li>
     * </ul>
     * <p>If no smaller limit is obtained, <code>2147483647</code> is returned. This does not mean that the resource inventory is unlimited.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Data")
    public Long data;

    /**
     * <p>The error message returned when an error occurs during the call. This message and the error code help you identify the cause of the error.</p>
     * 
     * <strong>example:</strong>
     * <p>The ProductType is not supported.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier for the request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetResourceQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceQuotaResponseBody self = new GetResourceQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceQuotaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetResourceQuotaResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public GetResourceQuotaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetResourceQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
