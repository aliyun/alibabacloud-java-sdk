// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRuleBlackListResponseBody extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **DeleteMetricRuleBlackList**.</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The number of blacklist policies that are deleted.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>For more information about common request parameters, see [Common parameters](~~199331~~).</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteMetricRuleBlackListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRuleBlackListResponseBody self = new DeleteMetricRuleBlackListResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMetricRuleBlackListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteMetricRuleBlackListResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DeleteMetricRuleBlackListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteMetricRuleBlackListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMetricRuleBlackListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
