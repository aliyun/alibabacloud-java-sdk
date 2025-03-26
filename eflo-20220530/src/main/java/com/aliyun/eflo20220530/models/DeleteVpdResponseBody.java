// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class DeleteVpdResponseBody extends TeaModel {
    /**
     * <p>The detailed reason why the access was denied.</p>
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
     * <p>The response parameters. (If a dependent resource exists, the existing dependent resource is returned.)</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;subnet&quot;: [
     *             {
     *                   &quot;tenantId&quot;: &quot;1620939556166277&quot;,
     *                   &quot;regionId&quot;: &quot;cn-wulanchabu&quot;,
     *                   &quot;zoneId&quot;: &quot;cn&quot;,
     *                   &quot;type&quot;: null,
     *                   &quot;subnetId&quot;: &quot;subnet-zqebaxa0&quot;,
     *                   &quot;name&quot;: &quot;lql_testVPD&quot;
     *             }
     *       ],
     *       &quot;nc&quot;: [
     *             {}
     *       ]
     * }</p>
     */
    @NameInMap("Content")
    public Object content;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BDBCC783-84CA-5733-8EEA-645C88B9009C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteVpdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpdResponseBody self = new DeleteVpdResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVpdResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DeleteVpdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteVpdResponseBody setContent(Object content) {
        this.content = content;
        return this;
    }
    public Object getContent() {
        return this.content;
    }

    public DeleteVpdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteVpdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
