// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateInstanceConfigResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>## **Permissions**</p>
     * <br>
     * <p>If a RAM user wants to call the **UpdateInstanceConfig** operation, the RAM user must be granted the required permissions. For more information about how to grant permissions, see [RAM policies](~~185815~~).</p>
     * <br>
     * <p>|API|Action|Resource|</p>
     * <p>|---|---|---|</p>
     * <p>|UpdateInstanceConfig|alikafka: UpdateInstance|acs:alikafka:*:*:{instanceId}|</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>### Config parameters</p>
     * <br>
     * <p>|Parameter|Type|Valid values|Default value|Description|</p>
     * <p>|---|---|---|---|---|</p>
     * <p>|enable.vpc\_sasl\_ssl|Boolean|true/false|false|Specifies whether to enable virtual private cloud (VPC) transmission encryption. If VPC transmission encryption is enabled, you must also enable the access control list (ACL) feature.|</p>
     * <p>|enable.acl|Boolean|true/false|false|Specifies whether to enable the ACL feature.|</p>
     * <p>|kafka.log.retention.hours|Integer|24~480|72|The retention period of messages. Unit: hours.|</p>
     * <p>|kafka.message.max.bytes|Integer|1048576~10485760|1048576|The maximum size of a message. Unit: bytes.|</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Modifies the configuration of a Message Queue for Apache Kafka instance.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateInstanceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceConfigResponseBody self = new UpdateInstanceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateInstanceConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateInstanceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateInstanceConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
