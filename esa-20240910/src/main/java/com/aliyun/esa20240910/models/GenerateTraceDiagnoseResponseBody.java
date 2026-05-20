// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GenerateTraceDiagnoseResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>64D28B53-5902-409B-94F6-FD46680144FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p><a href="http://cdn.dns-detect.alicdn.com/diagnose/?id=xxxxxxx">http://cdn.dns-detect.alicdn.com/diagnose/?id=xxxxxxx</a></p>
     */
    @NameInMap("Tip")
    public String tip;

    /**
     * <strong>example:</strong>
     * <p><a href="http://cdn.dns-detect.alicdn.com/diagnose_v2?id=5d97ac9b&token=WFji65gy2mGNM11bD929%2BCMoyI6mbk2deRR9hOC6INH%2FoYbccQZQcvEn4wc%2FDPHlTshxRSAa5HokX%2BabItBpJ0FdnteROssomXqgIdjHpM46L%2BbaIeweZfsWG6QnbXT5n7O5APMyc%2Fe8d1o9PwwB429Ccks1FU1AfjNZfvBcLeo%3D">http://cdn.dns-detect.alicdn.com/diagnose_v2?id=5d97ac9b&amp;token=WFji65gy2mGNM11bD929%2BCMoyI6mbk2deRR9hOC6INH%2FoYbccQZQcvEn4wc%2FDPHlTshxRSAa5HokX%2BabItBpJ0FdnteROssomXqgIdjHpM46L%2BbaIeweZfsWG6QnbXT5n7O5APMyc%2Fe8d1o9PwwB429Ccks1FU1AfjNZfvBcLeo%3D</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static GenerateTraceDiagnoseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateTraceDiagnoseResponseBody self = new GenerateTraceDiagnoseResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateTraceDiagnoseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateTraceDiagnoseResponseBody setTip(String tip) {
        this.tip = tip;
        return this;
    }
    public String getTip() {
        return this.tip;
    }

    public GenerateTraceDiagnoseResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
