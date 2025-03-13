// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DoInsightsActionResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response parameters vary with the value of module.</p>
     * <ul>
     * <li><p>QueryTopo</p>
     * <pre><code>{
     * &quot;nodes&quot;: [Object] # The nodes. For more information, see node details in the supplementary notes of response parameters.
     * &quot;edges&quot;: [Object] # The edges. For more information, see edge details in the supplementary notes of response parameters.
     * }
     * </code></pre>
     * </li>
     * <li><p>QueryTopoRed</p>
     * <pre><code>{
     *   &quot;nodeRed&quot;: {
     *       &quot;nodeId&quot;: {
     *           &quot;count&quot;: double, # The total number of requests in the specified time range.
     *           &quot;error&quot;: double, # The total number of errors in the specified time range.
     *           &quot;rt&quot;: double, # The average response time in the specified time range. Unit: milliseconds.
     *       }
     *   },
     *   &quot;edgeRed&quot;: {
     *       &quot;edgeId&quot;: {
     *           &quot;count&quot;: double, # The total number of requests in the specified time range.
     *           &quot;error&quot;: double, # The total number of errors in the specified time range.
     *           &quot;rt&quot;: double, # The average response time in the specified time range. Unit: milliseconds.
     *       }
     *   }
     * </code></pre>
     * </li>
     * </ul>
     * <p>}</p>
     * <pre><code>
     * </code></pre>
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
     * <p>The error message.</p>
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
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code></li>
     * <li><code>false</code></li>
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
