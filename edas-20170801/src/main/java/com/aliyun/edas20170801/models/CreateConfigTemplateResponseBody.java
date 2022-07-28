// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateConfigTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CreateConfigTemplateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateConfigTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigTemplateResponseBody self = new CreateConfigTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConfigTemplateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreateConfigTemplateResponseBody setData(CreateConfigTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateConfigTemplateResponseBodyData getData() {
        return this.data;
    }

    public CreateConfigTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateConfigTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateConfigTemplateResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Long id;

        public static CreateConfigTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateConfigTemplateResponseBodyData self = new CreateConfigTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateConfigTemplateResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
