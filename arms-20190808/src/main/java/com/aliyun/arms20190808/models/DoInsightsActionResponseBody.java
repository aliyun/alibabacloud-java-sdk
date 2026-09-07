// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DoInsightsActionResponseBody extends TeaModel {
    /**
     * <p>Status code. 200 indicates success; other status codes indicate exceptions.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The return parameter type is related to the module value passed in.</p>
     * <ul>
     * <li><p>QueryTopo</p>
     * <pre><code>{
     *  &quot;nodes&quot;: [Object] #Node collection. See the Node definition in the supplementary description of return parameters.
     *  &quot;edges&quot;: [Object] #Edge collection. See the Edge definition in the supplementary description of return parameters.
     * }
     * </code></pre>
     * </li>
     * <li><p>QueryTopoRed</p>
     * <pre><code>{
     *   &quot;nodeRed&quot;: {
     *       &quot;nodeId&quot;: {
     *           &quot;count&quot;: double, #Total number of requests during the query period
     *           &quot;error&quot;: double, #Total number of errors during the query period
     *           &quot;rt&quot;: double, #Average latency during the query period, in milliseconds
     *       }
     *   },
     *   &quot;edgeRed&quot;: {
     *       &quot;edgeId&quot;: {
     *           &quot;count&quot;: double, #Total number of requests during the query period
     *           &quot;error&quot;: double, #Total number of errors during the query period
     *           &quot;rt&quot;: double, #Average latency during the query period, in milliseconds
     *       }
     *   }
     * </code></pre>
     * </li>
     * </ul>
     * <p>}
     *   ```</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li><p>QueryTopo</p>
     * <p>  {
     *   &quot;nodes&quot;: [
     *       {
     *           &quot;nodeId&quot;: &quot;3bfe1a747389273388182760406c079d&quot;,
     *           &quot;entity&quot;: {
     *               &quot;regionId&quot;: &quot;cn-hangzhou&quot;,
     *               &quot;appType&quot;: &quot;TRACE&quot;,
     *               &quot;appId&quot;: &quot;xxxxxxxxxxxxxxxx&quot;,
     *               &quot;name&quot;: &quot;prometheus-pop-cn-hangzhou&quot;,
     *               &quot;entityId&quot;: &quot;3bfe1a747389273388182760406c079d&quot;,
     *               &quot;firstSeenTms&quot;: 1721733226981,
     *               &quot;lastSeenTms&quot;: 1721789171614,
     *               &quot;type&quot;: &quot;APPLICATION&quot;
     *           },
     *           &quot;attrs&quot;: {
     *               &quot;RED&quot;: {
     *                   &quot;count&quot;: 643848.0,
     *                   &quot;error&quot;: 0.0,
     *                   &quot;rt&quot;: 172.31701892372112
     *               }
     *           }
     *       }
     *   ],
     *   &quot;edges&quot;: [
     *       {
     *           &quot;from&quot;: &quot;98b4184b22e588cf86e9a29aa4179606&quot;,
     *           &quot;to&quot;: &quot;98b4184b22e588cf86e9a29aa4179606&quot;,
     *           &quot;type&quot;: &quot;CALLS&quot;,
     *           &quot;attrs&quot;: {
     *               &quot;RED&quot;: {
     *                   &quot;count&quot;: 4.0,
     *                   &quot;error&quot;: 0.0,
     *                   &quot;rt&quot;: 37.0
     *               }
     *           },
     *           &quot;edgeId&quot;: &quot;5d611597e4b0013d0947615c9eca4de6&quot;,
     *           &quot;firstSeenTms&quot;: 1721783795125,
     *           &quot;lastSeenTms&quot;: 1721787371614
     *       }
     *   ]
     *   }</p>
     * </li>
     * <li><p>QueryTopoRed</p>
     * <p>  {
     *   &quot;nodeRed&quot;: {
     *       &quot;361d9f32e58cef316bf2355f3ff05575&quot;: {
     *           &quot;count&quot;: 3258110.0,
     *           &quot;error&quot;: 74.0,
     *           &quot;rt&quot;: 167.39844355494878
     *       }
     *   },
     *   &quot;edgeRed&quot;: {}
     *   }</p>
     * </li>
     * </ul>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The message returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>626037F5-FDEB-45B0-804C-B3C92797A64E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the query is successful:</p>
     * <ul>
     * <li><code>true</code>: Successful.</li>
     * <li><code>false</code>: Failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DoInsightsActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DoInsightsActionResponseBody self = new DoInsightsActionResponseBody();
        return TeaModel.build(map, self);
    }

    public DoInsightsActionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DoInsightsActionResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DoInsightsActionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DoInsightsActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DoInsightsActionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
