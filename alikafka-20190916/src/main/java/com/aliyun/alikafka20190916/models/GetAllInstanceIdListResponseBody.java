// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetAllInstanceIdListResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The instance IDs of all instances across all regions under the current account.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;cn-shenzhen&quot;: [&quot;alikafka_post-cn-7pp2btvo****&quot;],&quot;us-west-1&quot;: [&quot;alikafka_pre-cn-i7m2lxid****&quot;],&quot;cn-hangzhou&quot;: [&quot;alikafka_pre-cn-i7m2hflj****&quot;,&quot;alikafka_pre-cn-zvp2hsje****&quot;,&quot;alikafka_pre-cn-zvp2kvc9****&quot;]}]</p>
     */
    @NameInMap("InstanceIds")
    public java.util.Map<String, ?> instanceIds;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABA4A7FD-E10F-45C7-9774-A5236015****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAllInstanceIdListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAllInstanceIdListResponseBody self = new GetAllInstanceIdListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAllInstanceIdListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAllInstanceIdListResponseBody setInstanceIds(java.util.Map<String, ?> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.Map<String, ?> getInstanceIds() {
        return this.instanceIds;
    }

    public GetAllInstanceIdListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAllInstanceIdListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAllInstanceIdListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
