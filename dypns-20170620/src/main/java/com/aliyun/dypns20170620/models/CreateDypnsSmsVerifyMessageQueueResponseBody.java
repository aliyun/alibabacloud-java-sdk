// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreateDypnsSmsVerifyMessageQueueResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;RequestId&quot;: &quot;C210BE04-8CB4-542A-92E1-44160AB05B01&quot;,
     *   &quot;Message&quot;: &quot;successful&quot;,
     *   &quot;Data&quot;: &quot;Alicom-Queue-10********384-DypnsSmsVerifyReport&quot;,
     *   &quot;Code&quot;: &quot;200&quot;,
     *   &quot;Success&quot;: true
     * }</p>
     */
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2E7CA885-8D97-C497-A02C-2D31214D3285</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDypnsSmsVerifyMessageQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDypnsSmsVerifyMessageQueueResponseBody self = new CreateDypnsSmsVerifyMessageQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDypnsSmsVerifyMessageQueueResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateDypnsSmsVerifyMessageQueueResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateDypnsSmsVerifyMessageQueueResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public CreateDypnsSmsVerifyMessageQueueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDypnsSmsVerifyMessageQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDypnsSmsVerifyMessageQueueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
