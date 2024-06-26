// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class BindFabricManagementChaincodeResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public BindFabricManagementChaincodeResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static BindFabricManagementChaincodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BindFabricManagementChaincodeResponseBody self = new BindFabricManagementChaincodeResponseBody();
        return TeaModel.build(map, self);
    }

    public BindFabricManagementChaincodeResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public BindFabricManagementChaincodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BindFabricManagementChaincodeResponseBody setResult(BindFabricManagementChaincodeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public BindFabricManagementChaincodeResponseBodyResult getResult() {
        return this.result;
    }

    public BindFabricManagementChaincodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BindFabricManagementChaincodeResponseBodyResult extends TeaModel {
        @NameInMap("Input")
        public String input;

        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public Long path;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("Version")
        public String version;

        public static BindFabricManagementChaincodeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            BindFabricManagementChaincodeResponseBodyResult self = new BindFabricManagementChaincodeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public BindFabricManagementChaincodeResponseBodyResult setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public BindFabricManagementChaincodeResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BindFabricManagementChaincodeResponseBodyResult setPath(Long path) {
            this.path = path;
            return this;
        }
        public Long getPath() {
            return this.path;
        }

        public BindFabricManagementChaincodeResponseBodyResult setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public BindFabricManagementChaincodeResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
