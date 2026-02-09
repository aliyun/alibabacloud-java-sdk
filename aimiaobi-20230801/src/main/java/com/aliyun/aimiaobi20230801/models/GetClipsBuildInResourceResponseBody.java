// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetClipsBuildInResourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetClipsBuildInResourceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetClipsBuildInResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClipsBuildInResourceResponseBody self = new GetClipsBuildInResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClipsBuildInResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetClipsBuildInResourceResponseBody setData(GetClipsBuildInResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetClipsBuildInResourceResponseBodyData getData() {
        return this.data;
    }

    public GetClipsBuildInResourceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetClipsBuildInResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetClipsBuildInResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClipsBuildInResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetClipsBuildInResourceResponseBodyData extends TeaModel {
        @NameInMap("ResourceList")
        public java.util.List<String> resourceList;

        @NameInMap("ResourceType")
        public Integer resourceType;

        public static GetClipsBuildInResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetClipsBuildInResourceResponseBodyData self = new GetClipsBuildInResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetClipsBuildInResourceResponseBodyData setResourceList(java.util.List<String> resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public java.util.List<String> getResourceList() {
            return this.resourceList;
        }

        public GetClipsBuildInResourceResponseBodyData setResourceType(Integer resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Integer getResourceType() {
            return this.resourceType;
        }

    }

}
