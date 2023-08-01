// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateConfigTemplateResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public CreateConfigTemplateResponseBodyData data;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The ID of the template.</p>
         */
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
