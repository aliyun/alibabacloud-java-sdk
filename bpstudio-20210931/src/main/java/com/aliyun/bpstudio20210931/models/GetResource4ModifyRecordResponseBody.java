// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetResource4ModifyRecordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;PolicyType&quot;: &quot;&quot;,
     *     &quot;AuthPrincipalOwnerId&quot;: &quot;&quot;,
     *     &quot;EncodedDiagnosticMessage&quot;: &quot;&quot;,
     *     &quot;AuthPrincipalType&quot;: &quot;&quot;,
     *     &quot;AuthPrincipalDisplayName&quot;: &quot;&quot;,
     *     &quot;NoPermissionType&quot;: &quot;&quot;,
     *     &quot;AuthAction&quot;: &quot;&quot;
     *   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetResource4ModifyRecordResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>A07FFDF2-78FA-1B48-9E38-88E833A93187</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static GetResource4ModifyRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResource4ModifyRecordResponseBody self = new GetResource4ModifyRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResource4ModifyRecordResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetResource4ModifyRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetResource4ModifyRecordResponseBody setData(java.util.List<GetResource4ModifyRecordResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetResource4ModifyRecordResponseBodyData> getData() {
        return this.data;
    }

    public GetResource4ModifyRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetResource4ModifyRecordResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetResource4ModifyRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResource4ModifyRecordResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class GetResource4ModifyRecordResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{\&quot;InstanceId\&quot;: \&quot;\&quot;, \&quot;AttributeName\&quot;: \&quot;drmCommand\&quot;, \&quot;Id\&quot;: 16800, \&quot;Desc\&quot;: \&quot;test\&quot;}</p>
         */
        @NameInMap("Attribute")
        public String attribute;

        /**
         * <strong>example:</strong>
         * <p>1726645341000</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>rm-uf6308dyal1*****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>Finish</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetResource4ModifyRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetResource4ModifyRecordResponseBodyData self = new GetResource4ModifyRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetResource4ModifyRecordResponseBodyData setAttribute(String attribute) {
            this.attribute = attribute;
            return this;
        }
        public String getAttribute() {
            return this.attribute;
        }

        public GetResource4ModifyRecordResponseBodyData setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public GetResource4ModifyRecordResponseBodyData setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetResource4ModifyRecordResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetResource4ModifyRecordResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
