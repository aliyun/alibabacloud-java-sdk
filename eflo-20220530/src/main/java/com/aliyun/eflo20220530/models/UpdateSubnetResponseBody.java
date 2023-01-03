// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateSubnetResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public UpdateSubnetResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateSubnetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubnetResponseBody self = new UpdateSubnetResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSubnetResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateSubnetResponseBody setContent(UpdateSubnetResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public UpdateSubnetResponseBodyContent getContent() {
        return this.content;
    }

    public UpdateSubnetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateSubnetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateSubnetResponseBodyContent extends TeaModel {
        @NameInMap("SubnetId")
        public String subnetId;

        public static UpdateSubnetResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateSubnetResponseBodyContent self = new UpdateSubnetResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public UpdateSubnetResponseBodyContent setSubnetId(String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public String getSubnetId() {
            return this.subnetId;
        }

    }

}
