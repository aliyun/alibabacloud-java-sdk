// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMetricRuleBlackListResponseBody extends TeaModel {
    /**
     * <p>The effective scope of the blacklist policy. Valid values:</p>
     * <br>
     * <p>*   USER: The blacklist policy takes effect only for the current Alibaba Cloud account.</p>
     * <br>
     * <p>*   GROUP: The blacklist policy takes effect only for the specified application group. This is the default value.</p>
     * <br>
     * <p>    For information about how to obtain the ID of an application group, see [DescribeMonitorGroups](~~115032~~).</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Id")
    public String id;

    /**
     * <p>The ID of the request.</p>
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

    public static CreateMetricRuleBlackListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMetricRuleBlackListResponseBody self = new CreateMetricRuleBlackListResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMetricRuleBlackListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMetricRuleBlackListResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateMetricRuleBlackListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMetricRuleBlackListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMetricRuleBlackListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
