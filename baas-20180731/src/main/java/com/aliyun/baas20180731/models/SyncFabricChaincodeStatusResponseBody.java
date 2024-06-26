// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class SyncFabricChaincodeStatusResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public SyncFabricChaincodeStatusResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static SyncFabricChaincodeStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncFabricChaincodeStatusResponseBody self = new SyncFabricChaincodeStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncFabricChaincodeStatusResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public SyncFabricChaincodeStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncFabricChaincodeStatusResponseBody setResult(SyncFabricChaincodeStatusResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SyncFabricChaincodeStatusResponseBodyResult getResult() {
        return this.result;
    }

    public SyncFabricChaincodeStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SyncFabricChaincodeStatusResponseBodyResult extends TeaModel {
        @NameInMap("ChaincodeId")
        public String chaincodeId;

        @NameInMap("Input")
        public String input;

        @NameInMap("Name")
        public String name;

        @NameInMap("Path")
        public Long path;

        @NameInMap("State")
        public String state;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("Version")
        public String version;

        public static SyncFabricChaincodeStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SyncFabricChaincodeStatusResponseBodyResult self = new SyncFabricChaincodeStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SyncFabricChaincodeStatusResponseBodyResult setChaincodeId(String chaincodeId) {
            this.chaincodeId = chaincodeId;
            return this;
        }
        public String getChaincodeId() {
            return this.chaincodeId;
        }

        public SyncFabricChaincodeStatusResponseBodyResult setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public SyncFabricChaincodeStatusResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SyncFabricChaincodeStatusResponseBodyResult setPath(Long path) {
            this.path = path;
            return this;
        }
        public Long getPath() {
            return this.path;
        }

        public SyncFabricChaincodeStatusResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SyncFabricChaincodeStatusResponseBodyResult setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public SyncFabricChaincodeStatusResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
