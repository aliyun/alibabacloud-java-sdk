// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DescribeDifyDefaultVpcResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeDifyDefaultVpcResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDifyDefaultVpcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDifyDefaultVpcResponseBody self = new DescribeDifyDefaultVpcResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDifyDefaultVpcResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDifyDefaultVpcResponseBody setData(DescribeDifyDefaultVpcResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDifyDefaultVpcResponseBodyData getData() {
        return this.data;
    }

    public DescribeDifyDefaultVpcResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeDifyDefaultVpcResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDifyDefaultVpcResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDifyDefaultVpcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDifyDefaultVpcResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDifyDefaultVpcResponseBodyData extends TeaModel {
        @NameInMap("DefaultVpcId")
        public String defaultVpcId;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static DescribeDifyDefaultVpcResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDifyDefaultVpcResponseBodyData self = new DescribeDifyDefaultVpcResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDifyDefaultVpcResponseBodyData setDefaultVpcId(String defaultVpcId) {
            this.defaultVpcId = defaultVpcId;
            return this;
        }
        public String getDefaultVpcId() {
            return this.defaultVpcId;
        }

        public DescribeDifyDefaultVpcResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
