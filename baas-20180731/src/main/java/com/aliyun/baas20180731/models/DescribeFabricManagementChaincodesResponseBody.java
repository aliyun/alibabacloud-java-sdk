// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricManagementChaincodesResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeFabricManagementChaincodesResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricManagementChaincodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricManagementChaincodesResponseBody self = new DescribeFabricManagementChaincodesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricManagementChaincodesResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricManagementChaincodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricManagementChaincodesResponseBody setResult(java.util.List<DescribeFabricManagementChaincodesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricManagementChaincodesResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeFabricManagementChaincodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFabricManagementChaincodesResponseBodyResult extends TeaModel {
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

        public static DescribeFabricManagementChaincodesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricManagementChaincodesResponseBodyResult self = new DescribeFabricManagementChaincodesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricManagementChaincodesResponseBodyResult setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public DescribeFabricManagementChaincodesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeFabricManagementChaincodesResponseBodyResult setPath(Long path) {
            this.path = path;
            return this;
        }
        public Long getPath() {
            return this.path;
        }

        public DescribeFabricManagementChaincodesResponseBodyResult setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeFabricManagementChaincodesResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
