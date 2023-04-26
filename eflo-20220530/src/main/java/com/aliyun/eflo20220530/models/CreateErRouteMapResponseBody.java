// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateErRouteMapResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public CreateErRouteMapResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateErRouteMapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateErRouteMapResponseBody self = new CreateErRouteMapResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateErRouteMapResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateErRouteMapResponseBody setContent(CreateErRouteMapResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public CreateErRouteMapResponseBodyContent getContent() {
        return this.content;
    }

    public CreateErRouteMapResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateErRouteMapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateErRouteMapResponseBodyContent extends TeaModel {
        @NameInMap("ErRouteMapId")
        public String erRouteMapId;

        public static CreateErRouteMapResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            CreateErRouteMapResponseBodyContent self = new CreateErRouteMapResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public CreateErRouteMapResponseBodyContent setErRouteMapId(String erRouteMapId) {
            this.erRouteMapId = erRouteMapId;
            return this;
        }
        public String getErRouteMapId() {
            return this.erRouteMapId;
        }

    }

}
