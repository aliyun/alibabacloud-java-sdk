// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetConsoleScoreResponseBody extends TeaModel {
    /**
     * <p>Interface response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data returned by the interface.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;score&quot;: &quot;94.00&quot;,
     *     &quot;consoleScoreTrendDTOS&quot;: [
     *         {
     *             &quot;date&quot;: &quot;20241009&quot;,
     *             &quot;score&quot;: &quot;100.0&quot;
     *         }
     *     ],
     *     &quot;cyclicYearOverYear&quot;: &quot;-6.00&quot;,
     *     &quot;recordDate&quot;: &quot;20241209&quot;,
     *     &quot;weeklyYearOverYear&quot;: &quot;1.62&quot;,
     *     &quot;aboveWholeNetworkUserRatio&quot;: &quot;6.25&quot;,
     *     &quot;aliUid&quot;: &quot;1601097845544644&quot;,
     *     &quot;detailJson&quot;: &quot;[{\&quot;detailDTO\&quot;:[{\&quot;count\&quot;:0,\&quot;itemName\&quot;:\&quot;应用漏洞POC验证\&quot;,\&quot;mark\&quot;:\&quot;1\&quot;},{\&quot;count\&quot;:0,\&quot;itemName\&quot;:\&quot;未授权访问漏洞（公网暴露）\&quot;,\&quot;mark\&quot;:\&quot;1\&quot;},{\&quot;count\&quot;:0,\&quot;itemName\&quot;:\&quot;后台弱口令漏洞（公网暴露）\&quot;,\&quot;mark\&quot;:\&quot;1\&quot;},{\&quot;count\&quot;:0,\&quot;itemName\&quot;:\&quot;文件上传漏洞（公网暴露）\&quot;,\&quot;mark\&quot;:\&quot;1\&quot;}],\&quot;markRate\&quot;:\&quot;0.5\&quot;,\&quot;markType\&quot;:\&quot;vul\&quot;},{\&quot;detailDTO\&quot;:[{\&quot;count\&quot;:12,\&quot;itemName\&quot;:\&quot;WAF3.0回源配置不正确\&quot;,\&quot;mark\&quot;:\&quot;1\&quot;},{\&quot;count\&quot;:0,\&quot;itemName\&quot;:\&quot;AK泄露检查未开启\&quot;,\&quot;mark\&quot;:\&quot;1\&quot;},{\&quot;count\&quot;:0,\&quot;itemName\&quot;:\&quot;DNAT管理端口开放\&quot;,\&quot;mark\&quot;:\&quot;1\&quot;},{\&quot;count\&quot;:0,\&quot;itemName\&quot;:\&quot;高危端口暴露\&quot;,\&quot;mark\&quot;:\&quot;0.5\&quot;}],\&quot;markRate\&quot;:\&quot;0.5\&quot;,\&quot;markType\&quot;:\&quot;risk\&quot;}]&quot;
     * }</p>
     */
    @NameInMap("Data")
    public Object data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Prompt message for the result returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>D0937B0F-9180-5F70-B6ED-0BA22591627F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. true means success, false means failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetConsoleScoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConsoleScoreResponseBody self = new GetConsoleScoreResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConsoleScoreResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetConsoleScoreResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public GetConsoleScoreResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetConsoleScoreResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConsoleScoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConsoleScoreResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
