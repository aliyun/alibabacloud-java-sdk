// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeShareUrlResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The share URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://hdm.console.aliyun.com/#/queryOptimize?Keywords=&OnlyOptimizedSql=true&Time=1684771200000&Engine=MySQL&InstanceIds=&Rules=&PageNo=1&PageSize=10&OrderBy=count&Asc=false&SqlIds=&dbNames=&region=cn-china&user=">https://hdm.console.aliyun.com/#/queryOptimize?Keywords=&amp;OnlyOptimizedSql=true&amp;Time=1684771200000&amp;Engine=MySQL&amp;InstanceIds=&amp;Rules=&amp;PageNo=1&amp;PageSize=10&amp;OrderBy=count&amp;Asc=false&amp;SqlIds=&amp;dbNames=&amp;region=cn-china&amp;user=</a></p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request was successful, Successful is returned. If the request failed, an error message that contains information such as an error code is returned.</p>
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
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
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

    public static GetQueryOptimizeShareUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeShareUrlResponseBody self = new GetQueryOptimizeShareUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeShareUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQueryOptimizeShareUrlResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetQueryOptimizeShareUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQueryOptimizeShareUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueryOptimizeShareUrlResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
