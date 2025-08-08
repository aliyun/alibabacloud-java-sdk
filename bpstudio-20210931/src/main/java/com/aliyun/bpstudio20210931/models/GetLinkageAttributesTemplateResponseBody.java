// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetLinkageAttributesTemplateResponseBody extends TeaModel {
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
    public GetLinkageAttributesTemplateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A07FFDF2-78FA-1B48-9E38-88E833A93187</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetLinkageAttributesTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkageAttributesTemplateResponseBody self = new GetLinkageAttributesTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkageAttributesTemplateResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetLinkageAttributesTemplateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLinkageAttributesTemplateResponseBody setData(GetLinkageAttributesTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetLinkageAttributesTemplateResponseBodyData getData() {
        return this.data;
    }

    public GetLinkageAttributesTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkageAttributesTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetLinkageAttributesTemplateResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>SyntaxError</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <strong>example:</strong>
         * <p>[
         *       {
         *         &quot;label&quot;: &quot;ecs.c6.2xlarge (8c 16g)&quot;,
         *         &quot;value&quot;: &quot;ecs.c6.2xlarge&quot;
         *       },
         *       {
         *         &quot;label&quot;: &quot;ecs.c6.3xlarge (12c 24g)&quot;,
         *         &quot;value&quot;: &quot;ecs.c6.3xlarge&quot;
         *       }
         * ]</p>
         */
        @NameInMap("OptionalValues")
        public String optionalValues;

        /**
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetLinkageAttributesTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetLinkageAttributesTemplateResponseBodyData self = new GetLinkageAttributesTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetLinkageAttributesTemplateResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetLinkageAttributesTemplateResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetLinkageAttributesTemplateResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public GetLinkageAttributesTemplateResponseBodyData setOptionalValues(String optionalValues) {
            this.optionalValues = optionalValues;
            return this;
        }
        public String getOptionalValues() {
            return this.optionalValues;
        }

        public GetLinkageAttributesTemplateResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
