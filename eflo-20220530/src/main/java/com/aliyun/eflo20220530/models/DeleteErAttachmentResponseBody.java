// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteErAttachmentResponseBody extends TeaModel {
    /**
     * <p>访问被拒绝的详细原因。</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response content. If a resource has dependent resources, the existing dependent resources are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;ER_RMAP&quot;: [
     *         {
     *             &quot;erId&quot;: &quot;er-opy1wrfv&quot;,
     *             &quot;destinationCidrBlock&quot;: &quot;0.0.0.0/0&quot;,
     *             &quot;regionId&quot;: &quot;cn-wulanchabu&quot;,
     *             &quot;routeMapNum&quot;: 3000,
     *             &quot;erRouteMapId&quot;: &quot;er-rmap-v5lfhmvm&quot;,
     *             &quot;action&quot;: &quot;permit&quot;,
     *             &quot;status&quot;: &quot;Available&quot;
     *         },
     *         {
     *             &quot;erId&quot;: &quot;er-opy1wrfv&quot;,
     *             &quot;destinationCidrBlock&quot;: &quot;0.0.0.0/0&quot;,
     *             &quot;regionId&quot;: &quot;cn-wulanchabu&quot;,
     *             &quot;routeMapNum&quot;: 3000,
     *             &quot;erRouteMapId&quot;: &quot;er-rmap-of3r0ndh&quot;,
     *             &quot;action&quot;: &quot;permit&quot;,
     *             &quot;status&quot;: &quot;Available&quot;
     *         }
     *     ]
     * }</p>
     */
    @NameInMap("Content")
    public Object content;

    /**
     * <p>response message, if the success request is</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID of the current request</p>
     * 
     * <strong>example:</strong>
     * <p>A88DFED5-24B7-5A3E-87DE-380BF06F3C90</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteErAttachmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteErAttachmentResponseBody self = new DeleteErAttachmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteErAttachmentResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DeleteErAttachmentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteErAttachmentResponseBody setContent(Object content) {
        this.content = content;
        return this;
    }
    public Object getContent() {
        return this.content;
    }

    public DeleteErAttachmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteErAttachmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
