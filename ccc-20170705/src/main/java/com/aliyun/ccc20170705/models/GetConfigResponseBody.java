// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetConfigResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ConfigItem")
    public GetConfigResponseBodyConfigItem configItem;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConfigResponseBody self = new GetConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetConfigResponseBody setConfigItem(GetConfigResponseBodyConfigItem configItem) {
        this.configItem = configItem;
        return this;
    }
    public GetConfigResponseBodyConfigItem getConfigItem() {
        return this.configItem;
    }

    public GetConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetConfigResponseBodyConfigItem extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        public static GetConfigResponseBodyConfigItem build(java.util.Map<String, ?> map) throws Exception {
            GetConfigResponseBodyConfigItem self = new GetConfigResponseBodyConfigItem();
            return TeaModel.build(map, self);
        }

        public GetConfigResponseBodyConfigItem setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetConfigResponseBodyConfigItem setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
