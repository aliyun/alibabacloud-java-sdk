// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetApiPriceRequest extends TeaModel {
    /**
     * <p>The pricing request body, including popCode, popVersion, apiName, and parameters. All calls return a unified pricing envelope. The language parameter specifies the server-side message language, such as en or zh. Target resource operations are not executed for cost-irrelevant or unsupported pricing queries.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;popCode&quot;:&quot;ecs&quot;,&quot;popVersion&quot;:&quot;2014-05-26&quot;,&quot;apiName&quot;:&quot;CreateDisk&quot;,&quot;parameters&quot;:{&quot;RegionId&quot;:&quot;cn-hangzhou&quot;,&quot;ZoneId&quot;:&quot;cn-hangzhou-i&quot;,&quot;DiskCategory&quot;:&quot;cloud_essd&quot;,&quot;Size&quot;:40},&quot;language&quot;:&quot;zh&quot;}</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static GetApiPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApiPriceRequest self = new GetApiPriceRequest();
        return TeaModel.build(map, self);
    }

    public GetApiPriceRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
