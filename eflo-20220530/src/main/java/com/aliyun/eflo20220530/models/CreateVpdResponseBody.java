// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVpdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public CreateVpdResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateVpdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpdResponseBody self = new CreateVpdResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateVpdResponseBody setContent(CreateVpdResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateVpdResponseBodyContent getContent() {
        return this.content;
    }

    public CreateVpdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVpdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateVpdResponseBodyContent extends TeaModel {
        @NameInMap("SubnetIds")
        public java.util.List<String> subnetIds;

        @NameInMap("VpdId")
        public String vpdId;

        public static CreateVpdResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateVpdResponseBodyContent self = new CreateVpdResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateVpdResponseBodyContent setSubnetIds(java.util.List<String> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public java.util.List<String> getSubnetIds() {
            return this.subnetIds;
        }

        public CreateVpdResponseBodyContent setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

}
