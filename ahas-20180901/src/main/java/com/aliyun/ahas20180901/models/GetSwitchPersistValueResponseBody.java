// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetSwitchPersistValueResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetSwitchPersistValueResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSwitchPersistValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSwitchPersistValueResponseBody self = new GetSwitchPersistValueResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSwitchPersistValueResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSwitchPersistValueResponseBody setData(java.util.List<GetSwitchPersistValueResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetSwitchPersistValueResponseBodyData> getData() {
        return this.data;
    }

    public GetSwitchPersistValueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSwitchPersistValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSwitchPersistValueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSwitchPersistValueResponseBodyData extends TeaModel {
        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Value")
        public String value;

        public static GetSwitchPersistValueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSwitchPersistValueResponseBodyData self = new GetSwitchPersistValueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSwitchPersistValueResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public GetSwitchPersistValueResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
