// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class SendSdkStreamMessageRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    @NameInMap("header")
    public String header;

    @NameInMap("moduleName")
    public String moduleName;

    @NameInMap("operationName")
    public String operationName;

    @NameInMap("userId")
    public String userId;

    public static SendSdkStreamMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendSdkStreamMessageRequest self = new SendSdkStreamMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendSdkStreamMessageRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SendSdkStreamMessageRequest setHeader(String header) {
        this.header = header;
        return this;
    }
    public String getHeader() {
        return this.header;
    }

    public SendSdkStreamMessageRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public SendSdkStreamMessageRequest setOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }
    public String getOperationName() {
        return this.operationName;
    }

    public SendSdkStreamMessageRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
