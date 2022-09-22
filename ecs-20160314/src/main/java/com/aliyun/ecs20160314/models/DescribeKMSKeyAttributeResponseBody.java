// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeKMSKeyAttributeResponseBody extends TeaModel {
    @NameInMap("Alias")
    public String alias;

    @NameInMap("Creator")
    public String creator;

    @NameInMap("EcsTagged")
    public Boolean ecsTagged;

    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static DescribeKMSKeyAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKMSKeyAttributeResponseBody self = new DescribeKMSKeyAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKMSKeyAttributeResponseBody setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public DescribeKMSKeyAttributeResponseBody setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public DescribeKMSKeyAttributeResponseBody setEcsTagged(Boolean ecsTagged) {
        this.ecsTagged = ecsTagged;
        return this;
    }
    public Boolean getEcsTagged() {
        return this.ecsTagged;
    }

    public DescribeKMSKeyAttributeResponseBody setKMSKeyId(String KMSKeyId) {
        this.KMSKeyId = KMSKeyId;
        return this;
    }
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    public DescribeKMSKeyAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKMSKeyAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
