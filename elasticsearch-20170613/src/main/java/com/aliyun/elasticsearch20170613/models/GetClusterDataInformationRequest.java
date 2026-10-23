// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetClusterDataInformationRequest extends TeaModel {
    /**
     * <p>The cluster type, access endpoint, and index to be queried.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;dataSourceType&quot;:&quot;elasticsearch&quot;,&quot;endpoint&quot;:&quot;<a href="http://es-cn-npk1shyiq000d****.public.elasticsearch.aliyuncs.com:9200%22,%22username%22:%22elastic%22,%22password%22:%22xxxxxx%22,%22index%22:%22default%22,%22type%22:%22default%22%7D">http://es-cn-npk1shyiq000d****.public.elasticsearch.aliyuncs.com:9200&quot;,&quot;username&quot;:&quot;elastic&quot;,&quot;password&quot;:&quot;xxxxxx&quot;,&quot;index&quot;:&quot;default&quot;,&quot;type&quot;:&quot;default&quot;}</a></p>
     */
    @NameInMap("body")
    public String body;

    public static GetClusterDataInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterDataInformationRequest self = new GetClusterDataInformationRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterDataInformationRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
