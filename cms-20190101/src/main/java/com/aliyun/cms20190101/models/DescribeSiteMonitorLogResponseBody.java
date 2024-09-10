// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorLogResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <p>**</p>
     * <p><strong>Description</strong> The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The logs of the instant test tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\\&quot;redirectCount\\&quot;:0.0,\\&quot;SSLConnectTime\\&quot;:0.0,\\&quot;pingDetail\\&quot;:\\&quot;\\&quot;,\\&quot;HTTPConnectTime\\&quot;:0.0,\\&quot;isp\\&quot;:\\&quot;465\\&quot;,\\&quot;errorCode\\&quot;:611,\\&quot;ispCN\\&quot;:\\&quot;Alibaba\\&quot;,\\&quot;resolution\\&quot;:\\&quot;\\&quot;,\\&quot;areaEN\\&quot;:\\&quot;HuaBei\\&quot;,\\&quot;taskEndTimestamp\\&quot;:1638422475687,\\&quot;targetIspEN\\&quot;:\\&quot;\\&quot;,\\&quot;TotalTime\\&quot;:1.0,\\&quot;taskStartTimestamp\\&quot;:1638422474389,\\&quot;countryCN\\&quot;:\\&quot;China\\&quot;,\\&quot;provinceEN\\&quot;:\\&quot;Beijing\\&quot;,\\&quot;countryEN\\&quot;:\\&quot;China\\&quot;,\\&quot;targetCityEN\\&quot;:\\&quot;\\&quot;,\\&quot;curlConnectTime\\&quot;:0.0,\\&quot;ips\\&quot;:\\&quot;\\&quot;,\\&quot;route\\&quot;:\\&quot;\\&quot;,\\&quot;tcpConnectTime\\&quot;:0.0,\\&quot;cityEN\\&quot;:\\&quot;Beijing\\&quot;,\\&quot;HTTPDownloadSpeed\\&quot;:0.0,\\&quot;HTTPDownloadTime\\&quot;:0.0,\\&quot;HTTPResponseCode\\&quot;:0.0,\\&quot;areaCN\\&quot;:\\&quot;North China\\&quot;,\\&quot;city\\&quot;:\\&quot;546\\&quot;,\\&quot;expection\\&quot;:\\&quot;\\&quot;,\\&quot;suorceIp\\&quot;:\\&quot;192.168.XX.XX \\&quot;,\\&quot;ispEN\\&quot;:\\&quot;Alibaba\\&quot;,\\&quot;HTTPDNSTime\\&quot;:1.0,\\&quot;targetIsp\\&quot;:\\&quot;\\&quot;,\\&quot;curlStarttransferTime\\&quot;:0.0,\\&quot;provinceCN\\&quot;:\\&quot;Beijing\\&quot;,\\&quot;timestamp\\&quot;:1638422474000,\\&quot;redirectTime\\&quot;:0.0,\\&quot;targetCity\\&quot;:\\&quot;\\&quot;, \\&quot;expect\\&quot;:\\&quot;\\&quot;,\\&quot;HTTPDownloadSize\\&quot;:0.0,\\&quot;localDns\\&quot;:\\&quot;192.168.XX.XX\\&quot;,\\&quot;cityCN\\&quot;:\\&quot;Beijing\\&quot;,\\&quot;taskId\\&quot;:\\&quot;afa5c3ce-f944-4363-9edb-ce919a29\<em>\</em>\<em>\</em>\\&quot;}]</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>IWBjqMYSy0is7zSMGu16****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>67F646FA-ED8A-58C2-B461-451DB52C8B14</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeSiteMonitorLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorLogResponseBody self = new DescribeSiteMonitorLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSiteMonitorLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSiteMonitorLogResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeSiteMonitorLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSiteMonitorLogResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSiteMonitorLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSiteMonitorLogResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
