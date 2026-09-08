// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetTurnServerListResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>A list of front-end access point servers.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *     {
     *         &quot;region&quot;:&quot;hangzhou&quot;,
     *         &quot;name&quot;:&quot;杭州&quot;,
     *         &quot;domain&quot;:&quot;turn-hz-ecs.ccc.aliyuncs.com&quot;,
     *         &quot;cidr&quot;:&quot;172.31.XX.XX/28&quot;
     *     },
     *     {
     *         &quot;region&quot;:&quot;qingdao&quot;,
     *         &quot;name&quot;:&quot;青岛&quot;,
     *         &quot;domain&quot;:&quot;turn-qd-ecs.ccc.aliyuncs.com&quot;,
     *         &quot;cidr&quot;:&quot;172.31.XX.XX/28&quot;
     *     },
     *     {
     *         &quot;region&quot;:&quot;shanghai&quot;,
     *         &quot;name&quot;:&quot;上海&quot;,
     *         &quot;domain&quot;:&quot;turn-sh-ecs.ccc.aliyuncs.com&quot;,
     *         &quot;cidr&quot;:&quot;172.31.XX.XX/28&quot;
     *     },
     *     {
     *         &quot;region&quot;:&quot;chengdu&quot;,
     *         &quot;name&quot;:&quot;成都&quot;,
     *         &quot;domain&quot;:&quot;turn-cd-ecs.ccc.aliyuncs.com&quot;,
     *         &quot;cidr&quot;:&quot;172.31.XX.XX/28&quot;
     *     },
     *     {
     *         &quot;region&quot;:&quot;beijing&quot;,
     *         &quot;name&quot;:&quot;北京&quot;,
     *         &quot;domain&quot;:&quot;turn-bj-ecs.ccc.aliyuncs.com&quot;,
     *         &quot;cidr&quot;:&quot;172.31.XX.XX/28&quot;
     *     },
     *     {
     *         &quot;region&quot;:&quot;huanan&quot;,
     *         &quot;name&quot;:&quot;深圳&quot;,
     *         &quot;domain&quot;:&quot;turn-sz-ecs.ccc.aliyuncs.com&quot;,
     *         &quot;cidr&quot;:&quot;172.31.XX.XX/28&quot;
     *     },
     *     {
     *         &quot;region&quot;:&quot;zhangbei&quot;,
     *         &quot;name&quot;:&quot;张北&quot;,
     *         &quot;domain&quot;:&quot;turn-zb-ecs.ccc.aliyuncs.com&quot;,
     *         &quot;cidr&quot;:&quot;172.31.XX.XX/28&quot;
     *     }
     * ]</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTurnServerListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTurnServerListResponseBody self = new GetTurnServerListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTurnServerListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTurnServerListResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetTurnServerListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTurnServerListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTurnServerListResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetTurnServerListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
