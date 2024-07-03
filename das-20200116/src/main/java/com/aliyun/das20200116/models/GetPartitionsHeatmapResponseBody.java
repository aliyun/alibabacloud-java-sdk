// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetPartitionsHeatmapResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The hot data of the PolarDB-X 2.0 instance. The data is returned in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;boundAxis&quot;: [
     *         {
     *             &quot;bound&quot;: &quot;A,B,C,D&quot;,
     *             &quot;labels&quot;: [
     *                 &quot;L1&quot;,
     *                 &quot;L2&quot;,
     *                 &quot;L3&quot;,
     *                 &quot;L4&quot;
     *             ],
     *             &quot;rows&quot;: 3171
     *         },
     *         {
     *             &quot;bound&quot;: &quot;A,B,C,D&quot;,
     *             &quot;labels&quot;: [
     *                 &quot;L1&quot;,
     *                 &quot;L2&quot;,
     *                 &quot;L3&quot;,
     *                 &quot;L4&quot;
     *             ],
     *             &quot;rows&quot;: 277128
     *         }
     *     ],
     *     &quot;dataMap&quot;: {
     *         &quot;READ_WRITTEN_ROWS&quot;: [
     *             [
     *                 0,
     *                 0,
     *                 0
     *             ],
     *             [
     *                 0,
     *                 0,
     *                 0
     *             ]
     *         ]
     *     },
     *     &quot;timeAxis&quot;: [
     *         1671701056070,
     *         1671701116551,
     *         1671701177020
     *     ]
     * }</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message that contains information such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D00DB161-FEF6-5428-B37A-8D29A4C2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetPartitionsHeatmapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPartitionsHeatmapResponseBody self = new GetPartitionsHeatmapResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPartitionsHeatmapResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPartitionsHeatmapResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetPartitionsHeatmapResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPartitionsHeatmapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPartitionsHeatmapResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
