// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateResponseBody extends TeaModel {
    // 返回结果 OK 为正常
    @NameInMap("Code")
    public String code;

    // 返回数据结点
    // {"templateCode": "744c4b5c79c9432497a075bdfca36bf5"，"templateName": "hello_whatsapp"}
    @NameInMap("Data")
    public String data;

    // 提示信息，当返回异常时有值
    @NameInMap("Message")
    public String message;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static CreateChatappTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChatappTemplateResponseBody self = new CreateChatappTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChatappTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateChatappTemplateResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateChatappTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateChatappTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
