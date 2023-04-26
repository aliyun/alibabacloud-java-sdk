// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVccRouteEntryResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public CreateVccRouteEntryResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateVccRouteEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVccRouteEntryResponseBody self = new CreateVccRouteEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVccRouteEntryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateVccRouteEntryResponseBody setContent(CreateVccRouteEntryResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateVccRouteEntryResponseBodyContent getContent() {
        return this.content;
    }

    public CreateVccRouteEntryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateVccRouteEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateVccRouteEntryResponseBodyContent extends TeaModel {
        @NameInMap("VccRouteEntryId")
        public String vccRouteEntryId;

        public static CreateVccRouteEntryResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateVccRouteEntryResponseBodyContent self = new CreateVccRouteEntryResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateVccRouteEntryResponseBodyContent setVccRouteEntryId(String vccRouteEntryId) {
            this.vccRouteEntryId = vccRouteEntryId;
            return this;
        }
        public String getVccRouteEntryId() {
            return this.vccRouteEntryId;
        }

    }

}
